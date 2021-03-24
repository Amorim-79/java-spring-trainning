<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<core:url value="/company/list" var="linkListCompany" />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Companies Registered</title>
	</head>
	<body>
		<h1>All companies registered in the system</h1>
	
		<ul>
			<core:forEach item="companies" var="company">
				<li> ${ company.name } - ${ company.initialDate } </li>
			</core:forEach>		
		</ul>
	
	</body>
</html>