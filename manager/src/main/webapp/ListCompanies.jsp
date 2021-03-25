<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/company/edit" var="linkEditCompany" />
<c:url value="/company/delete" var="linkDeleteCompany" />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Companies Registered</title>
	</head>
	<body>
		<h1>All companies registered in the system</h1>
	
		<ul>
			<c:forEach var="company" items="${ companies }" >
				<li> ${ company.name } - <fmt:formatDate value="${ company.initialDate }" pattern="dd/MM/yyyy" /> </li>
			</c:forEach>		
		</ul>
	
	</body>
</html>