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
							<div class="clear"></div>
						</div>
						<div class="sbaz_table">
							<p>
								<span class="tiaoshijian"> 学校名称： <input type="text"
									style="width: 200px;" name="schoolName">
								</span> <input type="submit" value="  查询 " id="query" class="in_sub"> <input
									type="button" value="  新增  " id="reset" class="in_sub">
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
											<td>学号名称</td>
											<td>学制(年)</td>
											<td>状态</td>
											<td>操作</td>
										</tr>
									</thead>
									<tbody id="content"></tbody>
								</table>
								<div class="t_fanye">
									<span class="upten"></span>
								    <span class="up"></span>
								    <span class="split"></span>
									<span class="page_info_one">第 1/1 页</span>
									<span class="split"></span>
									<span class="dowm"></span>
									<span class="downten"></span>
									<span class="page_info_two">页记录数15</span>
									<span class="page_info_three">当前1-1条记录，共1条记录</span>
									<div class="clear"></div>
								</div>

							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="images/pageList/xx_azcy/xxxx.js"></script>
</body>