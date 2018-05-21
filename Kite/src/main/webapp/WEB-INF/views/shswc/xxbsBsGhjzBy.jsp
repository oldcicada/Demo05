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
							<span class="left_ten">骨灰江葬信息报送 </span> 
							<a href="user/xxbsBsGhjzBy?id=${szxx.id }"><input type="submit" value="信息报送" ></a>
							<a href="user/xxbsCxGhjzBy"><input type="submit" value="信息查询"></a>
							<div class="clear"></div>
						</div>
					<div class="ssjc_right_bottom">
						<div class="nei">
							<div class="ssjc_rub_table sbaz_table">
								<form action="user/xxbsZcGhjzBy" method="post">
								<table class="tj_table" style="border: 0">
									<thead>
										<tr>
											<td colspan="6">
											逝者基本信息<input type="hidden" value="${szxx.id }" name="id">
											</td>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>身份证号码</td>
											<td><p>
													<input type="text" id="text"
														value="${szxx.szsfzhm }" name="szsfzhm"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,30}$"
														required="required"/>
												</p></td>
											<td>姓名</td>
											<td><p>
													<input type="text" id="text"
														value="${szxx.szxm }" name="szxm"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,20}$"
														required="required"/>
												</p></td>
											<td>户籍地</td>
											<td><p>
													<input type="text" id="text" 
													value="${szxx.szhjd }" name="szhjd" 
													pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,20}$" required="required"/>
												</p></td>
										</tr>
										<tr>
											<td colspan="6">经办人信息</td>
										</tr>
										<tr>
											<td>身份证号码</td>
											<td><p>
													<input type="text" id="text" 
														value="${szxx.jbrsfzhm }" name="jbrsfzhm"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,30}$"
														required="required"/>
												</p></td>
											<td>姓名</td>
											<td><p>
													<input type="text" id="text"
														value="${szxx.jbrxm }" name="jbrxm"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,20}$"
														required="required"/>
												</p></td>
											<td>联系电话</td>
											<td><p>
													<input type="text" id="text" 
														value="${szxx.jbrlxdh }" name="jbrlxdh"
														pattern="^[0-9]{11}$"
														required="required"/>
												</p></td>
										</tr>
										<tr>
											<td colspan="6">
												<p>
													<input type="submit" value="  暂存  " class="in_sub">
													<input type="reset" value="  取消  " class="in_sub">
													<input type="submit" value="  报送 " class="in_sub" id="submit">
												</p>
											</td>
										</tr>
									</tbody>
								</table>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
	$('#submit').click(function(){
			$("form").attr("action","user/xxbsBsGhjzBy");
	});
	</script>
</body>