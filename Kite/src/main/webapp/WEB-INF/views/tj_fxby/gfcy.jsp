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
                                    <span>栏目：
			          					<select  class="biaoti_select" name="lmmc" id="lmmc">
										  <option value="">-请选择-</option>
										</select>
          				            </span>
									<input type="submit" value="  生成 " class="in_sub" id="query"> 
									<input type="reset" value="  导出  " class="in_sub" id="daochu">
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
												<td>见报日期</td>
												<td>期数</td>
												<td>标题</td>
												<td>作者</td>
												<td>稿酬(元)</td>
												<td>签名</td>
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
	<script src="images/pageList/fxb/gfcy.js"></script>
</body>