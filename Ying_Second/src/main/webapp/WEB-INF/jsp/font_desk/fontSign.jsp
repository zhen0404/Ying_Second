<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

	
	<meta name="renderer" content="webkit">
    <meta name="viewport" content="width=device-width,maximum-scale=1.0,user-scalable=yes">
	<meta name="Keywords" content="股指体验交易，股指单手交易，股指多手交易">
	<meta name="description" content="申请实盘交易账户，直接进行实盘交易。">
	<title>注册 - 盈+</title>
	
	<meta name="keywords" content="盈+，盈，社区金融，O2O社区金融，社区金融O2O，O2O，互联网+社区金融，O2O连锁，社区门店，首家社区金融，社区金融服务，综合金融，互联网金融，体验中心，普惠金融，金融创新，社区化，普惠化，全渠道化，互联网线上平台，O2O交易，全国首家，盈十，金融衍生品，固收类理财，私募基金，股权基金，股指期货，玩转股指，商品期货，国际期货，外盘，A50，沪深300，中证500，上证50">
	<meta name="description" content="盈+——全国首家互联网金融交流体验中心，与您共盈，给财富做加法。">
	<link href="http://pro.ying158.com/resources/web/images/icon.ico" type="image/x-icon" rel="shortcut icon">
	
	<link href="/Ying_Second/css/iconfont.css" rel="stylesheet" type="text/css">
	<link href="/Ying_Second/css/common.css" rel="stylesheet">
	<link href="/Ying_Second/css/jw.css" rel="stylesheet">
	
	<script src="/Ying_Second/js/hm.js"></script>
	<script src="/Ying_Second/js/jquery.js"></script>
	<script type="text/javascript" src="/Ying_Second/js/layer.js"></script>
	<link rel="stylesheet" href="/Ying_Second/css/layer.css" id="layui_layer_skinlayercss">
	<script src="/Ying_Second/js/echarts.js"></script>
	
</head>
	
<body>

	<div style="width: 1002px; height: 94px; margin: 0 auto;">
			<iframe src="/Ying_Second/top" scrolling="nox`" width="1002" height="94" frameborder="0"></iframe>
	</div>
<div class="jwNav">
		<div class="container">
			<div class="row">
				<ul class="topNav">
					<li class="active"><a class="item first"
						href="/Ying_Second/home"> 首页 </a></li>
					<li><a class="item" href="/Ying_Second/exploration">
							网上体验中心 </a></li>
					<li><a class="item" href="/Ying_Second/frontSubject/showsubject"> 产品中心 </a>
					</li>
					<li><a class="item" href="/Ying_Second/frontJournalism"> 新闻中心 </a></li>
					<li><a class="item"
						href="/Ying_Second/frontLoad"> 下载中心 </a></li>
					<li><a class="item " href="/Ying_Second/frontCollege">
							盈+商学院 </a></li>
					<li><a class="item"
						href="/Ying_Second/frontStudy"> 投研中心
					</a></li>
					<li><a class="item last"
						href="/Ying_Second/myadd">
							我的加法库 </a></li>
				</ul>
			</div>
		</div>
	</div>
<script type="text/javascript">
    $(function(){
        function showIn(url){
            var info="<div class='mydig'><div class='bg'></div><div class='imgbox'><a href="+url+"></a></div></div>";
            $('body').append(info);
        }

    });

</script>    <div class="proMain">
    	</div>
	<div class="row register">
		<div class="title">
			<div class="left">
				<hr>
			</div>
			<div class="mid">
				15秒快速注册
			</div>
			<div class="right">
				<hr>
			</div>
		</div>
        <div class="item">
            <div class="rLabel">
                用户名
            </div>
            <div class="rInput">
                <input type="text" placeholder="请输入用户名" id="userName" name="youname" class="form-control textInput youname">（需用实名注册）<span class="errorInfo">用户名不能为空</span>
            </div>
        </div>
		<div class="item">
			<div class="rLabel">
				手机号
			</div>
			<div class="rInput">
				<input type="text" placeholder="请输入手机号" id="phone" name="phone" class="form-control textInput phone"><span class="errorInfo">手机号码不能为空</span>
			</div>
		</div>
<!-- 		 <div class="item"> -->
<!--             <div class="rLabel"> -->
<!--                 	图形验证码 -->
<!--             </div> -->
<!--             <div class="rInput"> -->
<!--                 <input type="text" placeholder="图片验证码" id="picCode" class="form-control textInput imgcode"> -->
<!--                 <img src="/Ying_Second/img/authImage" id="captcha" onclick="updcaptcha()" title="看不清楚,点击换一张" alt="看不清楚,点击换一张" class="picCodeImg"> -->
<!--                 <span class="errorInfo">请输入图形验证码</span> -->
<!--             </div> -->
<!--         </div> -->
<!-- 		<div class="item"> -->
<!-- 			<div class="rLabel"> -->
<!-- 				验证码 -->
<!-- 			</div> -->
<!-- 			<div class="rInput"> -->
<!-- 				<input type="text" placeholder="请输入验证码" id="vCode" name="vCode" class="form-control textInput code"><button class="btn vCodeBtn" onclick="sendMessage(90)" id="btnSendCode">获取验证码</button><span class="errorInfo"></span> -->
<!-- 			</div> -->
<!-- 		</div> -->
		<div class="item">
			<div class="rLabel">
				登录密码
			</div>
			<div class="rInput">
				<input type="password" placeholder="请输入密码" id="password" name="password" class="form-control textInput password"><span class="errorInfo"></span>（数字和字母组合，不少于6位）
			</div>
		</div>
		<div class="item">
			<div class="rLabel">
				确认密码
			</div>
			<div class="rInput">
				<input type="password" placeholder="请再输入密码" id="password2" name="password2" class="form-control textInput password2"><span class="errorInfo"></span>
			</div>
		</div>
        <div class="item">
            <div class="rLabel">  理财师邀请码 </div>
            <div class="rInput">
                <input type="text" placeholder="选填" id="invitationCode" name="invitationCode" class="form-control textInput invitationCode">（填写理财师邀请码，将会有更多惊喜）
            </div>
        </div>
		<div class="item">
			<div class="rLabel">
				QQ号码
			</div>
			<div class="rInput">
				<input type="text" placeholder="选填" id="qq" name="qq" class="form-control textInput qqAccount">
			</div>
		</div>
		<div class="item extro">
			<div class="rLabel">
				&nbsp;
			</div>
			<div class="rInput">
				<span class="extroInfo">请用户提供QQ号码，方便客服联系</span>
			</div>
		</div>
		<div class="item">
			<div class="rLabel">
				&nbsp;
			</div>
			<div class="rInput">
				<label>
					<input type="checkbox" id="registerRule" class="registerRule" checked="checked"><span>我已阅读并同意<a href="javascript:showAgreement();">《本网站服务协议》</a></span>
				</label>
				<span class="ruleError">请先阅读并同意网站服务协议</span>
			</div>
		</div>
		<div class="item">
			<div class="rLabel">
				&nbsp;
			</div>
			<div class="rInput">
				<button class="btn registBtn submit">立即注册</button>
			</div>
		</div>
		<div class="item">
			<div class="rLabel">
				&nbsp;
			</div>
			<div class="rInput loginChoose">
				我已经注册，现在就<a href="/Ying_Second/frontIframeLogin">登录</a>
			</div>
		</div>
	</div>
	
<script type="text/javascript" src="/Ying_Second/js/regis.js"></script>
<script type="text/javascript">
$(function(){
	var b = "";
	regis(b);
});

function updcaptcha(){
	document.getElementById("captcha").src="/Ying_Second/img/authImage?"+new Date().getTime();
}

function showAgreement(){
	window.open("/web/zcxy","注册协议","height=800,width=1000,scrollbars=yes, resizable=no,location=no, status=no,screenX=100") 
}
</script>

<div class="container index">
			<div class="row">
				<div class="security">
					<div class="item">
						<img src="/Ying_Second/img/indexSecurity1.png">
						<div class="detail">
							资金银行监管
							<div class="desc">平台资金由第三方银行监管</div>
						</div>
					</div>
					<div class="item">
						<img src="/Ying_Second/img/indexSecurity2.png">
						<div class="detail">
							交易证监会监管
							<div class="desc">投资交易由证监会监管</div>
						</div>
					</div>
					<div class="item">
						<img src="/Ying_Second/img/indexSecurity3.png">
						<div class="detail">
							风控盈+监管
							<div class="desc">盈+全自动风控系统为您保驾护航</div>
						</div>
					</div>
				</div>
			</div> 
		</div>
    
<!-- 	<iframe scrolling="no" src="/Ying_Second/middle" width="972"  height="500" frameborder="0"></iframe> -->
	
	<div class="foot3">
		<div class="container">
			<div class="row">
				Copyright © 2010 - 2015 www.ying158.com All Rights Reserverd 杭州吉威投资管理有限公司 版权所有<br>
				浙ICP备14030807号-3 杭州市江干区钱江新城迪凯银座19F 4000-999-158
			</div>
		</div>
	</div>
<script>
    var _hmt = _hmt || [];
    (function() {
        var hm = document.createElement("script");
//         hm.src = "//hm.baidu.com/hm.js?06cf97732baac1a65bed8ae95f2384aa";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
    })();
</script>
</body>
</html>