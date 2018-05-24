<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="background-color: #000">
<head>
<%@include file="../commont.jsp"%>
<script src="images/pageList/xxxx/xxxx.js" type="text/javascript"></script>
</head>
<body class="skin-blue" style="height: 100% !important;">
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
							    <span class="tiaoshijian"> 学校名称：
                                    <input type="text" id="pzmc" style="width: 200px;">
                                 </span>
								<input type="button" id="query" value="  查询 " class="in_sub"> 
								<input type="button" id="add" value="  新增  " class="in_sub">
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
											<td>编号</td>
											<td>学号名称</td>
											<td>状态</td>
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