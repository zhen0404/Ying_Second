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
		<h3 class="form-title">您的权限不足，是否更换账号</h3>
			<input name="user_name" value="admin">
			<input name="password" value="123456">
			<br>${message }
			<input type="submit" value="登录" >
		</form>
		
<!-- 		<form class="form-vertical login-form" action="/Ying_Second/back/login" > -->
<!-- 			<h3 class="form-title">请登录</h3> -->
<!-- 			<div class="control-group"> -->
<!-- 				<div class="controls"> -->
<!-- 					<div class="input-icon left"> -->
<!-- 						<i class="icon-user"></i> -->
<!-- 						<input class="m-wrap placeholder-no-fix" type="text" placeholder="用户名" name="user_name"/> -->
<!-- 					</div> -->
<!-- 				</div> -->
<!-- 			</div> -->
<!-- 			<div class="control-group"> -->
<!-- 				<label class="control-label visible-ie8 visible-ie9">Password</label> -->
<!-- 				<div class="controls"> -->
<!-- 					<div class="input-icon left"> -->
<!-- 						<i class="icon-lock"></i> -->
<!-- 						<input class="m-wrap placeholder-no-fix" type="password" placeholder="密码" name="password"/> -->
<!-- 					</div> -->
<!-- 				</div> -->
<!-- 			</div> -->

<!-- 			<div class="form-actions"> -->
<!-- 				<button type="submit" class="btn green pull-right">登录 -->
<!-- 				 <i class="m-icon-swapright m-icon-white"></i> -->
<!-- 				</button>             -->
<!-- 			</div> -->
<!-- 		</form> -->

		<form class="form-vertical forget-form" action="index.html">
			<h3 class="">Forget Password ?</h3>
			<p>Enter your e-mail address below to reset your password.</p>
			<div class="control-group">
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-envelope"></i>
						<input class="m-wrap placeholder-no-fix" type="text" placeholder="Email" name="email" />
					</div>
				</div>
			</div>

			<div class="form-actions">
				<button type="button" id="back-btn" class="btn">
				<i class="m-icon-swapleft"></i> Back
				</button>
				<button type="submit" class="btn green pull-right">
				Submit <i class="m-icon-swapright m-icon-white"></i>
				</button>            
			</div>
		</form>

		<form class="form-vertical register-form" action="index.html">
			<h3 class="">Sign Up</h3>
			<p>Enter your account details below:</p>
			<div class="control-group">
				<label class="control-label visible-ie8 visible-ie9">Username</label>
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-user"></i>
						<input class="m-wrap placeholder-no-fix" type="text" placeholder="Username" name="username"/>
					</div>
				</div>
			</div>

			<div class="control-group">
				<label class="control-label visible-ie8 visible-ie9">Password</label>
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-lock"></i>
						<input class="m-wrap placeholder-no-fix" type="password" id="register_password" placeholder="Password" name="password"/>
					</div>
				</div>
			</div>

			<div class="control-group">
				<label class="control-label visible-ie8 visible-ie9">Re-type Your Password</label>
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-ok"></i>
						<input class="m-wrap placeholder-no-fix" type="password" placeholder="Re-type Your Password" name="rpassword"/>
					</div>
				</div>
			</div>

			<div class="control-group">
				<label class="control-label visible-ie8 visible-ie9">Email</label>
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-envelope"></i>
						<input class="m-wrap placeholder-no-fix" type="text" placeholder="Email" name="email"/>
					</div>
				</div>
			</div>

			<div class="control-group">
				<div class="controls">
					<label class="checkbox">
					<input type="checkbox" name="tnc"/> I agree to the <a href="#">Terms of Service</a> and <a href="#">Privacy Policy</a>
					</label>  
					<div id="register_tnc_error"></div>
				</div>
			</div>

			<div class="form-actions">
				<button id="register-back-btn" type="button" class="btn">
				<i class="m-icon-swapleft"></i>  Back
				</button>
				<button type="submit" id="register-submit-btn" class="btn green pull-right">
				Sign Up <i class="m-icon-swapright m-icon-white"></i>
				</button>            
			</div>
		</form>
	</div>

	<div class="copyright">
		2013 &copy; Metronic. Admin Dashboard Template.
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