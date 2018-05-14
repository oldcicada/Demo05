<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="background-color: #000">
<head>
<%@include file="../commont.jsp"%>
<style type="text/css">
#table {
	margin: 0 auto;
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
						<span class="left_ten">督查评比情况 </span>
							<a href=""><input type="submit" value="新增评分" ></a>
								<a href=""><input type="submit" value="评分查询"></a>
							<div class="clear"></div>
						</div>
						<div class="sbaz_table">
							<p>
								 <span> 处室类型 <select
									class="biaoti_select" style="width: 150px; height: 30px">
										<option value="">机关处室</option>
										<option value="">军休军供系统</option>
										<option value="">局属其他单位</option>
								</select>
								 <span> 年度 <select
									class="biaoti_select" style="width: 150px; height: 30px">
										<option value="">2010</option>
										<option value="">2014</option>
								</select>
								</span> <input type="submit" value="  查询  " class="in_sub"> <input
									type="reset" value="  重置  " class="in_sub">
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
											<td>处室分类</td>
											<td>年度</td>
											<td>标题</td>
											<td>操作</td>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>1</td>
											<td>机关处室</td>
											<td>2014</td>
											<td>2014年第4次督查评比情况汇总</td>
											<td><a href="">详情</a></td>
										</tr>
									</tbody>

								</table>
								<div class="t_fanye">
									<span class="upten"></span> <span class="up"></span> <span
										class="split"></span> <span class="page_info_one">第 1 /
										1 页</span> <span class="split"></span> <span class="dowm"></span> <span
										class="downten"></span> <span class="page_info_two">页记录数
										15</span> <span class="page_info_three">当前1-1条记录，共1条记录</span>
									<div class="clear"></div>
								</div>
								<div class="sbaz_table">
									<p>
										<input type="submit" value="  保存  " class="in_sub">
										<input type="reset" value="  取消  " class="in_sub">
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>