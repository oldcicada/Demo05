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
							<div class="clear"></div>
						</div>
					</div>
					<div class="ssjc_right_bottom">
						<div class="nei" style="padding-top: 10px">
							<div class="ssjc_rub_table " id="table">
								<table class="tj_table sbaz_table" style="border: 0">
										<tr>
											<td><p>获奖名称</p></td>
											<td>${pxbzOne.hjmc }</td>
										</tr>
										<tr>
											<td><p>表彰时间</p></td>
											<td>${pxbzOne.bzsj }</td>
										</tr>
										<tr>
											<td><p>颁奖单位名称</p></td>
											<td>${pxbzOne.bjdwmc }</td>
										</tr>
										<tr>
											<td><p>自评加分</p></td>
											<td>${pxbzOne.zpjf }</td>
										</tr>
										<tr>
											<td><p>报送单位</p></td>
											<td>${pxbzOne.bsdw }</td>
										</tr>
								</table>
								<div class="sbaz_table">
									<p>
										<a href="javascript:window.history.go(-1);"><input type="submit" id="return" value="  返回  " class="in_sub"></a>
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