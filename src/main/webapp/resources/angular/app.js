angular.module("enrollment",['ui.router'])
.config(function($stateProvider){
	
	$stateProvider.state('enrollment',{
		url: '/enrollment/:sectionId',
		templateUrl: function($stateParams){
			return appUrl+contextPath+'/enrollment/'+$stateParams.sectionId;
		}
	});
	
});