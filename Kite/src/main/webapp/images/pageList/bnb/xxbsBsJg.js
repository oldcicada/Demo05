$(document).ready(function(){ 
	$("#save").click(save);
});

function save(){
	var zhxgsj =$("input[name=zhxgsj]").val();
	var bnbjbqk =$("input[name=bnbjbqk]").val();
	var bnbyy =$("input[name=bnbyy]").val();
	var kcsyj =$("input[name=kcsyj]").val();
	var ldyj =$("input[name=ldyj]").val();
	var bjsj =$("input[name=bjsj]").val();
	var bjqk =$("input[name=bjqk]").val();
	var bz =$("input[name=bz]").val();
	var zcbs =$("input[name=zcbs]").val();
	
	$.post("user/xxbsBsJg",{"zhxgsj":zhxgsj,"bnbjbqk":bnbjbqk,"bnbyy":bnbyy,
		"kcsyj":kcsyj,"ldyj":ldyj,"bjsj":bjsj,"bjqk":bjqk,"bz":bz,"zcbs":zcbs},
	function(status){
		
	});
	location.href="user/bnbXxCxJg";
}