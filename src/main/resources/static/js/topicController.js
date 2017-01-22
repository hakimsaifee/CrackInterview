(function () {

	var injectParams = ['$location', '$routeParams', '$window', 'topicService'];
	var TopicController = function($location, $routeParams, $window, topicService) {

	
		var vm = this,
			technologyId = $routeParams.technologyId ? parseInt($routeParams.technologyId) : 0;

		var topics = [];

		var topicId = 0;
		
		function init() {
			console.log('init' + technologyId);
			getTopicsByTechnologyId(technologyId);
		};
		
		function getTopicsByTechnologyId(technologyId) {
			if (technologyId > 0) {
				topicService.getTopicsByTechnologyId(technologyId).success(function(response) {
					vm.topics = response;
					console.log('data' + response);
				}).error(function(data, status, headers, config) {
					$window.alert('Sorry, an error occurred: '
							+ data.message);
				}); 
				
			}
		};
		
		vm.topicChanged = function (topicId) {
			console.log('Topic Changed : ' + topicId);
			
		};
		
		init();

	};

	TopicController.$inject = injectParams;

	angular.module('crackInterviewApp').controller('TopicController',
			TopicController);
	
}());
	