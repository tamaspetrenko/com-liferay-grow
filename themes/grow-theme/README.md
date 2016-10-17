# grow-theme

A liferay theme for GROW baed on _styled theme.

Instructions:

- After you call npm init in this project please add a "liferay-theme.json" with the following content:

{
  "LiferayTheme": {
    "appServerPath": "#liferay_path\\tomcat-8.0.32",
    "deployPath": "#liferay_path\\deploy",
    "url": "#liferay_url",
    "appServerPathPlugin": "#theme_path\\grow-theme\\.web_bundle_build",
    "deployed": true,
    "pluginName": "grow-theme"
  }
} 