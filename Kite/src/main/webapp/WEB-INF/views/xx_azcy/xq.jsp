<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="background-color: #000">
<head>
<%@include file="../commont.jsp"%>
<script src="images/pageList/xxxx/xx.js" type="text/javascript"></script>
</head>
<body class="skin-blue" style="height: 100% !important;">
	<div class="wrapper">
		<div class="content">
			<div class="yjgl">
				<div class="ssjc_right_up">
					<div class="nei">
						<div class="ssjc_ru_title">
							<span class="left_ten"> 学校详情 </span>
                            <input id="id" type="hidden" value="${xxxq.id}">
							<div class="clear"></div>
						</div>
						<div class="sbaz_table">
							<p>
					
							</p>
						</div>
					</div>
					<div class="ssjc_right_bottom">
						<div class="nei">
							<div class="ssjc_rub_table">
								<table class="tj_table" border="0">
									<thead>
									<tr>
									<td >学校名称</td>
									<td colspan="3">${xxxq.pzmc }</td>
									</tr>
									</thead>
									<tbody id="content"></tbody>
								</table>

							</div>
						</div>
					</div>
				</div>
				</div>
			</div>
		</div>
</body>