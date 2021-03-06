<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="background-color: #000">
<head>
<%@include file="../commont.jsp"%>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.0/jquery-confirm.min.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.0/jquery-confirm.min.js"></script>
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
						    <span>信息报送 </span>
							<a href="user/xxbsCxSzxxBy"><input type="submit" value="信息查询"></a>
							<div class="clear"></div>
						</div>
					</div>
					<div class="ssjc_right_bottom">
						<div class="nei">
							<div class="ssjc_rub_table sbaz_table">
							<form action="user/xxbsZcSzxxBy" method="post">
								<table class="tj_table" style="border: 0">
									<thead>
										<tr>
											<td colspan="6">逝者基本信息
											<input type="hidden" value="${szxx.id }" name="id" id="id">
											<input type="hidden" value="${szxx.cjsj }" name="cjsj">
											<input type="hidden" value="${szxx.cjyh }" name="cjyh">
											<input type="hidden" value="${szxx.yxbs }" name="yxbs">
											<input type="hidden" value="${szxx.bygmc }" name="bygmc">
											</td>
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
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,10}$"
														required="required" name="szxm"/>
												</p></td>
											<td>户籍地</td>
											<td><p>
													<input type="text" id="text" value="${szxx.szhjd }"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,30}$"
														required="required" name="szhjd"/>
												</p></td>
										</tr>
										<tr>
											<td>死亡原因</td>
											<td><p>
											<input type="hidden" value="${szxx.szswyy }" id="szswyyValue">
											<select class="biaoti_select" style="width: 150px; height: 30px" name="szswyy" id="szswyy">
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
													<input type="text" id="text" value="${szxx.szhhrq }" name="szhhrq"
														required="required"/>
												</p></td>
										</tr>
										<tr>
											<td>重点救助对象</td>
											<td><p>
											<input type="hidden" value="${szxx.zdjzdx }" id="zdjzdxValue">
													<select class="biaoti_select" name="zdjzdx" id="zdjzdx"
														style="width: 150px; height: 30px">
													</select>
												</p></td>
											<td>是否选择江葬</td>
											<td colspan="4"><p>
											<input type="hidden" value="${szxx.sfxzjz }" id="sfxzjzValue">
													<select class="biaoti_select" name="sfxzjz" id="sfxzjz"
														style="width: 150px; height: 30px">
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
										</tr>
										<tr>
											<td><p>
											<input type="text" id="text" name="ptclytjyf" value="${szxx.ptclytjyf }"
											pattern="^[0-9_]{1,5}$" required="required"/>
												</p>
											</td>
											<td><p>
											<!-- 5位纯数字组合，如果打到四位数，以千分位展示；如果没有使用该项，则填写0； -->
											<input type="text" id="text" name="pthhlhhf" value="${szxx.pthhlhhf }"
											pattern="^[0-9_]{1,5}$" required="required"/>
												</p>
											</td>
											<td><p>
											<input type="text" id="text" name="ghcffy" value="${szxx.ghcffy }"
											pattern="^[0-9_]{1,5}$"
														required="required"/>
												</p>
											</td>
											<td><p>
											<input type="text" id="text" name="bygnytlcfy" value="${szxx.bygnytlcfy }"
											pattern="^[0-9_]{1,5}$" required="required"/>
												</p>
											</td>
											<td><p>
											<input type="text" id="text" name="ptghh" value="${szxx.ptghh }"
											pattern="^[0-9_]{1,5}$" required="required"/>
												</p>
											</td>
											<td><p>
											<input type="text" id="text" name="ptgbtfy" value="${szxx.pthhlhhf }"
											pattern="^[0-9_]{1,5}$" required="required"/>
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
													<input type="text" id="text" name="jbrsfzhm" value="${szxx.jbrsfzhm }"
														pattern="^(\d{6})(\d{4})(\d{2})(\d{2})(\d{3})([0-9]|X)$"
														required="required"/>
												</p></td>
											<td>姓名</td>
											<td><p>
													<input type="text" id="text" name="jbrxm" value="${szxx.jbrxm }"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,10}$"
														required="required"/>
												</p></td>
											<td>联系电话</td>
											<td><p>
													<input type="text" id="text" name="jbrlxdh" value="${szxx.jbrlxdh }"
														pattern="^[0-9]{11}$" required="required"/>
												</p></td>
										</tr>
										<tr>
										<td>证明材料</td>
											<td colspan="5">
												<p id="fjxx">
													<input type="checkbox" value="逝者身份证" class="in_sub"> <a>逝者身份证</a>
													<input type="checkbox" value="逝者户口簿" class="in_sub"> <a>逝者户口簿</a>
													<input type="checkbox" value="死亡证明" class="in_sub"> <a>死亡证明</a>
												</p>
											</td>
										</tr>
										<tr>
											<td colspan="6">
												<p>
													<input type="submit" value="  暂存  " class="in_sub"/>
													<input type="reset" value="  重置   " class="in_sub"></a>
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
	<script type="text/javascript" src="images/pageList/shswc/xxbsBsSzxxBy.js"></script>
	<script type="text/javascript" src="images/pageList/shswc/fjxxShow.js"></script>
	<script type="text/javascript" src="images/pageList/shswc/fjxx.js"></script>
	<script type="text/javascript">
	$('#submit').click(function(){
			$("form").attr("action","user/xxbsBsSzxxBy");
	});
	</script>
</body>