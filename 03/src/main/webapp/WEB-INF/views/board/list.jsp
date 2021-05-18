<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@include file="../includes/header.jsp"%>
<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">Tables</h1>
	</div>
	<!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">DataTables Advanced Tables
				<button id='regBtn' type="button" class="btn btn-xx pull-right">reg new</button>
			</div>
			<!-- /.panel-heading -->
			<div class="panel-body">
				<table width="100%"
					class="table table-striped table-bordered table-hover"
					id="dataTables-example">
					<thead>
						<tr>
							<th>number</th>
							<th>title</th>
							<th>writer</th>
							<th>date</th>
							<th>moddate</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${list}" var="board">
							<tr class="odd gradeX">
								<td><c:out value="${board.bno}" /></td>
								<td><c:out value="${board.title}" /></td>
								<td><c:out value="${board.writer}" /></td>
								<td><fmt:formatDate value="${board.regdate}"
										pattern="yyyy/MM/dd" /></td>
								<td><fmt:formatDate value="${board.updateDate}"
										pattern="yyyy/MM/dd" /></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

			</div>
			<!-- /.panel-body -->
		</div>
		<!-- /.panel -->
	</div>
	<!-- /.col-lg-12 -->
</div>
<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button>
				<h4 class="modal-title" id="myModalLabel">Modal title</h4>
			</div>
			<div class="modal-body">ssssssssss</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary">Save changes</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>
<script type="text/javascript">
          	$(document).ready(function(){
          		var result= '<c:out value="${result}"/>'
          		checkModal(result);
          		
          		function checkModal(result){
          			if(result==''){
          				return;
          			}
          			if(parseInt(result)>0){
          				$(".modal-body").html("게시글"+parseInt(result)+"is reged");
          			}
          			$("#myModal").modal("show");
          		}
          		
          		$("#regBtn").on("click",function(){
          			self.location="/board/register";
          		});
          	});
          </script>
<%@include file="../includes/footer.jsp"%>