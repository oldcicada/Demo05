<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=10">
<title>合肥市民政业务管理平台</title>
<%@include file="../base.jsp"%>
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<link rel="stylesheet" href="images/bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="images/dist/css/ionicons.min.css">
<link rel="stylesheet" href="images/dist/css/AdminLTE.css">
<link rel="stylesheet" href="images/dist/css/skins/_all-skins.css">
<link rel="stylesheet" href="images/vince/css/vince.css">
<link rel="stylesheet" href="images/vince/biao/css/font-awesome.min.css">
<script type="text/javascript">
function startTime()
{
	var today=new Date();
	var y=today.getFullYear();
	var M=today.getMonth()+1;
	var d=today.getDate();
	var h=today.getHours();
	var m=today.getMinutes();
	var s=today.getSeconds();
	m=checkTime(m);
	s=checkTime(s);
	document.getElementById("nowTime").innerHTML=y+"-"+M+"-"+d+"  "+h+":"+m+":"+s;
	t=setTimeout('startTime()',500);
}

function checkTime(i)
{
if (i<10) 
  {i="0" + i}
  return i
}
</script>
</head>
<body class="hold-transition skin-blue sidebar-mini"  onload="startTime()">
	<div class="wrapper">
		<header class="main-header">
			<a href="#" class="logo"> <span class="logo-mini"> <img
					src="images/vince/images/v01.png">
			</span> <span class="logo-lg"><img src="images/vince/images/v01.png"></span>
			</a>
			<nav class="navbar navbar-static-top" style="position:relative;">
				<a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button"></a> 
				<div class="all_title" style="width: 300px; height:50px;display:inline-block;float: left;">合肥市民政业务管理系统</div>
				<div style="margin-left: 150px;display: inline-block;float: left; "><iframe allowtransparency="true" frameborder="0" width="575" height="77" scrolling="no" 
				src="//tianqi.2345.com/plugin/widget/index.htm?s=2&z=1&t=0&v=0&d=5&bd=0&k=000000&f=&ltf=009944&htf=cc0000&q=1&e=1&a=1&c=58321&w=575&h=77&align=center"></iframe>
				</div> 
				<div class="navbar-custom-menu">
					<ul class="nav navbar-nav">
						<li class="dropdown user user-menu"><a href="#"
							class="dropdown-toggle" data-toggle="dropdown"> <img
								src="images/dist/img/user2-160x160.jpg" class="user-image"
								alt="User Image"> <span class="hidden-xs">${user.power }</span>
						</a>
							<ul class="dropdown-menu">
								<li class="user-header"><img
									src="images/dist/img/user2-160x160.jpg" class="img-circle"
									alt="User Image">
									<p>
										姓名：${user.name } <small>部门：${user.department }</small>
									</p></li>
								<li class="user-footer">
									<div class="pull-right">
										<a href="user/cancel" class="btn btn-default btn-flat">退出系统</a>
									</div>
								</li>
							</ul></li>

					</ul>
				</div>
			</nav>
		</header>
		<aside class="main-sidebar">
			<section class="sidebar">
				<div class="user-panel">
					<div class="pull-left image">
						<img src="images/dist/img/user2-160x160.jpg" class="img-circle"
							alt="User Image">
					</div>
					<div class="pull-left info">
						<p>当前用户：${user.power }</p>
						<p class="menu_time">
							TIME:<span id="nowTime"></span>
						</p>
					</div>
				</div>

				<ul class="sidebar-menu">
					<li class="header">菜单 MENU</li>
					<li>
					    <a href="user/tzggCx" target="frame"> <i class="fa fa-home"
							style="font-size: 22px"></i> <span>通知公告管理</span>
					    </a>
					</li>
					
					<li class="treeview">
					    <a> <i class="fa fa-commenting-o"></i>
							<span>通知送报</span> <span class="pull-right-container"> <i
							class="fa fa-angle-left pull-right"></i>
							</span>
					   </a>
						<ul class="treeview-menu">
							<li><a href="user/xxbsCxFxby" target="frame"><i class="fa fa-bookmark"></i>
									信息报送 (法宣办)</a></li>
							<li><a href="user/xxbsCxBdxxAz" target="frame"><i class="fa fa-bookmark"></i>
									信息报送 (安置处)</a></li>
							<li><a href="user/xxbsCxBn" target="frame"><i class="fa fa-bookmark"></i>
									信息报送 (不能办)</a></li>
							<li><a href="user/xxbsCxYljgQx" target="frame"><i class="fa fa-bookmark"></i>
									养老机构信息报送 (区/县用户)</a></li>
							<li><a href="user/xxbsCxSqylQx" target="frame"><i class="fa fa-bookmark"></i>
									社区养老服务设施信息报送 (区/县用户)</a></li>
						    <li><a href="user/xxbsCxYljgFc" target="frame"><i class="fa fa-bookmark"></i>
									养老机构信息报送 (福慈处)</a></li>
							<li><a href="user/xxbsCxSqylFc" target="frame"><i class="fa fa-bookmark"></i>
									社区养老服务设施信息报送 (福慈处)</a></li>
						</ul>
					</li>
					<li class="treeview">
					    <a href="#"> <i class="fa fa-bar-chart"></i>
					        <span>统计报表 (法宣办)</span> <span class="pull-right-container"> <i
							class="fa fa-angle-left pull-right"></i>
						    </span>
					    </a>
						<ul class="treeview-menu">
							<li><a href="user/gftj" target="frame"><i class="fa fa-bookmark"></i>
									稿费统计表</a></li>
							<li><a href="user/gfcy" target="frame"><i class="fa fa-bookmark"></i>
									稿费采用明细统计报表</a></li>
							<li><a href="user/jgcs" target="frame"><i class="fa fa-bookmark"></i>
									机关处室年度投稿统计表</a></li>
						</ul>
					</li>
					
					<li class="treeview">
					    <a href="#"> <i class="fa fa-wrench"></i>
					        <span>数据维护</span> <span class="pull-right-container"> <i
							class="fa fa-angle-left pull-right"></i>
						    </span>
					    </a>
						<ul class="treeview-menu">
				
							<li><a href="user/xxbsWhYljgFc" target="frame"><i class="fa fa-bookmark"></i>
									养老机构维护 (福慈处)</a></li>
							<li><a href="user/xxbsWhSqylFc" target="frame"><i class="fa fa-bookmark"></i>
									养老服务设施维护 (福慈处)</a></li>
						</ul>
					</li>
					
				</ul>
				
			</section>
		</aside>
		<div class="content-wrapper">
			<section class="content-header">
				<ol class="breadcrumb">
				    
					<li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>
					<li class="active">系统管理</li>
				</ol>
			</section>
			<div class="content qqq">
				<iframe width="100%" name="frame" height="100%" frameborder=0  src="user/tzggCx"></iframe>
			</div>
		</div>

		<footer class="main-footer">
			<strong>Copyright 科大讯飞有限公司 &copy; 2014-2018</strong>
		</footer>
		<div class="control-sidebar-bg"></div>
	</div>
	<script src="images/plugins/jQuery/jquery-2.2.3.min.js"></script>
	<script src="images/bootstrap/js/bootstrap.min.js"></script>
	<script src="images/dist/js/app.min.js"></script>
	<script src="images/dist/js/demo.js"></script>
	<script src="images/vince/js/nicescroll.js"></script>
	<script src="images/vince/js/demo.js"></script>
	<div id="sss" style="display: none; height: 200px; width: 200px;"></div>
	<script src="images/vince/js/echarts.min.js"></script>
</body>
</html>