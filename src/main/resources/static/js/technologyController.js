(function () {

	var injectParams = ['$location', '$routeParams', '$window', 'topicService'];
	var TechnologyController = function($location, $routeParams, $window, topicService) {

	
		var vm = this;

		var technologies = [];
		var isEnableTopicView = false;
		
		technologyId = 1;
		
		var topics = [];
		
		function enableTopicView() {
			vm.isEnableTopicView = true;
		};
		
		
		function init() {
			console.log('init' + technologyId);
			getTopicsByTechnologyId(technologyId);
			changePath('/showQuestions/' + 0);
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
			changePath('/showQuestions/' + topicId);
		};
		
		vm.technologyChanged = function (techId) {
			console.log('Tech Changed : ' + techId);
			vm.technologyId = techId ? parseInt(techId) : 0;
			getTopicsByTechnologyId(vm.technologyId);
			changePath('/showQuestions/' + 0);
		};
		
		function changePath(path) {
			$location.path(path);
		};

		
		init();
	};

	TechnologyController.$inject = injectParams;

	angular.module('crackInterviewApp').controller('TechnologyController',
			TechnologyController);
	
}());
	