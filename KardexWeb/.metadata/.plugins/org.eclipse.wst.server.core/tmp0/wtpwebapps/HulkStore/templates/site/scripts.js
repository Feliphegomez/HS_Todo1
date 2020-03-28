// Set config defaults when creating the instance
const API = axios.create({
  baseURL: '/HulkShop'
});

// Modificar valores predeterminados despu�s de que se haya creado la instancia para agregar un token
// instance.defaults.headers.common['Authorization'] = AUTH_TOKEN;

// 0. Si utiliza un sistema de m�dulos (por ejemplo, a trav�s de vue-cli), importe Vue y VueRouter y luego llame a `Vue.use (VueRouter)`
// 1. Definir componentes de ruta.
// Estos pueden importarse desde otros archivos
const Request = { template: '<div>Request</div>' }

var Home = Vue.extend({
	template: '#home-template',
	data(){
		return {
		};
	},
	mounted: function () {
		var self = this;
		console.log("Iniciando Home Vue");
		// self.load();
	},
	computed: {
		filters(){
			var self = this;
			return [1,2,3];
		}
	},
	methods: {
	}
});

var Profile = Vue.extend({
	template: '#vue_profile',
	data(){
		return {
		};
	},
	mounted: function () {
		var self = this;
		// self.load();
	},
	computed: {
		filters(){
			var self = this;
			return [1,2,3];
		}
	},
	methods: {
	}
});

var Shop = Vue.extend({
	template: '#vue_shop',
	data(){
		return {
			records: [],
		};
	},
	mounted: function () {
		var self = this;
		self.load();
		
	},
	computed: {
		filters(){
			var self = this;
			return [1,2,3];
		}
	},
	methods: {
		load(){
			var self = this;
			API.get("/ApiProducts", { params: {
				
			} })
			.then(function (response) {
				// handle success
			    console.log(response);
			    self.records = (response.data);
			})
			.catch(function (error) {
				// handle error
			    console.log(error);
			})
			.then(function () {
			    // always executed
			});
		}
	}
});

//2. Definir rutas.
/** 
 * Cada ruta debe mapearse a un componente. 
 * El "componente" puede ser un constructor de componentes real creado a trav�s de `Vue.extend ()`, 
 * o simplemente un objeto de opciones de componentes.
 */
const routes = [
	{ path: '/', name: 'Home', component: Home },
	{ path: '/Profile', name: 'Profile', component: Profile },
	// { path: '/Request', name: 'Request', component: Request },
	// { path: '/Shop', name: 'Shop', component: Shop },
	// { path: '/adminKardex', name: 'adminKardex', component: adminKardex },
	// { path: '/Help', name: 'Help', component: Help },
]

// 3. Cree la instancia del enrutador y pase la opci�n de 'rutas'. Puede pasar opciones adicionales aqu�, pero seamos simples por ahora.
const router = new VueRouter({
	routes
})

// 4. Cree y monte la instancia ra�z. 
// Aseg�rese de inyectar el enrutador con la opci�n de enrutador para que toda la aplicaci�n sea compatible con el enrutador.
const app = new Vue({
	router,
	data(){
		return {
			Me: {
				userid: 0,
				username: "",
				password: "",
				fullname: "",
			},
			activeClass: 'active',
		};
	},
	created(){
		var self = this;
		self.loadScripts();
	},
	computed: {
		currentPage(){
			var self = this;
			return self.$route.path;
		},
	},
	mounted(){
		var self = this;
		API.get("/Me", { params: {
			
		} })
		.then(function (response) {
			// handle success
		    console.log(response);
		    self.Me = response.data;
		})
		.catch(function (error) {
			// handle error
		    console.log(error);
		})
		.then(function () {
		    // always executed
		});
	}, 
	methods: {
		loadScripts(){
			$('.main-search').hide();
				$('button').click(function (){
					$('.main-search').show();
					$('.main-search text').focus();
				}
			);
			$('.close').click(function(){
				$('.main-search').hide();
			});
			


			function DropDown(el) {
				this.dd = el;
				this.placeholder = this.dd.children('span');
				this.opts = this.dd.find('ul.dropdown > li');
				this.val = '';
				this.index = -1;
				this.initEvents();
			}
			DropDown.prototype = {
				initEvents : function() {
					var obj = this;

					obj.dd.on('click', function(event){
						$(this).toggleClass('active');
						return false;
					});

					obj.opts.on('click',function(){
						var opt = $(this);
						obj.val = opt.text();
						obj.index = opt.index();
						obj.placeholder.text(obj.val);
					});
				},
				getValue : function() {
					return this.val;
				},
				getIndex : function() {
					return this.index;
				}
			}

			$(function() {

				var dd = new DropDown( $('#dd') );

				$(document).click(function() {
					// all dropdowns
					$('.wrapper-dropdown-3').removeClass('active');
				});

			});

		},
	}
}).$mount('#vue_app');
