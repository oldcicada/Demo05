<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="background-color: #000">
<head>
<%@include file="../commont.jsp"%>
<style type="text/css">
.nei span {
	color: #fff;
	font-size: 20px;
}

#text {
	width: 150px;
}
</style>
</head>
<body class="skin-blue">
	<div class="wrapper">
		<div class="content">
			<div class="yjgl">
				<div class="nei">
				<div class="ssjc_ru_title">
					    <span class="left_ten">当前位置：首页->信息详情 </span> 
					    <a href="" target="frame"><input type="submit" value="信息查询" ></a>
						<a href="" target="frame"><input type="submit" value="信息审核"></a>
						<a href="" target="frame"><input type="submit" value="报表统计" ></a>
						<div class="clear"></div>
						</div>
					<div class="ssjc_right_bottom">
						<div class="nei">
							<div class="ssjc_rub_table sbaz_table">
								<table class="tj_table" style="border: 0">
									<tbody>
										<tr>
											<td>信息标题</td>
											<td><p>
													<input type="text" style="width: 200px;" value="${mzywFxb.xxbt }" name="xxbt" id="xxbt"/>
												</p></td>
											<td>上报单位</td>
											<td><p>
													<input type="text" style="width: 200px;" value="${mzywFxb.sbdw }" name="sbdw" id="sbdw"/>
												</p></td>
											<td>正文</td>
											<td><p>
													<textarea rows="5" cols="30" value="${mzywFxb.sbdw }" name="xxzw" id="xxzw">${mzywFxb.xxzw }</textarea>
												</p></td>
										</tr>
										<tr>
											<td>附件</td>
											<td><p>
													${MzywFjxx.fjmc }
												</p></td>
											<td>分管领导</td>
											<td><p>
													<input type="text" style="width: 200px;" name="fgld" id="fgld" value="${MzywFxb.fgld }">
												</p></td>
											<td>上报人员</td>
											<td><p>
													<input type="text" style="width: 200px;" name="sbry" id="sbry" value="${MzywFxb.sbry }">
												</p></td>
										</tr>
										<tr>
											<td>作者</td>
											<td><p>
													<input type="text" style="width: 200px;" name="zz" id="zz" value="${MzywFxb.zz }">
												</p></td>
											<td>栏目</td>
											<td><p>
													<input type="text" style="width: 200px;" name="lm" id="lm" value="${mzywFxb.lm }">
												</p></td>
											<td>稿酬</td>
											<td><p>
													<input type="text" style="width: 200px;" name="gc" id="gc" value="${mzywFxb.gc }">
												</p></td>
										</tr>
										<tr>
											<td>采用情况</td>
											<td><p>
													<input type="text" style="width: 200px;" name="cyqk" id="cyqk" value="${mzywFxb.cyqk }">
												</p></td>
											<td>期数</td>
											<td><p>
													<input type="text" style="width: 200px;" name="qs" id="qs" value="${mzywFxb.qs } ">
												</p></td>
											<td>见报日期</td>
											<td><p>
													<input type="text" style="width: 200px;" name="jbrq" id="jbrq" value="${mzywFxb.jbrq } ">
													<input type="hidden" style="width: 200px;" name="id" id="id" value="${mzywFxb.id } ">
												</p></td>
										</tr>
										<tr>
											<td colspan="6">
												<p>
												    <input type="button" value="  审核  " class="in_sub bt" id="submit"> 
													<input type="reset" value="  取消 " class="in_sub" id="reset">
												</p>
											</td>
										</tr>
									</tbody>
								</table>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="images/pageList/fxb/fxbsh.js"></script>
</body>