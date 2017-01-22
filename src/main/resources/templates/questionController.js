var crackInterviewApp = angular.module('crackInterviewApp', ['questionService', 'ngRoute']);


//Controller for question.
crackInterviewApp.controller('questionController', ['$scope', function($scope, fetchAllQuestions) {

	$scope.questions = [];
	
	fetchAllQuestions.fetchQuestions().success( function(response) {
		$scope.questions = response;
	})

};
}]);


crackInterviewApp.config(['$routeProvider', function($routeProvider) {
	
	$routeProvider.when("/javaQuestions", {templateUrl: "questionGrid.html", controller: "questionController"});
}]);