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
td p{
margin:2px;
}
#text {
	width: 150px;
	margin-top:2px;
}
#tbody tr td:nth-child(odd){
width:250px;
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
							<a href=""><input type="submit"
								value="信息报送"> </a> <a
								href="views/fcc_xxbs_cx_yljg_qx/xxbsCxYljgFc"><input
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
											<td colspan="6">士兵基本信息</td>
										</tr>
									</thead>
									<tbody id="tbody">
										<tr>
											<td>身份证号码</td>
											<td><p>
													<input type="text" id="text"
														pattern="^[0-9]{18}$"
														required="required">
												</p></td>
											<td>姓名</td>
											<td><p>
													<input type="text" id="text"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,4}$"
														required="required">
												</p></td>
											<td>籍贯</td>
											<td><p>
													<input type="text" id="text" pattern="^[0-9]{11}$"
														required="required">
												</p></td>
										</tr>
										<tr>
											<td>性别</td>
											<td><p>
													<select class="biaoti_select"
														style="width: 150px; height: 30px">
														<option value="">男</option>
														<option value="">女</option>
													</select>
												</p></td>
											<td>政治面貌</td>
											<td><p>
													<select class="biaoti_select"
														style="width: 150px; height: 30px">
														<option value="">党员</option>
														<option value="">团员</option>
														<option value="">无</option>
													</select>
												</p></td>
											<td>出生年月</td>
											<td><p>
													<input type="date" id="text"
														required="required">
												</p></td>
										</tr>
										<tr>
											<td>文化程度</td>
											<td><p>
													<select class="biaoti_select"
														style="width: 150px; height: 30px">
														<option value="">本科及以上</option>
														<option value="">大专</option>
														<option value="">高中</option>
														<option value="">初中</option>
														<option value="">小学及以下</option>
													</select>
												</p></td>
											<td>居住地址</td>
											<td><p>
													<select class="biaoti_select"
														style="width: 150px; height: 30px">
														<option value="">党员</option>
														<option value="">团员</option>
														<option value="">无</option>
													</select>
												</p></td>
											<td>健康状态</td>
											<td><p>
													<select class="biaoti_select"
														style="width: 150px; height: 30px">
														<option value="">良好</option>
														<option value="">一般</option>
														<option value="">其他</option>
													</select>
												</p></td>
										</tr>
										<tr>
											<td colspan="6">入伍与退伍信息</td>
										</tr>
										<tr>
											<td>军种</td>
											<td><p>
													<select class="biaoti_select"
														style="width: 150px; height: 30px">
														<option value="">海军</option>
														<option value="">陆军</option>
														<option value="">空军</option>
														<option value="">二炮</option>
														<option value="">武警</option>
													</select>
												</p></td>
											<td>专业特长</td>
											<td><p>
													<input type="text" style="width: 300px" 
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,20}$"
														required="required">
												</p></td>
												<td>联系电话</td>
												<td><p>
													<input type="text" style="width: 300px"
														pattern="^[0-9]{11}$"
														required="required">
												</p></td>
										</tr>
										<tr>
											<td>入伍地点</td>
											<td><p>
													<select class="biaoti_select"
														style="width: 150px; height: 30px">
														<option value=""></option>
													</select>
												</p></td>
											<td>入伍时间</td>
											<td><p>
													<input type="date" id="text"
														required="required">
												</p></td>
												<td>入伍通知编号</td>
												<td><p>
													<input type="text" style="width: 300px" 
													pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,20}$"
														required="required">
												</p></td>
										</tr>
										<tr>
											<td>退役部队名称</td>
											<td><p>
											<input type="text" id="text"
													pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,20}$"
														required="required">
												</p></td>
											<td>入伍前户口性质</td>
											<td><p>
													<select class="biaoti_select"
														style="width: 150px; height: 30px">
														<option value="">农业</option>
														<option value="">非农业</option>
													</select>
												</p></td>
												<td>退伍时间</td>
												<td><p>
													<input type="date" id="text" required="required">
												</p></td>
										</tr>
										<tr>
											<td>受过奖励</td>
											<td><p>
												<select class="biaoti_select"
														style="width: 150px; height: 30px">
														<option value="">一等功</option>
														<option value="">二等功</option>
															<option value="">三等功</option>
																<option value="">嘉奖</option>
																	<option value="">优秀士兵</option>
													</select>
												</p></td>
											<td>退役证件编号</td>
											<td><p>
													<input type="text" id="text"
													pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,20}$"
														required="required">
												</p></td>
												<td>退役时是否领取退役金</td>
												<td><p>
													<select class="biaoti_select"
														style="width: 150px; height: 30px">
														<option value="">是</option>
														<option value="">否</option>
													</select>
												</p></td>
										</tr>
										<tr>
											<td>是否参加免费培训</td>
											<td><p>
												<select class="biaoti_select"
														style="width: 150px; height: 30px">
														<option value="">是</option>
														<option value="">否</option>
													</select>
												</p></td>
											<td>服役方式</td>
											<td><p>
												<select class="biaoti_select"
														style="width: 150px; height: 30px">
														<option value="">义务兵</option>
														<option value="">初级士官</option>
														<option value="">中级士官</option>
													</select>
												</p></td>
												<td>报道时间</td>
												<td><p>
													<input type="date" id="text"
														required="required">
												</p></td>
										</tr>
										<tr>
											<td colspan="6">职业教育和技能培训信息</td>
										</tr>
									</tbody>
								</table>
								</div>
								<div class="ssjc_rub_table sbaz_table" style="padding:0;margin:0">
								<table class="tj_table" style="border: 0" >
										<tr>
											<td>学校名称</td>
											<td><p>
													<select class="biaoti_select" id="text">
														<option value=""></option>
													</select>
												</p></td>
											<td>专业</td>
											<td><p>
													<select class="biaoti_select" id="text">
														<option value=""></option>
													</select>
												</p></td>
											<td>学制</td>
											<td><p>3年</p></td>
											<td><p>编辑删除</p></td>
										</tr>
											<tr>
											<td>学校名称</td>
											<td><p>
													<select class="biaoti_select" id="text">
														<option value=""></option>
													</select>
												</p></td>
											<td>专业</td>
											<td><p>
													<select class="biaoti_select" id="text">
														<option value=""></option>
													</select>
												</p></td>
											<td>学制</td>
											<td><p>5年</p></td>
											<td><p>编辑删除</p></td>
										</tr>
											<tr>
											<td>学校名称</td>
											<td><p>
													<select class="biaoti_select" id="text">
														<option value=""></option>
													</select>
												</p></td>
											<td>专业</td>
											<td><p>
													<select class="biaoti_select" id="text">
														<option value=""></option>
													</select>
												</p></td>
											<td>学制</td>
											<td><p>半年</p></td>
											<td><p>编辑删除</p></td>
										</tr>
										<tr>
											<td>其他专业意向</td>
											<td colspan="4"><p><input type="text" style="width:500px"
													pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,20}$"
														required="required"></p></td>
											<td>是否服从调整</td>
											<td><p>
													<select class="biaoti_select" id="text">
														<option value="">是</option>
														<option value="">否</option>
													</select>
												</p></td>
										</tr>
										<tr>
											<td colspan="7">
												<p>
													<input type="submit" value="  暂存  " class="in_sub">
													<input type="submit" value="  取消  " class="in_sub">
													<input type="reset" value="  报送 " class="in_sub">
												</p>
											</td>
										</tr>
								</table>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>