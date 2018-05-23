$(document).ready(function(){ 
	$("#submit").click(submit);
	$("#reset").click(reset);
	$("#save").click(save);
});



function save(){
	
	var tzggbt =$("input[name=tzggbt]").val();
	var tzggzw =$("textarea[name=tzggzw]").val();
	var id=$("input[name=id]").val();
	var tzggzt = "未发布";
	
	$.post("user/tzggGX",{"tzggbt":tzggbt,"tzggzw":tzggzw,"tzggzt":tzggzt,"id":id},
	function(status){
		
	});
	
}



function reset(){
	location.href="user/tzggCx";
}

function submit(){
	var id =$("#id").val();
	var tzggzt = "已发布";
	
	$.post("user/tzggFaBu",{"id":id,"tzggzt":tzggzt},
	function(status){
		
	});
	location.href="user/tzggCx";
}


