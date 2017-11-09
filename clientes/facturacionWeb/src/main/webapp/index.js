var app = angular.module("app", [ "ngRoute", "ngResource" ]);

app.controller("ctrlIndex", [
	"$scope",
	"$location",
	"$rootScope",
	function($scope, $location, $rootScope) {
		
		$scope.listarOrdenes = function() {
			$location.path('/listarOrdenes').search({
				token: Math.random().toString(36).substr(2, 11)
			});
		};

		// Se inicializa la página
		$scope.init = function() {
			console.log('entramos en el controlador del index.');
			
			$scope.lstClientes = {};
			
			$scope.listarClientes ();
		};
		
		$scope.listarClientes = function () {
			console.log ('Cargamos la lista de clientes.');
			$.ajax({
				url: "api/public/custumer/listarClientes"
				, success: function(result){
					$scope.lstClientes = result;
					
					console.log ('Mostramos la respuesta de listar clientes');
					console.log ($scope.lstClientes);
					
					$scope.$digest();
					
					if ($scope.lstClientes.length == 1) {
						$scope.cliente = $scope.lstClientes[0].custumerId;
					}
				}
			});
		}
		
		$scope.cargarOrdenes = function () {
			if ($scope.cliente == undefined || $scope.cliente == '') {
				alert ('Por favor seleccione un cliente');
			}
			else {
				console.log ('Iniaciamos la carga de las ordenes.');
				// Seteamos en el sessionStorage el id del client selecionado.
				sessionStorage.setItem( "custumerId", $scope.cliente );
				// Cargamos la lista de ordenes.
				$scope.listarOrdenes ();
			}
		}
		
		$scope.init ();
	}
]);

app.config(function($routeProvider, $locationProvider) {
	$routeProvider.when('/listarOrdenes', {
		templateUrl : 'app/componentes/listar-ordenes/listar-ordenes.html',
		controller	: 'ctrlListarOrdenes',
	}).otherwise({
		redirectTo: '/'
	});
});