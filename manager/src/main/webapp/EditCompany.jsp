<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/company/edit" var="linkEditCompany" />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Edit Company</title>
	</head>
	<body>
	

		<h1>Edit Company</h1>
	
		<form action="${ linkEditCompany }" method="post">
		
			<label for="companyName">Company name</label>
			<input type="text" name="companyName" value="${ company.name }"/>
			
			<label for="initialDateCompany">Initial Company Date</label>
			<input type="date" name="initialDateCompany" value="<fmt:formatDate value="${ company.initialDate }" pattern="yyyy-MM-dd" />"/>
			
			<input type="hidden" name="id" value="${ company.id }"/>
			
			<button type="submit">Submit</button>
		</form>
	
	</body>
</html>