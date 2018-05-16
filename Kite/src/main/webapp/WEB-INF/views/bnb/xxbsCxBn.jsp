<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="background-color: #000">
<head>
<%@include file="../commont.jsp"%>
<script src="images/pageList/bnb/xxbsCxBn.js" type="text/javascript"></script>
</head>
<body class="skin-blue">
	<div class="wrapper">
		<div class="content">
			<div class="yjgl">
				<div class="ssjc_right_up">
					<div class="nei">
						<div class="ssjc_ru_title">
							<span class="left_ten"> 查询条件 </span> 
						</div>
						<div class="sbaz_table">
							<p>
								<span class="tiaoshijian"> 报送时间： <input type="date"
									id="date_time" name="startDate"> <i
									class="glyphicon glyphicon-calendar fa fa-calendar"
									style="top: 14px;"></i>
								</span> <span class="tiaoshijian"> 至： <input type="date"
									id="date_time" name="endDate"> <i
									class="glyphicon glyphicon-calendar fa fa-calendar"
									style="top: 14px; left: 40px;"></i>
								</span> <span>报送单位：<select class="biaoti_select" id="sbdw" style="width: 150px; height: 30px">
														<option value="">--请选择--</option>
														<option value="民政部">民政部</option>
														<option value="社会事务处">社会事务处</option>
													</select>
								</span>
								<input type="button" id="query" value="  查询  " class="in_sub"> 
								<input type="button" id="reset" value="  重置  "  class="in_sub">
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
											<td>受理时间</td>
											<td>办结时间</td>
											<td>报送时间</td>
											<td>操作</td>
										</tr>

									</thead>
							
									<tbody id="content"></tbody>
								</table>
								<div class="t_fanye">
									<span class="upten"></span> <span class="up"></span> <span
										class="split"></span> <span class="page_info_one"></span> <span
										class="split"></span> <span class="dowm"></span> <span
										class="downten"></span> <span class="page_info_two"> 15</span>
									<span class="page_info_three"></span>
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