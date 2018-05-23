$(document).ready(function(){ 
	$("#submit").click(submit);
	$("#reset").click(reset);
	$("#save").click(save);
});



function save(){
	var xxbt =$("input[name=xxbt]").val();
	var sbdw =$("input[name=sbdw]").val();
	var xxzw =$("textarea[name=xxzw]").val();
	var zz =$("input[name=zz]").val();
	var fgld =$("input[name=fgld]").val();
	var sbry =$("input[name=sbry]").val();
	var id=$("input[name=id]").val();
	var zcbs = "未报送";
	
	$.post("user/fxbGX",{"xxbt":xxbt,"sbdw":sbdw,"xxzw":xxzw,"zz":zz,"fgld":fgld,"sbry":sbry,"id":id},
	function(status){
		
	});
	location.href="user/fxbXxCxQx";
}

function reset(){
	location.href="user/fxbXxCxQx";
}

function submit(){
	var id =$("#id").val();
	var zcbs = "已报送";
	
	$.post("user/fxbBS",{"id":id,"zcbs":zcbs},
	function(status){
		
	});
	location.href="user/fxbXxCxQx";
}