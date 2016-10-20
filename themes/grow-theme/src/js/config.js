Loader.addModule(
	{
		dependencies: [],
		exports: '$.fn.owlCarousel',
		name: 'owl',
		path: '/o/grow-theme/js/owl/owl.carousel.min.js'
	}
);

Loader.addModule(
	{
		dependencies: [],
		exports: '$.fn.swipe',
		name: 'swipe',
		path: '/o/grow-theme/js/revolution/jquery.themepunch.tools.min.js'
	}
);

Loader.addModule(
	{
		dependencies: ['swipe'],
		exports: '$.fn.revolution',
		name: 'revolution',
		path: '/o/grow-theme/js/revolution/jquery.themepunch.revolution.min.js'
	}
)