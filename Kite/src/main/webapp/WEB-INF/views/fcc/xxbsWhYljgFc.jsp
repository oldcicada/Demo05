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
							<span class="left_ten"> 查询条件 </span> <a href="user/xxbsWhYljgFc"><input type="submit"
								value="机构维护"> </a> <a href="user/xxbsCxYljgFc"><input type="submit" value="信息查询"></a>
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
											<td><p>
													<input name="mc" type="text" id="text"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,30}$"
														required="required">
												</p></td>
											<td>联系人</td>
											<td><p>
													<input name="lxr" type="text" id="text"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,20}$"
														required="required">
												</p></td>
											<td>联系电话</td>
											<td><p>
													<input name="lxdh" type="text" id="text" pattern="^[0-9]{11}$"
														required="required">
												</p></td>
										</tr>
										<tr>
											<td>地址</td>
											<td><p>
													<select id="dz" name="dz" class="biaoti_select"
														style="width: 150px; height: 30px">
														<option value=""></option>
													</select>
												</p></td>
											<td>入住率</td>
											<td><p>
													<input name="rzl" type="text" id="text" pattern="^[0-9]{5}$"
														required="required">
												</p></td>
											<td>总床位数</td>
											<td><p>
													<input name="zcws" type="text" id="text" pattern="^[0-9]{5}$"
														required="required">
												</p></td>
										</tr>
										<tr>
											<td>房屋性质</td>
											<td><p>
													<input name="fwxz" type="text" id="text"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,30}$"
														required="required">
												</p></td>
											<td>服务对象类型</td>
											<td colspan="3"><p>
													<input name="fwdxlx" type="text" style="width: 400px"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{8}$"
														required="required">
												</p></td>
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
											<td><p id="pstyle">
													<input name="yz" type="text" pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{3}$"
														required="required">
												</p></td>
											<td><p id="pstyle">
													<input name="fyz" type="text" pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{3}$"
														required="required">
												</p></td>
											<td colspan="3"><p id="pstyle">
													<input name="zcglry" type="text" pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{3}$"
														required="required" style="width:80px">
												</p></td>
											<td><p id="pstyle">
													<input name="ys" type="text" pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{3}$"
														required="required">
												</p></td>
											<td><p id="pstyle">
													<input name="hs" type="text" pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{3}$"
														required="required">
												</p></td>
											<td><p id="pstyle">
													<input name="cw" type="text" pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{3}$"
														required="required">
												</p></td>
											<td><p id="pstyle">
													<input name="sg" type="text" pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{3}$"
														required="required">
												</p></td>
											<td colspan="2"><p id="pstyle">
													<input name="xlzxs" type="text" pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{3}$"
														required="required">
												</p></td>
											<td><p id="pstyle"> 
													<input name="js" type="text" pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{3}$"
														required="required">
												</p></td>
											<td><p id="pstyle">
													<input name="gj" type="text" pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{3}$"
														required="required"></td>
											<td><p id="pstyle">
													<input name="cj" type="text" pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{3}$"
														required="required">
												</p></td>
										</tr>
										<tr>
											<td colspan="2">人员持证上岗率</td>
											<td colspan="3"><p id="pstyle">
													<input name="ryczsgl" type="text" pattern="^[0-9]{5}$" required="required" style="width:80px"></td>
											<td colspan="4">等级评定</td>
											<td colspan="5"><p id="pstyle">
													<input name="djpd" type="text" pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{3}$"
														required="required" style="width:400px">
												</p></td>
										</tr>
										<tr>
											<td colspan="2">备注</td>
											<td colspan="12"><p id="pstyle">
													<input name="bz" type="text"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{30}$"
														required="required" style="width:600px">
												</p></td>
										</tr>
										<tr>
											<td colspan="14">
												<p id="pstyle">
													<input id="save" type="submit" value="  保存  " class="in_sub">
													<input type="reset" value="  取消  " class="in_sub">
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
	<script type="text/javascript" src="images/pageList/fcc/xxbsWhYljgFc.js"></script>
</body>