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
						<span class="left_ten">评先表彰加分上报</span>
						<a href="user/xxbsCxPxbzDc" target="frame"><input type="submit" value="信息查询" ></a>
						<a href="javascript:(void);" target="frame"><input type="submit" value="信息报送"></a>
							<div class="clear"></div>
						</div>
					</div>
					<div class="ssjc_right_bottom">
						<div class="nei" style="padding-top: 10px">
							<h4 style="color:#fff;text-align:center">评先表彰加分上报</h4>
							<div class="ssjc_rub_table " id="table">
							<form>
							<input type="hidden" id="id" name="id" value="${pxbzbs.id }">
								<table class="tj_table sbaz_table" style="border: 0">
										<tr>
											<td><p>获奖名称</p></td>
											<td><p><input type="text" name="hjmc" id="text"
														value="${pxbzbs.hjmc }"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,40}$"
														required="required"/>
											</p></td>
										</tr>
										<tr>
											<td><p>表彰时间</p></td>
											<td><p><input type="date" name="bzsj" id="text"
														value="${pxbzbs.bzsj }"
														required="required"/>
											</p></td>
										</tr>
										<tr>
											<td><p>获奖单位类型</p></td>
											<td><p><input type="text" name="bjdwmc" id="text"
														value="${pxbzbs.bjdwmc }"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,40}$"
														required="required"/>
											</p></td>
										</tr>
										<tr>
											<td><p>自评加分</p></td>
											<td><p><input type="text" id="text" name="zpjf"
														value="${pxbzbs.zpjf }"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,40}$"
														required="required"/>
											</p></td>
										</tr>
								</table>
								</form>
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
	var hjmc=$("input[name=hjmc]").val();
	var bzsj=$("input[name=bzsj]").val();
	var bjdwmc=$("input[name=bjdwmc]").val();
	var zpjf=$("input[name=zpjf]").val();
	
	$.post("user/xxbsBsPxbzJg",
			{"id":id,
		"hjmc":hjmc,
		"bzsj":bzsj,
		"bjdwmc":bjdwmc,
		"zpjf":zpjf},
			function(data,status){
			alert(data);
			window.location.href = 'user/xxbsCxPxbzDc';
	});
	
});

$("#zc").click(function(){
	var id=$("input[name=id]").val();
	var hjmc=$("input[name=hjmc]").val();
	var bzsj=$("input[name=bzsj]").val();
	var bjdwmc=$("input[name=bjdwmc]").val();
	var zpjf=$("input[name=zpjf]").val();
	
	$.post("user/xxbsBsPxbzJgZc",
			{"id":id,
		"hjmc":hjmc,
		"bzsj":bzsj,
		"bjdwmc":bjdwmc,
		"zpjf":zpjf},
			function(data,status){
			alert(data);
			window.location.href = 'user/xxbsCxPxbzDc';
	});
	
});

</script>
</body>