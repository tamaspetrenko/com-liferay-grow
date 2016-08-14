AUI().ready(
	'liferay-sign-in-modal',
	function(A) {
		var signIn = A.one('.sign-in > a');

		if (signIn && signIn.getData('redirect') !== 'true') {
			signIn.plug(Liferay.SignInModal);
		}
	}
);

/*
 * Revolution custom js file
 * Author: Design_mylife
 * 
 */

//full width slider


jQuery(document).ready(function () {

    revapi = jQuery('.tp-banner').revolution(
            {
                delay: 6000,
                startwidth: 1170,
                startheight: 600,
                hideThumbs: 10,
                fullWidth: "on",
                forceFullWidth: "on",
                navigationStyle: "preview4"
            });

});