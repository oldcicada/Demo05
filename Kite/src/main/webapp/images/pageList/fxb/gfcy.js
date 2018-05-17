var pageIndex=1;
var pageSize=2;
var pageTotal;

$(function(){
	select();
	queryPage();
	$(".t_fanye > span").click(otherOperate);
	$("#query").click(query);
	$("#daochu").click(daochu);
});


function select(){
	$.post("dictList",
			{"dm":"lmmc"},
			function(data,status){
				if(status){
					$("#lmmc").empty();
					var content="<option value=''>请选择</option>";
					for(var i=0;i<data.length;i++){
						content+="<option value='"+data[i].lxjp+"'>"+data[i].mc+"</option>";
					}
					$("#lmmc").append(content);
				}
			});
}


function daochu(){
	alert("导出成功");
	var lmmc=$("select[name=lmmc]").val();
	var startDate=$("input[name=startDate]").val();
	var endDate=$("input[name=endDate]").val();
	$.post("user/gfcyExcel",
			{"pageIndex":pageIndex,
		    "pageSize":pageSize,
		    "startDate":startDate,
			"endDate":endDate,
			"lmmc":lmmc},
			function(data,status){
		if(status){
			alert("导出成功");
		}
		
	});
}


function query(){
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
	var lmmc=$("select[name=lmmc]").val();
	$.post("user/gfcy",
	   {"pageIndex":pageIndex,
		"pageSize":pageSize,
		"startDate":startDate,
		"endDate":endDate,
		"lmmc":lmmc},
			function(data,status){
				//字符串转成json对象
				var list=data.list;
				if(status){
					$("#content").empty();
					for(var i=0;i<list.length;i++){
						var content = "<tr><td><input type='checkbox' class='table_check'></td><td>"+(i+1)
						+"</td><td>"+list[i].jbrq
						+"</td><td>"+list[i].qs
						+"</td><td>"+list[i].xxbt
						+"</td><td>" +list[i].zz
						+"</td><td>" +list[i].gc
						+"</td><td>" 
						+"</td></tr>";
						$("#content").append(content);}
						
				}
				if(data.list.length == 0){
					$("#pageControl").css('display','none');
				}
		pageTotal=data.pageTotal;
		count=data.count;
		var nowPage=(pageIndex-1)*pageSize+1;
		$('.page_info_one').text("第"+pageIndex+"/"+pageTotal+"页");
		$('.page_info_two').text("总页数:"+pageTotal);
		$('.page_info_three').text("共"+count+"条记录");
	});
}

