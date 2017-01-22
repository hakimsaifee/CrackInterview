var crackInterviewApp = angular.module('crackInterviewApp', [ 'studentService',
		'ngRoute' ,'ngAnimate', 'ngSanitize', 'ui.bootstrap']);

crackInterviewApp.controller('StudentController1', function($scope, $location,
		$routeParams, fetchAllStudents) {

	/*$scope.students = [ {
		name : 'Hakim',
		city : 'Ujjain'
	}, {
		name : 'Saifee',
		city : 'Pune'
	} ];*/

	$scope.questions = [];
	$scope.technologies = [];
	$scope.topics = [];
	$scope.questionId = $routeParams.questionId;
	$scope.question;
	  $scope.totalItems = 64;
	  $scope.currentPage = 1;
	  $scope.maxSize = 5;
	  $scope.bigTotalItems = 175;
	  $scope.bigCurrentPage = 1;

	fetchAllStudents.fetchStudents().success(function(response) {
		$scope.topics = response;
	})

	fetchAllStudents.fetchQuestions($routeParams.topicId, $scope.currentPage, 3).success(
			function(response) {
				$scope.questions = response;
				 $scope.totalItems = 34;
			})

	fetchAllStudents.fetchQuestionById($routeParams.questionId).success(
			function(response) {
				$scope.question = response;
			})

	$scope.message = "Click to view Student list."
	$scope.isActive = function(viewLocation) {
		var active = (viewLocation === $location.path());
		return active;
	};

	
	  $scope.pageChanged = function() {
		  var path =  '/javaQuestions/' + $scope.topicId; 
		  console.log('Page changed to: ' + $scope.currentPage);
		  console.log('Page changed to: ' + path);
		    
			$scope.go(path, $scope.topicId);
		  };
		  
	$scope.go = function(path,topicId) {
		console.log('Path : ' + path);
		console.log('ttt ' + topicId)
		$scope.topicId = topicId;
	    $location.path(path);
	};
});

crackInterviewApp.controller('TopicController', function($scope, topicService) {
	
	topicService.fetchStudents().success(function(response) {
		$scope.topics = response;
	})
});

crackInterviewApp.config(function($routeProvider) {

	$routeProvider.when('/home', {
		templateUrl : "showQuestions",
		controller : "StudentController1"
	}).when('/javaQuestions/:topicId', {
		templateUrl : "showQuestions",
		controller : "StudentController1"
	}).when('/showQuestionDetail/:questionId', {
		templateUrl : "showQuestionDetail",
		controller : "StudentController1"
	}).otherwise({
		redirectTo : '/home'
	});
});

crackInterviewApp.filter('cut', function() {

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
			//Also remove . and , so its gives a cleaner result.
			if (value.charAt(lastspace - 1) == '.'
					|| value.charAt(lastspace - 1) == ',') {
				lastspace = lastspace - 1;
			}
			value = value.substr(0, lastspace);
		}

		return value + (tail || ' …');

	};
});
