angular.module("enrollment")
.service("EnrollmentService", function($http, $q){
	var genericPromise = function(promise){
		var deferred = $q.defer();
		promise.success(function(data){
			deferred.resolve(data);
		});
		return deferred.promise;
	};
	this.getInitialEnrollment = function(){
		return genericPromise($http.get(contextPath+'/enrollment'));
	};
	this.getCurrentSection = function(){
		return genericPromise($http.get(contextPath+'/enrollment/currentSection'));
		
	};
	this.getPreviousSection = function(){
		return genericPromise($http.post(contextPath+'/enrollment/previousSection'));
	};
	this.submit = function(enrollment){
		return genericPromise($http.post(contextPath+'/enrollment', enrollment));
	};
});