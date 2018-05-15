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

#text {
	width: 150px;
}
</style>
</head>
<body class="skin-blue">
	<div class="wrapper">
		<div class="content">
			<div class="yjgl">
				<div class="ssjc_right_up">
					<div class="ssjc_ru_title">
							<span class="left_ten">当前位置：首页->信息报送 </span> 
							
							<div class="clear"></div>
						</div>
					<div class="ssjc_right_bottom">
						<div class="nei">
							<div class="ssjc_rub_table sbaz_table">
								<table class="tj_table" style="border: 0">
									<thead>
										<tr>
											<td colspan="6">逝者基本信息</td>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>身份证号码</td>
											<td><p>
													<input type="text" id="text"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,30}$"
														required="required"/>
												</p></td>
											<td>姓名</td>
											<td><p>
													<input type="text" id="text"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,20}$"
														required="required"/>
												</p></td>
											<td>户籍地</td>
											<td><p>
													<input type="text" id="text" pattern="^[0-9]{11}$"
														required="required"/>
												</p></td>
										</tr>
										<tr>
											<td colspan="6">经办人信息</td>
										</tr>
										<tr>
											<td>身份证号码</td>
											<td><p>
													<input type="text" id="text"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,30}$"
														required="required"/>
												</p></td>
											<td>姓名</td>
											<td><p>
													<input type="text" id="text"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,20}$"
														required="required"/>
												</p></td>
											<td>联系电话</td>
											<td><p>
													<input type="text" id="text" pattern="^[0-9]{11}$"
														required="required"/>
												</p></td>
										</tr>
										<tr>
											<td colspan="6">
												<p>
													<a href=""><input type="submit" value="  返回 " class="in_sub"></a>
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