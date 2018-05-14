var pageIndex=1;
var pageSize=6;
var pageTotal;

$(document).ready(function(){ 
	queryPage();
	$(".page").click(otherOperate);
	$("#query").click(query);
	$("#reset").click(reset);
}); 


function query(){
	queryPage();
}

function reset(){
	$("input[name=equipName]").val("");
	$("#title option:first").prop("selected", 'selected');  
	$("#equipId option:first").prop("selected", 'selected');
	queryPage();
}

function otherOperate(){
	var operate=$(this).attr("id");
	if(operate == "first"){
		pageIndex=1;
		queryPage();
	}else if(operate == "previou"){
		if(pageIndex ==1){
			alert("已经是第一页");
		}else{
			pageIndex--;
			queryPage();
		}
		
	}else if(operate == "next"){
		if(pageIndex ==pageTotal){
			alert("已经是最后一页");
		}else{
			pageIndex++;
			queryPage();
		}
	}
	else if(operate == "last"){
		pageIndex=pageTotal;
		queryPage();
	}
}


function queryPage(){
	var equipName=$("input[name=equipName]").val();
	var title=$("#title").val();
	var equipId=$("#equipId").val();
	$.post("user/maintenance",
			{"pageIndex":pageIndex,"pageSize":pageSize,"equipName":equipName,"title":title,"equipId":equipId},
			function(data,status){
				data=eval("("+data+")");
				if(status){
					$("#userTable").empty();
					$("#userList").tmpl(data).appendTo("#userTable");
				}
				
				if(data.list.length == 0){
					$("#myPage").css("display","none");
				}
		$("#myPage").css("display","block");
		pageTotal=data.pageTotal;
		$("#myspan").text("第"+pageIndex+"页"+"/"+"共"+pageTotal+"页").css("display","block");
	});
}

