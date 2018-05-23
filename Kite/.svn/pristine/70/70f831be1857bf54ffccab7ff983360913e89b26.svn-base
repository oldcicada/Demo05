var pageIndex=1;
var pageSize=2;
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

function reset(){
	var bmmc=$("select[name=bmmc]").val("");
	queryPage();
}




function queryPage(){
	var bmmc=$("select[name=bmmc]").val();
	$.post("user/jssz",
	   {"pageIndex":pageIndex,
		"pageSize":pageSize,
		"bmmc":bmmc},
			function(data,status){
				//字符串转成json对象
				var list=data.list;
				if(status){
					$("#content").empty();
					for(var i=0;i<list.length;i++){
						var content = "<tr><td><input type='checkbox' class='table_check'></td><td>"+(i+1)
						+"</td><td>"+list[i].bmmc
						+"</td><td>"+list[i].js
						+"</td><td>"+list[i].zhxgsj
						+"</td><td class='text-center'><a href='user/jswh?id="+list[i].id+"'>维护</a>"
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

