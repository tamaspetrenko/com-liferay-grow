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

	public void setArticleCategory(String categorie) {
		if (!categorie.isEmpty()) {
			this._articleCategory = categorie;
		}
	}

	@XmlElement
	public Long getId() {
		return _id;
	}

	public void setId(Long id) {
		this._id = id;
	}

	@XmlElement
	public String[] getTagNames() {
		return _tagNames;
	}

	public void setTagNames(String[] _tagNames) {
		this._tagNames = _tagNames;
	}

	@XmlElement
	public int getReadCount() {
		return _readCount;
	}

	public void setReadCount(int _readCount) {
		this._readCount = _readCount;
	}

	private String _articleAuthor;
	private String _authorAvatar;
	private String _createDate;
	private String _articleTitle;
	private String _articleCategory;
	private Long _id;
	private int _readCount;
	private String[] _tagNames;
}
