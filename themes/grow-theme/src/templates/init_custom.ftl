<#assign show_header_search = getterUtil.getBoolean(themeDisplay.getThemeSetting("show-header-search"))>
<#assign logo_css_class = "navbar-brand">

<#assign permission_checker = themeDisplay.getPermissionChecker() />

<#assign is_group_admin = permission_checker.isGroupAdmin(group_id) />
<#assign is_omniadmin = permission_checker.isOmniadmin() />

<#assign show_control_menu = is_group_admin || is_omniadmin />