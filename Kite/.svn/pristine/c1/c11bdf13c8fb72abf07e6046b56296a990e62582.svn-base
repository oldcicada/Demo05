$(function(){
    xq();
   
});


function xq(){
	
	var id= $("#id").val();
	$.post("user/xq",{"id":id},
	function(data,status){
		if(status){
			$("#content").empty();
			var list = eval("("+data+")");
			for(var i=0;i<list.length;i++){
				var content="<tr><td>专业名称</td><td class='a'>"+list[i].zy+
				"</td><td >学制</td><td class='a'>"+list[i].xz
				+"</td></tr>";
				$("#content").append(content);
			}
		}
	});
}