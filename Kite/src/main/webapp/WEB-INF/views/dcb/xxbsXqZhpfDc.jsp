<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="background-color: #000">
<head>
<%@include file="../commont.jsp"%>
<style type="text/css">
tr td:first-child {
	width: 100px;
}

#table {
	margin: 0 auto;
	width: 600px;
}
</style>
</head>
<script type="text/javascript">
$(document).ready(function(){
var id=$("input[name=id]").val();
	
	$.post("user/xxbsXqZhpfDc",
			{"id":id},
			function(data,status){
				//字符串转成json对象
				var list=data.list;
				if(status){
					$("#content").empty();
					for(var i=0;i<list.length;i++){
							var content="<tr><td>"+list[i].dw
							+"</td><td>"+list[i].jbdf
							+"</td><td>"+list[i].cxld
							+"</td><td>"+list[i].bzxc
							+"</td><td>"+list[i].hj
							+"</td><td>"+(i+1)
							+"</td></tr>";
							$("#content").append(content);
					}
				}
				
	});
	});
</script>
<body class="skin-blue">
	<div class="wrapper">
		<div class="content">
			<div class="yjgl">
				<div class="ssjc_right_up">
					<div class="nei">
						<div class="ssjc_ru_title">
							<span class="left_ten">督查评比情况 </span>
						</div>
						<div class="sbaz_table">
							<p>
								<span>${bt }</span>
							</p>
						</div>
					</div>
					<div class="ssjc_right_bottom" id="table">
					<input type="hidden" id="id" name="id" value="${id }">
						<div class="nei">
							<p>查询结果</p>
							<div class="ssjc_rub_table">
								<table class="tj_table sbaz_table" style="border: 0">
									<thead>
										<tr>
											<td>单位</td>
											<td>基本得分</td>
											<td>创新亮点</td>
											<td>表彰宣传</td>
											<td>合计</td>
											<td>名次</td>
										</tr>
									</thead>
									<tbody id="content">
									<%-- 	<tr>
											<td>${zhpfOne.dw }</td>
											<td><p>
													<input type="text" id="text" value="${zhpfOne.jbdf }" pattern="^[0-9.]{1,6}$"
														required="required" />
												</p></td>
											<td><p>
													<input type="text" id="text" value="${zhpfOne.cxld }" pattern="^[0-9.]{1,6}$"
														required="required" />
												</p></td>
											<td><p>
													<input type="text" id="text" value="${zhpfOne.bzxc }" pattern="^[0-9.]{1,6}$"
														required="required" />
												</p></td>
											<td><p>
													<input type="text" id="text" value="${zhpfOne.hj }" pattern="^[0-9.]{1,6}$"
														required="required" readonly="readonly" />
												</p></td>
											<td>1</td>
										</tr> --%>
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
										<input type="submit" value="  导出  " class="in_sub">
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