<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="pop">
<div class="con">
<span class="close"><img src="img/close.png"></span>
<div class="page1">
<p class="info">
<span class="title">手机号：</span>
<input type="tel" class="tel" id="mobile" onkeyup="value=value.replace(/[^\w\.\/]/ig,'')" required="" placeholder="请输入您的手机号">
</p>
<p class="info">
<span class="title">验证码：</span>
<input type="tel" class="code" placeholder="输入验证码">
<span class="code1">获取验证码</span>
</p>
<div class="demand demand2" style="width: 70%; margin-top: 20px;">提交</div>
</div>
<div class="page2">
<p class="p1">提交成功</p>
<p class="p2">我们将在索要成功后</p>
<p class="p2">第一时间通知您！</p>
<div class="demand demand3" style="width: 80%; margin-top: 20px; margin-bottom: 10px;">朕知道了</div>
</div>
</div>
</div>
</body>

<script type="text/javascript" src="/Ying_Second/js/jquery.js"></script>

<script type="text/javascript">
//发送验证码给手机 
	$.ajax({
		type: 'post',
		url:"/Ying_Second/yanzheng?mobile="+$('#mobile').val+"", //即上面的接口1
		success: function(data, status) {
		if (data.errcode==0) {
			alert("已发送");
			$(".code1").attr("disabled", "disabled");
			$(".code1").css("background-color", "#b4b2b3");
			//下面就是实现倒计时的效果代码
			var d = new Date();
			d.setSeconds(d.getSeconds() + 59);
			var m = d.getMonth() + 1;
			var time = d.getFullYear() + '-' + m + '-' + d.getDate() + ' ' + d.getHours() + ':' + d.getMinutes() + ':' + d.getSeconds();
			var id = ".code1";
			var end_time = new Date(Date.parse(time.replace(/-/g, "/"))).getTime(),
			//月份是实际月份-1
			sys_second = (end_time - new Date().getTime()) / 1000;
			var timer = setInterval(function() {
			if (sys_second > 1) {
				sys_second -= 1;
				var day = Math.floor((sys_second / 3600) / 24);
				var hour = Math.floor((sys_second / 3600) % 24);
				var minute = Math.floor((sys_second / 60) % 60);
				var second = Math.floor(sys_second % 60);
				var time_text = '';
				if (day > 0) {
					time_text += day + '天';
				}
			if (hour > 0) {
				if (hour < 10) {
				hour = '0' + hour;
				}
				time_text += hour + '小时';
			}
			if (minute > 0) {
				if (minute < 10) {
					minute = '0' + minute;
				}
				time_text += minute + '分';
			}
			if (second > 0) {
				if (second < 10) {
					second = '0' + second;
				}
				time_text += second + '秒';
			}
			$(id).text(time_text);
		} else {
			clearInterval(timer);
			$(".code1").attr("disabled", false);
			$(".code1").text('获取验证码');
			$(".code1").css("background-color", "#f67a62");
		}
		},1000); 
		}else{
			alert("发送失败，请再试一次。");
		}
		},
		error: function(data, status) {
			alert(status);
		}
	});

</script>
</html>