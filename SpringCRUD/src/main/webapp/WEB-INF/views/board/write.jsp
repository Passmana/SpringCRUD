<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="pageNav" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head> 
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <div class="container">
 <h1>샘플 쓰기</h1>
 <form action="" method="post">
 <input name="perPageNum" value="${param.perPageNum }" type="hidden">
 <table class="table">
 	<tr>
 		<th>제목</th>
 		<td><input type="text" name="title" required="required"></td>
 	</tr>
 	<tr>
 		<th>내용</th>
 		<td><textarea name="content"></textarea> </td>
 	</tr>
 	<tr>
 		<th>글쓴이</th>
 		<td><input type="text" name="writer" required="required"></td>
 	</tr>
 	
 </table>
 <button class="btn btn-primary">확인</button>
 <button class="btn btn-primary" type="button" onClick="history.back()">취소</button>
 </form>
 </div>
</body>
</html>