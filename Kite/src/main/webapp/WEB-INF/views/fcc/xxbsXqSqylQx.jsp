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
							<span>合肥市养老服务设施管理</span> <a href=""><input type="submit"
								value="养老服务设施维护"> </a> <a
								href="views/fcc_xxbs_cx_yljg_qx/xxbsCxSqylFc"><input
								type="submit" value="信息查询"></a>
							<div class="clear"></div>
						</div>
					</div>
					<div class="ssjc_right_bottom">
						<div class="nei">
							<div class="ssjc_rub_table sbaz_table">
								<table class="tj_table" style="border: 0">
									<thead>
										<tr>
											<td colspan="6">
											<input type="hidden" value="${MzywFccSqylfwss.id }">基本信息</td>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>名称</td>
											<td>${MzywFccSqylfwss.mc }</td>
											<td>联系人</td>
											<td>${MzywFccSqylfwss.lxr }</td>
											<td>联系电话</td>
											<td>${MzywFccSqylfwss.lxdh }</td>
										</tr>
										<tr>
											<td>地址</td>
											<td>${MzywFccSqylfwss.dz }</td>
											<td>建筑面积</td>
											<td>${MzywFccSqylfwss.jzmj }</td>
											<td>主要功能</td>
											<td>${MzywFccSqylfwss.zygn }</td>
										</tr>
										<tr>
											<td>辖区基本情况</td>
											<td>${MzywFccSqylfwss.xqjbqk }</td>
											<td>开放时间安排</td>
											<td colspan="4">${MzywFccSqylfwss.kfsjap }</td>
										</tr>
										<tr>
											<td colspan="6">
												<p>
													<a href="user/xxbsCxSqylQx"><input type="button" value="  取消  " class="in_sub"></a>
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
<script type="text/javascript" src="images/pageList/fcc/xxbsWhSqylssFc.js"></script>
</body>