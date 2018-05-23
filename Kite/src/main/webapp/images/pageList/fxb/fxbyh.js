var pageIndex=1;
var pageSize=2;
var pageTotal;

$(function(){
	select1();
	select2();
	select3();
	select4();
	queryPage();
	$(".t_fanye > span").click(otherOperate);
	$("#query").click(query);
	$("#reset").click(reset);
});

function select1(){
	$.post("dictList",
			{"dm":"shenhe"},
			function(data,status){
				if(status){
					$("#shjg").empty();
					var content="<option value=''>请选择</option>";
					for(var i=0;i<data.length;i++){
						content+="<option value='"+data[i].lxjp+"'>"+data[i].mc+"</option>";
					}
					$("#shjg").append(content);
				}
			});
}


function select2(){
	$.post("dictList",
			{"dm":"tijiaozt"},
			function(data,status){
				if(status){
					$("#tjzt").empty();
					var content="<option value=''>请选择</option>";
					for(var i=0;i<data.length;i++){
						content+="<option value='"+data[i].lxjp+"'>"+data[i].mc+"</option>";
					}
					$("#tjzt").append(content);
				}
			});
}


function select3(){
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

function select4(){
	$.post("dictList",
			{"dm":"sbdw"},
			function(data,status){
				if(status){
					$("#sbdw").empty();
					var content="<option value=''>请选择</option>";
					for(var i=0;i<data.length;i++){
						content+="<option value='"+data[i].lxjp+"'>"+data[i].mc+"</option>";
					}
					$("#sbdw").append(content);
				}
			});
}


function query(){
	queryPage();
}
function reset(){
	var startDate=$("input[name=startDate]").val("");
	var endDate=$("input[name=endDate]").val("");
	var xxbt=$("input[name=xxbt]").val("");
	var shenhe=$("select[name=shenhe]").val("");
	var tjzt=$("select[name=tjzt]").val("");
	var lmmc=$("select[name=lmmc]").val("");
	var sbdw=$("select[name=sbdw]").val("");
	select1();
	select2();
	select3();
	select4();
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
	var xxbt=$("input[name=xxbt]").val();
	var shjg=$("select[name=shjg]").val();
	var tjzt=$("select[name=tjzt]").val();
	var lmmc=$("#lmmc").val();
	var sbdw=$("select[name=sbdw]").val();
	$.post("user/xxbsCxFxby",
	   {"pageIndex":pageIndex,
		"pageSize":pageSize,
		"xxbt":xxbt,
		"shjg":shjg,
		"tjzt":tjzt,
		"lmmc":lmmc,
		"sbdw":sbdw,
		"startDate":startDate,
		"endDate":endDate},
			function(data,status){
				//字符串转成json对象
				var list=data.list;
				if(status){
					$("#content").empty();
					for(var i=0;i<list.length;i++){
						var content="<tr><td><input type='checkbox' class='table_check'></td><td>"+(i+1)
						+"</td><td>"+list[i].sbdw
						+"</td><td>"+list[i].xxbt
						+"</td><td>"+list[i].zhxgsj
						+"</td><td>"+list[i].tjzt
						+"</td><td>"+list[i].shjg
						+"</td><td>" +list[i].lmmc
						+"</td><td>"+list[i].gc
						+"</td>";
						if(list[i].tjzt == "已提交已审核"){
						content += "<td class='text-center'><a href='user/xxbsShFxby?id="+list[i].id+"'>查看</a> "
						+"</td></tr>";
					    }else{
						content += "<td class='text-center'><a href='user/xxbsXqQxjj?id="+list[i].id+"'>审核</a>"
						+"</td></tr>";
						}
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
		$('.page_info_two').text("总页数:"+pageTotal);
		$('.page_info_three').text("共"+count+"条记录");
	});
}

