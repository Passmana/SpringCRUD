<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이미지 게시판 등록</title>
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
	<h2>이미지 게시판 등록</h2>
	<form method="post" enctype="multipart/form-data">
		<input type="hidden" name="perPageNum" value="${param.perPageNum }">
		<div class="form-group">
			<label for="title">제목</label>
			<input name="title" id="title" class="form-control" required="required">
		</div>
		<div class="form-group">
			<label for="content">내용</label>
			<textarea rows="5" name="content" class="form-control"></textarea>
		</div>
		<div class="form-group">
			<label for="imageFile">첨부파일</label>
			<input name="imageFile" id="imageFile" class="form-control" required="required"
			 type="file">
		</div>
		
		<button>등록</button>
		<button type="reset">새로입력</button>
		<button type="button" id="cancelBtn">취소</button>
	</form>
</div>
</body>
</html>