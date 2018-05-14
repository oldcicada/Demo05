<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE >
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>合肥市民政业务管理平台</title>
<%@include file="base.jsp"%>
<link rel="stylesheet" type="text/css"
	href="images/vince/rain/css/normalize.css" />
<link rel="stylesheet" type="text/css"
	href="images/vince/rain/css/default.css">
<link rel="stylesheet" type="text/css" href="images/vince/css/vince.css">
<link rel="stylesheet" type="text/css"
	href="images/bootstrap/css/bootstrap.min.css">
<script src="images/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="images/bootstrap/css/input.js"></script>
<style media="screen">
body {
	overflow: hidden;
	height: 100%;
	margin: 0;
	padding: 0;
}

img {
	width: 100%;
	height: 100%;
}
</style>
<script src="images/vince/rain/js/rainyday.min.js"></script>
<script>
	function run() {
		var image = document.getElementById('background');
		image.onload = function() {
			var engine = new RainyDay({
				image : this
			});
			engine.rain([ [ 1, 2, 8000 ] ]);
			engine.rain([ [ 3, 3, 0.88 ], [ 5, 5, 0.9 ], [ 6, 2, 1 ] ], 100);
		};
		image.crossOrigin = 'anonymous';
		image.src = "images/vince/rain/css/1.jpg";

	}
</script>


</head>
<body onLoad="run();">

	<div class="login">
		<div class="loginform">
			<form action="login" method="post">
				<div class="form-group  has-feedback" id="form-group1">
					<input type="text" class="form-control" id="name"
						aria-describedby="inputSuccess2Status" onblur="inputAction1()" name="name"> 
						<span id="iconInput1" class="glyphicon form-control-feedback" aria-hidden="true"></span>
				</div>
				<div class="form-group  has-feedback" id="form-group2">
					<input type="password" class="form-control" id="password"
						aria-describedby="inputSuccess2Status" onblur="inputAction2()" name="password"> 
						<span id="iconInput2" class="glyphicon form-control-feedback" aria-hidden="true"></span>
				</div>
				<div class="login_botton">
					<input type="submit" value="登录">
				</div>

			</form>
		</div>

	</div>

	<img id="background" alt="background" src="images/vince/rain/css/1.jpg" />
	<script>
		pingHeight = document.documentElement.clientHeight;
		pingWidth = document.documentElement.clientWidth;
		$("body").css({
			"height" : pingHeight
		})
	</script>
</body>
</html>
