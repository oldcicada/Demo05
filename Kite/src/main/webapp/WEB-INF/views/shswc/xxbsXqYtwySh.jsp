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
							<span class="left_ten">遗体外运信息</span> 
							
							<div class="clear"></div>
						</div>
					</div>
					<div class="ssjc_right_bottom">
						<div class="nei">
							<div class="ssjc_rub_table sbaz_table">
								<table class="tj_table" style="border: 0">
									<thead>
										<tr>
											<td colspan="6">逝者基本信息
											<input type="hidden" value="${ytwy.id }" id="id"> </td>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>身份证号码</td>
											<td>${ytwy.szsfzhm }</td>
											<td>姓名</td>
											<td>${ytwy.szxm }</td>
											<td>户籍地</td>
											<td>${ytwy.szhjd }</td>
										</tr>
										<tr>
											<td>死亡原因</td>
											<td>${ytwy.szswyy }</td>
											<td>遗体运往地</td>
											<td>${ytwy.szytywd }</td>
											<td></td>
										</tr>
										<tr>
											<td colspan="6">
													申请人信息
											</td>
										</tr>
										<tr>
											<td>身份证号码</td>
											<td>${ytwy.sqrsfzhm }</td>
											<td>申请人姓名</td>
											<td>${ytwy.sqrxm }</td>
											<td>与逝者关系</td>
											<td>${ytwy.gx }</td>
										</tr>
										<tr>
											<td>联系电话</td>
											<td>${ytwy.sqrlxdh }</td>
											<td>遗体承担运输单位名称</td>
											
											<td>${ytwy.ytcdysdwmc }</td>
											<td></td>
										</tr>
										<tr>
										<td>附件信息</td>
											<td colspan="5">
												<p id="fjxx">
												<input type="checkbox" value="运入地殡仪馆或者民政局来函同意接收并监督火化的证明材料" class="in_sub"> 运入地殡仪馆或者民政局来函同意接收并监督火化的证明材料
												<input type="checkbox" value="申请人书面申请材料" class="in_sub"> 申请人书面申请材料 <br/>
													<input type="checkbox" value="逝者身份证" class="in_sub"> 逝者身份证 
													<input type="checkbox" value="逝者户口簿" class="in_sub"> 逝者户口簿 
													<input type="checkbox" value="死亡证明" class="in_sub"> 死亡证明 
												</p>
											</td>
										</tr>
										<tr>
											<td colspan="6">
												<p>
													<a href="user/xxbsCxYtwySh"><input type="button" value="  返回 " class="in_sub"></a>
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
	<script type="text/javascript" src="images/pageList/shswc/fjxxShow.js"></script>
</body>