<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="pageNav" tagdir="/WEB-INF/tags" %> 
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
</head>
<body>

<h1>Logout Page</h1>


<form action="/customLogout" method="post">

<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }">
<button>로그아웃</button>

</form>

</body>
</html>
