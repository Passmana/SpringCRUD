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
<script type="text/javascript"> 
$(function(){


	$(".updateBtn").click(function(){
		// alert(no);
		location = "update.do?no=${vo.no}" 
				+ "&page=${param.page}"
				+ "&perPageNum=${param.perPageNum}"
				+ "&key=${pageObject.key}"
				+ "&word=${pageObject.word}"
	});
	})
	
</script>
</head>
<body>


 <div class="container">
  <h1>샘플 리스트</h1>
 <table class="table">
 	<tr>
 		<th>번호</th>
 		<td>${vo.no }</td>
 	</tr>
 	<tr>
 		<th>제목</th>
 		<td>${vo.title}</td>
 	</tr>
 	<tr>
 		<th>내용</th>
 		<td>${vo.content }</td>
 	</tr>
 	<tr>
 		<th>글쓴이</th>
 		<td>${vo.writer }</td>
 	</tr>
 	
 	<tr>
 		<th>작성일</th>
 		<td><fmt:formatDate value="${vo.writeDate }" pattern="yyyy-MM-dd HH:mm"/> </td>
 	</tr>
 	<tr>
 		<th>조회수</th>
 		<td>${vo.hit }</td>
 	</tr>
 </table>
 	<button class="btn btn-primary updateBtn">수정</button>
 	<a href="delete.do?no=${vo.no}" class="btn btn-primary">삭제</a>
 	<a href="list.do?page=${param.page }&perPageNum=${param.perPageNum}&key=${param.key}&word=${param.word }" class="btn btn-primary">뒤로가기</a>
 </div>
</body>
</html>