<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CreditCard-Invalid</title>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<div id='msg'>Invalid PAN Entry !!!</div>
<a href='${contextPath}'>Enter Again</a>
</body>
</html>