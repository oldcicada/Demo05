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
								<a href="user/xxbsCxFxby" target="frame"><input type="submit" value="信息查询" ></a>
								<a href="" target="frame"><input type="submit" value="信息审核"></a>
								<a href="" target="frame"><input type="submit" value="报表统计" ></a>
								<div class="clear"></div>
							</div>
							<div class="sbaz_table">
								<p>
								   <span class="tiaoshijian"> 送报时间：
                                    <input type="date" id="date_time" name="startDate">
                                    <i class="glyphicon glyphicon-calendar fa fa-calendar" style="top:14px;"></i>
                                    </span> 
									<span class="tiaoshijian"> 至：
                                    <input type="date" id="date_time" name="endDate">
                                    <i class="glyphicon glyphicon-calendar fa fa-calendar" style="top:14px; left: 40px;"></i>
                                    </span> 
                   
									<span>标题名称：<input type="text" name="xxbt"></span>
									<span>报送单位：
			          					<select  class="biaoti_select" name="sbdw" id="sbdw">
										  <option value="">-请选择-</option>
										</select>
          				            </span>
									
									<span>审核结果：
			          					<select  class="biaoti_select" name="shjg" id="shjg">
										  <option value="">-请选择-</option>
										</select>
          				            </span>
          				            <span>提交状态：
			          					<select  class="biaoti_select" name="tjzt" id="tjzt">
										   <option value="">-请选择-</option>
										</select>
          				            </span>
									<span>栏目名称：
			          					<select  class="biaoti_select" name="lmmc" id="lmmc">
										    <option value="">-请选择-</option>
										</select>
          				            </span>
									<input type="submit" value="  查询  " class="in_sub" id="query"> 
									<input type="reset" value="  重置  " class="in_sub" id="reset">
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
												<td>报送单位</td>
												<td>标题</td>
												<td>报送时间</td>
												<td>提交状态</td>
												<td>审核结果</td>
												<td>栏目名称</td>
												<td>稿酬(元)</td>
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
	<script src="images/pageList/fxb/fxbyh.js"></script>
</body>