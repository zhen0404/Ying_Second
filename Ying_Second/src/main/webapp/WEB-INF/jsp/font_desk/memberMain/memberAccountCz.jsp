<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
<meta name="keywords" content="盈+，盈，社区金融，O2O社区金融，社区金融O2O，O2O，互联网+社区金融，O2O连锁，社区门店，首家社区金融，社区金融服务，综合金融，互联网金融，体验中心，普惠金融，金融创新，社区化，普惠化，全渠道化，互联网线上平台，O2O交易，全国首家，盈十，金融衍生品，固收类理财，私募基金，股权基金，股指期货，玩转股指，商品期货，国际期货，外盘，A50，沪深300，中证500，上证50">
<meta name="description" content="盈+——全国首家互联网金融交流体验中心，与您共盈，给财富做加法。">
<link href="http://pro.ying158.com/resources/web/images/icon.ico" type="image/x-icon" rel="shortcut icon">

	<meta name="renderer" content="webkit">
    <meta name="viewport" content="width=device-width,maximum-scale=1.0,user-scalable=yes">
	<meta name="Keywords" content="股指体验交易，股指单手交易，股指多手交易">
	<meta name="description" content="申请实盘交易账户，直接进行实盘交易。">
	<title>收益记录-会员中心-盈+</title>
	
	<link href="http://www.ying158.com/images/icon.ico" type="image/x-icon" rel="shortcut icon">
	<link href="/Ying_Second/css/iconfont.css" rel="stylesheet" type="text/css">
	<link href="/Ying_Second/css/common.css" rel="stylesheet">
	<link href="/Ying_Second/css/jw2.css" rel="stylesheet">
	
    <script src="/Ying_Second/js/hm.js"></script>
    <script src="/Ying_Second/js/jquery.js"></script>
    <script src="/Ying_Second/js/echarts.js"></script>
</head>
<body>

	<div style="width:1002px; height: 94px; margin: 0 auto;" >
		<iframe src="/Ying_Second/top" scrolling="nox`" width="1002"
		height="94" frameborder="0"></iframe>
	</div>
<div class="jwNav">
		<div class="container">
			<div class="row">
				<ul class="topNav">
					<li class="active">
					<a class="item first"
						href="/Ying_Second/home"> 首页 </a></li>
					<li><a class="item" href="/Ying_Second/exploration">
							网上体验中心 </a></li>
					<li><a class="item" href="/Ying_Second/product"> 产品中心 </a>
					</li>
					<li><a class="item"
						href="/Ying_Second/frontJournalism"> 新闻中心 </a></li>
					<li><a class="item"
						href="/Ying_Second/frontLoad"> 下载中心 </a></li>
					<li><a class="item " href="/Ying_Second/frontCollege">
							盈+商学院 </a></li>
					<li><a class="item"
						href="/Ying_Second/frontStudy"> 投研中心
					</a></li>
					<li><a class="item last"
						href="/Ying_Second/frontLast">
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
            if (1!=null&&1==0){
                showIn("/account/bbinInfo/getBbinInfo");
            }

    });

</script><table height="160" class="peopleInfo" width="970" border="0" cellspacing="0" cellpadding="0">
    <tbody><tr>
        <td align="left" valign="middle" class="info">
            <a href="http://pro.ying158.com/account/security">
                <div class="img"><img src="/Ying_Second/img/userPic.jpg"></div>
                <h2>${member.name }<span>您好!</span></h2>
            </a>
            <div class="safe">账户安全&nbsp;&nbsp;<span class="scroll"><em style="width:50%"></em></span></div>
            <ul class="listIco iconfont">
                <li class=""><a href="http://pro.ying158.com/account/trades/profit/records#1"></a><em></em></li>
                <li class="active"><a href="http://pro.ying158.com/account/trades/profit/records#1"></a><em></em></li>
                <!-- <li class=""><a href="#1">&#xe61f;</a><em>&#xe61b;</em></li> -->
                <li class="active"><a href="http://pro.ying158.com/account/trades/profit/records#1"></a><em></em></li>                                
                <li class=""><a href="http://pro.ying158.com/account/trades/profit/records#1"></a><em></em></li>
            </ul>
        </td>
        <td align="right">
            <a href="http://pro.ying158.com/web/logout" class="loginOut"><span class="iconfont"></span>安全退出</a>
        </td>
    </tr>
</tbody></table>
<div class="countBox">
   <ul>
        <li><h2>${memberAccount.useable_balance }</h2><p>账户可用余额(元)</p></li>
        <li><h2>${money2+memberAccount.useable_balance+invest_amount }</h2><p>账户总资产(元)<a href="javascript:;" class="iconfont"><span>可用余额+投资金额+累计收益</span><i></i></a></p></li>
        <li><h2 style="color:#9d8440">${memberAccount.invest_amount }</h2><p>投资金额(元)<a href="javascript:;" class="iconfont"><span>投资中资金</span><i></i></a></p></li>
        <li><h2 style="color:#9d8440">${money2 }</h2><p>累计收益(元)<a href="javascript:;" class="iconfont"><span>累计收益</span><i></i></a></p></li>
        <li><h2 style="color:#9d8440">${memberAccount.imuseale_balance }</h2><p>冻结金额(元)<a href="javascript:;" class="iconfont"><span>提现冻结金额</span><i></i></a></p></li>
    </ul>
    <a href="http://pro.ying158.com/account/deposit" class="cz">充值</a>
    <a href="http://pro.ying158.com/account/withdraw" class="tk">提款</a>
</div>    <div class="proMain clearfix">
<div class="adminLeft">
    <h2>我的投资</h2>
    <ul>
        <li><a id="member_center_menu_invests" href="http://pro.ying158.com/account/touZiList"><em class="iconfont red"></em>投资记录</a></li>
        <li><a id="member_center_menu_profit_record" href="http://pro.ying158.com/account/trades/profit/records" class="select"><em class="iconfont red"></em>收益记录</a></li>
        <li><a id="member_center_menu_deposit_record" href="http://pro.ying158.com/account/deposit/records"><em class="iconfont red"></em>充值记录</a></li>
        <li><a id="member_center_menu_withdraw_record" href="http://pro.ying158.com/account/withdraw/records"><em class="iconfont red"></em>提款记录</a></li>
        <li><a id="member_center_menu_bbinInfo_record" href="http://pro.ying158.com/account/bbinInfo/records"><em class="iconfont red"></em>体验金记录</a></li>
    </ul>
    <h2>我的账户</h2>
    <ul>
         <li><a id="member_center_menu_deposit" href="/Ying_Second/fontmember/czjl"><em class="iconfont"></em>账户充值</a></li>
        <li><a id="member_center_menu_security" href="/Ying_Second/fontmember/safe"><em class="iconfont"></em>安全信息</a></li>
        <li><a id="member_center_menu_withdraw" href="/Ying_Second/fontmember/woyaotikuan"><em class="iconfont"></em>我要提款</a></li>
    </ul>
</div>
<script>
  var menu_item="member_center_menu_profit_record";
 $("#"+menu_item).addClass("select");
</script>

          <div class="admin-right">
        	<div class="tbConBox">
                <div class="tab">
                    <a class="select" href="javascript:;">网银充值</a>
                    <a href="javascript:;" id="hisTabLink">充值记录</a>
                </div>
                <div id="conBox">
                    <div class="box" style="display:block">
                    	<div class="picTab">
                    		<a class="select" href="javascript:">
                            	<img height="42px" src="/Ying_Second/img/fuiou.png">
                                <p>通过富友支付平台进行网银充值</p>
                            </a>
                        </div>
                        <div class="formBox">
                        	<div class="czbox">
                        		<form id="depositForm" action="http://pro.ying158.com/account/deposit/gopay" method="POST" target="_blank">
									<div>充值银行卡：<strong>农业银行-${memberBank.card_no }</strong></div><br>
	                        		<div>充值金额：<input class="tytxt" id="fee" name="fee" type="text"></div>
	                        		<button class="tybutton" id="btn_go_pay" type="button">前往充值</button>
	                        	</form>
                        	</div>
                        </div>
                        <div class="txtCon">
                            <p style="display: block;">上海富友金融网络技术有限公司自2008年创立至今，已发展成为一家大型综合性金融支付服务集团公司——注册资本2.0007亿元，实收资本3.8亿元，下设6家全资子公司，同时拥有6张支付及金融服务牌照，并在全国设立了35家分公司。富友以“打造便利金融生活”为愿景，以“专业——分享——价值”为理念，以“专业创新，差异化经营”为手段，立志成为网络金融和网络生活服务的领先者——用便利金融，让生活更美好。 2011年获得中国人民银行颁发的银行卡收单和互联网支付牌照，同时获得人民银行颁发的预付卡发行与受理牌照。2013年富友金融获得中国银联“收单外包机构注册认证”，在全国范围建立银行卡收单服务网络。2014年成为“上海市网络信贷服务业企业联盟”成员单位，在目前国家已颁布牌照的269家第三方支付公司中，获此殊荣的仅有4家公司</p>
                        </div> 
                    </div>
                    <div class="box">

<meta name="keywords" content="盈+，盈，社区金融，O2O社区金融，社区金融O2O，O2O，互联网+社区金融，O2O连锁，社区门店，首家社区金融，社区金融服务，综合金融，互联网金融，体验中心，普惠金融，金融创新，社区化，普惠化，全渠道化，互联网线上平台，O2O交易，全国首家，盈十，金融衍生品，固收类理财，私募基金，股权基金，股指期货，玩转股指，商品期货，国际期货，外盘，A50，沪深300，中证500，上证50">
<meta name="description" content="盈+——全国首家互联网金融交流体验中心，与您共盈，给财富做加法。">
<link href="http://pro.ying158.com/resources/web/images/icon.ico" type="image/x-icon" rel="shortcut icon">

<div class="ajaxContainer">
	<table class="tzlist" width="100%" border="1" bordercolor="#e9e9e9" cellspacing="0" cellpadding="0">
		<tbody><tr>
			<th width="30%">订单号</th>
			<th width="20%">金额</th>
			<th width="20%">状态</th>
			<th width="30%">时间</th>
		</tr>
			<tr>
				<td>201709211113471626</td>
				<td><font color="#ff503f">￥100.00</font></td>
				<td>充值失败</td>
				<td>2017-09-21 11:13</td>
			</tr>
	</tbody></table>
	
	
	<div class="llpage">
		<div class="in">
			
				<a class="prev_page">上页</a>
			
			
					<a class="now">1</a>
			
			
				<a class="next_page" rel="next">下页</a>
		</div>
	</div>
</div>
<script type="text/javascript">
	function getJsonInfo(url) {
		$.get(url, 'json', function(data) {
			$(".ajaxContainer").empty();
			$(".ajaxContainer").append(data);
		});
	}
</script>                    </div>
                </div>
            </div>
        </div>
        </div>

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
        hm.src = "//hm.baidu.com/hm.js?06cf97732baac1a65bed8ae95f2384aa";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
    })();
</script>
</body>
</html>