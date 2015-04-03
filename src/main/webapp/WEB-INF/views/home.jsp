<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Enrollment Flow</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">	
	
</head>
<body ng-app="enrollment">
	<div ng-controller="EnrollmentCtrl" class="container">
		<div ui-view></div>
		<div class="btn-group" role="group">
  			<button type="button" class="btn btn-default" ng-click="previous();" ng-if="!sectionDTO.first">Previous</button>
  			<button type="button" class="btn btn-default" ng-click="submit();" ng-if="!sectionDTO.last">Continue</button>
		</div>
	</div>
<script type="text/javascript">
	var contextPath = "${pageContext.request.contextPath}";
	var appUrl = "http://localhost:8080";
</script>
<script src="<c:url value="/resources/vendor.js" />" type="text/javascript"></script>
<script src="<c:url value="/resources/angular/app.js" />" type="text/javascript"></script>
<script src="<c:url value="/resources/angular/controllers/enrollmentCtrl.js" />" type="text/javascript"></script>
<script src="<c:url value="/resources/angular/services/enrollmentService.js" />" type="text/javascript"></script>
</body>
</html>