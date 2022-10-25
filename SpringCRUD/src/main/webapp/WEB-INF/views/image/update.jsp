<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이미지 게시판 수정</title>
<script type="text/javascript">
$(function(){
	$("#cancelBtn").click(function(){
		history.back();
	});
});
</script>
</head>
<body>
<div class="container">
	<h2>이미지 게시판 수정</h2>
	<form method="post">
		<input type="hidden" name="page" value="${param.page }">
		<input type="hidden" name="perPageNum" value="${param.perPageNum }">
		<div class="form-group">
			<label for="no">번호</label>
			<input name="no" id="no" class="form-control" readonly="readonly" value="${vo.no }">
		</div>
		<div class="form-group">
			<label for="title">제목</label>
			<input name="title" id="title" class="form-control" required="required" value="${vo.title }">
		</div>
		<div class="form-group">
			<label for="content">내용</label>
			<textarea rows="5" name="content" class="form-control">${vo.content }</textarea>
		</div>
		<button>수정</button>
		<button type="reset">새로입력</button>
		<button type="button" id="cancelBtn">취소</button>
	</form>
</div>
</body>
</html>