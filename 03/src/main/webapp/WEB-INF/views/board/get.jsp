<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@include file="../includes/header.jsp"%>
<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">getTables</h1>
	</div>
	<!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">getdata</div>
			<!-- /.panel-heading -->
			<div class="panel-body">
				<!-- <form role="form" action="/board/list" method="get"> -->
					<div class="form-group">
						<label>bno</label>
						<input class="form-control" name="bno" readonly="readonly" value='<c:out value="${board.bno}"/>'>
					</div>
					<div class="form-group">
						<label>title</label>
						<input class="form-control" name="title" readonly="readonly" value='<c:out value="${board.title}"/>'>
					</div>
					<div class="form-group">
						<label>text area</label>
						<textarea class="form-control" rows="3" name="content" readonly="readonly"><c:out value="${board.content}"/></textarea>
					</div>
					<div class="form-group">
						<label>writer</label>
						<input class="form-control" name="writer" readonly="readonly" value='<c:out value="${board.writer}"/>'>
					</div>
					<button data-oper='modify' class="btn btn-default"
					 onclick="location.href='/board/modify?bno=<c:out value="${board.bno}"/>'">mod</button>
					<button data-oper='list' class="btn btn-info" onclick="location.href='/board/list'">list</button>
				<!-- </form> -->
			</div>
		</div>
	</div>
</div>

<%@include file="../includes/footer.jsp"%>