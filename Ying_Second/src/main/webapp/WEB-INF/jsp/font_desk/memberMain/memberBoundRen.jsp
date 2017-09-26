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
        <li><a id="member_center_menu_invests" href="/Ying_Second/memberCenter/list"><em class="iconfont red"></em>投资记录</a></li>
        <li><a id="member_center_menu_profit_record" href="/Ying_Second/myadd"><em class="iconfont red"></em>收益记录</a></li>
        <li><a id="member_center_menu_deposit_record" href="/Ying_Second/memberCenter/cz"><em class="iconfont red"></em>充值记录</a></li>
        <li><a id="member_center_menu_withdraw_record" href="/Ying_Second/memberCenter/tiKuan"><em class="iconfont red"></em>提款记录</a></li>
        <li><a id="member_center_menu_bbinInfo_record" href="/Ying_Second/memberCenter/tiyanj"><em class="iconfont red"></em>体验金记录</a></li>
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
                    <a class="select" href="javascript:;">银行卡管理</a>
                </div>
                <div id="conBox">
                    <div class="box" style="display:block">
                        <div class="myBankCards clearfix">
                                <div class="card" id="bankcard_392">
                                    <div class="banklogo"><img src="/Ying_Second/img/NYYH.jpg"></div>
                                    <div class="cardno"><strong>6228480759744638173</strong></div>
                                    <div class="cardno"><strong>湖北省-襄樊市-襄城区-襄阳市农业银行</strong></div>

                                </div>
                                <div style="clear: both;">
                                    <strong>
					                                    您可以通过盈+理财APP申请更换安全银行卡，盈+理财会为您进行信息核对，换卡申请通过后，原银行卡自动失效，您可以绑定一张新的银行卡。<br>
					                                    换卡需要您提供如下资料：<br> </strong>
                                    1）手持身份证照片：手持身份证正面与本人头部合影，同时需确保本人头部与身份证无遮挡；<br>
                                    2）原卡注销证明：需前往对应银行开具盖有银行公章的旧银行卡注销或挂失证明。<br><br>
									发送至邮箱 vip@hzgeway.com 或 vip@ying158.com <br>
									联系400-999-158电话<br>
                                   
                                </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="modal fade errorInfo infoModal" id="withdrawErrorModal" role="dialog">
        <div class="modal-dialog">
            <div class="modal-content jddModalContnt" style="border-radius: 0px;width:400px;">
                <div class="modal-header">
                    <span>通知</span>
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                </div>
                <div class="modal-body">
                    <div id="withdrawError"></div>
                    <button class="btn btn-success confirmBtn" data-dismiss="modal">确认</button>
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