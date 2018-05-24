$(function(){
	selectdz();
	$("#save").click(save);
});
function selectdz(){
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
function save(){
	var mc=$("input[name=mc]").val();
	var lxr=$("input[name=lxr]").val();
	var lxdh=$("input[name=lxdh]").val();
	var dz=$("select[name=dz]").val();
	var rzl=$("input[name=rzl]").val();
	var zcws=$("input[name=zcws]").val();
	var fwxz=$("input[name=fwxz]").val();
	var fwdxlx=$("input[name=fwdxlx]").val();
	var yz=$("input[name=yz]").val();
	var fyz=$("input[name=fyz]").val();
	var zcglry=$("input[name=zcglry]").val();
	var ys=$("input[name=ys]").val();
	var hs=$("input[name=hs]").val();
	var cw=$("input[name=cw]").val();
	var sg=$("input[name=sg]").val();
	var xlzxs=$("input[name=xlzxs]").val();
	var js=$("input[name=js]").val();
	var gj=$("input[name=gj]").val();
	var cj=$("input[name=cj]").val();
	var ryczsgl=$("input[name=ryczsgl]").val();
	var djpd=$("input[name=djpd]").val();
	var bz=$("input[name=bz]").val();
	$.post("user/xxbsBsYljgQxZc",{"mc":mc,"lxr":lxr,"lxdh":lxdh,
		"dz":dz,"rzl":rzl,"zcws":zcws,
		"fwxz":fwxz,"fwdxlx":fwdxlx,"yz":yz,
		"fyz":fyz,"zcglry":zcglry,"ys":ys,
		"hs":hs,"cw":cw,"sg":sg,
		"xlzxs":xlzxs,"js":js,"gj":gj,
		"cj":cj,"ryczsgl":ryczsgl,"djpd":djpd,
		"bz":bz},
		function(data,status){
			if(status){
				alert("保存成功");
			}
		})
}