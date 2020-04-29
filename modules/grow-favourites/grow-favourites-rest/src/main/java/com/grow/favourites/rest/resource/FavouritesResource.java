/**
 * 
 */
package com.grow.favourites.rest.resource;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.grow.favourites.model.Favourite;
import com.grow.favourites.rest.model.FavouriteJSONModel;
import com.grow.favourites.service.FavouriteLocalServiceUtil;
import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.model.AssetTag;
import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.asset.kernel.service.AssetEntryLocalServiceUtil;
import com.liferay.asset.kernel.service.AssetTagLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserConstants;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.ratings.kernel.model.RatingsEntry;
import com.liferay.ratings.kernel.service.RatingsEntryLocalServiceUtil;
import com.liferay.wiki.model.WikiPage;
import com.liferay.wiki.service.WikiPageLocalServiceUtil;
import com.liferay.portal.kernel.util.Validator;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
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
			@QueryParam("assetEntryId") long assetEntryId) {

		try {
			FavouriteLocalServiceUtil.removeFavourite(groupId, assetEntryId, userId);

			return _accepted();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return _badRequest();
	}

	@PUT
	@Path("/addAssetLike")
	public Response addAssetLike(
			@QueryParam("assetEntryId") long assetEntryId,
			@QueryParam("userId") long userId) {

		try {
			User user = UserLocalServiceUtil.fetchUser(userId);
			AssetEntry assetEntry = AssetEntryLocalServiceUtil.fetchAssetEntry(assetEntryId);
			RatingsEntry ratingsEntry = RatingsEntryLocalServiceUtil
					.createRatingsEntry(CounterLocalServiceUtil.increment());

			ratingsEntry.setCompanyId(user.getCompanyId());
			ratingsEntry.setUserId(userId);
			ratingsEntry.setUserName(user.getFullName());
			ratingsEntry.setCreateDate(new Date());
			ratingsEntry.setModifiedDate(new Date());
			ratingsEntry.setClassNameId(assetEntry.getClassNameId());
			ratingsEntry.setClassPK(assetEntry.getClassPK());
			ratingsEntry.setScore(1);

			RatingsEntryLocalServiceUtil.addRatingsEntry(ratingsEntry);
			return _accepted();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return _badRequest();
	}

	@DELETE
	@Path("/removeAssetLike")
	public Response removeAssetLike(
			@QueryParam("userId") long userId,
			@QueryParam("assetEntryId") long assetEntryId) {

		try {
			AssetEntry assetEntry = AssetEntryLocalServiceUtil.fetchAssetEntry(assetEntryId);
			RatingsEntry ratingsEntry = RatingsEntryLocalServiceUtil.fetchEntry(userId, assetEntry.getClassName(),
					assetEntry.getClassPK());

			RatingsEntryLocalServiceUtil.deleteRatingsEntry(ratingsEntry);
			return _accepted();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return _badRequest();
	}

	@GET
	@Path("/getAssetsLikedByUserId")
	@Produces(MediaType.APPLICATION_JSON)
	public String getAssetsLikedByUserId(
			@QueryParam("userId") long userId,
			@QueryParam("amount") long amount,
			@QueryParam("random") boolean random,
			@QueryParam("content") boolean content) {

		if (Validator.isNotNull(userId)) {
			JSONObject ratings = JSONFactoryUtil.createJSONObject();

			DynamicQuery dynamicQuery = RatingsEntryLocalServiceUtil.dynamicQuery();
			dynamicQuery.add(RestrictionsFactoryUtil.eq("userId", userId));

			List<RatingsEntry> ratingsEntries = new ArrayList<>(
					RatingsEntryLocalServiceUtil.dynamicQuery(dynamicQuery));
			JSONArray ratingsArray = JSONFactoryUtil.createJSONArray();

			if (Validator.isNotNull(amount)) {
				if (random && ratingsEntries.size() > 0) Collections.shuffle(ratingsEntries);
				ratingsEntries = ratingsEntries.stream().limit(amount).collect(Collectors.toList());
			}
			
			for (RatingsEntry ratingsEntry : ratingsEntries) {

				try {
					AssetEntry assetEntry = AssetEntryLocalServiceUtil.fetchEntry(ratingsEntry.getClassNameId(),
							ratingsEntry.getClassPK());
					ratingsArray.put(getAsset(assetEntry, content));
				} catch (Exception e) {
						e.printStackTrace();
				}
			}

			ratings.put("data", ratingsArray);
			return ratings.toString();
		}

		return null;
	}

	@GET
	@Path("/getContent")
	@Produces(MediaType.APPLICATION_JSON)
	public String getContent(
			@QueryParam("assetEntryId") Long assetEntryId) {

		AssetEntry assetEntry = AssetEntryLocalServiceUtil.fetchAssetEntry(assetEntryId);
		return getAsset(assetEntry, true).toString();

	}

	@GET
	@Path("/isFavouriteAndLikedArray")
	@Produces(MediaType.APPLICATION_JSON)
	public String isFavouriteAndLikedArray(
			@QueryParam("groupId") long groupId,
			@QueryParam("userId") long userId,
			@QueryParam("assetEntryId") Long[] assetEntryIds) {

		JSONObject response = JSONFactoryUtil.createJSONObject();
		for (int i = 0; i < assetEntryIds.length; i++) {

			JSONArray array = JSONFactoryUtil.createJSONArray();
			JSONObject obj = JSONFactoryUtil.createJSONObject();
			AssetEntry assetEntry = AssetEntryLocalServiceUtil.fetchAssetEntry(assetEntryIds[i]);
			RatingsEntry ratingsEntry = RatingsEntryLocalServiceUtil.fetchEntry(userId, assetEntry.getClassName(),
					assetEntry.getClassPK());
			if (ratingsEntry == null) {
				obj.put("liked", false);
			} else {
				obj.put("liked", true);
			}
			obj.put("favourite", FavouriteLocalServiceUtil.isFavourite(groupId, userId, assetEntryIds[i]));
			array.put(obj);
			response.put(assetEntryIds[i].toString(), array);
		}

		return response.toString();
	}

	private FavouriteJSONModel[] getUserFavouritesJSON(long groupId, long userId) {
		try {
			Collection<Favourite> favourites = FavouriteLocalServiceUtil.getUserFavourites(groupId, userId);

			FavouriteJSONModel[] favouritesArray = new FavouriteJSONModel[favourites.size()];

			int i = 0;

			for (Favourite favourite : favourites) {
				
				AssetEntry asset = AssetEntryLocalServiceUtil.fetchAssetEntry(favourite.getAssetEntryId());

				if (asset == null) {
					continue;
				}
				
				User user = UserLocalServiceUtil.fetchUser(asset.getUserId());
				WikiPage wikiPage = WikiPageLocalServiceUtil.getPage(asset.getClassPK());
				
				
				String parentTitle = wikiPage.getTitle();

				if (!parentTitle.equals("Learn") && !parentTitle.equals("Share") && !parentTitle.equals("People")
						&& !parentTitle.equals("Excellence")) {

					parentTitle = wikiPage.getParentTitle();

					while (Validator.isNotNull(parentTitle) && !parentTitle.equals("Learn")
							&& !parentTitle.equals("Share") && !parentTitle.equals("People")
							&& !parentTitle.equals("Excellence")) {

						wikiPage = wikiPage.getParentPage();

						parentTitle = wikiPage.getParentTitle();
					}
				}

				if (!parentTitle.equals("Excellence") && !parentTitle.equals("Learn") && !parentTitle.equals("Share")
						&& !parentTitle.equals("People")) {
					parentTitle = "Share";
				}

				favouritesArray[i] = new FavouriteJSONModel();

				favouritesArray[i].setArticleAuthor(user.getFullName());
				favouritesArray[i].setAuthorAvatar(UserConstants.getPortraitURL(PortalUtil.getPathImage(),
						user.getMale(), user.getPortraitId(), user.getUserUuid()));
				favouritesArray[i]
						.setCreateDate(DateFormat.getDateInstance(DateFormat.MEDIUM).format(asset.getCreateDate()));
				favouritesArray[i].setArticleTitle(asset.getTitle());
				favouritesArray[i].setArticleCategory(parentTitle);
				favouritesArray[i].setId(asset.getEntryId());
				favouritesArray[i].setTagNames(getTags(asset));
				favouritesArray[i].setReadCount(asset.getViewCount());

				i++;
			}
			FavouriteJSONModel[] cleanedArray = Arrays.stream(favouritesArray).filter(Objects::nonNull).toArray(FavouriteJSONModel[]::new);
			return cleanedArray;
		} catch (PortalException e) {
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

			i++;
		}

		return tagNames;
	}

	private JSONObject getAsset(AssetEntry assetEntry, boolean content) {

		try {

			AssetRenderer<?> assetRenderer = assetEntry.getAssetRenderer();
			User user = UserLocalServiceUtil.fetchUser(assetRenderer.getUserId());
			JSONObject asset = JSONFactoryUtil.createJSONObject();

			asset.put("articleAuthor", user.getFullName());
			asset.put("articleTitle", assetEntry.getTitle());
			asset.put("authorAvatar", UserConstants.getPortraitURL(PortalUtil.getPathImage(), user.getMale(),
					user.getPortraitId(), user.getUserUuid()));
			asset.put("createDate", DateFormat.getDateInstance(DateFormat.MEDIUM).format(assetEntry.getCreateDate()));

			if (content) {
				asset.put("content", assetRenderer.getSearchSummary(LocaleUtil.getSiteDefault()));
			}

			if (!assetEntry.getTags().isEmpty()) {
				JSONArray tagNames = JSONFactoryUtil.createJSONArray();

				for (String tag : assetEntry.getTagNames()) {
					tagNames.put(tag);
				}

				asset.put("tags", tagNames);
			}

			asset.put("readCount", assetEntry.getViewCount());

			
			WikiPage wikiPage = WikiPageLocalServiceUtil.getPage(assetEntry.getClassPK());

			String parentTitle = wikiPage.getTitle();

			if (!parentTitle.equals("Learn") && !parentTitle.equals("Share") && !parentTitle.equals("People")
					&& !parentTitle.equals("Excellence")) {

				parentTitle = wikiPage.getParentTitle();

				while (Validator.isNotNull(parentTitle) && !parentTitle.equals("Learn")
						&& !parentTitle.equals("Share") && !parentTitle.equals("People")
						&& !parentTitle.equals("Excellence")) {

					wikiPage = wikiPage.getParentPage();

					parentTitle = wikiPage.getParentTitle();
				}
			}

			if (!parentTitle.equals("Excellence") && !parentTitle.equals("Learn") && !parentTitle.equals("Share")
					&& !parentTitle.equals("People")) {
				parentTitle = "Share";
			}

			asset.put("articleCategory", parentTitle);

			asset.put("id", assetEntry.getEntryId());
			asset.put("url", assetEntry.getUrl());
			
			return asset;
		} catch (PortalException pe) {
			pe.printStackTrace();
		}
		return null;

	}

	private Response _accepted() {
		Response.ResponseBuilder responseBuilder = Response.accepted();

		return responseBuilder.build();
	}

	private Response _badRequest() {
		Response.ResponseBuilder responseBuilder = Response.status(400);

		return responseBuilder.build();
	}

	@Reference(target = ModuleServiceLifecycle.PORTAL_INITIALIZED)
	private ModuleServiceLifecycle _portalInitialized;

}
