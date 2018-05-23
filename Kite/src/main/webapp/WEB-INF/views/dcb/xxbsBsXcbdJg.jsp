<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="background-color: #000">
<head>
<%@include file="../commont.jsp"%>
<style type="text/css">
#table {
	margin: 0 auto;
	width: 600px;
}
tr td:first-child{
width:200px;
}
#text{
width:400px;
}
</style>
</head>
<body class="skin-blue">
	<div class="wrapper">
		<div class="content">
			<div class="yjgl">
				<div class="ssjc_right_up">
					<div class="nei">
					<div class="ssjc_ru_title">
						<span class="left_ten">宣传报道加分</span>
							<a href=""><input type="submit" value="信息报送" ></a>
								<a href=""><input type="submit" value="信息查询"></a>
							<div class="clear"></div>
						</div>
					</div>
					<div class="ssjc_right_bottom">
						<div class="nei" style="padding-top: 10px">
							<div class="ssjc_rub_table" id="table">
							<input type="hidden" id="id" name="id" value="${xcbdOneBs.id }">
								<table class="tj_table sbaz_table" style="border: 0">
										<tr>
											<td><p>报纸、刊物、媒体、网站名称</p></td>
											<td><p><input type="text" id="text" name="bzkwmtwzmc"
														value="${xcbdOneBs.bzkwmtwzmc }"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,40}$"
														required="required"/>
											</p></td>
										</tr>
										<tr>
											<td><p>刊用时间</p></td>
											<td><p><input type="date" id="text" name="kysj" value="${xcbdOneBs.kysj }"
														required="required"/>
											</p></td>
										</tr>
										<tr>
											<td><p>报道类型</p></td>
											<td><p> <select
									class="biaoti_select" name="bdlx" value="${xcbdOneBs.bdlx }" style="width: 400px; height: 30px">
										<option value="通讯">通讯</option>
										<option value="简讯">简讯</option>
										<option value="其他">其他</option>
								</select>
											</p></td>
										</tr>
										<tr>
											<td><p>新闻标题</p></td>
											<td><p><input type="text" id="text" name="xwbt" value="${xcbdOneBs.xwbt }"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,40}$"
														required="required"/>
											</p></td>
										</tr>
										<tr>
											<td><p>作者</p></td>
											<td><p><input type="text" id="text" name="zz" value="${xcbdOneBs.zz }"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,4}$"
														required="required"/>
											</p></td>
										</tr>
										<tr>
											<td><p>备注</p></td>
											<td><p><input type="text" id="text" name="bz" value="${xcbdOneBs.bz }"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,40}$"
														required="required"/>
											</p></td>
										</tr>
								</table>
								<div class="sbaz_table">
									<p>
										<input type="submit" id="zc" value="  暂存  " class="in_sub">
										<a href="javascript:window.history.go(-1);"><input type="submit" value="  取消  " class="in_sub"></a>
										<input type="submit" id="bs" value="  报送  " class="in_sub">
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">

$("#bs").click(function(){
	var id=$("input[name=id]").val();
	var bzkwmtwzmc=$("input[name=bzkwmtwzmc]").val();
	var kysj=$("input[name=kysj]").val();
	var bdlx=$("select[name=bdlx]").val();
	var xwbt=$("input[name=xwbt]").val();
	var zz=$("input[name=zz]").val();
	var bz=$("input[name=bz]").val();
	
	$.post("user/xxbsBsXcbdJg",
			{"id":id,
		"bzkwmtwzmc":bzkwmtwzmc,
		"kysj":kysj,
		"bdlx":bdlx,
		"xwbt":xwbt,
		"zz":zz,
		"bz":bz},
			function(data,status){
			alert(data);
			window.location.href = 'user/xxbsCxXcbdDc';
	});
	
});

$("#zc").click(function(){
	var id=$("input[name=id]").val();
	var bzkwmtwzmc=$("input[name=bzkwmtwzmc]").val();
	var kysj=$("input[name=kysj]").val();
	var bdlx=$("select[name=bdlx]").val();
	var xwbt=$("input[name=xwbt]").val();
	var zz=$("input[name=zz]").val();
	var bz=$("input[name=bz]").val();
	
	$.post("user/xxbsBsXcbdJgZc",
			{"id":id,
		"bzkwmtwzmc":bzkwmtwzmc,
		"kysj":kysj,
		"bdlx":bdlx,
		"xwbt":xwbt,
		"zz":zz,
		"bz":bz},
			function(data,status){
			alert(data);
			window.location.href = 'user/xxbsCxXcbdDc';
	});
	
});

</script>
</body>