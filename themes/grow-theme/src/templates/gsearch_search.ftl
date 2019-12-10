<#assign gsearch_preferences = freeMarkerPortletPreferences.getPreferences({"showListed": "false", "portletSetupPortletDecoratorId": "barebone", "targetPortletId": ""}) />

<@liferay_portlet["runtime"]
    defaultPreferences="${gsearch_preferences}"
    portletProviderAction=portletProviderAction.VIEW
    portletName="gsearchminiportlet"
/>
