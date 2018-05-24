var pageIndex=1;
var pageSize=5;
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
	var xm=$("input[name=xm]").val("");
	var sbsfzhm=$("input[name=sbsfzhm]").val("");
	$("#xxmc option:first").prop("selected", 'selected'); 
	$("#sbdw option:first").prop("selected", 'selected'); 
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
	var startDate=$("input[name=startDate]").val();
	var endDate=$("input[name=endDate]").val();
	var xm=$("input[name=xm]").val();
	var sbsfzhm=$("input[name=sbsfzhm]").val();
	var xxmc=$("#xxmc").val();
	var sbdw=$("#sbdw").val();
	$.post("user/xxbsCxBdxxAz",
			{"pageIndex":pageIndex,"pageSize":pageSize,
		"xm":xm,"sbsfzhm":sbsfzhm,"xxmc":xxmc,"sbdw":sbdw,
		"startDate":startDate,"endDate":endDate},
			function(data,status){
				//字符串转成json对象
				var list=data.list;
				if(status){
					$("#content").empty();
					for(var i=0;i<list.length;i++){
						var content="<tr><td>"+(i+1)+"</td><td>"+list[i].sbdw
						+"</td><td>"+list[i].xm
						+"</td><td>"+list[i].tyzjbh
						+"</td><td>"+list[i].bdsj
						+"</td><td>"+list[i].xxmc
						+"</td><td>"+list[i].xxmc
						+"</td><td class='text-center'><a href='user/xxbsXqBdxxAz?id="+list[i].id+"'>查看</a>/<a href='user/xxbsXqBdxxAzDel?id="+list[i].id+"'>删除</a>"
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