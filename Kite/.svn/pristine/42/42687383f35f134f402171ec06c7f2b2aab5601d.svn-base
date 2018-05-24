$(function(){
    wh();
   
});


function wh(){
	
	var id= $("#id").val();
	$.post("user/whById",{"id":id},
	function(data,status){
		if(status){
			$("#content").empty();
			var list = eval("("+data+")");
			for(var i=0;i<list.length;i++){
				var content="<tr><td>专业</td><td><p><input class='zy' value='"+list[i].zy+"' type='text' style=' width: 100%;' /></p></td>"+
				  "<td>学制</td><td><p><input class='xz' type='text' value='"+list[i].xz+"' style='width: 100%;' /></p></td>"+
				  "<td><a onclick='add()' >添加</a>/<a  onclick='del(this)'>删除</a></td></tr>";
				$("#content").append(content);
			}
		}
	});
}