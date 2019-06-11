/**
 * 
 */
package com.grow.favourites.rest.resource;

import com.grow.favourites.model.Favourite;
import com.grow.favourites.rest.model.FavouriteJSONModel;
import com.grow.favourites.service.FavouriteLocalServiceUtil;
import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.model.AssetTag;
import com.liferay.asset.kernel.service.AssetEntryLocalServiceUtil;
import com.liferay.asset.kernel.service.AssetTagLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserConstants;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import java.text.DateFormat;
import java.util.Collection;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author Norbert Kocsis
 *
 */
@Component(
	property = {
		"osgi.jaxrs.application.select=(osgi.jaxrs.name=Grow.Favourites.REST)",
		"osgi.jaxrs.resource=true"
	},
	scope = ServiceScope.PROTOTYPE, service = FavouritesResource.class
)
public class FavouritesResource {

	@PUT
	@Path("/addFavourite")
	public Response addFavourite(
			@QueryParam("groupId") long groupId, 
			@QueryParam("userId") long userId,
			@QueryParam("assetEntryId") long assetEntryId) {

		try {
			FavouriteLocalServiceUtil.addFavourite(groupId, assetEntryId, userId);

			return _accepted();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return _badRequest();
	}

	@GET
	@Path("/isFavourite")
	@Produces(MediaType.APPLICATION_JSON)
	public Boolean isFavourite(
			@QueryParam("groupId") long groupId, 
			@QueryParam("userId") long userId,
			@QueryParam("assetEntryId") long assetEntryId) {
		return FavouriteLocalServiceUtil.isFavourite(groupId, userId, assetEntryId);
	}

	@GET
	@Path("/isFavouriteArray")
	@Produces(MediaType.APPLICATION_JSON)
	public Boolean[] isFavouriteArray(
			@QueryParam("groupId") long groupId, 
			@QueryParam("userId") long userId,
			@QueryParam("assetEntryId") Long[] assetEntryIds) {

		Boolean[] favourites = new Boolean[assetEntryIds.length];

		for (int i = 0; i < assetEntryIds.length; i++) {
			favourites[i] = FavouriteLocalServiceUtil.isFavourite(groupId, userId, assetEntryIds[i]);
		}

		return favourites;
	}

	@GET
	@Path("/getFavourites")
	@Produces(MediaType.APPLICATION_JSON)
	public FavouriteJSONModel[] getFavourites(
		@QueryParam("groupId") long groupId, 
		@QueryParam("userId") long userId) {

		return getUserFavouritesJSON(groupId, userId);
	}

	@DELETE
	@Path("/removeFavourite")
	public Response removeFavourite(
		@QueryParam("groupId") long groupId,
		@QueryParam("userId") long userId,
		@QueryParam("asseEntryId") long assetEntryId) {

		try {
			FavouriteLocalServiceUtil.removeFavourite(groupId, assetEntryId, userId);
			
			return _accepted();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return _badRequest();
	}

	private FavouriteJSONModel[] getUserFavouritesJSON(long groupId, long userId) {
		try {
			Collection<Favourite> favourites = FavouriteLocalServiceUtil.getUserFavourites(groupId, userId);

			FavouriteJSONModel[] favouritesArray = new FavouriteJSONModel[favourites.size()];

			int i = 0;

			for (Favourite favourite : favourites) {
				User user = UserLocalServiceUtil.fetchUser(favourite.getUserId());
				AssetEntry asset = AssetEntryLocalServiceUtil.fetchAssetEntry(favourite.getAssetEntryId());

				if (asset == null) {
					continue;
				}

				favouritesArray[i] = new FavouriteJSONModel();

				favouritesArray[i].setArticleAuthor(user.getFullName());
				favouritesArray[i].setAuthorAvatar(
					UserConstants.getPortraitURL(PortalUtil.getPathImage(), user.getMale(),
							user.getPortraitId(), user.getUserUuid()));
				favouritesArray[i].setCreateDate(
					DateFormat.getDateInstance(DateFormat.MEDIUM).format(asset.getCreateDate()));
				favouritesArray[i].setArticleTitle(asset.getTitle());
				favouritesArray[i].setArticleCategory(asset.getCategories());
				favouritesArray[i].setTagNames(getTags(asset));

				i++;
			}

			return favouritesArray;
		}
		catch (PortalException e) {
			e.printStackTrace();
		}

		return null;
	}

	private String[] getTags(AssetEntry assetEntry) {
		List<AssetTag> tags = AssetTagLocalServiceUtil.getAssetEntryAssetTags(assetEntry.getEntryId());

		String[] tagNames = new String[tags.size()];

		int i = 0;

		for (AssetTag tag : tags) {
			tagNames[i] = tag.getName();
		}

		return tagNames;
	}

	private Response _accepted() {
		Response.ResponseBuilder responseBuilder = Response.accepted();

		return responseBuilder.build();
	}

	private Response _badRequest() {
		Response.ResponseBuilder responseBuilder = Response.status(400);

		return responseBuilder.build();
	}
}
