var pageIndex=1;
var pageSize=10;
var pageTotal;

$(function(){
	select();
	queryPage();
	$(".t_fanye > span").click(otherOperate);
	$("#query").click(query);
	$("#reset").click(reset);
});

function select(){
	$.post("dictList",
			{"dm":"submit"},
			function(data,status){
				if(status){
					$("#bszt").empty();
					var content="<option value=''>请选择</option>";
					for(var i=0;i<data.length;i++){
						content+="<option value='"+data[i].lxjp+"'>"+data[i].mc+"</option>";
					}
					$("#bszt").append(content);
				}
			});
}
function query(){
	queryPage();
}
function reset(){
	var startDate=$("input[name=startDate]").val("");
	var endDate=$("input[name=endDate]").val("");
	var mc=$("input[name=mc]").val("");
	select();
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
	$.post("user/xxbsCxSqylQx",
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
						+"</td><td>"+list[i].dz
						+"</td><td>"+list[i].lxr
						+"</td><td>" +list[i].lxdh
						+"</td><td>" +list[i].cjsj
						+"</td><td>" +list[i].bszt
						+"</td><td>"
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