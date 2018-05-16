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
<script type="text/javascript">
var pageIndex=1;
var pageSize=8;
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
	var bsdw=$("select[name=bsdw]").val("");
	var startDate=$("input[name=startDate]").val("");
	var endDate=$("input[name=endDate]").val("");
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
	var bsdw=$("select[name=bsdw]").val();
	var startDate=$("input[name=startDate]").val();
	var endDate=$("input[name=endDate]").val();
	
	$.post("user/xxbsCxPxbzDc",
			{"pageIndex":pageIndex,"pageSize":pageSize,
		"bsdw":bsdw,
		"startDate":startDate,
		"endDate":endDate},
			function(data,status){
				//字符串转成json对象
				var list=data.list;
				if(status){
					$("#content").empty();
					for(var i=0;i<list.length;i++){
						var content="<tr><td><input type='checkbox' class='table_check'></td><td>"+(i+1)
						+"</td><td>"+list[i].bsdw
						+"</td><td>"+list[i].hjmc
						+"</td><td>"+list[i].bzsj
						+"</td><td>" +list[i].bjdwmc
						+"</td><td>" +list[i].zpjf
						+"</td><td>" +list[i].bssj
						+"</td><td class='text-center'><a href='user/xxbsXqPxbzDc?id="+list[i].id+"'>查看</a> "
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
}


</script>
<body class="skin-blue">
	<div class="wrapper">
		<div class="content">
			<div class="yjgl">
				<div class="ssjc_right_up">
					<div class="nei">
					<div class="ssjc_ru_title">
						<span class="left_ten">查询条件</span>
						<a href="javascript:(void);" target="frame"><input type="submit" value="信息查询" ></a>
						<a href="user/xxbsBsPxbzJg" target="frame"><input type="submit" value="信息报送"></a>
						<div class="clear"></div>
						</div>
						<div class="sbaz_table">
							<p>
								 <span> 报送单位 <select
									class="biaoti_select" id="bsdw" name="bsdw" style="width: 150px; height: 30px">
          <option value="社会救助处">社会救助处</option>
          <option value="政权处于民管处">政权处于民管处</option>
          <option value="法宣办">法宣办</option>
          <option value="区划地名处">区划地名处</option>
          <option value="办公室">办公室</option>
          <option value="安置处">安置处</option>
          <option value="双拥办（优抚处）">双拥办（优抚处）</option>
          <option value="救灾救济处">救灾救济处</option>
          <option value="社会事务处">社会事务处</option>
          <option value="计财与核算中心">计财与核算中心</option>
          <option value="民生办">民生办</option>
          <option value="福慈处">福慈处</option>
          <option value="项目办">项目办</option>
          <option value="老龄办">老龄办</option>
          <option value="市军休一所">市军休一所</option>
          <option value="市军休二所">市军休二所</option>
          <option value="市军休三所">市军休三所</option>
          <option value="市军休四所">市军休四所</option>
          <option value="市军休五所">市军休五所</option>
          <option value="市军休六所">市军休六所</option>
          <option value="市军休干部保健办">市军休干部保健办</option>
          <option value="市巢湖军供与军休">市巢湖军供与军休</option>
          <option value="市军供站">市军供站</option>
          <option value="市救助管理站">市救助管理站</option>
          <option value="市福彩中心">市福彩中心</option>
          <option value="市巢湖福彩中心">市巢湖福彩中心</option>
          <option value="市小蜀山陵园">市小蜀山陵园</option>
          <option value="市殡葬管理处">市殡葬管理处</option>
          <option value="市福利中心">市福利中心</option>
          <option value="合肥市蜀山烈士陵园">合肥市蜀山烈士陵园</option>
        </select>
								<span> 报送时间： <input type="date" name="startDate" id="startDate">
								</span> <span> 至： <input type="date" name="endDate" id="endDate">
								</span>
								<input type="submit" value="  查询  " id="query" class="in_sub"> <input
									type="reset" value="  重置  " id="reset" class="in_sub">
							</p>
						</div>
					</div>
					<div class="ssjc_right_bottom" id="table">
						<div class="nei">
							<p>查询结果</p>
							<div class="ssjc_rub_table">
								<table id="content" class="tj_table sbaz_table" style="border: 0">
									<thead>
										<tr>
											<td>编号</td>
											<td>报送单位</td>
											<td>获奖名称</td>
											<td>表彰时间时间</td>
											<td>颁奖单位名称</td>
											<td>自评加分</td>
											<td>报送时间</td>
											<td>操作</td>
										</tr>
									</thead>

								</table>
								<div class="t_fanye">
									<span class="upten"></span> <span class="up"></span>
									 <span class="split"></span> <span class="page_info_one">第 1 / 1 页</span>
									  <span class="split"></span> <span class="dowm"></span> 
									  <span class="downten"></span> <span class="page_info_two">页记录数15</span> 
									  <span class="page_info_three">当前1-1条记录，共1条记录</span>
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