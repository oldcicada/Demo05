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
							<span>合肥市养老机构详情</span> <a href="user/xxbsBsYljgQx"><input type="submit"
								value="信息报送"> </a> <a
								href="user/xxbsCxYljgQx"><input
								type="submit" value="信息查询"></a>
							<div class="clear"></div>
						</div>
					</div>
					<div class="ssjc_right_bottom">
						<div class="nei">
							<div class="ssjc_rub_table sbaz_table" style="padding:0;margin:0">
							<table class="tj_table" style="border: 0">
									<thead>
										<tr>
											<td colspan="6">基本信息</td>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>名称</td>
											<td>${MzywFccYljgxx.mc }</td>
											<td>联系人</td>
											<td>${MzywFccYljgxx.lxr }</td>
											<td>联系电话</td>
											<td>${MzywFccYljgxx.lxdh }</td>
										</tr>
										<tr>
											<td>地址</td>
											<td>${MzywFccYljgxx.dz }</td>
											<td>入住率</td>
											<td>${MzywFccYljgxx.rzl }</td>
											<td>总床位数</td>
											<td>${MzywFccYljgxx.zcws }</td>
										</tr>
										<tr>
											<td>房屋性质</td>
											<td>${MzywFccYljgxx.fwxz }</td>
											<td>服务对象类型</td>
											<td colspan="3">${MzywFccYljgxx.fwdxlx }</td>
										</tr>
										<tr>
											<td colspan="6">机构人员信息</td>
										</tr>
									</tbody>
								</table>
								</div>
								<div class="ssjc_rub_table sbaz_table" style="padding:0;margin:0">
								<table class="tj_table" style="border: 0" >
									<tbody>
										<tr>
											<td colspan="5">管理人员数量</td>
											<td colspan="6">专业技术人员数量</td>
											<td colspan="3">养老护理人员</td>
										</tr>
										<tr>
											<td>院长</td>
											<td>副院长</td>
											<td colspan="3">中层管理人员</td>
											<td>医生</td>
											<td>护士</td>
											<td>财务</td>
											<td>社工</td>
											<td colspan="2">心理咨询师</td>
											<td>技师</td>
											<td>高级</td>
											<td>初级</td>
										</tr>
										<tr>
											<td>${MzywFccYljgxx.yz }</td>
											<td>${MzywFccYljgxx.fyz }</td>
											<td colspan="3">${MzywFccYljgxx.zcglry }</td>
											<td>${MzywFccYljgxx.ys }</td>
											<td>${MzywFccYljgxx.hs }</td>
											<td>${MzywFccYljgxx.cw }</td>
											<td>${MzywFccYljgxx.sg }</td>
											<td colspan="2">${MzywFccYljgxx.xlzxs }</td>
											<td>${MzywFccYljgxx.js }</td>
											<td>${MzywFccYljgxx.gj }</td>
											<td>${MzywFccYljgxx.cj }</td>
										</tr>
										<tr>
											<td colspan="2">人员持证上岗率</td>
											<td colspan="3">${MzywFccYljgxx.ryczsgl }</td>
											<td colspan="4">等级评定</td>
											<td colspan="5">${MzywFccYljgxx.djpd }</td>
										</tr>
										<tr>
											<td colspan="2">备注</td>
											<td colspan="12">${MzywFccYljgxx.bz }</td>
										</tr>
										<tr>
											<td colspan="14">
												<p id="pstyle">
													<a href="user/xxbsCxYljgFc"><input type="button" value="  返回  " class="in_sub"></a>
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