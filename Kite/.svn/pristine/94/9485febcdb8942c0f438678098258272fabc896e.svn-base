$(function(){
	mxqymc();
	init();
});
function mxqymc(){
	var mxqymcValue=$("#mxqymcValue").val();
	$.post("dictList",
			{"dm":"cemetery"},
			function(data,status){
				if(status){
					$("#mxqymc").empty();
					var content="";
					for(var i=0;i<data.length;i++){
						content+="<option value='"+data[i].lxjp+"'" ;
						if(mxqymcValue==data[i].lxjp){
							content+=" selected='selected'";
						}
						content+=" >"+data[i].mc+"</option>";
					}
					$("#mxqymc").append(content);
				}
			});
}
function init(){
	var zsxz=$('#zsxz').val();
	if(zsxz=="0"){
		$('#first').attr("checked",true);
	}else if(zsxz=="1"){
		$('#second').attr("checked",true); 
	}else if(zsxz=="2"){
		$('#third').attr("checked",true);
	}
}
