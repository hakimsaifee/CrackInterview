(function() {

	var injectParams = [ '$location', '$routeParams', 'questionService' ];

	var QuestionController = function($location, $routeProvider,
			questionService) {

		var vm = this, topicId = $routeProvider.topicId ? parseInt($routeProvider.topicId)
				: 0;

		var questions = [];

		vm.totalRecords = 0;
		vm.pageSize = 3;
		vm.currentPage = 1;

		function init() {
			console.log('Initializing Question Controller.');
			if (topicId > 0) {
				getQuestionsByTopicId(topicId, vm.currentPage, vm.pageSize);
			} else {
				getAllQuestions(vm.currentPage, vm.pageSize);
			}
		}
		;

		function getAllQuestions(pageNumber, pageSize) {
			console.log('Topic Id' + vm.topicId);
			if (topicId == 0) {
				questionService.getAllQuestions(pageNumber, pageSize).success(
						function(data, status, headers, config) {
							console.log('Question Response' + data);
							vm.questions = data.elements;
							vm.totalRecords = data.totalRecords;
						}).error(function(data, status, headers, config) {
					console.log('Error while fetching the questions.');
				})
			}
		}
		;

		function getQuestionsByTopicId(topicId, pageNumber, pageSize) {
			questionService
					.getQuestionsByTopicId(topicId, pageNumber, pageSize)
					.success(function(data, status, headers, config) {
						console.log('Question By Id : ' + data);
						vm.questions = data.elements;
						vm.totalRecords = data.totalRecords;
					});
		}
		;

		vm.pageChanged = function(page) {
			console.log('Page Changed :' + page);
			vm.currentPage = page;
			if (topicId > 0) {
				getQuestionsByTopicId(topicId, vm.currentPage, vm.pageSize);
			} else {
				getAllQuestions(vm.currentPage, vm.pageSize);
			}
		};

		init();

	};

	var limitFilter = function() {

		return function(value, max, tail) {
			if (!value)
				return '';

			max = parseInt(max, 10);
			if (!max)
				return value;
			if (value.length <= max)
				return value;

			value = value.substr(0, max);
			var lastspace = value.lastIndexOf(' ');
			if (lastspace != -1) {
				// Also remove . and , so its gives a cleaner result.
				if (value.charAt(lastspace - 1) == '.'
						|| value.charAt(lastspace - 1) == ',') {
					lastspace = lastspace - 1;
				}
				value = value.substr(0, lastspace);
			}

			return value + (tail || ' …');

		};
	};

	QuestionController.$inject = injectParams;
	// angular.module('crackInterviewApp', ['ngAnimate', 'ngSanitize',
	// 'ui.bootstrap']);
	angular.module('crackInterviewApp').controller('QuestionController',
			QuestionController).filter('cut', limitFilter);

}());