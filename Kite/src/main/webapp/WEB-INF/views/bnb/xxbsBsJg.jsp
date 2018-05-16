<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="background-color: #000">
<head>
<%@include file="../commont.jsp"%>
<script type="text/javascript" src="images/pageList/bnb/xxbsBsJg.js"></script>
<style type="text/css">
.nei span {
	color: #fff;
	font-size: 20px;
}
tr td:first-child{
   width:100px;
}
#table{
margin:0 auto;
width: 550px;
}
#text{
	width: 400px;
	padding:0;
}
#textarea{
width: 400px;
height:60px;
margin:5px 0 0 -5px;
}
</style>
</head>
<body class="skin-blue">
	<div class="wrapper">
		<div class="content">
			<div class="yjgl">
				<div class="ssjc_right_up">
					<div class="nei">
						<div class="ssjc_ru_title">
							<a href=""><input type="submit" value="信息查询"> </a> <a
								href=""><input type="submit" value="信息报送"></a>
							<div class="clear"></div>
						</div>
					</div>
					<div class="ssjc_right_bottom" id="table">
						<div class="nei">
							<div class="ssjc_rub_table sbaz_table">
							<form action="" method="post">
								<table class="tj_table" style="border: 0">
								
									<thead>
										<tr>
											<td>受理时间</td>
											<td><p>
													<input type="date" id="zhxgsj" value="${bnbJg.zhxgsj }" name="zhxgsj" style="width: 400px;" />
												</p></td>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>“不能办”基本情况</td>
											<td><p >
											<input id="bnbjbqk"  name="bnbjbqk" value="${bnbJg.bnbjbqk }" style="width: 400px;" />
												</p></td>
										</tr>
										<tr>
											<td>“不能办”原因</td>
											<td><p >
													<input id="bnbyy" name="bnbyy" value="${bnbJg.bnbyy }" style="width: 400px;" />
												</p></td>
										</tr>
										<tr>
											<td>科处室意见</td>
											<td><p >
													<input id="kcsyj" name="kcsyj" value="${bnbJg.kcsyj }" style="width: 400px;"  />
												</p></td>
										</tr>
										<tr>
											<td>领导意见</td>
											<td><p >
													<input id="ldyj" name="ldyj" value="${bnbJg.ldyj }" style="width: 400px;" />
												</p></td>
										</tr>
										<tr>
											<td>办结时间</td>
											<td><p>
													<input type="date" id="bjsj" name="bjsj" value="${bnbJg.bjsj }" style="width: 400px;" />
												</p></td>
										</tr>
										<tr>
											<td>办结情况</td>
											<td><p>
													<input type="text" id="bjqk" name="bjqk" value="${bnbJg.bjqk }"  style="width: 400px;" />
												</p></td>
										</tr>
										<tr>
											<td>备注</td>
											<td><p>
													<input type="text" id="bz" name="bz" value="${bnbJg.bz }" style="width: 400px;" />
													<input type="hidden"  id="id" name="id" value="${bnbJg.id }" style="width: 400px;" />
													<input type="hidden"  id="cjsj" name="cjsj" value="${bnbJg.cjsj }" style="width: 400px;" />
												</p></td>
										</tr>
										<tr>
											<td colspan="2">
												<p>
													<input type="button" id="update"  value="  暂存  " class="in_sub">
													<input type="button" id="reset" value=" 取消  " class="in_sub">
													<input type="button" id="submit" value="  报送  " class="in_sub">
												</p>
											</td>
										</tr>
									</tbody>
								</table>
								</form>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>