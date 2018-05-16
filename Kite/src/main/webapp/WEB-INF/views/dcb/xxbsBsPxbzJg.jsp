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
								<table class="tj_table sbaz_table" style="border: 0">
										<tr>
											<td><p>获奖名称</p></td>
											<td><p><input type="text" id="text"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,40}$"
														required="required"/>
											</p></td>
										</tr>
										<tr>
											<td><p>表彰时间</p></td>
											<td><p><input type="date" id="text"
														required="required"/>
											</p></td>
										</tr>
										<tr>
											<td><p>获奖单位类型</p></td>
											<td><p><input type="text" id="text"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,40}$"
														required="required"/>
											</p></td>
										</tr>
										<tr>
											<td><p>自评加分</p></td>
											<td><p><input type="text" id="text"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,40}$"
														required="required"/>
											</p></td>
										</tr>
								</table>
								<div class="sbaz_table">
									<p>
										<input type="submit" value="  暂存  " class="in_sub">
											<input type="submit" value="  取消  " class="in_sub">
												<input type="submit" value="  报送  " class="in_sub">
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>