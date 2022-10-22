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
	$(".dataRow").click(function(){
		var no = $(this).find(".no").text();
		// alert(no);
		location = "view.do?no=" + no + "&inc=1"
				+ "&page=${pageObject.page}"
				+ "&perPageNum=${pageObject.perPageNum}"
				+ "&key=${pageObject.key}"
				+ "&word=${pageObject.word}"
	});
});
</script>
</head>
<body>
${list }

 <div class="container">
  <h1>샘플 리스트</h1>
  <form action="search" class="form-inline">
			<div class="input-group">
				<select class="form-control" name="key" id="key">
					<option value="t">제목</option>
					<option value="c">내용</option>
					<option value="w">작성자</option>
					<option value="tcf">모두</option>
				</select>
			</div>
		  <div class="input-group">
		    <input type="text" class="form-control" placeholder="Search" name="word" value="${pageObject.word }">
		    <div class="input-group-btn">
		      <button class="btn btn-default" type="submit">
		        <i class="glyphicon glyphicon-search"></i>
		      </button>
		    </div>
		  </div>
		</form>
 <table class="table">
 	<tr>
 		<th>번호</th>
 		<th>제목</th>
 		<th>글쓴이</th>
 		<th>날짜</th>
 		<th>조회수</th> 		
 	</tr>
 	<c:forEach items="${list }" var="vo">
 	<tr class="dataRow">
 		<td class="no">${vo.no }</td>
 		<td>${vo.title }</td>
 		<td>${vo.writer }</td>
 		<td><fmt:formatDate value="${vo.writeDate }" pattern="yyyy-MM-dd"/> </td>
 		<td>${vo.hit }</td>
 	</tr>
 	</c:forEach>
 </table>
 <button class="btn btn-primary" onClick="location='write.do?perPageNum=${pageObject.perPageNum }'">글쓰기</button>
 <div><pageNav:pageNav listURI="list.do" pageObject="${pageObject }" /></div>
 </div>
</body>
</html>