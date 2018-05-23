
$(function(){
	$("#query").click(query);
	$("#daochu").click(daochu);
});

function daochu(){
	alert("导出成功");
	var date=$("input[name=date]").val();
	$.post("user/jgcs",
			{
			"date":endDate},
			function(data,status){
		if(status){
			alert("导出成功");
		}
		
	});
}


function query(){
	queryPage();
}



function queryPage(){
	var date=$("input[name=date]").val();
	$.post("user/jgcs",
	   {
		"date":date},
			function(data,status){
				//字符串转成json对象
				var list=data.list;
				if(status){
					$("#content").empty();
					for(var i=0;i<list.length;i++){
						var content = "<tr><td><input type='checkbox' class='table_check'></td><td>"+(i+1)
						+"</td><td>"+list[i].bmmc
						+"</td><td>"+list[i].qs
						+"</td><td>"+list[i].xxbt
						+"</td><td>" +list[i].id
						+"</td><td>" +list[i].id
						+"</td><td>" 
						+"</td></tr>";
						$("#content").append(content);}
						
				}
				if(data.list.length == 0){
					$("#pageControl").css('display','none');
				}
		
	});
}

