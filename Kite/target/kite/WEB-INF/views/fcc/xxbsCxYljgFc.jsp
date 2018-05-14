<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="background-color: #000">
<head>
<%@include file="../commont.jsp"%>
</head>
<body class="skin-blue">
	<div class="wrapper">
		<div class="content">
			<div class="yjgl">
				<div class="ssjc_right_up">
					<div class="nei">
						<div class="ssjc_ru_title">
							<span class="left_ten"> 查询条件 </span> <input type="submit"
								value="机构维护"> <input type="submit" value="信息查询">
							<div class="clear"></div>
						</div>
						<div class="sbaz_table">
							<p>
								<span class="tiaoshijian"> 报送时间： <input type="date"
									id="date_time"> <i
									class="glyphicon glyphicon-calendar fa fa-calendar"
									style="top: 14px;"></i>
								</span> <span class="tiaoshijian"> 至： <input type="date"
									id="date_time"> <i
									class="glyphicon glyphicon-calendar fa fa-calendar"
									style="top: 14px; left: 40px;"></i>
								</span> <span>报送单位：<select class="biaoti_select"
														style="width: 150px; height: 30px">
														<option value="曲线图">曲线图</option>
														<option value="折线图">折线图</option>
														<option value="柱状图">柱状图</option>
													</select></span> 养老机构名称<span>：<input
									type="text"></span> <input type="submit" value="  查询  "
									class="in_sub"> <input type="reset" value="  重置  "
									class="in_sub">
							</p>
						</div>
					</div>
					<div class="ssjc_right_bottom">
						<div class="nei">
							<p>查询结果</p>
							<div class="ssjc_rub_table">
								<table class="tj_table" style="border: 0">
									<thead>
										<tr>
											<td>编号</td>
											<td>报送单位</td>
											<td>养老机构名称</td>
											<td>地址</td>
											<td>联系人</td>
											<td>联系电话</td>
											<td>报送时间</td>
											<td>操作</td>
										</tr>

									</thead>
									<tbody>
										<tr>
											<td>166</td>
											<td>生产</td>
											<td>电表</td>
											<td>电</td>
											<td>项目</td>
											<td>2015-02-01</td>
											<td>2015-02-01</td>
											<td><a href="views/fcc_xxbs_cx_yljg_qx/xxbsXqYljgFc">查看</a></td>
										</tr>
									</tbody>

								</table>
								<div class="t_fanye">
									<span class="upten"></span> <span class="up"></span> <span
										class="split"></span> <span class="page_info_one">第 1 /
										1 页</span> <span class="split"></span> <span class="dowm"></span> <span
										class="downten"></span> <span class="page_info_two">页记录数
										15</span> <span class="page_info_three">当前1-1条记录，共1条记录</span>
									<div class="clear"></div>
								</div>

							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>