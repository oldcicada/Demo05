<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="background-color: #000">
<head>
<%@include file="../commont.jsp"%>
<style type="text/css">
input {
	margin-bottom: 50px;
}

label {
	margin-right: 50px;
}

.in_sub {
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
							<span class="left_ten">当前位置：首页->公告发布 </span> <a href="user/ggFb"
								target="frame"><input type="submit" value="公告发布"></a> <a
								href="user/tzggCx" target="frame"><input type="submit"
								value="公告查询"></a>
							<div class="clear"></div>
						</div>
<form action="<%=request.getContextPath() %>/upload2" method="post" enctype="multipart/form-data">
						<div class="sbaz_table">
							<p>
								<label>公告标题：</label><input type="text"
									value="${MzywTzgg.tzggbt }" name="tzggbt" style="width: 200px;">
							</p>
							<p>
								<label> 正文：</label>
								<textarea rows="10" cols="30" name="tzggzw">${MzywTzgg.tzggzw }</textarea>
							</p>
							<p>
								<label> 附件：</label> <input type="file" style="width: 200px;"  name="photo">
							</p>
							<p>
								<input type="hidden" id="id" name="id" value="${MzywTzgg.id }"
									style="width: 200px;" />
									<input type="hidden" id="ysbxxid" name="ysbxxid" value="${MzywFjxx.ysbxxid }"
									style="width: 200px;" />
							</p>
							
							<p>
								<input type="submit" value="  暂存  " class="in_sub" id="save"> <input
									type="reset" value="  取消   " class="in_sub" id="reset"> <input
									type="reset" value="  发布    " class="in_sub" id="submit">
							</p>
						</div>
</form>
					</div>
				</div>
			</div>
		</div>
	</div>
<script src="images/pageList/tzgg/ggfb.js"></script>
</body>