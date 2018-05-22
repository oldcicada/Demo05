$(function(){
	//渲染下拉列表，是否选择江葬，重点救助对象，死亡原因
	init();
});
function init(){
	var gxValue=$("#gxValue").val();
	var szswyyValue=$("#szswyyValue").val();
	$.post("dictList",
			{"dm":"relation"},
			function(data,status){
				if(status){
					$("#gx").empty();
					var content="";
					for(var i=0;i<data.length;i++){
						content+="<option value='"+data[i].lxjp+"'" ;
						if(gxValue==data[i].lxjp){
							content+=" selected='selected'";
						}
						content+=" >"+data[i].mc+"</option>";
					}
					$("#gx").append(content);
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