<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="background-color: #000">
<head>
<%@include file="../commont.jsp"%>
<script src="images/pageList/xxxx/wh.js" type="text/javascript"></script>
<script type="text/javascript">
		function del(a){
			$(a).parent().parent().remove();
		}
		
		function add(){
			var s="<tr><td>专业</td><td><p><input class='zy' type='text' style='width: 100%;'/></p></td><td>学制</td><td><p><input class='xz' type='text' style='width: 100%;' /></p></td><td><a  class='add'>添加</a>/<a class='delete' onclick='del(this)'>删除</a></td></tr>";
			$("#content").append(s); 
		}
		
</script>
</head>
<body class="skin-blue" style="height: 100% !important;">
	<div class="wrapper">
		<div class="content">
			<div class="yjgl">
				<div class="ssjc_right_up">
					<form action="user/wh" method="post" onsubmit="doSubmit()">
					<div class="nei">
						<div class="ssjc_ru_title">
							<span class="left_ten"> 学校详情 </span>
							<input id="id" type="hidden" name="id" value="${xxxq.id}">
							<div class="clear"></div>
						</div>
						<div class="sbaz_table">
							<p>
								<input type="submit" value="保存" class="in_sub">
								<input type="reset" value="取消" class="in_sub" style="margin-left: 50px;">
							</p>
						</div>
					</div>
					<div class="ssjc_right_bottom">
						<div class="nei">
							<div class="ssjc_rub_table sbaz_table">

								<table class="tj_table " border="0">
									<thead>
									<tr>
									<td >学校名称</td>
									<td colspan="4">
									    <input type="text" name="pzmc" value="${xxxq.pzmc }" style=" width: 100%; background-color: #21242E">
										<input id="xx" type="hidden" name="xx" />
									</td>
									</tr>
									</thead>
									
									<tbody id="content">

									</tbody>
									
								</table>
								
                           
							</div>
						</div>
					</div>
				</form>
				</div>
				</div>
			</div>
		</div>
<script type="text/javascript">
function doSubmit(){
	var zys=$(".zy");
	var xzs=$(".xz");
	//专业数组
	var obj=[];
	if(zys.length>0){
		for(var i=0;i<zys.length;i++){
			var content={"zy":zys[i].value,"xz":xzs[i].value};
			obj.push(content);
		}
	}
	//转换为json字符串，保存在隐藏框，表单提交时传给后台
	$("#xx").val(JSON.stringify(obj));
	return true;
}

</script>
</body>
</html>