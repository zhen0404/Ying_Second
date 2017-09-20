<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta name="renderer" content="webkit">
<meta name="viewport"
	content="width=device-width,maximum-scale=1.0,user-scalable=yes">
<meta name="Keywords"
	content="盈+，盈，社区金融，O2O社区金融，社区金融O2O，O2O，互联网+社区金融，O2O连锁，社区门店，首家社区金融，社区金融服务，综合金融，互联网金融，体验中心，普惠金融，金融创新，社区化，普惠化，全渠道化，互联网线上平台，O2O交易，全国首家，盈十，金融衍生品，固收类理财，私募基金，股权基金，股指期货，玩转股指，商品期货，国际期货，外盘，A50，沪深300，中证500，上证50">
<meta name="description" content="盈+——全国首家互联网金融交流体验中心，与您共盈，给财富做加法。">
<title>产品中心</title>
<link href="http://www.ying158.com/Content/images/jw/icon.ico"
	type="image/x-icon" rel="shortcut icon">

<link rel="stylesheet" href="/Ying_Second/css/iconfont.css" />
<link rel="stylesheet" href="/Ying_Second/css/common.css" />
<link rel="stylesheet" href="/Ying_Second/css/jw2.css" />

<script type="text/javascript" src="/Ying_Second/js/hm.js" ></script>
<script type="text/javascript" src="/Ying_Second/js/jquery.js" ></script>
<script type="text/javascript" src="/Ying_Second/js/layer.js" ></script>
<link rel="stylesheet" href="/Ying_Second/css/layer.css" />
<script type="text/javascript" src="/Ying_Second/js/echarts.js" ></script>
<script type="text/javascript" src="/Ying_Second/js/pie.js" ></script>


<style type="text/css">
.hzhb_box {
	float: left;
	width: 610px;
	margin-top: 32px;
}

.hzhb_item {
	float: left;
	margin: 5px;
	border: solid 1px #aaa;
	border-radius: 3px;
}

.hzhb_item img {
	width: 120px;
	height: 40px;
}

.ft_item {
	float: left;
	width: 239px;
}

.ft_item_tit {
	height: 28px;
	line-height: 28px;
	font-size: 20px;
	color: #ccc;
	padding-left: 40px;
}

.ft_links_list {
	margin-top: 10px;
}

.ft_links_list .ft_link {
	height: 30px;
	line-height: 30px;
}

.ft_item_sns {
	float: right;
	width: 340px;
}

.ft_sns_list {
	margin-left: 40px;
}

.ft_sns_list li {
	float: left;
	width: 74px;
	margin: 5px;
}

.ft_sns_list a {
	display: block;
	width: 74px;
}

.ft_sns_list .txt {
	display: block;
	line-height: 32px;
	text-align: center;
	color: #ccc;
}

.ft_sns_list .ico_sns {
	display: block;
	width: 62px;
	height: 62px;
	margin: 0 auto;
	background: url() no-repeat;
}

.ft_sns_list .ico_weixin {
	background-position: 0 0;
}

.ft_sns_list .ico_sinawb {
	background-position: -63px 0;
}

.ft_sns_list .ico_txwb {
	background-position: -126px 0;
}

.ft_sns_list a:hover .ico_sinawb {
	background-position: -63px -63px;
}

.ft_sns_list a:hover .ico_txwb {
	background-position: -126px -63px;
}

.ft_sns_list a:hover .txt {
	color: #3D9FE1
}

.ft_sns_list .wx_tips {
	cursor: pointer;
	position: relative;
}

.ft_sns_list .wx_tips .tips_hd {
	
}

.ft_sns_list .wx_tips .tips_bd {
	display: none;
	position: absolute;
	left: 90px;
	top: -10px;
}

.ft_sns_list .wx_tips .tips_bd .arrow {
	width: 0;
	height: 0;
	overflow: hidden;
	border-color: transparent #fff transparent transparent;
	border-width: 8px 8px 8px 8px;
	border-style: dashed solid dashed none;
	position: absolute;
	top: : -8px;
}

.ft_sns_list .wx_tips .tips_bd img {
	width: 180px;
	height: 180px;
}

.ft_sns_list .wx_tips .tips_bd .txt {
	font-size: 14px;
	line-height: 32px;
	color: #3D9FE1;
}

.ft_sns_list .wx_tips:hover .ico_weixin {
	background-position: 0 -63px;
}

.ft_sns_list .wx_tips:hover .txt {
	color: #3D9FE1;
}

.ft_sns_list .wx_tips:hover .tips_bd {
	display: block;
}
</style>

<style>
* {
	margin: 0;
	padding: 0;
	list-style: none;
}

img {
	border: 0;
}

.rides-cs {
	font-size: 12px;
	background: #29a7e2;
	position: fixed;
	top: 250px;
	right: 0px;
	_position: absolute;
	z-index: 1500;
	border-radius: 6px 0px 0 6px;
}

.rides-cs a {
	color: #00A0E9;
}

.rides-cs a:hover {
	color: #ff8100;
	text-decoration: none;
}

.rides-cs .floatL {
	width: 36px;
	float: left;
	position: relative;
	z-index: 1;
	margin-top: 21px;
	height: 181px;
}

.rides-cs .floatL a {
	font-size: 0;
	text-indent: -999em;
	display: block;
}

.rides-cs .floatR {
	width: 130px;
	float: left;
	padding: 5px;
	overflow: hidden;
}

.rides-cs .floatR .cn {
	background: #F7F7F7;
	border-radius: 6px;
	margin-top: 4px;
}

.rides-cs .cn .titZx {
	font-size: 14px;
	color: #333;
	font-weight: 600;
	line-height: 24px;
	padding: 5px;
	text-align: center;
}

.rides-cs .cn ul {
	padding: 0px;
}

.rides-cs .cn ul li {
	line-height: 38px;
	height: 38px;
	border-bottom: solid 1px #E6E4E4;
	overflow: hidden;
	text-align: center;
}

.rides-cs .cn ul li span {
	color: #333;
}

.rides-cs .cn ul li a {
	color: #777;
}

.rides-cs .cn ul li img {
	vertical-align: middle;
}

.rides-cs .btnOpen, .rides-cs .btnCtn {
	position: relative;
	z-index: 9;
	top: 25px;
	left: 0;
	background-image: url(/Content/images/jw/qqkefu.png);
	background-repeat: no-repeat;
	display: block;
	height: 146px;
	padding: 8px;
}

.rides-cs .btnOpen {
	background-position: 0 0;
}

.rides-cs .btnCtn {
	background-position: -37px 0;
}

.rides-cs ul li.top {
	border-bottom: solid #ACE5F9 1px;
}

.rides-cs ul li.bot {
	border-bottom: none;
}

.topNav {
	padding: 0;
	margin: 0;
}

li {
	margin: 0;
	padding: 8px 0;
}

li.active {
	/*background: #323030;*/
	background: none;
}

li.active a {
	color: white;
}
</style>

</head>
<body>
<!-- 顶部iframe -->
	 <div style="width: 1002px; height: 94px; margin: 0 auto;">
		<iframe src="/Ying_Second/top" scrolling="nox`" width="1002"
			height="94" frameborder="0"></iframe>
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
	<!-- -----------------------------------------分割线---------------------------------- -->
	<!-- -----------------------------------------分割线---------------------------------- -->
	<!-- -----------------------------------------分割线---------------------------------- -->
	<!-- -----------------------------------------分割线---------------------------------- -->

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

</script>    <div class="sdbanner probanner"></div>
    <div class="proMain">
    	<div class="hwpzNav">
    		<ul>
    			<li class="first"><a class="active" href="http://pro.ying158.com/subject">固收类理财</a></li>
    			<li class="second"><a href="http://pro.ying158.com/finance">私募基金</a></li>
    			<li class="three"><a href="http://pro.ying158.com/oversea">海外配置</a></li>
    			<li class="four"><a href="http://pro.ying158.com/finance">股权基金</a></li>
    		</ul>
    	</div>
        <div class="sdShaix">
        	<ul>
            	<li class="first">标的类型：</li>
               		<li><a href="/Ying_Second/frontSubject/showsubject" id="11" class="select">全部</a></li>
               		<c:if test="">
               		<li><a href="/Ying_Second/frontSubject/queryType?type=0&num=1" id="12">固收类理财</a></li>
               		</c:if>
               		<li><a href="/Ying_Second/frontSubject/queryType?type=1&num=2" id="13">车盈宝</a></li>
            </ul>
        	<ul>
            	<li class="first">年化收益：</li>
               		<li><a href="/Ying_Second/frontSubject/showsubject" id="21" class="select">全部</a></li>
               		<li><a href="/Ying_Second/frontSubject/queryYear_rate?year_rate=6" id="22">6.0%</a></li>
               		<li><a href="/Ying_Second/frontSubject/queryYear_rate?year_rate=7" id="23">7.0%</a></li>
               		<li><a href="/Ying_Second/frontSubject/queryYear_rate?year_rate=8" id="24">8.0%</a></li>
               		<li><a href="/Ying_Second/frontSubject/queryYear_rate?year_rate=9" id="25">9.0%</a></li>
               		<li><a href="/Ying_Second/frontSubject/queryYear_rate?year_rate=10" id="25">10%以上</a></li>
            </ul>
        	<ul>
            	<li class="first">项目期限：</li>
               		<li><a href="Ying_Second/frontSubject/showsubject" id="31" class="select">全部</a></li>
               		<li><a href="/Ying_Second/frontSubject/queryDays?days=1" id="32">15天以下</a></li>
               		<li><a href="/Ying_Second/frontSubject/queryDays?days=2" id="33">15-30天</a></li>
               		<li><a href="/Ying_Second/frontSubject/queryDays?days=3" id="34">30-180天</a></li>
               		<li><a href="/Ying_Second/frontSubject/queryDays?days=4" id="35">180-365天</a></li>
               		<li><a href="/Ying_Second/frontSubject/queryDays?days=5" id="36">一年以上</a></li>
            </ul>
        	<ul>
            	<li class="first">标的状态：</li>
               		<li><a href="/Ying_Second/frontSubject/showsubject" class="select">全部</a></li>
               		<li><a href="/Ying_Second/frontSubject/queryStatus?status=0" id="42">投标中</a></li>
               		<li><a href="/Ying_Second/frontSubject/queryStatus?status=1" id="43">还款中</a></li>
               		<li><a href="/Ying_Second/frontSubject/queryStatus?status=2" id="44">已完成</a></li>
            </ul>
        </div>

<meta name="keywords" content="盈+，盈，社区金融，O2O社区金融，社区金融O2O，O2O，互联网+社区金融，O2O连锁，社区门店，首家社区金融，社区金融服务，综合金融，互联网金融，体验中心，普惠金融，金融创新，社区化，普惠化，全渠道化，互联网线上平台，O2O交易，全国首家，盈十，金融衍生品，固收类理财，私募基金，股权基金，股指期货，玩转股指，商品期货，国际期货，外盘，A50，沪深300，中证500，上证50">
<meta name="description" content="盈+——全国首家互联网金融交流体验中心，与您共盈，给财富做加法。">
<link href="http://pro.ying158.com/resources/web/images/icon.ico" type="image/x-icon" rel="shortcut icon">

<div class="ajaxContainer">
	<!-- 异步内容开始 -->
					<c:forEach items="${list}" var="s">
					<ul class="tbList">
						<li class="first">
							<span class="ico zq"></span>
							<h2><em>投</em>${s.name }</h2>
							<i></i>
						</li>
						<li class="second">					
							<div class="txt1">
								<h2>${s.year_rate }<span style="font-size:18px;">+1.0%</span></h2>
								<p>年化收益</p>
							</div>
							<div class="txt2">
								<h2>￥${s.floor_amount }</h2>
								<p>起购金额(元)</p>
							</div>
							<div class="txt2">
								<h2>${s.period }天</h2>
								<p>投资期限</p>
							</div>
						</li>
						<li class="three">
							<a href="#1">企业担保</a><span>中国人保财险承保</span>
							<p>计息日期：当天投资，立即计息<br>已购人数：${s.bought }人</p>
						</li>
						<li class="four">
						</li>
						<li class="five">
							<a class="abtn" href="/yingJiaProfit/product/toBuy?id=${s.id }">购买</a>
						</li>
					</ul>
				</c:forEach>
	<!-- 异步内容结束 -->
	
	
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
		require.config({
            paths: {
                echarts: '/resources/web/echart/dist/'
            }
        });
		require(
			[
				'echarts',
				'echarts/chart/pie'
			],
			function (ec) {
				var labelTop = {
						normal : {
							color:'#ff503f',
							label : {
								show : false,
								position : 'center',
								formatter : '{b}',
								textStyle: {
									baseline : 'bottom'
								}
							},
							labelLine : {
								show : false
							}
						}
					};
				var labelFromatter = {
					normal : {
						label : {
							formatter : function (params){
								return 100 - params.value + '%'
							},
							textStyle: {
								color:'#666',
								baseline : 'middle'
							}
						}
					},
				};
				var labelBottom = {
					normal : {
						color: '#f8f8f8',
						label : {
							show : true,
							position : 'center'
						},
						labelLine : {
							show : false
						}
					}
				};
				var radius = [30,35];
				var myChart1 =document.getElementsByClassName('yuan');
				for(i=0;i<myChart1.length;i++){
					var num = myChart1[i].getAttribute('data-num');
					ec.init(myChart1[i]).setOption({
						series : [
							{
								type : 'pie',
								center : ['50%', '50%'],
								radius : radius,
								x: '0%', // for funnel
								itemStyle : labelFromatter,
								data : [
									{name:'other', value:100-num, itemStyle : labelBottom},
									{name:'占比', value:num,itemStyle : labelTop}
								]
							},
						]
					});
				}
			}
		);
    </script>    </div>
   

	<!-- -----------------------------------------分割线---------------------------------- -->
	<!-- -----------------------------------------分割线---------------------------------- -->
	<!-- -----------------------------------------分割线---------------------------------- -->
	<!-- -----------------------------------------分割线---------------------------------- -->

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
	</div>



	<div class="foot">
		<div class="container">
			<div class="row">
				<div class="hzhb_box">
					<div class="title"
						style="padding-left: 10px; font-weight: normal; font-size: 20px; color: #ccc;">
						主要合作机构</div>
					<div class="hzhb_item">
						<a target="_blank" href="http://www.picc.com/"><img
							onmouseout="this.src = '/Ying_Second/img/1.jpg'"
							src="/Ying_Second/img/1.jpg"></a>
					</div>
					<div class="hzhb_item">
						<a target="_blank" href="http://www.fuioupay.com/"><img
							onmouseout="    this.src = '/Ying_Second/img/2.jpg'"
							src="/Ying_Second/img/2.jpg"></a>
					</div>
					<div class="hzhb_item">
						<a target="_blank" href="http://www.nanhua.net/"><img
							onmouseout="    this.src = 'Ying_Second/img/3.jpg'"
							src="/Ying_Second/img/3.jpg"></a>
					</div>
					<div class="hzhb_item">
						<a target="_blank"
							href="http://www.zttrust.com.cn/stations/526623d20a/index.php/5268e6b50a"><img
							onmouseout="    this.src = '/Ying_Second/img/4.jpg'"
							src="/Ying_Second/img/4.jpg"></a>
					</div>
					<div class="hzhb_item">
						<a target="_blank"
							href="http://sc.hkex.com.hk/TuniS/www.hkex.com.hk/eng/index.htm/"><img
							onmouseout="    this.src = '/Ying_Second/img/5.jpg'"
							src="/Ying_Second/img/5.jpg"></a>
					</div>
					<div class="hzhb_item">
						<a target="_blank" href="http://www.cmegroup.com/cn-s/"><img
							onmouseout="    this.src = '/Ying_Second/img/6.jpg'"
							src="/Ying_Second/img/6.jpg"></a>
					</div>
					<div class="hzhb_item">
						<a target="_blank"
							href="http://www.sgx.com/wps/portal/sgxweb_ch/home/%21ut/p/a1/04_Sj9CPykssy0xPLMnMz0vMAfGjzOKNHB1NPAycDSz9wwzMDTxD_Z2Cg8PCDANdjYEKIoEKDHAARwNC-sP1o8BK8JhQkBthkO6oqAgAzDYPQQ%21%21/dl5/d5/L2dBISEvZ0FBIS9nQSEh/"><img
							onmouseout="    this.src = '/Ying_Second/img/7.jpg'"
							src="/Ying_Second/img/7.jpg"></a>
					</div>
					<div class="hzhb_item">
						<a target="_blank" href="http://www.neeq.com.cn/index/"><img
							onmouseout="    this.src = '/Ying_Second/img/8.jpg'"
							src="/Ying_Second/img/8.jpg"></a>
					</div>
					<div class="hzhb_item">
						<a target="_blank" href="http://www.cmbchina.com/"><img
							onmouseout="    this.src = '/Ying_Second/img/9.jpg'"
							src="/Ying_Second/img/9.jpg"></a>
					</div>
					<div class="hzhb_item">
						<a target="_blank"
							href="http://www.bankcomm.com/BankCommSite/default.shtml"><img
							onmouseout="this.src = '/Ying_Second/img/10.jpg'"
							src="/Ying_Second/img/10.jpg"></a>
					</div>

					<div class="hzhb_item">
						<a target="_blank" href="http://www.ccb.com/cn/home/index.html"><img
							onmouseout="    this.src = '/Ying_Second/img/11.jpg'"
							src="/Ying_Second/img/11.jpg"></a>
					</div>
					<div class="hzhb_item">
						<a target="_blank" href="http://www.icbc.com.cn/icbc/"><img
							onmouseout="    this.src = '/Ying_Second/img/12.jpg'"
							src="/Ying_Second/img/12.jpg"></a>
					</div>
				</div>

				<div class="ft_item ft_item_sns">
					<div class="ft_item_tit">关注我们</div>
					<ul style="margin-bottom: 0px;" class="ft_sns_list clearfix">
						<li>
							<div class="wx_tips j_tips">
								<div class="tips_hd">
									<em class="ico_sns ico_weixin"></em> <span class="txt">微信公众号</span>
								</div>
								<div class="tips_bd">
									<em class="arrow"></em> <img src="/Ying_Second/img/yj.jpg"
										alt="微信公共平台">
								</div>
							</div>
						</li>
						<li><a href="" target="_blank" rel="nofollow"> <em
								class="ico_sns ico_sinawb"></em> <span class="txt">新浪微博</span>
						</a></li>
						<li><a href="" target="_blank" rel="nofollow"> <em
								class="ico_sns ico_txwb"></em> <span class="txt">腾讯微博</span>
						</a></li>
					</ul>

					<div class="contactUs">
						<div class="title"
							style="padding-left: 10px; font-weight: normal; font-size: 20px; color: #ccc;">
							联系我们</div>
						<div class="contactInfo" style="padding-left: 30px;">
							<a
								style="display: inline-block; height: 50px; width: 50px; text-align: center;"
								target="_blank"
								href="http://wpa.qq.com/msgrd?v=3&amp;uin=508886246&amp;site=qq&amp;menu=yes"><img
								src="/Ying_Second/img/qqIcon.png"
								onmouseover="$(this).css('height', '52px');"
								onmouseout="    $(this).css('height', '48px');"></a> <span
								class="kefu">在线客服</span><span class="time">08:30 - 21:00</span>
						</div>
					</div>

				</div>

			</div>
		</div>
	</div>
	<div class="foot3">
		<div class="container">
			<div class="row">
				Copyright © 2010 - 2015 www.ying158.com All Rights Reserverd
				杭州吉威投资管理有限公司 版权所有<br> 浙ICP备14030807号-3 杭州市江干区钱江新城迪凯银座19F
				4000-999-158
			</div>
		</div>
	</div>
	<div class="modal fade loginModal infoModal" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content" style="width: 400px;">
				<div class="modal-header">
					<span>用户登录</span>
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">×</span><span class="sr-only">Close</span>
					</button>
				</div>
				<div class="modal-body text-center">
					<div class="content" style="padding: 20px 40px;">
						<input class="form-control" placeholder="用户名/手机/邮箱" id="modalUser"
							type="text"><br> <input class="form-control"
							placeholder="密码" id="modalPw" type="password">
					</div>
					<div>
						<button class="btn btn-primary" onclick="loginFromModal()"
							style="padding-left: 20px; padding-right: 20px;">登录</button>
						<a class="btn btn-info"
							href="http://www.ying158.com/Account/Regist" target="blank"
							style="padding-left: 20px; padding-right: 20px; margin-left: 20px;">注册</a>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="modal fade loginInfo infoModal" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content" style="width: 400px;">
				<div class="modal-header">
					<span>错误信息</span>
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">×</span><span class="sr-only">Close</span>
					</button>
				</div>
				<div class="modal-body text-center">
					<div class="content" id="loginFail"></div>
					<button class="btn btn-primary confirmBtn" data-dismiss="modal">确认</button>
				</div>
			</div>
		</div>
	</div>

	<div class="modal fade infoModal" id="infosModal" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content" style="border-radius: 0px; width: 400px;">
				<div class="modal-header">
					<span>通知</span>
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">×</span><span class="sr-only">Close</span>
					</button>
				</div>
				<div class="modal-body">
					<div id="infosModalError"></div>
					<button class="btn btn-success confirmBtn" data-dismiss="modal">确认</button>
				</div>
			</div>
		</div>
	</div>
	<div class="modal fade infoModal" id="infosSuccessModal" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content" style="border-radius: 0px; width: 400px;">
				<div class="modal-header">
					<span>通知</span>
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">×</span><span class="sr-only">Close</span>
					</button>
				</div>
				<div class="modal-body">
					<div id="infosSuccessModalError"></div>
					<button class="btn btn-success confirmBtn" data-dismiss="modal">确认</button>
				</div>
			</div>
		</div>
	</div>

	<div id="feedbackModal" class="modal fade infoModal">
		<div data-bind="" class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-header">
					<span>填写反馈</span>
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">×</span><span class="sr-only"></span>
					</button>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="feedbackForm">
						<div class="form-group">
							<div class="col-sm-12">


								<select name="MsgType" class="form-control" id="MsgType"
									data-val-required="留言类型 字段是必需的。" data-val="true">
									<option selected="selected" value="0">请选择反馈类型</option>
									<option value="1">终止实盘结算申请</option>
									<option value="6">追加保证金</option>
									<option value="7">交易问题</option>
									<option value="3">功能使用问题</option>
									<option value="4">大额预约</option>
									<option value="50">其他问题</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-12">
								<input class="form-control" id="contact" placeholder="请输入手机号或邮箱"
									type="text">
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-12">
								<textarea class="form-control" id="content"
									placeholder="请填写你的用户名、实盘帐号并说明是结算申请还是追加保证金！"></textarea>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-success" id="submitFeedback"
						onclick="submitFeedback();">提交</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript">
		function submitFeedback() {
			var type = $('#feedbackForm #MsgType').val();
			var contact = $('#feedbackForm #contact').val();
			var content = $('#feedbackForm #content').val();
			$('#submitFeedback').attr('disabled', true);
			$.post('/api/feedback/create', {
				msgType : type,
				contact : contact,
				content : content
			}).done(function(res) {
				if (res.isSuccess) {
					alert('感谢您的反馈，我们会尽快给您做出答复！');
					$('#feedbackModal').modal('hide');
					$('#feedbackForm #contact').val('');
					$('#feedbackForm #content').val('');
				} else {
					alert(res.errorMessage);
				}
			}).always(function() {
				$('#submitFeedback').attr('disabled', false);
			});
		}
	</script>

	<div id="bannedStockModal" class="modal fade infoModal">
		<div data-bind="" class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header">
					<span>今日限制购买的股票</span>
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">×</span><span class="sr-only"></span>
					</button>
				</div>
				<div class="modal-body">
					<div class="row">
						<span>今日暂时没有限购的股票</span>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary btn-straight"
						data-dismiss="modal" style="margin-top: initial;">确认</button>
				</div>
			</div>
		</div>
	</div>


	<script type="text/javascript">
		function showBannedStocks() {
			$('#bannedStockModal').modal('show');
		}
	</script>


	<script>
		$("#aFloatTools_Show").click(function() {
			$('#divFloatToolsView').animate({
				width : 'show',
				opacity : 'show'
			}, 100, function() {
				$('#divFloatToolsView').show();
			});
			$('#aFloatTools_Show').hide();
			$('#aFloatTools_Hide').show();
		});
		$("#aFloatTools_Hide").click(function() {
			$('#divFloatToolsView').animate({
				width : 'hide',
				opacity : 'hide'
			}, 100, function() {
				$('#divFloatToolsView').hide();
			});
			$('#aFloatTools_Show').show();
			$('#aFloatTools_Hide').hide();
		});
		$('*[data-toggle="tooltip"]').tooltip();
		$(document).ready(
				function() {
					var href = window.location.href.toLowerCase();

					if (href.indexOf("/account/") >= 0) {
						$(".topNav li:eq(7)").addClass("active");

					} else if (href.indexOf("/home/help") >= 0) {

						$(".topNav li:eq(5)").addClass("active");

					} else if (href.indexOf("/home/kcenter") >= 0) {

						$(".topNav li:eq(1)").addClass("active");

					} else if (href.indexOf("/home/newscenter") >= 0
							|| href.indexOf("/news/") >= 0) {

						$(".topNav li:eq(3)").addClass("active");

					} else if (href.indexOf("/home/rule") >= 0) {

						$(".topNav li:eq(3)").addClass("active");

					} else if (href.indexOf("/tradingsoftware") >= 0) {

						$(".topNav li:eq(6)").addClass("active");

					} else if (href.indexOf("/gzpeizi") >= 0) {

						$(".topNav li:eq(2)").addClass("active");

					} else if (href.indexOf("jiameng") >= 0) {

						$(".topNav li:eq(4)").addClass("active");

					} else {

						$(".topNav li:eq(0)").addClass("active");
					}

				});

		var kefu = function(num) {
			var url = "";
			switch (num) {
			case 1:
				url = "tencent://message/?uin=3044901756&Menu=yes";
				break;
			case 2:
				url = "tencent://message/?uin=773031422&Menu=yes";
				break;
			default:
				url = "tencent://message/?uin=2093717869&Menu=yes";
			}
			window
					.open(
							url,
							'在线客服',
							'height=405,width=500,top=200,left=200,toolbar=no,menubar=no,scrollbars=yes, resizable=no,location=no, status=no');
		}

		var loginFromModal = function() {
			var un = $("#modalUser").val();
			var pw = $("#modalPw").val();
			if (un == "" || un == undefined) {
				$("#loginFail").html("请输入用户名");
				$(".loginInfo").modal();
				return;
			}
			if (pw == "" || pw == undefined) {
				$("#loginFail").html("请输入登录密码");
				$(".loginInfo").modal();
				return;
			}
			$.post("/api/authentication/signIn", {
				login : un,
				password : pw
			}, function(data) {
				if (data.isAuthenticated) {
					window.location.reload();
				} else {
					$("#loginFail").html("用户名或密码有误");
					$(".loginInfo").modal();
				}
			});

		}

		var gotoTop = function() {
			$("html,body").animate({
				scrollTop : 0
			}, 1000);
		}
	</script>

	<script type="text/javascript">
		var _hmt = _hmt || [];
		(function() {
			var hm = document.createElement("script");
			hm.src = "//hm.baidu.com/hm.js?bb6cf2322300378a89a69641641427c0";
			var s = document.getElementsByTagName("script")[0];
			s.parentNode.insertBefore(hm, s);
		})();
	</script>

</body>
</html>