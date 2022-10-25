<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <div class="row" style="margin-top: 30px;">
            	<div class = "col-lg-12">
	            	<div class="panel panel-default">
					  <div class="panel-heading">
					  	<i class="fa fa-comments fa-fw"></i> Reply
					  	<button id="addReplyBtn" class="btn btn-primary btn-xs pull-right">New Reply</button>
					  </div>
					  <div class="panel-body">
					  	<ul class="chat">
					  		<!-- ajax로 데이터를 가져와서 chat에 empty()를 이용해서 비운 다음 append로 추가시킨다. -->
					  	</ul>
					  	<!-- /.chat -->
					  </div>
					  <!-- panel-body의 끝 -->
					  <div class="panel-footer" id="footer_pagination">
					  </div>
					  <!-- panel-footer의 끝 : 페이지 네이션을 작성해서 넣는다.(JS) -->
					</div>
				  <!-- panel의 끝 -->
            	</div>
			  <!-- col의 끝 -->
            </div>
            <!-- /.row -->
          
<!-- 댓글 등록 수정 삭제를 위한 모달 창 만들기 : 맨 처음에는 안보이게 한다. -->
<div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">REPLY MODAL</h4>
      </div>
      <div class="modal-body">
      	<div class="form-group">
      		<label>Reply</label>
      		<textarea rows="3" name="reply" class="form-control" id="modalReply"></textarea>
      	</div>
      	<div class="form-group">
      		<label>Replyer</label>
      		<input name = "replyer" class="form-control" id="modalReplyer">
      	</div>
      </div>
      <div class="modal-footer">
      	<button class="btn btn-warning" id="modalUpdateBtn">Update</button>
      	<button class="btn btn-danger" id="modalDeleteBtn">Delete</button>
      	<button class="btn btn-primary" id="modalRegisterBtn">Register</button>
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>

  </div>
</div>
