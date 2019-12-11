package com.grow.favourites.rest.application;

import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;

/**
 * @author Norbert Kocsis
 */
@Component(
	property = {
		"auth.verifier.BasicAuthHeaderAuthVerifier.urls.includes=/*",
		"auth.verifier.PortalSessionAuthVerifier.urls.includes=/*",
		"osgi.jaxrs.application.base=/favourites",
		"osgi.jaxrs.extension.select=(osgi.jaxrs.name=jaxb-json)",
		"osgi.jaxrs.extension.select=(osgi.jaxrs.name=Liferay.Vulcan)",
		"osgi.jaxrs.name=Grow.Favourites.REST"
	},
	service = Application.class
)
public class GrowFavouritesRestApplication extends Application {
}