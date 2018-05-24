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
								   <span class="tiaoshijian"> 年度：
			          					<select  class="biaoti_select" name="ssnd">
										  <option value="2018">2018</option>
										   <option value="2017">2017</option>
										   <option value="2016">2016</option>
										   <option value="2015">2015</option>
										   <option value="2014">2014</option>
										   <option value="2018">2013</option>
										   <option value="2018">2012</option>
										   <option value="2018">2011</option>
										   <option value="2018">2010</option>
										</select>
                                    </span> 
									<input type="submit" value="  生成 " class="in_sub" id="query" name="query"> 
									<input type="button" value="  导出  " class="in_sub" id="daochu" name="daochu">
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
												<td>机关处室名称</td>
												<td>每月报送基数</td>
												<td>1月</td>
												<td>2月</td>
												<td>3月</td>
												<td>4月</td>
												<td>5月</td>
												<td>6月</td>
												<td>7月</td>
												<td>8月</td>
												<td>9月</td>
												<td>10月</td>
												<td>11月</td>
												<td>12月</td>
												<td>累计报送条数</td>
											</tr>
											
										</thead>
											<tbody id="content">
										</tbody>
									</table>
							
								</div>
								
							</div>
						</div>
					</div>
			</div>
		</div>
	</div>
		<script src="images/pageList/fxb/jgcs.js"></script>
</body>