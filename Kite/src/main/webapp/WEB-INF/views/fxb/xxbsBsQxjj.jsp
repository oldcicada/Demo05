<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="background-color: #000">
<head>
<%@include file="../commont.jsp"%>
<style type="text/css">
input{
margin-bottom: 5px;
}
label {
margin-right: 50px;
}
.bt{
 width: 200px;
 margin-right: 50px;
}
</style>
</head>
<body class="skin-blue" style="height: 100% !important;">
	<div class="wrapper">
		<div class="content">
			<div class="yjgl">
				<div class="ssjc_right_up">
					<div class="nei">
						<div class="ssjc_ru_title">
							<span class="left_ten">当前位置：首页->信息报送 </span> 
							<a href="fxb_xx_cx_qx/xxbsBsQxjj" target="frame"><input type="submit" value="信息报送" ></a>
							<a href="fxb_xx_cx_qx/fxbXxCxQx" target="frame"><input type="submit" value="信息查询"></a>
							<div class="clear"></div>
						</div>
						<form action="<%=request.getContextPath() %>/fxb/upload" method="post" enctype="multipart/form-data">
						<div class="sbaz_table">
						    <div style="width: 49%;display: inline-block;">
							  <p>
							      <label>公告标题：</label><input type="text" style="width: 200px;" name="xxbt" id="xxbt" value="${MzywFxb.xxbt }">
							  </p>
							  <p>
							      <label>上报单位：</label><input type="text" style="width: 200px;" name="sbdw" name="sdbw" value="${MzywFxb.sbdw }">
							  </p>
							  <p>
							       <label>  正文：</label> <textarea rows="5" cols="30" name="xxzw" id="xxzw" >${MzywFxb.xxzw }</textarea>
							  </p>
			                 </div>
			                 
			                 <div style="width: 49%;display: inline-block;">
							  <p>
							      <label>作者：</label><input type="text" style="width: 200px;" name="zz" id="zz" value="${MzywFxb.zz }">
							  </p>
							  <p>
							      <label>分管领导：</label><input type="text" style="width: 200px;" name="fgld" id="fgld" value="${MzywFxb.fgld }">
							  </p>
							  <p>
							      <label>上报人员：</label><input type="text" style="width: 200px;" name="sbry" id="sbry" value="${MzywFxb.sbry }">
							  </p>
							  <p>
							       <label>   附件：</label> <input type="file" style="width: 200px;" value="" name="photo">
							  </p>
							  
							  <p>
							      <input type="hidden" style="width: 200px;" name="id" id="id" value="${MzywFxb.id }">
							  </p>
							  </div>
							  <p style="margin-top: 100px;">
							     <input type="submit" value="  暂存  " class="in_sub bt" id="save"> 
							     <input type="reset" value="  取消    " class="in_sub bt" id="reset">
							     <input type="button" value="  报送    " class="in_sub bt" id="submit">
							  </p>
					   </div>
</form>
				</div>
                 </div>
			</div>
		</div>
	</div>
	<script src="images/pageList/fxb/fxbbs.js"></script>
</body>