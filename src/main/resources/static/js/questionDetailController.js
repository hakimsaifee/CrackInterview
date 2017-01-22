(function () {

	var injectParams = ['$location', '$routeParams', '$window', 'questionService'];
	var QuestionDetailController = function($location, $routeParams, $window, questionService) {

	
		var vm = this;
		var showEditor = false;
		var editorText = "";
		var showOutput = false;
		
		questionId = $routeParams.questionId ? parseInt($routeParams.questionId) : 0;

		var question;
		
		var output;
		
		function init() {
			getQuestionDetail(questionId);
			vm.editorText = "import java.util.*;\nimport java.io.*;\n\n\nclass TestCode {\n	public static void main(String[] args) {\n		//insert your code here. \n	}\n}";
		};
		
		function getQuestionDetail(questionId) {
			if (questionId > 0) {
				questionService.getQuestionById(questionId).success(function(response) {
					console.log('question' + response);
					vm.question = response;
				}).error(function(data, status, headers, config) {
					$window.alert('Sorry, an error occurred: '
							+ data.message);
				}); 
				
			}
		};
		
		vm.showCodeEditor = function() {
			vm.showEditor= true;
		};
		
		

		vm.executeCode = function() {
			 questionService.executeCode(vm.editorText).success(function(response) {
				console.log('code' + response.output);
				vm.output = response.output;
				vm.showOutput = true;
			}).error(function(data, status, headers, config) {
				$window.alert('Sorry, an error occurred: '
						+ data.message);
			}); ;
		};

		init();
		
		/*function populateTextArea() {
			retrun "Class TestCode {\n		public static void main(String[] args) {\n	//insert your code here. \n	}\n}";
		};*/ 

	};

	QuestionDetailController.$inject = injectParams;

	angular.module('crackInterviewApp').controller('QuestionDetailController',
			QuestionDetailController);
	
}());
	