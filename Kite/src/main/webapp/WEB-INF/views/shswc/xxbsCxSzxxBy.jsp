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
							<span class="left_ten"> 查询条件 </span> 
							<a href="user/xxbsAdSzxxBy"><input type="submit" value="新增信息报送" ></a>
							<a href="user/xxbsCxSzxxBy"><input type="submit" value="信息查询"></a>
							<div class="clear"></div>
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
								</span> <span>逝者姓名：<input type="text" style="width: 120px;"
									name="szxm"></span> <span>殡仪馆名称： <select
									class="biaoti_select" name="bygmc" id="bygmc">
										<option value="">请选择</option>
								</select>
								</span> <span>身份证号码：<input type="text" name="szsfzhm"
									pattern="^[1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$"></span>
								<input type="submit" id="query" value="  查询  " class="in_sub">
								<input type="submit" id="reset" value="  重置  " class="in_sub">
							</p>
						</div>
					</div>
					<div class="ssjc_right_bottom">
						<div class="nei">
							<p>查询结果</p>
							<div class="ssjc_rub_table">
								<table class="tj_table" border="0">
									<thead>
										<tr>
											<td><input type="checkbox" class="table_check"></td>
											<td>编号</td>
											<td>逝者姓名</td>
											<td>身份证号码</td>
											<td>报送状态</td>
											<td>报送时间</td>
											<td>救助对象</td>
											<td>户籍地</td>
											<td>操作</td>
										</tr>
									</thead>
									<tbody id="content"></tbody>
								</table>
								<div class="t_fanye" id="pageControl">
									<span class="upten"></span> <span class="up"></span> <span
										class="split"></span> <span class="page_info_one"></span> <span
										class="split"></span> <span class="dowm"></span> <span
										class="downten"></span> <span class="page_info_two"></span> <span
										class="page_info_three"></span>
									<div class="clear"></div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript"
		src="images/pageList/shswc/xxbsCxSzxxBy.js"></script>
</body>