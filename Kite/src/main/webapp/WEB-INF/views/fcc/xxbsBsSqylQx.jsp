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
							<span>合肥市养老服务设施管理</span> <a href="user/xxbsBsSqylQx"><input type="submit"
								value="信息报送"> </a> <a
								href="user/xxbsCxSqylQx"><input
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
											<input type="hidden" name="id" value="${MzywFccSqylfwss.id }">
											基本信息</td>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>名称</td>
											<td><p>
													<input name="mc" value="${MzywFccSqylfwss.mc }" type="text" id="text"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,30}$"
														required="required"/>
												</p></td>
											<td>联系人</td>
											<td><p>
													<input name="lxr" value="${MzywFccSqylfwss.lxr }" type="text" id="text"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{1,20}$"
														required="required"/>
												</p></td>
											<td>联系电话</td>
											<td><p>
													<input name="lxdh" value="${MzywFccSqylfwss.lxdh }" type="text" id="text" pattern="^[0-9]{11}$"
														required="required"/>
												</p></td>
										</tr>
										<tr>
											<td>地址</td>
											<td><p>
													<select id="dz" name="dz" value="${MzywFccSqylfwss.dz }" class="biaoti_select"
														style="width: 150px; height: 30px">
														<option value=''>请选择</option>
													</select>
												</p></td>
											<td>建筑面积</td>
											<td><p>
													<input name="jzmj" value="${MzywFccSqylfwss.jzmj }" type="text" id="text" pattern="^[0-9]{7}$"
														required="required"/>
												</p></td>
											<td>主要功能</td>
											<td><p>
													<input name="zygn" value="${MzywFccSqylfwss.zygn }" type="text" id="text"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{40}$"
														required="required"/>
												</p></td>
										</tr>
										<tr>
											<td>辖区基本情况</td>
											<td><p>
													<input name="xqjbqk" value="${MzywFccSqylfwss.xqjbqk }" type="text" id="text"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{80}$"
														required="required"/>
												</p></td>
											<td>开放时间安排</td>
											<td colspan="4"><p>
													<input name="kfsjap" value="${MzywFccSqylfwss.kfsjap }" type="text" style="width: 400px"
														pattern="^[\u4E00-\u9FA5A-Za-z0-9_]{80}$"
														required="required"/>
												</p></td>
										</tr>
										<tr>
											<td colspan="6">
												<p>
													<input id="zc" type="submit" value=" 暂存  " class="in_sub">
													<input id="bs" type="reset" value="  报送 " class="in_sub">
													<input type="reset" value="  取消 " class="in_sub">
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
	<script type="text/javascript" src="images/pageList/fcc/xxbsBsSqylssQx.js"></script>
</body>