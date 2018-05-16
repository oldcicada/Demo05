<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="background-color: #000">
<head>
<%@include file="../commont.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
							<a href="fxb_xx_cx_qx/xxbsBsQxjj" target="frame"><input type="submit" value="信息报送" ></a>
							<a href="fxb_xx_cx_qx/fxbXxCxQx" target="frame"><input type="submit" value="信息查询"></a>
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
													<input type="text" id="text"  value="${szxx.szsfzhm }"
														pattern="^(\d{6})(\d{4})(\d{2})(\d{2})(\d{3})([0-9]|X)$"
														required="required" name="szsfzhm"/>
												</p></td>
											<td>姓名</td>
											<td><p>
													<input type="text" id="text" value="${szxx.szxm }"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{10}$"
														required="required" name="szxm"/>
												</p></td>
											<td>户籍地</td>
											<td><p>
													<input type="text" id="text" value="${szxx.szhjd }"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{30}$"
														required="required" name="szhjd"/>
												</p></td>
										</tr>
										<tr>
											<td>死亡原因</td>
											<td><p><select class="biaoti_select" style="width: 150px; height: 30px" name="szswyy">
														<option value="正常">正常</option>
														<option value="非正常">非正常</option>
													</select>
												</p></td>
											<td>遗体入馆日期</td>
											<td><p>
											<!-- 具体到小时 -->
													<input type="text" id="text" required="required" value="${szxx.ytrgrq }" name="ytrgrq"/>
												</p></td>
											<td>火化日期</td>
											<td><p>
											<!-- 具体到小时 -->
													<input type="text" id="text" value="${szxx.hhrq }" name="hhrq"
														required="required"/>
												</p></td>
										</tr>
										<tr>
											<td>重点救助对象</td>
											<td><p>
													<select class="biaoti_select" name="zdjzdx"
														style="width: 150px; height: 30px">
														<option value="城乡低保">城乡低保</option>
														<option value="农村五保">农村五保</option>
														<option value="重点优抚对">重点优抚对</option>
														<option value="非重点救助">非重点救助</option>
													</select>
												</p></td>
											<td>是否选择江葬</td>
											<td colspan="4"><p>
													<select class="biaoti_select" name="sfxzjz"
														style="width: 150px; height: 30px">
														<option value="是">是</option>
														<option value="否">否</option>
													</select>
												</p></td>
										</tr>
										<tr>
											<td colspan="6">
													合肥市殡葬基本公共服务惠民工程六项免费清单（单位：元）
											</td>
										</tr>
										<tr>
											<td>普通车辆遗体接运费</td>
											<td>普通火化炉火化费</td>
											<td>骨灰存放费用</td>
											<td>殡仪馆内遗体冷藏费用</td>
											<td>普通骨灰盒</td>
											<td>普通告别厅费用</td>
										<tr/>
										<tr>
											<td><p>
											<input type="text" id="text" name="ptclytjyf"
											pattern="^[0-9_]{5}$" required="required"/>
												</p>
											</td>
											<td><p>
											<!-- 5位纯数字组合，如果打到四位数，以千分位展示；如果没有使用该项，则填写0； -->
											<input type="text" id="text" name="pthhlhhf"
											pattern="^[0-9_]{5}$" required="required"/>
												</p>
											</td>
											<td><p>
											<input type="text" id="text" name="ghcffy"
											pattern="^[0-9_]{5}$"
														required="required"/>
												</p>
											</td>
											<td><p>
											<input type="text" id="text" name="bygnytlcfy"
											pattern="^[0-9_]{5}$" required="required"/>
												</p>
											</td>
											<td><p>
											<input type="text" id="text" name="ptghh"
											pattern="^[0-9_]{5}$" required="required"/>
												</p>
											</td>
											<td><p>
											<input type="text" id="text" name="ptgbtfy"
											pattern="^[0-9_]{5}$" required="required"/>
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
													<input type="text" id="text" name="jbrsfzhm"
														pattern="^(\d{6})(\d{4})(\d{2})(\d{2})(\d{3})([0-9]|X)$"
														required="required"/>
												</p></td>
											<td>姓名</td>
											<td><p>
													<input type="text" id="text" name="jbrxm"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{10}$"
														required="required"/>
												</p></td>
											<td>联系电话</td>
											<td><p>
													<input type="text" id="text" name="jbrlxdh"
														pattern="^[0-9]{11}$" required="required"/>
												</p></td>
										</tr>
										<tr>
										<td>证明材料</td>
											<td colspan="5">
												<p>
													<input type="checkbox" value="  逝者身份证  " class="in_sub"> 逝者身份证
													<input type="checkbox" value="  逝者户口簿  " class="in_sub"> 逝者户口簿
													<input type="checkbox" value="  死亡证明  " class="in_sub"> 死亡证明
												</p>
											</td>
										</tr>
										<tr>
											<td colspan="6">
												<p>
													<input type="submit" value="  暂存  " class="in_sub" id="temporary">
													<input type="reset" value="  取消  " class="in_sub" id="reset">
													<input type="reset" value="  报送  " class="in_sub" id="submit"> 
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
	<script type="text/javascript" src="images/pageList/shswc/xxbsBsSzxxBy"></script>
</body>