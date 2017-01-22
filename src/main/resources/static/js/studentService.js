var questionService = angular.module('studentService', []);

questionService.factory('fetchAllStudents', function($http) {
	
	var questions = [];
	var question;
	
	questions.fetchStudents = function() {
		
		return $http({method : 'GET', url : 'topic/getAll'}); 
	}
	
	questions.fetchQuestions = function(topicId, pageNumber, pageSize) {
		if (topicId == undefined) {
			console.log('Undefined');
			return $http({method : 'GET', url : 'question/getAll'}); 
		}
		return $http({method : 'GET', url : 'question/getByTopicId/' + topicId + "/" + pageNumber + "/" +pageSize}); 
	}

	questions.fetchQuestionById = function(questionId) {
//		if (questionId != undefined) {
			return $http({method : 'GET', url : 'question/get/' + questionId}); 
//		} else {
//		}
	}
	/*questions.fetchAllQuestions = function() {
		
		return $http({method : 'GET', url : 'question/getAll'}); 
	}*/
	
	return questions;
	
	
});
