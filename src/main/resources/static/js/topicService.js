(function () {
	
	
	var injectParams = ['$http'];
	var topicsFactory = function($http) {
		
		factory = {};
		
		factory.getTopicsByTechnologyId = function(technologyId) {
			
			return getPagedResource(technologyId);
		};
		
		
		function getPagedResource(technologyId) {
			
				var uri  = buildUri(technologyId);
				return $http({method : 'GET', url : uri}); 
		};
		
		function buildUri(technologyId) {
			return 'topic/' + 'getByTechnoloyId' + '?technologyId=' +technologyId;
		};
		
		return factory;
	};
	
	topicsFactory.$inject = injectParams;
	
	angular.module('crackInterviewApp').factory('topicService', topicsFactory);
}());