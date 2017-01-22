var questionService = angular.module('questionService', []);

questionService.factory('fetchAllQuestions', function($http) {
	
	var questions = {};
	
	questions.fetchQuestions = function() {
		
		return $http({method : 'GET', url : '/technology/getAll'}); 
	}
	
	return questions;
});
