<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta charset="utf-8" />

	<title>Metronic | Login Page</title>

	<meta content="width=device-width, initial-scale=1.0" name="viewport" />

	<meta content="" name="description" />

	<meta content="" name="author" />

	<link href="/Ying_Second/back_desk/media/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/style-metro.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/style.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/style-responsive.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/default.css" rel="stylesheet" type="text/css" id="style_color"/>

	<link href="/Ying_Second/back_desk/media/css/uniform.default.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/login.css" rel="stylesheet" type="text/css"/>

	<link rel="shortcut icon" href="/Ying_Second/back_desk/media/image/favicon.ico" />

</head>

<body class="login">

	<div class="logo">

		<img src="/Ying_Second/back_desk/media/image/logo-big.png" alt="" /> 

	</div>

	<div class="content">
		
		<form action="/Ying_Second/back/login">
		<br><br>
			<div class="input-icon left">
				<i class="icon-user"></i>
				<input class="m-wrap placeholder-no-fix" type="text" placeholder="用户名" name="user_name"/>
			</div><br><br><br>
			<div class="input-icon left">
				<i class="icon-lock"></i>
				<input class="m-wrap placeholder-no-fix" type="password" placeholder="密码" name="password"/>
			</div>
			<br>${message }
			<input type="submit" class="btn green pull-right" value="登录">
		</form>
		<br><br>
	</div>

	<div class="copyright">
		2017 &copy; Metronic. Admin Dashboard Template.
	</div>
	
	<script src="/Ying_Second/back_desk/media/js/jquery-1.10.1.min.js" type="text/javascript"></script>
	<script src="/Ying_Second/back_desk/media/js/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
	<script src="/Ying_Second/back_desk/media/js/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>      
	<script src="/Ying_Second/back_desk/media/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="/Ying_Second/back_desk/media/js/jquery.slimscroll.min.js" type="text/javascript"></script>
	<script src="/Ying_Second/back_desk/media/js/jquery.blockui.min.js" type="text/javascript"></script>  
	<script src="/Ying_Second/back_desk/media/js/jquery.cookie.min.js" type="text/javascript"></script>
	<script src="/Ying_Second/back_desk/media/js/jquery.uniform.min.js" type="text/javascript" ></script>
	<script src="/Ying_Second/back_desk/media/js/jquery.validate.min.js" type="text/javascript"></script>
	<script src="/Ying_Second/back_desk/media/js/app.js" type="text/javascript"></script>
	<script src="/Ying_Second/back_desk/media/js/login.js" type="text/javascript"></script>      
	<script>
		jQuery(document).ready(function() {
		  App.init();
		  Login.init();
		});
	</script>
</body>
</html>