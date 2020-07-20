﻿Up to date with the fix for OWXP-190 and OWXP-229 as of February 22, 2017

<script type="text/javascript">
	$(function () {
		$('[data-toggle="tooltip"]').tooltip()
	});
	$(document).ready(function () {
		$(".sidenav-content .list-group").owlCarousel({
			autoPlay: 4000,
			items: 3,
			itemsDesktop: [1199, 3],
			itemsDesktopSmall: [979, 3],
			itemsTablet: [768, 2],
			itemsMobile: [479, 1],
			pagination: false,
			navigation: true,
			navigationText: ["<i class='fa fa-angle-left'>", "<i class='fa fa-angle-right'>"]
		});
		$(".wiki-actions .rating-thumb-up").addClass("btn btn-default btn-block");
		$(".wiki-actions .rating-thumb-down").addClass("btn btn-default btn-block");
	});
	</script>
	
	<#assign wikiPageClassName = "com.liferay.wiki.model.WikiPage" >
	<#assign wikiNodeClassName = "com.liferay.wiki.model.WikiNode" >
	<#assign serviceContext = staticUtil["com.liferay.portal.kernel.service.ServiceContextThreadLocal"].getServiceContext()>
	<#assign httpServletRequest = serviceContext.getRequest()>
	<#assign pubFriendlyURL = prefsPropsUtil.getString(companyId, "layout.friendly.url.public.servlet.mapping")>
	<#assign privateFriendlyURL = prefsPropsUtil.getString(companyId, "layout.friendly.url.private.group.servlet.mapping")>
	<#assign UserLocalService = serviceLocator.findService("com.liferay.portal.kernel.service.UserLocalService")>
	<#assign AssetTagLocalService = serviceLocator.findService("com.liferay.asset.kernel.service.AssetTagLocalService")>
	<#assign AssetCategoryLocalService = serviceLocator.findService("com.liferay.asset.kernel.service.AssetCategoryLocalService")>
	<#assign SubscriptionLocalService = serviceLocator.findService("com.liferay.portal.kernel.service.SubscriptionLocalService")>
	<#assign isSubscribedPage = SubscriptionLocalService.isSubscribed(entry.getCompanyId(), themeDisplay.getUserId(), wikiPageClassName, entry.getResourcePrimKey())>
	<#assign isSubscribedWiki = SubscriptionLocalService.isSubscribed(entry.getCompanyId(), themeDisplay.getUserId(), wikiNodeClassName, entry.getNodeId())>
	<#assign tags = AssetTagLocalService.getAssetEntryAssetTags(assetEntry.getEntryId())>
	<#assign categories = AssetCategoryLocalService.getAssetEntryAssetCategories(assetEntry.getEntryId())>
	<#assign creatorUser = UserLocalService.getUser(assetEntry.getUserId())>
	<#assign modifierUser = UserLocalService.getUser(entry.getStatusByUserId())>
	<#assign renderURL = renderResponse.createRenderURL()>
	<#assign assetRenderer = assetEntry.getAssetRenderer() />
	<#assign portalURL = portal.getPortalURL(httpServletRequest)>
	<#assign siteFriendlyURL = themeDisplay.getSiteGroup().getFriendlyURL()>
	<#assign pageFriendlyURL = themeDisplay.getLayout().getFriendlyURL()>
	<#if entry.getParentPage()?has_content>
		<#assign parentTitle = entry.getParentPage().getTitle()>
	</#if>
	<div class="row wiki-body">
		<div class="col-md-12 wiki-content">
			<div class="affix wiki-actions">
				<ul class="list-unstyled">
					<li><@displayEditLink/></li>
					<li><@displayFriendlyURL name=entry.getTitle() /></li>
					<li><@displayAddChildLink/></li>
					<li><@displayPageSubscription/></li>
					<li><@displayPageDetails/></li>
					<@getRatings/>
				</ul>
			</div>
			<h1 class="text-default">${entry.getTitle()}</h1>
			<ul class="list-inline post-detail">
				<li><span class="glyphicon glyphicon-user"></span> updated by <a href="${portal.getPortalURL(httpServletRequest) + pubFriendlyURL + "/" + modifierUser.getScreenName()}">${entry.getStatusByUserName()}</a></li>
				<li><span class="glyphicon glyphicon-calendar"></span> ${assetEntry.getModifiedDate()?date}</li>
				<#if categories?has_content>
					<li><span class="glyphicon glyphicon-tag"></span>
						 <#list categories as category>
							<@displayCategory
								 category=category
							 />
						</#list>
					</li>
				</#if>
				<#if tags?has_content>
					<li><span class="glyphicon glyphicon-tag"></span>
						<#list tags as tag>
							<@displayTag
					    		tag=tag
							/>
						</#list>
					</li>
				</#if>
				<li><span class="glyphicon glyphicon-eye-open"></span> ${assetEntry.getViewCount()}</li>
			</ul>
			${formattedContent}
		</div>
	</div>
<#if entry.getAttachmentsFileEntriesCount() gt 0>
	<div class="row attachments content">
		<h4 class="text-default">Attachments</h4>
		<@displayAttachmentSection/>
	</div>
</#if>
<div class="comments content">
	<h4 class="text-default">Comments</h4>
	<@displayComments/>
</div>
<#macro displayEditLink>
	<#assign editPageURL = renderResponse.createRenderURL() />
	${editPageURL.setParameter("mvcRenderCommandName", "/wiki/edit_page")}
	${editPageURL.setParameter("redirect", currentURL)}
	${editPageURL.setParameter("nodeId", entry.getNodeId()?string)}
	${editPageURL.setParameter("title", assetEntry.getTitle())}

	<a class="btn btn-default btn-block" data-toggle="tooltip" data-placement="right" title="Edit" data-animation="true" href="${editPageURL?string}"><span class="glyphicon glyphicon-edit"> </span></a>
</#macro>
<#macro displayFriendlyURL
	name
>
	<#assign wikiTitle = getNormalizedWikiName(name)>
	<a class="btn btn-default btn-block" data-toggle="tooltip" data-placement="right" title="Permalink" data-animation="true" href="${portalURL}${pageFriendlyURL}/${wikiTitle}"><span class="glyphicon glyphicon-link"> </span></a>
</#macro>
<#macro displayPageDetails>
	<#assign viewPageDetailsURL = renderResponse.createRenderURL() />
	${viewPageDetailsURL.setParameter("mvcRenderCommandName", "/wiki/view_page_details")}	
	${viewPageDetailsURL.setParameter("redirect", currentURL)}

	<a class="btn btn-default btn-block" href="${viewPageDetailsURL?string}"><span class="glyphicon glyphicon-info-sign" data-toggle="tooltip" data-placement="right" title="Details" data-animation="true"> </span></a>
</#macro>
<#macro displayAddChildLink>
	<#assign addPageURL = renderResponse.createRenderURL() />
	${addPageURL.setParameter("mvcRenderCommandName", "/wiki/edit_page")}
	${addPageURL.setParameter("redirect", currentURL)}
	${addPageURL.setParameter("nodeId", entry.getNodeId()?string)}
	${addPageURL.setParameter("title", "")}
	${addPageURL.setParameter("editTitle", "1")}
	${addPageURL.setParameter("parentTitle", entry.getTitle())}

	<a class="btn btn-default btn-block" href="${addPageURL?string}"><span class="glyphicon glyphicon-plus" data-toggle="tooltip" data-placement="right" title="Add Child page" data-animation="true"> </span></a>
</#macro>
<#macro displayPageSubscription>
	<#if isSubscribedPage>
		<#assign unsubscribeURL = renderResponse.createActionURL()>
		${unsubscribeURL.setParameter("javax.portlet.action", "/wiki/edit_page")}
		${unsubscribeURL.setParameter("cmd", "unsubscribe")}
		${unsubscribeURL.setParameter("redirect", currentURL)}
		${unsubscribeURL.setParameter("nodeId", entry.getNodeId()?string)}
		${unsubscribeURL.setParameter("title", entry.getTitle()?string)}

		<a class="btn btn-default btn-block" href="${unsubscribeURL?string}"><span class="glyphicon glyphicon-remove" data-toggle="tooltip" data-placement="right" title="Unsubscribe" data-animation="true"> </span></a>
	<#else>
		<#assign subscribeURL = renderResponse.createActionURL()>
		${subscribeURL.setParameter("javax.portlet.action", "/wiki/edit_page")}
		${subscribeURL.setParameter("cmd", "subscribe")}
		${subscribeURL.setParameter("redirect", currentURL)}
		${subscribeURL.setParameter("nodeId", entry.getNodeId()?string)}
		${subscribeURL.setParameter("title", entry.getTitle()?string)}

		<a class="btn btn-default btn-block" href="${subscribeURL?string}"><span class="glyphicon glyphicon-ok" data-toggle="tooltip" data-placement="right" title="Subscribe" data-animation="true"> </span></a>
	</#if>
</#macro>
<#macro displayAttachmentSection>
	<#assign message = "attachments">
	<#if entry.getAttachmentsFileEntriesCount() == 1>
		<#assign message = "attachment">
	</#if>
	<#assign attachments = entry.getAttachmentsFileEntries()>
	<a data-toggle="collapse" href="#attachmentsCollapse" aria-expanded="false" aria-controls="collapseExample">
	<span class="glyphicon glyphicon-paperclip"> </span>
	${entry.getAttachmentsFileEntriesCount()} ${message} <span class="caret"> </span></a><br>
	<div class="collapse" id="attachmentsCollapse">
		<div class="table-responsive">
			<table class="table table-condensed table-hover table-striped table-responsive">
			<tbody>
				<tr>
					<th>Filename</th>
					<th>Size</th>
				</tr>
				<#list attachments as file>
					<#assign downloadURL = portalURL + "/documents/portlet_file_entry/" + file.getGroupId() + "/" + file.getFileName() + "/" + file.getUuid() + "?status=0&download=true">
					<#assign tooltip = "false">
					<#assign title = file.getTitle()>
						<#if title?length gt 60>
							<#assign tooltipMsg = title>
							<#assign title = title[0..50] + "(...)." + file.getExtension()>
							<#assign tooltip = "true">
						</#if>
					<tr>
						<td>
							<#if tooltip == "true">
									<a href="${downloadURL}" data-toggle="tooltip" data-placement="top" title="${tooltipMsg}" data-animation="true">${title}</a>
							<#else>
									<a href="${downloadURL}">${title}</a>
							</#if>
						</td>
						<#assign size = file.getSize()>
						<#assign unit = "B">
						<#if size gt 1000>
							<#assign size = size / 1024>
							<#assign unit = "Kb">
						</#if>
						<#if size gt 1000>
							<#assign size = size / 1024>
							<#assign unit = "Mb">
						</#if>
						<td>${size?string["0.##"]} ${unit}</td>
					</tr>
				</#list>
				</tbody>
			</table>
		</div>
	</div>
</#macro>

<#macro getRatings>
	<@liferay_ui["ratings"]
		className=wikiPageClassName	
		classPK=entry.getResourcePrimKey()
	/>
</#macro>
<#macro displayComments>
	<@liferay_ui["discussion"]
		className=wikiPageClassName
		classPK=entry.getResourcePrimKey()
		formAction="/c/portal/comment/edit_discussion"
		formName="fm2"
		ratingsEnabled=wikiPortletInstanceOverriddenConfiguration.enableCommentRatings()
		redirect=currentURL
		subject=entry.getTitle()
		userId=assetRenderer.getUserId()
	/>
</#macro>
<#macro displayWikiSubscription>
	<#if isSubscribedWiki>
		<#assign unsubscribeURL = renderResponse.createActionURL()>
		${unsubscribeURL.setParameter("javax.portlet.action", "/wiki/edit_node")}
		${unsubscribeURL.setParameter("cmd", "unsubscribe")}
		${unsubscribeURL.setParameter("redirect", currentURL)}
		${unsubscribeURL.setParameter("nodeId", entry.getNodeId()?string)}

		<a href="${unsubscribeURL?string}"><span class="glyphicon glyphicon-remove"> </span> Unsubscribe</a> from this wiki.
	<#else>
		<#assign subscribeURL = renderResponse.createActionURL()>
		${subscribeURL.setParameter("javax.portlet.action", "/wiki/edit_node")}
		${subscribeURL.setParameter("cmd", "subscribe")}
		${subscribeURL.setParameter("redirect", currentURL)}
		${subscribeURL.setParameter("nodeId", entry.getNodeId()?string)}
	
		<a href="${subscribeURL?string}"><span class="glyphicon glyphicon-ok"> </span> Subscribe</a> to this wiki.
	</#if>
</#macro>
<#macro displayTag
	tag
>
	<#assign tagRenderURL = renderResponse.createRenderURL()>
	<#assign tagName = tag.getName()>
	${tagRenderURL.setParameter("mvcRenderCommandName", "/wiki/view_tagged_pages")}
	${tagRenderURL.setParameter("nodeId", entry.getNodeId()?string)}
	${tagRenderURL.setParameter("tag", tagName)}
	
	<a href="${tagRenderURL}">${tagName}</a>
</#macro>
<#macro displayCategory
	category
>
	<#assign categoryRenderURL = renderResponse.createRenderURL()>
	${categoryRenderURL.setParameter("mvcRenderCommandName", "/wiki/view_categorized_pages")}
	${categoryRenderURL.setParameter("nodeId", entry.getNodeId()?string)}
	${categoryRenderURL.setParameter("categoryId", category.getCategoryId()?string)}
	
	<a href="${categoryRenderURL}">${category.getName()}</a>
</#macro>

<#function getNormalizedWikiName string>
	<#return string?replace("á", "a")?replace("é","e")?replace("í","i")?replace("[ú|ü|ű]", "u", "r")?replace("[ó|ö|ő]", "o", "r")?replace("&", "<AMPERSAND>")?replace("'", "<APOSTROPHE>")?replace("@", "<AT>")?replace("]", "<CLOSE_BRACKET>,")?replace(")", "<CLOSE_PARENTHESIS>")?replace(":", "<COLON>")?replace(",", "<COMMA>")?replace("$", "<DOLLAR>")?replace("=", "<EQUAL>")?replace("!", "<EXCLAMATION>")?replace("[", "<OPEN_BRACKET>")?replace("(", "<OPEN_PARENTHESIS>")?replace("#", "<POUND>")?replace("?", "<QUESTION>")?replace(";", "<SEMICOLON>")?replace("/", "<SLASH>")?replace("*", "<STAR>")?replace("+","<PLUS>")?replace(" ","+")>
</#function>