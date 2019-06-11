package com.grow.favourites.rest.model;

import com.liferay.asset.kernel.model.AssetCategory;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Norbert Kocsis
 *
 */
@XmlRootElement
public class FavouriteJSONModel {

	@XmlElement
	public String getArticleAuthor() {
		return _articleAuthor;
	}

	public void setArticleAuthor(String _articleAuthor) {
		this._articleAuthor = _articleAuthor;
	}

	@XmlElement
	public String getAuthorAvatar() {
		return _authorAvatar;
	}

	public void setAuthorAvatar(String _authorAvatar) {
		this._authorAvatar = _authorAvatar;
	}

	@XmlElement
	public String getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(String _createDate) {
		this._createDate = _createDate;
	}

	@XmlElement
	public String getArticleTitle() {
		return _articleTitle;
	}

	public void setArticleTitle(String _articleTitle) {
		this._articleTitle = _articleTitle;
	}

	@XmlElement
	public String getArticleCategory() {
		return _articleCategory;
	}

	public void setArticleCategory(List<AssetCategory> categories) {
		if (!categories.isEmpty()) {
			this._articleCategory = categories.get(0).getName();
		}
	}

	@XmlElement
	public String[] get_tagNames() {
		return _tagNames;
	}

	public void set_tagNames(String[] _tagNames) {
		this._tagNames = _tagNames;
	}

	private String _articleAuthor;
	private String _authorAvatar;
	private String _createDate;
	private String _articleTitle;
	private String _articleCategory;
	private String[] _tagNames;
}
