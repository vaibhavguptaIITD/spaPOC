angular.module("enrollment")
.controller("EnrollmentCtrl", function($scope, EnrollmentService,$location){
	EnrollmentService.getInitialEnrollment()
	.then(function(data){
		$scope.enrollment = data;
		return EnrollmentService.getCurrentSection();
	})
	.then(function(data){
		$scope.sectionDTO = data;
	});
	
	$scope.$watch("sectionDTO", function(sectionDTO){
		if(sectionDTO){
			$location.url('/enrollment/'+sectionDTO.section);
		}
	});
	
	$scope.previous = function(){
		EnrollmentService.getPreviousSection()
		.then(function(data){
			$scope.sectionDTO = data;
		})
	};
	
	$scope.submit = function(){
		EnrollmentService.submit($scope.enrollment)
		.then(function(data){
			$scope.sectionDTO = data;
		});
	}
	
});