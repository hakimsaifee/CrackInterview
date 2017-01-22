var simpleApp = angular.module('firstApp', []);

simpleApp.controller('SimpleController', ['$scope', function($scope) {
	$scope.name = 'Default';
	
	$scope.fistButtonClicked = function() {
		$scope.name = 'First';
	};
	
	$scope.secondButtonClicked = function () {
		$scope.name = 'Second';
	};
}]);