<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
							
							<div class="clear"></div>
						</div>
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
											<td>${mzxx.szsfzhm}</td>
											<td>姓名</td>
											<td>${mzxx.szxm }</td>
											<td>户籍地</td>
											<td>${mzxx.szhjd }</td>
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
											<p>
											<input type="checkbox" value="  地上式墓穴  " class="in_sub"> 地上式墓穴
						          					<select  class="biaoti_select">
													  <option value="">单穴</option>
													  <option value="">双穴</option>
													   <option value="">多穴</option>
													</select>
	          				                  &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
	          				                    <input type="checkbox" value="  生态葬式  " class="in_sub"> 地上式墓穴
						          					<select  class="biaoti_select">
													  <option value="">森林葬</option>
													  <option value="">花坛葬</option>
													   <option value="">树葬</option>
													</select>
	          				                   &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
	          				                    <input type="checkbox" value="  节地葬式  " class="in_sub"> 地上式墓穴
												
						          					<select  class="biaoti_select">
													  <option value="">骨灰格位葬</option>
													  <option value="">草坪葬</option>
													</select>
	          				                   
											  </p>
											</td>
										</tr>
									<!-- 循环渲染合葬者信息 -->
									<%--   <c:forEach var="hzxx" items="${mzxx.hzxx }">
									  	<tr>
									  		<td>身份证号码</td>
											<td>${hzxx.szsfzhm }</td>
											<td>姓名</td>
											<td>${hzxx.szxm }</td>
										</tr>
									  </c:forEach> --%>
										<tr>
											<td>墓穴区域名称</td>
											<td>${mzxx.mxqymc }</td>
											<td>墓穴价格</td>
											<td>${mzxx.mxjg }</td>
											<td></td>
											<td></td>
										</tr>
										<tr>
											<td>购墓日期</td>
											<td>${mzxx.gmrq }</td>
											<td>安葬日期</td>
											<td>${mzxx.azrq }</td>
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
											<td>${mzxx.jbrsfzhm }</td>
											<td>姓名</td>
											<td>${mzxx.jbrxm }</td>
											<td>联系电话</td>
											<td>${mzxx.jbrlxdh }</td>
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
													<a href="user/xxbsCxMzxxSh"><input type="submit" value="  返回 " class="in_sub"></a>
												
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