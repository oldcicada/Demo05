$(function(){
	//渲染下拉列表，是否选择江葬，重点救助对象，死亡原因
	init();
});
function init(){
	var sfxzjzValue=$("#sfxzjzValue").val();
	var zdjzdxValue=$("#zdjzdxValue").val();
	var szswyyValue=$("#szswyyValue").val();
	$.post("dictList",
			{"dm":"choose"},
			function(data,status){
				if(status){
					$("#sfxzjz").empty();
					var content="";
					for(var i=0;i<data.length;i++){
						content+="<option value='"+data[i].lxjp+"'" ;
						if(sfxzjzValue==data[i].lxjp){
							content+=" selected='selected'";
						}
						content+=" >"+data[i].mc+"</option>";
					}
					$("#sfxzjz").append(content);
				}
			});
	$.post("dictList",
			{"dm":"succour"},
			function(data,status){
				if(status){
					$("#zdjzdx").empty();
					var content="";
					for(var i=0;i<data.length;i++){
						content+="<option value='"+data[i].lxjp+"'" ;
						if(zdjzdxValue==data[i].lxjp){
							content+=" checked='checked'";
						}
						content+=" >"+data[i].mc+"</option>";
					}
					$("#zdjzdx").append(content);
				}
			});	
	$.post("dictList",
					{"dm":"cause"},
					function(data,status){
						if(status){
							$("#szswyy").empty();
							var content="";
							for(var i=0;i<data.length;i++){
								content+="<option value='"+data[i].lxjp+"'" ;
								if(szswyyValue==data[i].lxjp){
									content+=" selected='selected'";
								}
								content+=" >"+data[i].mc+"</option>";
							}
							$("#szswyy").append(content);
						}
					});
}