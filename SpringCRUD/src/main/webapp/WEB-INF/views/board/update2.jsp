<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

 <div class="container">
 <h1>샘플 업데이트</h1>
 
 <form method="post">
 <table class="table">
 	<tr>
 		<th>번호</th>
 		<td><input type="text" name="no" readonly="readonly" value="${vo.no }"></td>
 	</tr>
 	<tr>
 		<th>제목</th>
 		<td><input type="text" name="title" required="required" value="${vo.title }"></td>
 	</tr>
 	<tr>
 		<th>내용</th>
 		<td><textarea name="content">${vo.content }</textarea> </td>
 	</tr>
 	<tr>
 		<th>글쓴이</th>
 		<td>${vo.writer }</td>
 	</tr>
 	
 </table>
 <button class="btn btn-primary">수정</button>
 <button class="btn btn-primary" type="button" onClick="history.back()">취소</button>
 <a href="view.do?no=${vo.no }&inc=0&page=${param.page }&perPageNum=${param.perPageNum }&key=${param.key }&word=${param.word }" class="btn btn-primary">취소</a>
 </form>

 
 </div>
</body>
</html>