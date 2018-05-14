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
	$("input[name=address]").val("");
	$("input[name=number]").val("");
	$("select[name=type]").val("");
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
	var szxm=$("select[name=szxm]").val();
	var bygmc=$("input[name=bygmc]").val();
	var szsfzhm=$("input[name=szsfzhm]").val();
	$.post("user/xxbsCxSzxxSh",
			{"pageIndex":pageIndex,"pageSize":pageSize,
		"szxm":szxm,
		"bygmc":bygmc,
		"szsfzhm":szsfzhm,
		"startDate":startDate,"endDate":endDate},
			function(data,status){
				//字符串转成json对象
				var list=data.list;
				if(status){
					$("#content").empty();
					for(var i=0;i<list.length;i++){
						var content="<tr><td>"+(i+1)
						+"</td><td>"+list[i].bygmc
						+"</td><td>"+list[i].szxm
						+"</td><td>"+list[i].szsfzhm
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

