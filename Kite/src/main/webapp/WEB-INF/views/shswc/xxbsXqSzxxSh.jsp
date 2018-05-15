<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="background-color: #000">
<head>
<%@include file="../commont.jsp"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<style type="text/css">
.nei span {
	color: #fff;
	font-size: 20px;
}
</style>
</head>
<body class="skin-blue">
	<div class="wrapper">
		<div class="content">
			<div class="yjgl">
				<div class="ssjc_right_up">
					<div class="nei"></div>
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
													${szxx.szsfzhm }
												</p></td>
											<td>姓名</td>
											<td><p>
													${szxx.szxm }
												</p></td>
											<td>户籍地</td>
											<td><p>
													${szxx.szhjdmc }
												</p></td>
										</tr>
										<tr>
											<td>死亡原因</td>
											<td><p><select class="biaoti_select"
														style="width: 150px; height: 30px">
														<option value="">正常</option>
														<option value="">非正常</option>
													</select>
												</p></td>
											<td>遗体入馆日期</td>
											<td><p>
											<!-- 具体到小时 -->
													${szxx.ytrgrq }
												</p></td>
											<td>火化日期</td>
											<td><p>
											<!-- 具体到小时 -->
													${szxx.szhhrq }
												</p></td>
										</tr>
										<tr>
											<td>重点救助对象</td>
											<td><p>
													<select class="biaoti_select"
														style="width: 150px; height: 30px">
														<option value="">城乡低保</option>
														<option value="">农村五保</option>
														<option value="">重点优抚对</option>
														<option value="">非重点救助</option>
													</select>
												</p></td>
											<td>是否选择江葬</td>
											<td colspan="4"><p>
													<select class="biaoti_select"
														style="width: 150px; height: 30px">
														<option value="">是</option>
														<option value="">否</option>
													</select>
												</p></td>
										</tr>
										<tr>
											<td colspan="6">
													<p>合肥市殡葬基本公共服务惠民工程六项免费清单（单位：元）</p>
											</td>
										</tr>
										<tr>
											<td><p>普通车辆遗体接运费</p></td>
											<td><p>普通火化炉火化费</p></td>
											<td><p>骨灰存放费用</p></td>
											<td><p>殡仪馆内遗体冷藏费用</p></td>
											<td><p>普通骨灰盒</p></td>
											<td><p>普通告别厅费用</p></td>
										<tr/>
										<tr>
											<td><p>${szxx.ptclytjyf }</p></td>
											<td><p>${szxx.pthhlhhf }</p></td>
											<td><p>${szxx.ghcffy }</p></td>
											<td><p>${szxx.bygnytlcfy }</p></td>
											<td><p>${szxx.ptghh }</p></td>
											<td><p>${szxx.ptgbtfy }</p></td>
										<tr/>
										<tr>
											<td colspan="6">经办人信息</td>
										</tr>
										<tr>
											<td>身份证号码</td>
											<td><p>
													${szxx.jbrsfzhm }
												</p></td>
											<td>姓名</td>
											<td><p>
													${szxx.jbrxm }
												</p></td>
											<td>联系电话</td>
											<td><p>
													${szxx.jbrlxdh }
												</p></td>
										</tr>
										<tr>
										<td>证明材料</td>
											<td colspan="5">
												<p>
													<input type="checkbox" value=" 逝者身份证  " class="in_sub"> 逝者身份证
													<input type="checkbox" value=" 逝者户口簿  " class="in_sub" style="margin-left:40px;"> 逝者户口簿
													<input type="checkbox" value=" 死亡证明  " class="in_sub" style="margin-left:40px;"> 死亡证明
												</p>
											</td>
										</tr>
										
										<tr>
											<td colspan="6">
												<p>
													<a href="user/xxbsCxSzxxSh"><input type="submit" value="  返回 " class="in_sub"></a>
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