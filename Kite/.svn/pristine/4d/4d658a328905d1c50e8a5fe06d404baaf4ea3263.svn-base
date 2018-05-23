$(document).ready(function(){ 
	$("#save").click(save);
});



function save(){
	
	var js =$("input[name=js]").val();
	var bmmc =$("input[name=bmmc]").val();
	var id=$("input[name=id]").val();
	
	$.post("user/jswh",{"js":js,"bmmc":bmmc,"id":id},
	function(status){
		window.location.href="user/jssz";
	});
	
}





