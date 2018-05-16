<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="background-color: #000">
<head>
<%@include file="../commont.jsp"%>
</head>
<body class="skin-blue">
	<div class="wrapper">
		<div class="content">
			<div class="yjgl">
				<div class="ssjc_right_up">
					<div class="nei">
						<div class="ssjc_ru_title">
							<span class="left_ten"> 查询条件 </span> <input type="submit"
								value="机构维护"> <input type="submit" value="信息查询">
							<div class="clear"></div>
						</div>
						<div class="sbaz_table">
							<p>
								<span class="tiaoshijian"> 报送时间： <input type="date"
									id="date_time" name="startDate"> <i
									class="glyphicon glyphicon-calendar fa fa-calendar"
									style="top: 14px;"></i>
								</span> <span class="tiaoshijian"> 至： <input type="date"
									id="date_time" name="endDate"> <i
									class="glyphicon glyphicon-calendar fa fa-calendar"
									style="top: 14px; left: 40px;"></i>
								</span> <span>报送状态：<select name="bszt" class="biaoti_select"
														style="width: 150px; height: 30px">
														<option value=""></option>
														<option value="已提交">已提交</option>
														<option value="未提交">未提交</option>
													</select></span> 养老机构名称<span>：<input
									type="text" name="mc" id="mc"></span> <input type="submit" value="  查询  "
									class="in_sub"> <input type="reset" value="  重置  "
									class="in_sub">
							</p>
						</div>
					</div>
					<div class="ssjc_right_bottom">
						<div class="nei">
							<p>查询结果</p>
							<div class="ssjc_rub_table">
								<table class="tj_table" style="border: 0">
									<thead>
										<tr>
											<td>编号</td>
											<td>养老机构名称</td>
											<td>地址</td>
											<td>联系人</td>
											<td>联系电话</td>
											<td>报送时间</td>
											<td>报送状态</td>
											<td>操作</td>
										</tr>
									</thead>
									<tbody id="content"></tbody>
								</table>
								<div class="t_fanye">
									<span class="upten"></span> <span class="up"></span> <span
										class="split"></span> <span class="page_info_one">第 1 /
										1 页</span> <span class="split"></span> <span class="dowm"></span> <span
										class="downten"></span> <span class="page_info_two">页记录数
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
	<script type="text/javascript">
	var pageIndex=1;
	var pageSize=10;
	var pageTotal;

	$(function(){
		queryPage();
		$(".t_fanye > span").click(otherOperate);
		$("#query").click(query);
		$("#reset").click(reset);
	});

	function query(){
		queryPage();
	}
	function reset(){
		var startDate=$("input[name=startDate]").val("");
		var endDate=$("input[name=endDate]").val("");
		var bszt=$("select[name=bszt]").val("");
		var mc=$("input[name=mc]").val("");
		queryPage();
	}

	function otherOperate(){
		var operate=$(this).attr("class");
		if(operate == "upten"){
			pageIndex=1;
			queryPage();
		}else if(operate == "up"){
			if(pageIndex ==1){
				alert("已经是第一页");
			}else{
				pageIndex--;
				queryPage();
			}
			
		}else if(operate == "down"){
			if(pageIndex ==pageTotal){
				alert("已经是最后一页");
			}else{
				pageIndex++;
				queryPage();
			}
		}
		else if(operate == "downten"){
			pageIndex=pageTotal;
			queryPage();
		}
	}


	function queryPage(){
		var startDate=$("input[name=startDate]").val();
		var endDate=$("input[name=endDate]").val();
		var bszt=$("select[name=bszt]").val();
		var mc=$("input[name=mc]").val();
		$.post("user/xxbsCxYljgQx",
				{"pageIndex":pageIndex,"pageSize":pageSize,
			"bszt":bszt,
			"mc":mc,
			"startDate":startDate,"endDate":endDate},
				function(data,status){
					//字符串转成json对象
					var list=data.list;
					if(status){
						$("#content").empty();
						for(var i=0;i<list.length;i++){
							var content="<tr><td>"+(i+1)
							+"</td><td>"+list[i].mc
							+"</td><td>"+list[i].szxm
							+"</td><td>"+list[i].szsfzhm
							+"</td><td>" +list[i].zhxgsj
							+"</td><td>" +list[i].zdjzdx
							+"</td><td>" +list[i].szhjd
							+"</td><td class='text-center'><a href='view/sys/roomEdit?id="+list[i].id+"'>查看</a> "
							+"</td></tr>";
							$("#content").append(content);
						}
					}
					if(data.list.length == 0){
						$("#pageControl").css('display','none');
					}
			pageTotal=data.pageTotal;
			count=data.count;
			var nowPage=(pageIndex-1)*pageSize+1;
			$('.page_info_one').text("第"+pageIndex+"/"+pageTotal+"页");
			$('.page_info_two').text("页记录数"+pageTotal);
			$('.page_info_three').text("共"+count+"条记录");
		});
	} </script>
</body>
