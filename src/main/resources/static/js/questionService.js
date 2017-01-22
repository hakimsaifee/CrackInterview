(function () {
	
	var injectParams = ['$http'];
	
	var questionsFactory = function($http) {
		
		factory={};
		
		factory.getAllQuestions = function (pageNumber,pageSize) {
			return getAllPagedQuestions(pageNumber,pageSize);
		};
		
		factory.getQuestionsByTopicId = function (topicId, pageNumber, pageSize) {
			return getQuestionsByTopicId(topicId, pageNumber, pageSize);
		};
		
		factory.getQuestionById = function(questionId) {
			return getQuestionById(questionId);
		};
		
		factory.executeCode = function(code) {
			return executeCode(code);
		};
		
		
		function getAllPagedQuestions(pageNumber,pageSize) {
			var uri  = 'question/getAll' + "/" + pageNumber + "/" +pageSize;
			return $http({method : 'GET', url : uri}); 
		};
		
		function getQuestionsByTopicId(topicId, pageNumber, pageSize) {
			console.log('Topic Id : '+topicId + 'PageNumber : ' + pageNumber + 'Page Size : ' +pageSize);
			var uri  = 'question/getByTopicId/' + topicId + "/" + pageNumber + "/" +pageSize;
			return $http({method : 'GET', url : uri}); 
		};
		
		function getQuestionById(questionId) {
			return $http({method : 'GET', url : 'question/get/' + questionId});
		};
		
		function executeCode(code) {
			
			var data = {
					code : code
			}
			
			return $http({method : 'POST', url : '/question/code', data : data});
			
			 /* $http.post('/question/code', data)
	            .success(function (data, status, headers, config) {

	            	console.log('Response ' + data.output);
	            	return data.output;
	            })
	            .error(function (data, status, header, config) {
	                
	            });*/
		};
		function buildUri() {
		};
		
		return factory;
	};
	
	
	questionsFactory.$inject = injectParams;
	angular.module('crackInterviewApp').factory('questionService', questionsFactory);
	
}());