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
							<span class="left_ten">当前位置：首页->信息报送 </span> 
							
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
											<td><p>
													<input type="text" id="text"
														pattern="^(\d{6})(\d{4})(\d{2})(\d{2})(\d{3})([0-9]|X)$"
														required="required"/>
												</p></td>
											<td>姓名</td>
											<td><p>
													<input type="text" id="text"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{10}$"
														required="required"/>
												</p></td>
											<td>户籍地</td>
											<td><p>
													<input type="text" id="text"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{30}$"
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
											<td>藏式选择</td>
											<td colspan="5">
											<p>
											    
												<input type="checkbox" value="  地上式墓穴  " class="in_sub"> 地上式墓穴
						          					<select  class="biaoti_select">
													  <option value="">单穴</option>
													  <option value="">双穴</option>
													   <option value="">多穴</option>
													</select>
	          				                    
	          				                  &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
	          				                    <input type="checkbox" value="  生态藏式  " class="in_sub"> 地上式墓穴
						          					<select  class="biaoti_select">
													  <option value="">森林藏</option>
													  <option value="">花坛葬</option>
													   <option value="">树葬</option>
													</select>
	          				                   &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
	          				                    <input type="checkbox" value="  节地藏式  " class="in_sub"> 地上式墓穴
												
						          					<select  class="biaoti_select">
													  <option value="">骨灰格位藏</option>
													  <option value="">草坪葬</option>
													</select>
	          				                   
											  </p>
											</td>
										</tr>
									<!--  -->
									  <tr>
											<td>身份证号码</td>
											<td><p>
													<input type="text" id="text"
														
														required="required"/>
												</p></td>
											<td>姓名</td>
											<td><p>
													<input type="text" id="text"
														
														required="required"/>
												</p></td>
											<td>墓穴区域名称</td>
											<td><p>
													<input type="text" id="text"
														
														required="required"/>
												</p>
												</td>
										</tr>
										
										<tr>
											<td>墓穴价格</td>
											<td><p>
													<input type="text" id="text"
														
														required="required"/>
												</p></td>
											<td>购墓日期</td>
											<td><p>
													<input type="text" id="text"
														
														required="required"/>
												</p></td>
											<td>安葬日期</td>
											<td><p>
													<input type="text" id="text"
														
														required="required"/>
												</p>
												</td>
										</tr>
									
										<tr>
											<td colspan="6">
													经办人信息
											</td>
										</tr>
										<tr>
											<td>身份证号码</td>
											<td><p>
													<input type="text" id="text"
														pattern="^(\d{6})(\d{4})(\d{2})(\d{2})(\d{3})([0-9]|X)$"
														required="required"/>
												</p></td>
											<td>姓名</td>
											<td><p>
													<input type="text" id="text"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{10}$"
														required="required"/>
												</p></td>
											<td>联系电话</td>
											<td><p>
													<input type="text" id="text"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{30}$"
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
													<input type="submit" value="  返回 " class="in_sub">
												
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