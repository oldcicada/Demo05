<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="background-color: #000">
<head>
<%@include file="../commont.jsp"%>
<style type="text/css">
input{
margin-bottom: 50px;
}
label {
margin-right: 50px;
}
.in_sub{
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
							<span class="left_ten">当前位置：首页->公告发布 </span> 
							<a href="user/ggFb" target="frame"><input type="submit" value="公告发布" ></a>
							<a href="user/tzggCx" target="frame"><input type="submit" value="公告查询"></a>
							<div class="clear"></div>
						</div>
						
						<div class="sbaz_table">
							  <p>
							      <label>公告标题：</label><input type="text" style="width: 200px;" value="${MzywTzgg.tzggbt }" readonly="readonly">
							  </p>
							  <p>
							       <label>  正文：</label> <textarea rows="10" cols="30" >${MzywTzgg.tzggzw }</textarea>
							  </p>
							  <p>
							       <label id="down" name="down">   附件：</label><input type="text" value="${MzywFjxx.fjmc }" style="width: 200px;" >
							  </p>
							  <p>
							     <a href="user/tzggCx"><input type="button" value="  返回   " class="in_sub"></a>
							  </p>
					   </div>

				</div>
                 </div>
			</div>
		</div>
	</div>
	<script src="images/pageList/tzgg/down.js"></script>
</body>