<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="background-color: #000">
<head>
<%@include file="../commont.jsp"%>
<script src="images/pageList/azc/azcXxCxBdQx.js" type="text/javascript"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style type="text/css">
#table {
	margin: 0 auto;
}

#text {
	width: 150px;
	height: 30px;
}
</style>

</head>
<body class="skin-blue">
	<div class="wrapper">
		<div class="content">
			<div class="yjgl">
				<div class="ssjc_right_up">
					<div class="nei">
						<div class="ssjc_ru_title">
							<span class="left_ten">查询条件</span>
							<div class="clear"></div>
						</div>
						<div class="sbaz_table">
							<p>
								<span> 士兵姓名 <input type="text" id="text" name="xm" required="required"></span>
								<span> 士兵身份证号码 <input type="text" id="text" name="sbsfzhm" required="required"></span> 
								<span>
								是否参加免费培训 <select class="biaoti_select" id="sfcjmfpx" style="width: 150px; height: 30px">
										<option value="">--请选择--</option>
										<option value="是">是</option>
										<option value="否">否</option>
								</select>
								</span><br/>
								<span> 报送状态
								<select class="biaoti_select" id="zcbs" style="width: 150px; height: 30px">
										<option value="">--请选择--</option>
										<option value="未报送">未报送</option>
										<option value="已报送">已报送</option>
								</select>
								</span> 
								<span> 报送时间： <input type="date" id="date_time" name="startDate"></span> 
								<span> 至： <input type="date" id="date_time" name="endDate"></span> 
								<input type="button" id="query" value="  查询  " class="in_sub"> 
								<input type="button" id="reset" value="  重置  " class="in_sub">
							</p>
						</div>
					</div>
					<div class="ssjc_right_bottom" id="table">
						<div class="nei">
							<p>查询结果</p>
							<div class="ssjc_rub_table">
								<table class="tj_table sbaz_table" style="border: 0">
									<thead>
										<tr>
											<td>编号</td>
											<td>士兵姓名</td>
											<td>身份证号码</td>
											<td>报送状态</td>
											<td>报道时间</td>
											<td>籍贯</td>
											<td>是否参加免费培训</td>
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