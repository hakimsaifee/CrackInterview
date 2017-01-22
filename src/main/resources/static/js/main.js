var mainApp = angular.module('mainApp', ['studentService', 'ngRoute' ]);

mainApp.config(function($routeProvider) {

	$routeProvider.when('/home', {
		templateUrl : "home1",
		controller : "StudentController"
	}).when('/viewStudents', {
		templateUrl : "viewStudents",
		controller : "StudentController"
	}).otherwise({
		redirectTo : '/home'
	});
});

mainApp.controller('StudentController', function($scope, fetchAllStudents) {

	/*$scope.students = [ {
		name : 'Hakim',
		city : 'Ujjain'
	}, {
		name : 'Saifee',
		city : 'Pune'
	} ];*/
	
	$scope.questions = [];
	
	fetchAllStudents.fetchStudents().success( function(response) {
		$scope.students = response;
	})

	
	$scope.message = "Click to view Student list."
});