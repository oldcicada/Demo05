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
								<a href="user/xxbsBsQxjj" target="frame"><input type="submit" value="信息报送" ></a>
								<a href="user/fxbXxCxQx" target="frame"><input type="submit" value="信息查询"></a>
								<div class="clear"></div>
							</div>
							<div class="sbaz_table">
								<p>
								   <span class="tiaoshijian"> 送报时间：
                                    <input type="date" id="date_time">
                                    <i class="glyphicon glyphicon-calendar fa fa-calendar" style="top:14px;"></i>
                                    </span> 
									<span class="tiaoshijian"> 至：
                                    <input type="date" id="date_time">
                                    <i class="glyphicon glyphicon-calendar fa fa-calendar" style="top:14px; left: 40px;"></i>
                                    </span> 
                   
									<span>标题名称：<input type="text"></span>
									<span>审核结果：
			          					<select  class="biaoti_select">
										  <option value="已采用">已采用</option>
										  <option value="未采用">未采用</option>
										</select>
          				            </span>
          				            <span>提交状态：
			          					<select  class="biaoti_select">
										  <option value="已提交未审核">已提交未审核</option>
										  <option value="已提交已审核">已提交已审核</option>
										  <option value="未提交">未提交</option>
										</select>
          				            </span>
									<span>栏目名称：
			          					<select  class="biaoti_select">
										  <option value="民政专版">民政专版</option>
										  <option value="民政信息">民政信息</option>
										  <option value="门户网站">民政网站</option>
										</select>
          				            </span>
									<input type="submit" value="  查询  " class="in_sub"> 
									<input type="reset" value="  重置  " class="in_sub">
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
												<td>标题</td>
												<td>报送时间</td>
												<td>提交状态</td>
												<td>审核结果</td>
												<td>栏目名称</td>
												<td>稿酬(元)</td>
												<td>操作</td>
											</tr>
											
										</thead>
										<tbody>
											<tr>
												<td><input type="checkbox" class="table_check"></td>
												<td>166</td>
												<td>生产</td>
												<td>电表</td>
												<td>电</td>
												<td>166</td>
												<td>生产</td>
												<td>项目</td>
												<td>2015-02-01</td>
											</tr>
											<tr>
												<td><input type="checkbox" class="table_check"></td>
												<td>174</td>
												<td>生产</td>
												<td>电表</td>
												<td>电</td>
												<td>项目</td>
												<td>生产</td>
												<td>项目</td>
												<td>2015-03-01</td>
											</tr>
											<tr>
												<td><input type="checkbox" class="table_check"></td>
												<td>175</td>
												<td>生产</td>
												<td>电表</td>
												<td>电</td>
												<td>项目</td>
												<td>生产</td>
												<td>项目</td>
												<td>2015-03-02</td>
											</tr>
											<tr>
												<td><input type="checkbox" class="table_check"></td>
												<td>174</td>
												<td>生产</td>
												<td>电表</td>
												<td>电</td>
												<td>项目</td>
												<td>生产</td>
												<td>项目</td>
												<td>2015-03-01</td>
											</tr>
											<tr>
												<td><input type="checkbox" class="table_check"></td>
												<td>174</td>
												<td>生产</td>
												<td>电表</td>
												<td>电</td>
												<td>项目</td>
												<td>生产</td>
												<td>项目</td>
												<td>2015-03-01</td>
											</tr>
											<tr>
												<td><input type="checkbox" class="table_check"></td>
												<td>175</td>
												<td>生产</td>
												<td>电表</td>
												<td>电</td>
												<td>项目</td>
												<td>生产</td>
												<td>项目</td>
												<td>2015-03-02</td>
											</tr>
											<tr>
												<td><input type="checkbox" class="table_check"></td>
												<td>175</td>
												<td>生产</td>
												<td>电表</td>
												<td>电</td>
												<td>项目</td>
												<td>生产</td>
												<td>项目</td>
												<td>2015-03-02</td>
											</tr>
										
											<tr>
												<td><input type="checkbox" class="table_check"></td>
												<td>175</td>
												<td>生产</td>
												<td>电表</td>
												<td>电</td>
												<td>项目</td>
												<td>生产</td>
												<td>项目</td>
												<td>2015-03-02</td>
											</tr>
											<tr>
												<td><input type="checkbox" class="table_check"></td>
												<td>177</td>
												<td>生产</td>
												<td>采集器</td>
												<td>水</td>
												<td>项目</td>
												<td>生产</td>
												<td>项目</td>
												<td>2015-03-02</td>
											</tr>
											
										</tbody>

									</table>
									<div class="t_fanye">
										<span class="upten"></span> <span class="up"></span> <span
											class="split"></span> <span class="page_info_one">第 1
											/ 1 页</span> <span class="split"></span> <span class="dowm"></span>
										<span class="downten"></span> <span class="page_info_two">页记录数
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