var pageIndex=1;
var pageSize=5;
var pageTotal;

$(function(){
	queryPage();
	$(".t_fanye > span").click(otherOperate);
	$("#query").click(query);
	$("#reset").click(reset);
	$("#add").click(add);
	$("#flush").click(query);
});

function query(){
	queryPage();
}
function reset(){
	var pzmc=$("input[name=pzmc]").val("");
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

function add(){
	
	location.href="user/xz";
}

function queryPage(){
	var pzmc=$("#pzmc").val();
	$.post("user/xxxx",
			{"pageIndex":pageIndex,"pageSize":pageSize,
		"pzmc":pzmc,},
			function(data,status){
				//字符串转成json对象
				var list=data.list;
				if(status){
					$("#content").empty();
					for(var i=0;i<list.length;i++){
						var content="<tr><td>"+(i+1)
						+"</td><td>"+list[i].pzmc
						+"</td><td>"+list[i].status
						+"</td>";
						if(list[i].status == "已下发"){
							content += "<td class='text-center'><a href='user/xq?id="+list[i].id+"'>查看</a>/<a href='user/xxxx' >取消</a>"
							+"</td></tr>";
						}else{
							content += "<td class='text-center'><a href='user/xq?id="+list[i].id+"'>查看</a> "
							+"/<a href='user/wh?id="+list[i].id+"'>维护</a>/<a href='user/xf?id="+list[i].id+"'>下发</a>"
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
		$('.page_info_two').text("页记录数"+pageTotal);
		$('.page_info_three').text("共"+count+"条记录");
	});
}
