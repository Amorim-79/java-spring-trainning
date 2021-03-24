<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<core:url value="/company/new" var="linkNewCompany" />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Register Company</title>
	</head>
	<body>
	

		<h1>Register new Company</h1>
	
		<form action="${ linkNewCompany }" method="post">
		
			<label for="companyName">Company name</label>
			<input type="text" name="companyName"/>
			
			<label for="initialDateCompany">Initial Company Date</label>
			<input type="date" name="initialDateCompany"/>
			
			<button type="submit">Submit</button>
		</form>
	
	</body>
</html>