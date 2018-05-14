/**
 *学校信息下发列表
 */
var pageIndex=1;
var pageSize=8;
var pageTotal;
var count;

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
	$("input[name=startDate]").val("");
	$("input[name=endDate]").val("");
	$("input[name=szmc]").val("");
	$("select[name=bygmc]").val("");
	$("input[name=sfzhm]").val("");
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
		
	}else if(operate == "dowm"){
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
	var schoolName=$("input[name=schoolName]").val();
	$.post("user/xxbsCxSzxxSh",
			{"pageIndex":pageIndex,
			"pageSize":pageSize,
			"startDate":startDate
			"endDate":endDate,
			"szmc":szmc,
			"bygmc":bygmc,
			"sfzhm":sfzhm},
			function(data,status){
				var list=data.list;
				if(status){
					$("#content").empty();
					for(var i=0;i<list.length;i++){
						var content="<tr><td><input type='checkbox' class='table_check'></td><td>"+(i+1)
						+"</td><td>"+list[i].bygmc
						+"</td><td>"+list[i].szmc
						+"</td><td>"+list[i].sfzhm
						+"</td><td>" +list[i].zhxgsj
						+"</td><td>" +list[i].jzdx
						+"</td><td>" +list[i].hjd
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
		$("#pageMessage").text("显示第"+nowPage+"到"+(list.length+nowPage-1)+"条数据，当前"+pageIndex+"/"+pageTotal+"页,共"+count+"条记录");
	});
}

