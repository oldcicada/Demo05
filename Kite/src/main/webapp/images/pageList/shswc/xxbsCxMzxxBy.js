var pageIndex=1;
var pageTotal;

$(function(){
	select();
	queryPage();
	$(".t_fanye > span").click(otherOperate);
	$("#query").click(query);
	$("#reset").click(reset);
	$('#pageSize').change(queryPage);
	$("#pageTo").blur(function(){
		var pageTo=parseInt($('#pageTo').val());
		if(isNaN(pageTo)){
			pageTo=1;
		}
		if(pageTo<=pageTotal){
			pageIndex=pageTo;
			queryPage();
		}else{
			alert("当前最多为"+pageTotal+"页");
			$("#pageTo").val('');
		}
	});
});

function select(){
	$.post("dictList",
			{"dm":"tibetan"},
			function(data,status){
				if(status){
					$("#zsxz").empty();
					var content="<option value=''>请选择</option>";
					for(var i=0;i<data.length;i++){
						content+="<option value='"+data[i].lxjp+"'>"+data[i].mc+"</option>";
					}
					$("#zsxz").append(content);
				}
			});
	$.post("dictList",
			{"dm":"cemetery"},
			function(data,status){
				if(status){
					$("#mxqymc").empty();
					var content="<option value=''>请选择</option>";
					for(var i=0;i<data.length;i++){
						content+="<option value='"+data[i].lxjp+"'>"+data[i].mc+"</option>";
					}
					$("#mxqymc").append(content);
				}
			});
}
function query(){
	queryPage();
}
function reset(){
	var startDate=$("input[name=startDate]").val("");
	var endDate=$("input[name=endDate]").val("");
	var szxm=$("input[name=szxm]").val("");
	var szsfzhm=$("input[name=szsfzhm]").val("");
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
	var pageSize=$('#pageSize').val();
	var startDate=$("input[name=startDate]").val();
	var endDate=$("input[name=endDate]").val();
	var szxm=$("input[name=szxm]").val();
	var zsxz=$("select[name=zsxz]").val();
	var mxqymc=$("select[name=mxqymc]").val();
	$.post("user/xxbsCxMzxxBy",
			{"pageIndex":pageIndex,"pageSize":pageSize,
		"szxm":szxm,
		"zsxz":zsxz,
		"mxqymc":mxqymc,
		"startDate":startDate,"endDate":endDate},
			function(data,status){
				//字符串转成json对象
				var list=data.list;
				if(status){
					$("#content").empty();
					for(var i=0;i<list.length;i++){
						var content="<tr><td><input type='checkbox' class='table_check'></td><td>"+(i+1)
						+"</td><td>"+list[i].mxqymc
						+"</td><td>"+list[i].szsfzhm
						+"</td><td>"+list[i].zcbs
						+"</td><td>" +list[i].zhxgsj
						+"</td><td>" +list[i].zsxz
						+"</td><td>" +list[i].szhjd+"</td>";
						if(list[i].zcbs=="已报送"){
							content+="<td class='text-center'><a href='user/xxbsXqSzxxBy?id="+list[i].id+"'> 查看 </a></td></tr>";
						}else{
							content+="<td class='text-center'><a href='user/xxbsBsSzxxBy?id="+list[i].id+"'>报送  </a>"
							+"<a href='user/xxbsScSzxxBy?id="+list[i].id+"'> 删除</a></td></tr>";
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

