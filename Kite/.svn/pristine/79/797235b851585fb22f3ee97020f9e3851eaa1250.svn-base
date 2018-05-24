$(function(){
	select();
	$("#zc").click(zc);
	$("#bs").click(bs);
});

function select(){
	$.post("dictList",
			{"dm":"dz"},
			function(data,status){
				if(status){
					$("#dz").empty();
					var content="<option value=''>请选择</option>";
					for(var i=0;i<data.length;i++){
						content+="<option value='"+data[i].lxjp+"'>"+data[i].mc+"</option>";
					}
					$("#dz").append(content);
				}
			});
}
function zc(){
	var id=$("input[name=id]").val();
	var mc=$("input[name=mc]").val();
	var lxr=$("input[name=lxr]").val();
	var lxdh=$("input[name=lxdh]").val();
	var dz=$("select[name=dz]").val();
	var jzmj=$("input[name=jzmj]").val();
	var zygn=$("input[name=zygn]").val();
	var xqjbqk=$("input[name=xqjbqk]").val();
	var kfsjap=$("input[name=kfsjap]").val();
	$.post("user/xxbsBsSqylQxZc",{"id":id,"mc":mc,"lxr":lxr,"lxdh":lxdh,
		"dz":dz,"jzmj":jzmj,"zygn":zygn,"xqjbqk":xqjbqk,"kfsjap":kfsjap},
		function(data,status){
			if(status){
				alert("暂存成功");
			}
		})
}

function bs(){
	var id=$("input[name=id]").val();
	var mc=$("input[name=mc]").val();
	var lxr=$("input[name=lxr]").val();
	var lxdh=$("input[name=lxdh]").val();
	var dz=$("select[name=dz]").val();
	var jzmj=$("input[name=jzmj]").val();
	var zygn=$("input[name=zygn]").val();
	var xqjbqk=$("input[name=xqjbqk]").val();
	var kfsjap=$("input[name=kfsjap]").val();
	$.post("user/xxbsBsSqylQx",{"id":id,"mc":mc,"lxr":lxr,"lxdh":lxdh,
		"dz":dz,"jzmj":jzmj,"zygn":zygn,"xqjbqk":xqjbqk,"kfsjap":kfsjap},
		function(data,status){
			if(status){
				alert("暂存成功");
			}
		})
}