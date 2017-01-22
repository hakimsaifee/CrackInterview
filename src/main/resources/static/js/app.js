(function() {
	
	var app =angular.module('crackInterviewApp', ['ngRoute','ui.bootstrap']);
	
	app.config(['$routeProvider', function($routeProvider) {
		
		$routeProvider.when('/home1', {
			controller: "TopicController",
			templateUrl: "showTopics",
			controllerAs: "vm"
		}).when('/showTopics/:technologyId', {
			controller: "TopicController",
			templateUrl: "showTopics",
			controllerAs: "vm"
		}).when('/showQuestions/:topicId', {
			controller: "QuestionController",
			templateUrl: "showQuestions",
			controllerAs: "vm"
		}).when('/showQuestionDetail/:questionId', {
			controller : "QuestionDetailController",
			templateUrl : "showQuestionDetail",
			controllerAs: "vm"
		}).otherwise({
			redirectTo : '/home'
		});
	}]);
	
}());