<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Date</title>
<script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
	<h1> <c:out value="${dateNow}"/> </h1>
	<a href="http://localhost:8080/">Back to Dashboard</a>
	
</body>
</html>