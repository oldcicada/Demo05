$(function(){
	init();
});
function init(){
	var zsxz=$('#zsxz').val();
	if(zsxz=="0"){
		$('#first').attr("checked",true);
		$('#second').attr("disabled",true); 
		$('#third').attr("disabled",true); 
	}else if(zsxz=="1"){
		$('#second').attr("checked",true); 
		$('#first').attr("disabled",true); 
		$('#third').attr("disabled",true); 
	}else if(zsxz=="2"){
		$('#third').attr("checked",true);
		$('#first').attr("disabled",true); 
		$('#second').attr("disabled",true); 
	}
}
