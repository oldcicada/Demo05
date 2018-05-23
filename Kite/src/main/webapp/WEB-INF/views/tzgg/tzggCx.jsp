<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="background-color: #000">
<head>
<%@include file="../commont.jsp"%>
</head>
<body class="skin-blue"  style="height: 100% !important;">
	<div class="wrapper" >
			<div class="content">
				<div class="yjgl">
					<div class="ssjc_right_up">
						<div class="nei">
							<div class="ssjc_ru_title">
								<span class="left_ten"> 查询条件 </span>
								<a href="user/tzggxz" target="frame"><input type="submit" value="公告发布" ></a>
								<a href="user/tzggCx" target="frame"><input type="submit" value="公告查询"></a>
								<div class="clear"></div>
							</div>
							<div class="sbaz_table">
								<p>
								   <span class="tiaoshijian"> 开始时间：
                                    <input type="date" id="date_time" name="startDate">
                                    <i class="glyphicon glyphicon-calendar fa fa-calendar" style="top:14px;"></i>
                                    </span> 
									<span class="tiaoshijian"> 至：
                                    <input type="date" id="date_time" name="endDate">
                                    <i class="glyphicon glyphicon-calendar fa fa-calendar" style="top:14px; left: 40px;"></i>
                                    </span> 
                   
									<span>公告标题：<input type="text" name="tzggbt"></span>
									<span>状态：
			          					<select  class="biaoti_select" name="tzggzt">
										  <option value="已发布">已发布</option>
										   <option value="未发布">未发布</option>
										 
										</select>
          				            </span>
									<input type="submit" value="  查询  " id="query" class="in_sub"> 
									<input type="reset" value="  重置  " id="reset" class="in_sub">
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
												<td>公告标题</td>
												<td>发布处室</td>
												<td>状态</td>
												<td>发布时间</td>
												<td>操作</td>
											</tr>
											
										</thead>
										<tbody id="content">
										</tbody>

									</table>
								<div class="t_fanye">
										<span class="upten"></span>
										 <span class="up"></span> 
										 <span class="split"></span>
										 <span class="page_info_one"></span>
										 <span class="split"></span>
										 <span class="dowm"></span>
										<span class="downten"></span>
										<span class="page_info_two">
											</span> <span class="page_info_three"></span>
										<div class="clear"></div>
									</div>

								</div>
								
							</div>
						</div>
					</div>
			</div>
		</div>
	</div>
	<script src="images/pageList/tzgg/tzgg.js"></script>
</body>