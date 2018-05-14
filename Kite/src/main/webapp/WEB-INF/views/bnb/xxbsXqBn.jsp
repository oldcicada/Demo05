<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="background-color: #000">
<head>
<%@include file="../commont.jsp"%>
<style type="text/css">
.nei span {
	color: #fff;
	font-size: 20px;
}
tr td:first-child{
   width:100px;
}
#table{
margin:0 auto;
width: 550px;
}
#text{
	width: 400px;
	padding:0;
}
#textarea{
width: 400px;
height:55px;
margin:5px 0 0 -5px;
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
							<a href=""><input type="submit" value="信息查询"> </a> <a
								href=""><input type="submit" value="信息报送"></a>
							<div class="clear"></div>
						</div>
					</div>
					<div class="ssjc_right_bottom" id="table">
						<div class="nei">
							<div class="ssjc_rub_table sbaz_table">
								<table class="tj_table" style="border: 0">
									<thead>
										<tr>
											<td>基本信息</td>
											<td><p>
													<input type="date" id="text" />
												</p></td>
										</tr>
									</thead>
									<tbody>
									<tr>
											<td>报送单位</td>
											<td><p>
													<input type="text" id="text" />
												</p></td>
										</tr>
										<tr>
											<td>“不能办”基本情况</td>
											<td><p style="margin:0">
											<textarea id="textarea" pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,300}$"
														required="required" >
											</textarea>
												</p></td>
										</tr>
										<tr>
											<td>“不能办”原因</td>
											<td><p style="margin:0">
													<textarea id="textarea" pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,300}$"
														required="required" >
											</textarea>
												</p></td>
										</tr>
										<tr>
											<td>科处室意见</td>
											<td><p style="margin:0">
													<textarea id="textarea" pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,300}$"
														required="required" >
											</textarea>
												</p></td>
										</tr>
										<tr>
											<td>领导意见</td>
											<td><p style="margin:0">
													<textarea id="textarea" pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,300}$"
														required="required" >
											</textarea>
												</p></td>
										</tr>
										<tr>
											<td>办结时间</td>
											<td><p>
													<input type="date" id="text" />
												</p></td>
										</tr>
										<tr>
											<td>办结情况</td>
											<td><p>
													<input type="text" id="text"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,40}$"
														required="required" />
												</p></td>
										</tr>
										<tr>
											<td>备注</td>
											<td><p>
													<input type="text" id="text"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,40}$"
														required="required" />
												</p></td>
										</tr>
										<tr>
											<td colspan="2">
												<p>
													<input type="submit" value="  返回  " class="in_sub">
												</p>
											</td>
										</tr>
									</tbody>
								</table>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>