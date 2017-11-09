app.controller("ctrlListarOrdenes",["$scope","$rootScope","$routeParams","$location",
    function($scope,$rootScope,$routeParams,$location){
		console.log('Entramos en le controlador de listarOrdenes.');
		
		$scope.init = function () {
			$scope.custumerId = sessionStorage.custumerId;
			console.log ("$scope.custumerId", $scope.custumerId);
			$scope.lstOrdenes = {};
			$scope.obtenerOrdenes ();
		}
		
		// Cargamos el listado de ordenes del cliente que nos llegue como parametro en el sessionStorage
		$scope.obtenerOrdenes = function () {
			console.log ('Cargamos la lista de ordenes para el cliente con id:', $scope.custumerId);
			$.ajax({
				url: "api/public/orders/listarOrdenes"
				, success: function(result){
					$scope.lstOrdenes = result;
					
					console.log ('Mostramos la respuesta de listar ordenes');
					console.log ($scope.lstOrdenes);
					$scope.$digest();
				}
			});
		}
		
		$scope.init ();
	}
]);


