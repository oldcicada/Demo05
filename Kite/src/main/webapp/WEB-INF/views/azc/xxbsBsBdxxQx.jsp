<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="background-color: #000">
<head>
<%@include file="../commont.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="images/pageList/azc/xxbsBsBdxxQx.js" type="text/javascript"></script>
<style type="text/css">
.nei span {
	color: #fff;
	font-size: 20px;
}
td p{
margin:2px;
}

#tbody tr td:nth-child(odd){
width:250px;
}
</style>
</head>
<body class="skin-blue">
	<div class="wrapper">
		<div class="content">
			<div class="yjgl">
				<div class="ssjc_right_up">
					<div class="nei">
					
					</div>
					<div class="ssjc_right_bottom">
						<div class="nei">
							<form action="user/xxbsBsBdxxQx" method="post">
							<input type="hidden" id="id" value="${id }">
							<div class="ssjc_rub_table sbaz_table" style="padding:0;margin:0">
							<table class="tj_table" style="border: 0">
									<thead>
										<tr>
											<td colspan="6">士兵基本信息</td>
										</tr>
									</thead>
									<tbody id="tbody">
										<tr>
											<td>身份证号码</td>
											<td><p>
													<input type="text" id="sbsfzhm"
													style="width:150px;" name="sbsfzhm"
														required="required">
												</p></td>
											<td>姓名</td>
											<td><p>
													<input type="text" id="xm"
														style="width:200px;" name="xm"
														required="required">
												</p></td>
											<td>籍贯</td>
											<td><p>
													<input type="text" id="jg" 
													style="width:300px;" name="jg"
														required="required">
												</p></td>
										</tr>
										<tr>
											<td>性别</td>
											<td><p>
													<select class="biaoti_select" id="xb"  name="xb"
														style="width: 150px;">
														<option value="男">男</option>
														<option value="女">女</option>
													</select>
												</p></td>
											<td>政治面貌</td>
											<td><p>
													<select class="biaoti_select" id="zzmm" name="zzmm"
														style="width:200px;">
														<option value="党员">党员</option>
														<option value="团员">团员</option>
														<option value="无">无</option>
													</select>
												</p></td>
											<td>出生年月</td>
											<td><p>
													<input type="date" id="csny" name="csny"
													style="width:300px;"
														required="required">
												</p></td>
										</tr>
										<tr>
											<td>文化程度</td>
											<td><p>
													<select class="biaoti_select" id="whcd" name="whcd"
														style="width: 150px;">
														<option value="本科及以上">本科及以上</option>
														<option value="大专">大专</option>
														<option value="高中">高中</option>
														<option value="初中">初中</option>
														<option value="小学及以下">小学及以下</option>
													</select>
												</p></td>
											<td>居住地址</td>
											<td><p>
													<select class="biaoti_select" id="jzdz" name="jzdz"
														style="width: 200px;">
														<option value="党员">党员</option>
														<option value="团员">团员</option>
														<option value="无">无</option>
													</select>
												</p></td>
											<td>健康状态</td>
											<td><p>
													<select class="biaoti_select" id="jkzt" name="jkzt"
														style="width: 150px;">
														<option value="良好">良好</option>
														<option value="一般">一般</option>
														<option value="其他">其他</option>
													</select>
												</p></td>
										</tr>
										<tr>
											<td colspan="6">入伍与退伍信息</td>
										</tr>
										<tr>
											<td>军种</td>
											<td><p>
													<select class="biaoti_select" id="jz" name="jz"
														style="width: 150px;">
														<option value="海军">海军</option>
														<option value="陆军">陆军</option>
														<option value="空军">空军</option>
														<option value="二炮">二炮</option>
														<option value="武警">武警</option>
													</select>
												</p></td>
											<td>专业特长</td>
											<td><p>
													<input type="text" style="width: 200px" 
													id="zytc" name="zytc"
														required="required">
												</p></td>
												<td>联系电话</td>
												<td><p>
													<input type="text" style="width: 300px"
														id="lxdh" name="lxdh"
														required="required">
												</p></td>
										</tr>
										<tr>
											<td>入伍地点</td>
											<td><p>
													<input type="text" style="width: 300px"
														id="rwdd" name="rwdd"
														required="required">
												</p></td>
											<td>入伍时间</td>
											<td><p>
													<input type="date" id="rwsj" name="rwsj"
													style="width:200px;"
														required="required">
												</p></td>
												<td>入伍通知编号</td>
												<td><p>
													<input type="text" style="width: 300px" 
													  id="rwtzbh" name="rwtzbh"
														required="required">
												</p></td>
										</tr>
										<tr>
											<td>退役部队名称</td>
											<td><p>
											<input type="text" id="text" id="tybdmc" name="tybdmc"
													style="width: 150px"
														required="required">
												</p></td>
											<td>入伍前户口性质</td>
											<td><p>
													<select class="biaoti_select" id="rwqhkxz" name="rwqhkxz"
														style="width: 200px; ">
														<option value="农业">农业</option>
														<option value="非农业">非农业</option>
													</select>
												</p></td>
												<td>退伍时间</td>
												<td><p>
													<input type="date" id="twsj" name="twsj" style="width:300px;" required="required">
												</p></td>
										</tr>
										<tr>
											<td>受过奖励</td>
											<td><p>
												<select class="biaoti_select" id="sgjl" name="sgjl"
														style="width: 150px;">
														<option value="一等功">一等功</option>
														<option value="二等功">二等功</option>
														<option value="三等功">三等功</option>
														<option value="嘉奖">嘉奖</option>
														<option value="优秀士兵">优秀士兵</option>
													</select>
												</p></td>
											<td>退役证件编号</td>
											<td><p>
													<input type="text" id="tyzjbh" name="tyzjbh"
													style="width: 200px;"
														required="required">
												</p></td>
												<td>退役时是否领取退役金</td>
												<td><p>
													<select class="biaoti_select" id="tyssflqtyj" name="tyssflqtyj"
														style="width: 150px;">
														<option value="是">是</option>
														<option value="否">否</option>
													</select>
												</p></td>
										</tr>
										<tr>
											<td>是否参加免费培训</td>
											<td><p>
												<select class="biaoti_select" id="sfcjmfpx" name="sfcjmfpx"
														style="width: 150px;">
														<option value="是">是</option>
														<option value="否">否</option>
													</select>
												</p></td>
											<td>服役方式</td>
											<td><p>
												<select class="biaoti_select" id="fyfs" name="fyfs"
														style="width: 200px;">
														<option value="义务兵">义务兵</option>
														<option value="初级士官">初级士官</option>
														<option value="中级士官">中级士官</option>
													</select>
												</p></td>
												<td>报道时间</td>
												<td><p>
													<input type="date"  id="bdsj" name="bdsj"
													   style="width:300px"
														required="required">
												</p></td>
										</tr>
										<tr>
											<td colspan="6">职业教育和技能培训信息</td>
										</tr>
									</tbody>
								</table>
								</div>
								<div class="ssjc_rub_table sbaz_table" style="padding:0;margin:0">
								<table class="tj_table" style="border: 0" >
										<tr>
											<td>学校名称</td>
											<td><p>
													<select class="biaoti_select" id="xxmc" name="name" style="width:300px;" onchange="doZy();">
														<c:forEach items="${xxmcs }" var="xx">
														   <option value="${xx }">${xx }</option>
														</c:forEach>
														
													</select>
												</p></td>
											<td>专业</td>
											<td><p>
													<select class="biaoti_select" id="zy"  style="width:300px;">
														
													</select>
												</p></td>
											<td>学制</td>
											<td colspan="2"><p><input type="date"  id="bdsj" 
													   style="width:300px" value="3"
														required="required"></p></td>
										
										</tr>
											
										<tr>
											<td>其他专业意向</td>
											<td colspan="4"><p><input type="text" style="width:500px"
												id="qtzyyx" name="qtzyyx"
														required="required"></p></td>
											<td>是否服从调整</td>
											<td><p>
													<select class="biaoti_select" id="sffctz" name="sffctz">
														<option value="">是</option>
														<option value="">否</option>
													</select>
												</p></td>
										</tr>
										<tr>
											<td colspan="7">
												<p>
													<input type="submit" value="  暂存  " class="in_sub">
													<input type="reset" value="  取消  " class="in_sub">
													<input type="button" id="submit" value="  报送 " class="in_sub">
												</p>
											</td>
										</tr>
								</table>
								
							</div>
                         </form>
						</div>    
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
	$(function(){
		doZy();
	});
	
	  function doZy(){
		   var xxmc = $("#xxmc").val();
		   $.post("user/queryZyByxx",{"xxmc":xxmc},
		   function(data,status){
				if(status){
					$("#zy").empty();
					var list = eval("("+data+")");
					for(var i=0;i<list.length;i++){
						var content="<option value='"+list[i].zy+"'>"+list[i].zy+"</option>";
						$("#zy").append(content);
					}
				}
			});
	   }
	</script>
</body>