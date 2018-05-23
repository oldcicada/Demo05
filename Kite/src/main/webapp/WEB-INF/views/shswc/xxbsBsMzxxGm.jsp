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
					<div class="nei">
						<div class="ssjc_ru_title">
							<span class="left_ten">墓葬信息 </span> 
							<a href="user/xxbsCxMzxxGm" target="frame"><input type="submit" value="信息查询"></a>
							<div class="clear"></div>
						</div>
					</div>
					<div class="ssjc_right_bottom">
						<div class="nei">
							<div class="ssjc_rub_table sbaz_table">
							<form action="user/xxbsZcMzxxGm" method="post">
								<table class="tj_table" style="border: 0">
									<thead>
										<tr>
											<td colspan="6">逝者基本信息
											<input type="hidden" value="${mzxx.id }" name="id">
											</td>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>身份证号码</td>
											<td><p>
													<input type="text" id="text" name="szsfzhm" value="${mzxx.szsfzhm }"
														pattern="^(\d{6})(\d{4})(\d{2})(\d{2})(\d{3})([0-9]|X)$"
														required="required"/>
												</p></td>
											<td>姓名</td>
											<td><p>
													<input type="text" id="text" name="szxm" value="${mzxx.szxm }"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,10}$"
														required="required"/>
												</p></td>
											<td>户籍地</td>
											<td><p>
													<input type="text" id="text" name="szhjd" value="${mzxx.szhjd }"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,30}$"
														required="required"/>
												</p>
												</td>
										</tr>
										<tr>
											<td colspan="6">
													墓葬信息
											</td>
										</tr>
									<!-- 墓葬信息 -->
									    <tr>
											<td>葬式选择</td>
											<td colspan="5">
											<p><input type="hidden" value="${mzxx.zsxz }" id="zsxz"> 
												<input type="radio" name="zsxz"  value="0" class="in_sub" id="first"> 地上式墓穴
						          					<select  class="biaoti_select">
													  <option value="">单穴</option>
													  <option value="">双穴</option>
													   <option value="">多穴</option>
													</select>
	          				                    
	          				                  &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
	          				                    <input type="radio" name="zsxz" value="1" class="in_sub" id="second"> 生态葬式
						          					<select  class="biaoti_select">
													  <option value="">森林葬</option>
													  <option value="">花坛葬</option>
													   <option value="">树葬</option>
													</select>
	          				                   &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
	          				                    <input type="radio" name="zsxz" value="2" class="in_sub" id="third"> 节地葬式
						          					<select  class="biaoti_select">
													  <option value="">骨灰格位葬</option>
													  <option value="">草坪葬</option>
													</select>
											  </p>
											</td>
										</tr>
									<!--  -->
									<tr id="message">
											<td>墓穴区域名称</td>
											<td><p>
											<input type="hidden" id="mxqymcValue" value="${mzxx.mxqymc }">
											<select class="biaoti_select" style="width: 150px; height: 30px"
											 name="mxqymc" id="mxqymc">
											 </select>
											</p></td>
											<td>墓穴价格</td>
											<td><p>
											<input type="text" id="text" name="mxjg" value="${mzxx.mxjg }"
											pattern="^[0-9_]{1,5}$"
														required="required">
											</p></td>
											<td></td>
											<td></td>
										</tr>
										<tr>
											<td>购墓日期</td>
											<td><p>
											<input type="text" id="text" name="gmrq" value="${mzxx.gmrq }"
											pattern="^[0-9-]{1,30}$"
														required="required">
											</p></td>
											<td>安葬日期</td>
											<td><p>
											<input type="text" id="text" name="azrq" value="${mzxx.azrq }"
											pattern="^[0-9-]{1,30}$"
														required="required">
											</p></td>
											<td></td>
											<td></td>
										</tr>
										<tr>
											<td colspan="6">
													经办人信息
											</td>
										</tr>
										<tr>
											<td>身份证号码</td>
											<td><p>
													<input type="text" id="text" name="jbrsfzhm" value="${mzxx.jbrsfzhm }"
														pattern="^(\d{6})(\d{4})(\d{2})(\d{2})(\d{3})([0-9]|X)$"
														required="required"/>
												</p></td>
											<td>姓名</td>
											<td><p>
													<input type="text" id="text" name="jbrxm" value="${mzxx.jbrxm }"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,10}$"
														required="required"/>
												</p></td>
											<td>联系电话</td>
											<td><p>
													<input type="text" id="text" name="jbrlxdh" value="${mzxx.jbrlxdh }"
														pattern="^[0-9_]{1,20}$"
														required="required"/>
												</p></td>
										</tr>
										
										<tr>
										<td>附件信息</td>
											<td colspan="5">
												<p>
												
													<input type="checkbox" value="  经办人身份证  " class="in_sub"> 逝者身份证
													<input type="checkbox" value="  墓穴证  " class="in_sub"> 逝者户口簿
													<input type="checkbox" value="  死亡证明  " class="in_sub"> 死亡证明
												</p>
											</td>
										</tr>
										<tr>
											<td colspan="6">
												<p>
													<input type="submit" value="  暂存  " class="in_sub">
													<input type="reset" value="  取消  " class="in_sub">
													<input type="submit" value="  报送  " class="in_sub" id="submit">
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
	<script type="text/javascript" src="images/pageList/shswc/xxbsBsMzxxGm.js"></script>
	<script type="text/javascript">
	$('#submit').click(function(){
			$("form").attr("action","user/xxbsBsMzxxGm");
	});
	</script>
</body>