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
							<span class="left_ten">当前位置：首页->公告发布 </span> <a href="user/tzggxz"
								target="frame"><input type="submit" value="公告发布"></a> <a
								href="user/tzggCx" target="frame"><input type="submit"
								value="公告查询"></a>
							<div class="clear"></div>
						</div>
						<div class="sbaz_table">
							<p>
								<label>公告标题：</label><input type="text"
								name="tzggbt" style="width: 200px;">
							</p>
							<p>
								<label> 正文：</label>
								<textarea rows="10" cols="30" name="tzggzw"></textarea>
							</p>
							<p>
								<label> 附件：</label> <input type="file" style="width: 200px;"  name="photo">
							</p>
						
							
							<p>
								<input type="button" value="  保存  " class="in_sub" id="save" > 
								<a href="user/tzggCx"><input type="button" value="  取消   " class="in_sub"></a>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
	$(document).ready(function(){ 
		$("#save").click(save);
	});



	function save(){
		
		var tzggbt =$("input[name=tzggbt]").val();
		var tzggzw =$("textarea[name=tzggzw]").val();
		var tzggzt = "未发布";
		
		$.post("user/tzggZanCun",{"tzggbt":tzggbt,"tzggzw":tzggzw,"tzggzt":tzggzt},
				function(status){
		});
		location.href="user/tzggCx";
		
	}
	</script>
</body>