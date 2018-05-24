$(function(){
	var id=$('#id').val();
	var input=$('#fjxx > input');
	$.post("shswc/fjxxShow",{"id":id},function(data,status){
		if(status){
			var inputValue="";
			for(var i=0;i<input.length;i++){
				inputValue=input[i].defaultValue;
				if(data.fjmc.indexOf(inputValue) >= 0 ) { 
					input[i].defaultChecked=true;
				} 
			}
		}
	});
});