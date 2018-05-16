$(document).ready(function(){ 
	$("#update").click(update);
	$("#submit").click(submit);
	$("#reset").click(reset);
	$("#save").click(save);
});

function update(){
	var zhxgsj =$("input[name=zhxgsj]").val();
	var bnbjbqk =$("input[name=bnbjbqk]").val();
	var bnbyy =$("input[name=bnbyy]").val();
	var kcsyj =$("input[name=kcsyj]").val();
	var ldyj =$("input[name=ldyj]").val();
	var bjsj =$("input[name=bjsj]").val();
	var bjqk =$("input[name=bjqk]").val();
	var bz =$("input[name=bz]").val();
	var id =$("input[name=id]").val();
	var cjsj =$("input[name=cjsj]").val();
	var zcbs = "未报送";
	
	$.post("user/xxbsBsJgUpdate",{"zhxgsj":zhxgsj,"bnbjbqk":bnbjbqk,"bnbyy":bnbyy,
		"kcsyj":kcsyj,"ldyj":ldyj,"bjsj":bjsj,"bjqk":bjqk,"bz":bz,"zcbs":zcbs,"cjsj":cjsj,"id":id},
	function(status){
		
	});
	location.href="user/bnbXxCxJg";
}


function save(){
	var myDate = new Date();
	var y=myDate.getFullYear();    //获取完整的年份(4位,1970-????)
	var m=myDate.getMonth()+1;       //获取当前月份(0-11,0代表1月)
	var d=myDate.getDate();
	
	var zhxgsj =$("input[name=zhxgsj]").val();
	var bnbjbqk =$("input[name=bnbjbqk]").val();
	var bnbyy =$("input[name=bnbyy]").val();
	var kcsyj =$("input[name=kcsyj]").val();
	var ldyj =$("input[name=ldyj]").val();
	var bjsj =$("input[name=bjsj]").val();
	var bjqk =$("input[name=bjqk]").val();
	var bz =$("input[name=bz]").val();
	var cjsj =y+"-"+m+"-"+d;
	var zcbs = "未报送";
	
	$.post("user/bnbXxFbJg",{"zhxgsj":zhxgsj,"bnbjbqk":bnbjbqk,"bnbyy":bnbyy,
		"kcsyj":kcsyj,"ldyj":ldyj,"bjsj":bjsj,"bjqk":bjqk,"bz":bz,"zcbs":zcbs,"cjsj":cjsj},
	function(status){
		
	});
	location.href="user/bnbXxCxJg";
}

function reset(){
	var zhxgsj =$("input[name=zhxgsj]").val("");
	var bnbjbqk =$("input[name=bnbjbqk]").val("");
	var bnbyy =$("input[name=bnbyy]").val("");
	var kcsyj =$("input[name=kcsyj]").val("");
	var ldyj =$("input[name=ldyj]").val("");
	var bjsj =$("input[name=bjsj]").val("");
	var bjqk =$("input[name=bjqk]").val("");
	var bz =$("input[name=bz]").val("");
}

function submit(){
	var id =$("#id").val();
	var zcbs = "已报送";
	
	$.post("user/xxbsBsJgBao",{"id":id,"zcbs":zcbs},
	function(status){
		
	});
	location.href="user/bnbXxCxJg";
}