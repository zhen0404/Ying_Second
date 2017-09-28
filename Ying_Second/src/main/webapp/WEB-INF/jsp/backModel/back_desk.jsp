<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<meta charset="utf-8" />

	<title>Metronic | Admin Dashboard Template</title>

	<meta content="width=device-width, initial-scale=1.0" name="viewport" />

	<meta content="" name="description" />

	<meta content="" name="author" />

	<!-- BEGIN GLOBAL MANDATORY STYLES -->

	<link href="/Ying_Second/back_desk/media/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/style-metro.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/style.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/style-responsive.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/default.css" rel="stylesheet" type="text/css" id="style_color"/>

	<link href="/Ying_Second/back_desk/media/css/uniform.default.css" rel="stylesheet" type="text/css"/>

	<!-- END GLOBAL MANDATORY STYLES -->

	<!-- BEGIN PAGE LEVEL STYLES --> 

	<link href="/Ying_Second/back_desk/media/css/jquery.gritter.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/daterangepicker.css" rel="stylesheet" type="text/css" />

	<link href="/Ying_Second/back_desk/media/css/fullcalendar.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/jqvmap.css" rel="stylesheet" type="text/css" /Ying_Second/back_desk/media="screen"/>

	<link href="/Ying_Second/back_desk/media/css/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" /Ying_Second/back_desk/media="screen"/>

	<!-- END PAGE LEVEL STYLES -->

	<link rel="shortcut icon" href="/Ying_Second/back_desk/media/image/favicon.ico" />

</head>

<body class="page-header-fixed">

	<div class="header navbar navbar-inverse navbar-fixed-top">

		<div class="navbar-inner">

			<div class="container-fluid">

				<a class="brand" href="index.html">

				<img src="/Ying_Second/back_desk/media/image/logo.png" alt="logo"/>

				</a>

				<a href="javascript:;" class="btn-navbar collapsed" data-toggle="collapse" data-target=".nav-collapse">

				<img src="/Ying_Second/back_desk/media/image/menu-toggler.png" alt="" />

				</a>          

				<ul class="nav pull-right">

					<li class="dropdown" id="header_notification_bar">

						<a href="#" class="dropdown-toggle" data-toggle="dropdown">

						<i class="icon-warning-sign"></i>

						<span class="badge">6</span>

						</a>

						<ul class="dropdown-menu extended notification">

							<li>

								<p>You have 14 new notifications</p>

							</li>

							<li>

								<a href="#">

								<span class="label label-success"><i class="icon-plus"></i></span>

								New user registered. 

								<span class="time">Just now</span>

								</a>

							</li>

							<li>

								<a href="#">

								<span class="label label-important"><i class="icon-bolt"></i></span>

								Server #12 overloaded. 

								<span class="time">15 mins</span>

								</a>

							</li>

							<li>

								<a href="#">

								<span class="label label-warning"><i class="icon-bell"></i></span>

								Server #2 not respoding.

								<span class="time">22 mins</span>

								</a>

							</li>

							<li>

								<a href="#">

								<span class="label label-info"><i class="icon-bullhorn"></i></span>

								Application error.

								<span class="time">40 mins</span>

								</a>

							</li>

							<li>

								<a href="#">

								<span class="label label-important"><i class="icon-bolt"></i></span>

								Database overloaded 68%. 

								<span class="time">2 hrs</span>

								</a>

							</li>

							<li>

								<a href="#">

								<span class="label label-important"><i class="icon-bolt"></i></span>

								2 user IP blocked.

								<span class="time">5 hrs</span>

								</a>

							</li>

							<li class="external">

								<a href="#">See all notifications <i class="m-icon-swapright"></i></a>

							</li>

						</ul>

					</li>

					<!-- END NOTIFICATION DROPDOWN -->

					<!-- BEGIN INBOX DROPDOWN -->

					<li class="dropdown" id="header_inbox_bar">

						<a href="#" class="dropdown-toggle" data-toggle="dropdown">

						<i class="icon-envelope"></i>

						<span class="badge">5</span>

						</a>

						<ul class="dropdown-menu extended inbox">

							<li>

								<p>You have 12 new messages</p>

							</li>

							<li>

								<a href="inbox.html?a=view">

								<span class="photo"><img src="/Ying_Second/back_desk/media/image/avatar2.jpg" alt="" /></span>

								<span class="subject">

								<span class="from">Lisa Wong</span>

								<span class="time">Just Now</span>

								</span>

								<span class="message">

								Vivamus sed auctor nibh congue nibh. auctor nibh

								auctor nibh...

								</span>  

								</a>

							</li>

							<li>

								<a href="inbox.html?a=view">

								<span class="photo"><img src="/Ying_Second/back_desk/media/image/avatar3.jpg" alt="" /></span>

								<span class="subject">

								<span class="from">Richard Doe</span>

								<span class="time">16 mins</span>

								</span>

								<span class="message">

								Vivamus sed congue nibh auctor nibh congue nibh. auctor nibh

								auctor nibh...

								</span>  

								</a>

							</li>

							<li>

								<a href="inbox.html?a=view">

								<span class="photo"><img src="/Ying_Second/back_desk/media/image/avatar1.jpg" alt="" /></span>

								<span class="subject">

								<span class="from">Bob Nilson</span>

								<span class="time">2 hrs</span>

								</span>

								<span class="message">

								Vivamus sed nibh auctor nibh congue nibh. auctor nibh

								auctor nibh...

								</span>  

								</a>

							</li>

							<li class="external">

								<a href="inbox.html">See all messages <i class="m-icon-swapright"></i></a>

							</li>

						</ul>

					</li>

					<!-- END INBOX DROPDOWN -->

					<!-- BEGIN TODO DROPDOWN -->

					<li class="dropdown" id="header_task_bar">

						<a href="#" class="dropdown-toggle" data-toggle="dropdown">

						<i class="icon-tasks"></i>

						<span class="badge">5</span>

						</a>

						<ul class="dropdown-menu extended tasks">

							<li>

								<p>You have 12 pending tasks</p>

							</li>

							<li>

								<a href="#">

								<span class="task">

								<span class="desc">New release v1.2</span>

								<span class="percent">30%</span>

								</span>

								<span class="progress progress-success ">

								<span style="width: 30%;" class="bar"></span>

								</span>

								</a>

							</li>

							<li>

								<a href="#">

								<span class="task">

								<span class="desc">Application deployment</span>

								<span class="percent">65%</span>

								</span>

								<span class="progress progress-danger progress-striped active">

								<span style="width: 65%;" class="bar"></span>

								</span>

								</a>

							</li>

							<li>

								<a href="#">

								<span class="task">

								<span class="desc">Mobile app release</span>

								<span class="percent">98%</span>

								</span>

								<span class="progress progress-success">

								<span style="width: 98%;" class="bar"></span>

								</span>

								</a>

							</li>

							<li>

								<a href="#">

								<span class="task">

								<span class="desc">Database migration</span>

								<span class="percent">10%</span>

								</span>

								<span class="progress progress-warning progress-striped">

								<span style="width: 10%;" class="bar"></span>

								</span>

								</a>

							</li>

							<li>

								<a href="#">

								<span class="task">

								<span class="desc">Web server upgrade</span>

								<span class="percent">58%</span>

								</span>

								<span class="progress progress-info">

								<span style="width: 58%;" class="bar"></span>

								</span>

								</a>

							</li>

							<li>

								<a href="#">

								<span class="task">

								<span class="desc">Mobile development</span>

								<span class="percent">85%</span>

								</span>

								<span class="progress progress-success">

								<span style="width: 85%;" class="bar"></span>

								</span>

								</a>

							</li>

							<li class="external">

								<a href="#">See all tasks <i class="m-icon-swapright"></i></a>

							</li>

						</ul>

					</li>

					<!-- END TODO DROPDOWN -->

					<!-- BEGIN USER LOGIN DROPDOWN -->

					<li class="dropdown user">

						<a href="#" class="dropdown-toggle" data-toggle="dropdown">

						<img alt="" src="/Ying_Second/back_desk/media/image/avatar1_small.jpg" />

						<span class="username">Bob Nilson</span>

						<i class="icon-angle-down"></i>

						</a>

						<ul class="dropdown-menu">

							<li><a href="extra_profile.html"><i class="icon-user"></i> My Profile</a></li>

							<li><a href="page_calendar.html"><i class="icon-calendar"></i> My Calendar</a></li>

							<li><a href="inbox.html"><i class="icon-envelope"></i> My Inbox(3)</a></li>

							<li><a href="#"><i class="icon-tasks"></i> My Tasks</a></li>

							<li class="divider"></li>

							<li><a href="extra_lock.html"><i class="icon-lock"></i> Lock Screen</a></li>

							<li><a href="/Ying_Second/backLogin"><i class="icon-key"></i> 切换账号</a></li>

						</ul>

					</li>

					<!-- END USER LOGIN DROPDOWN -->

				</ul>

				<!-- END TOP NAVIGATION MENU --> 

			</div>

		</div>

		<!-- END TOP NAVIGATION BAR -->

	</div>

	<!-- END HEADER -->
    <div class="copyrights">Collect from <a href="http://www.cssmoban.com/" >网页模板</a></div>

	<!-- BEGIN CONTAINER -->

	<div class="page-container">

		<!-- BEGIN SIDEBAR -->

		<div class="page-sidebar nav-collapse collapse">

			<!-- BEGIN SIDEBAR MENU -->        

			<ul class="page-sidebar-menu">

				<li>

					<!-- BEGIN SIDEBAR TOGGLER BUTTON -->

					<div class="sidebar-toggler hidden-phone"></div>

					<!-- BEGIN SIDEBAR TOGGLER BUTTON -->

				</li>

				<li>

				</li>

				<li class="start active ">

					<a href="index.html">

					<i class="icon-home"></i> 

					<span class="title">Dashboard</span>

					<span class="selected"></span>

					</a>

				</li>

				<li class="">

					<a href="javascript:;">

					<i class="icon-cogs"></i> 

					<span class="title">理财产品</span>

					<span class="arrow "></span>

					</a>

					<ul class="sub-menu">

						<li >

							<a href="/Ying_Second/subject/list" target="showTable">

							固收类</a>

						</li>

						<li >

							<a href="/Ying_Second/simu/list" target="showTable">

							私募/股权类</a>

						</li>

						<li >

							<a href="/Ying_Second/oversea/overList" target="showTable">

							海外配置</a>

						</li>

					</ul>

				</li>

				<li class="">

					<a href="javascript:;">

					<i class="icon-bookmark-empty"></i> 

					<span class="title">钱包管理</span>

					<span class="arrow "></span>

					</a>

					<ul class="sub-menu">

						<li >

							<a href="/Ying_Second/wallet/list" target="showTable">

							钱包缴费记录</a>

						</li>

					</ul>

				</li>

				<li class="">

					<a href="javascript:;">

					<i class="icon-table"></i> 

					<span class="title">学院管理</span>

					<span class="arrow "></span>

					</a>

					<ul class="sub-menu">

						<li >

							<a href="/Ying_Second/"> 

							资讯分类</a>

						</li>

						<li >

							<a href="/Ying_Second/">

							资讯管理</a>

						</li>

					</ul>

				</li>

				<li class="">

					<a href="javascript:;">

					<i class="icon-briefcase"></i> 

					<span class="title">会员管理</span>

					<span class="arrow "></span>

					</a>

					<ul class="sub-menu">

						<li >

							<a href="page_timeline.html">

							<i class="icon-time"></i>

							账号管理</a>

						</li>

						<li >

							<a href="page_coming_soon.html">

							<i class="icon-cogs"></i>

							理财师审核</a>

						</li>

						<li >

							<a href="page_blog.html">

							<i class="icon-comments"></i>

							绑卡管理</a>

						</li>

						<li >

							<a href="page_blog_item.html">

							<i class="icon-font"></i>

							付息计划</a>

						</li>

						<li >

							<a href="page_news.html">

							<i class="icon-coffee"></i>

							充值管理</a>

						</li>

						<li >

							<a href="page_news_item.html">

							<i class="icon-bell"></i>

							体现管理</a>

						</li>

						<li >

							<a href="page_about.html">

							<i class="icon-group"></i>

							 邀请奖励</a>

						</li>

					</ul>

				</li>

				<li class="">

					<a href="javascript:;">

					<i class="icon-gift"></i> 

					<span class="title">盈+统计</span>

					<span class="arrow "></span>

					</a>

					<ul class="sub-menu">

						<li >

							<a href="Ying_Second/GongGao">

							财务统计</a>

						</li>

						<li >

							<a href="extra_lock.html">

							用户综合统计</a>

						</li>

					</ul>

				</li>

				<li>

					<a class="active" href="javascript:;">

					<i class="icon-sitemap"></i> 

					<span class="title">盈+设计</span>

					<span class="arrow "></span>

					</a>

					<ul class="sub-menu">

						<li>

							<a href="javascript:;">

							公告管理

							<span class="arrow"></span>

							</a>
						</li>
						
						<li>

							<a href="javascript:;">

							意见反馈

							<span class="arrow"></span>

							</a>
						</li>


					</ul>

				</li>

				<li>

					<a href="javascript:;">

					<i class="icon-folder-open"></i> 

					<span class="title">系统设置</span>

					<span class="arrow "></span>

					</a>

					<ul class="sub-menu">
						<li>
							<a href="/Ying_Second/usersManager/listMember"  target="showTable">
							<i class="icon-cogs"></i>
							用户管理
							</a>
						</li>
						
						<li>
							<a href="/Ying_Second/role/listRole" target="showTable">
							<i class="icon-folder-open"></i>
							权限设置
							</a>
						</li>
						<li>
							<a href="/Ying_Second/password/show" target="showTable">
							<i class="icon-globe"></i> 
							密码设置
							</a>
						</li>
					</ul>
				</li>
			</ul>
		</div>

		<div class="page-content">

			<div id="portlet-config" class="modal hide">

				<div class="modal-header">

					<button data-dismiss="modal" class="close" type="button"></button>

					<h3>Widget Settings</h3>

				</div>

				<div class="modal-body">

					Widget settings form goes here

				</div>

			</div>

			<!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->

			<!-- BEGIN PAGE CONTAINER-->

			<div class="container-fluid">

				<!-- BEGIN PAGE HEADER-->

				<div class="row-fluid">

					<div class="span12">

						<!-- BEGIN STYLE CUSTOMIZER -->

						<div class="color-panel hidden-phone">

							<div class="color-mode-icons icon-color"></div>

							<div class="color-mode-icons icon-color-close"></div>

							<div class="color-mode">

								<p>THEME COLOR</p>

								<ul class="inline">

									<li class="color-black current color-default" data-style="default"></li>

									<li class="color-blue" data-style="blue"></li>

									<li class="color-brown" data-style="brown"></li>

									<li class="color-purple" data-style="purple"></li>

									<li class="color-grey" data-style="grey"></li>

									<li class="color-white color-light" data-style="light"></li>

								</ul>

								<label>

									<span>Layout</span>

									<select class="layout-option m-wrap small">

										<option value="fluid" selected>Fluid</option>

										<option value="boxed">Boxed</option>

									</select>

								</label>

								<label>

									<span>Header</span>

									<select class="header-option m-wrap small">

										<option value="fixed" selected>Fixed</option>

										<option value="default">Default</option>

									</select>

								</label>

								<label>

									<span>Sidebar</span>

									<select class="sidebar-option m-wrap small">

										<option value="fixed">Fixed</option>

										<option value="default" selected>Default</option>

									</select>

								</label>

								<label>

									<span>Footer</span>

									<select class="footer-option m-wrap small">

										<option value="fixed">Fixed</option>

										<option value="default" selected>Default</option>

									</select>

								</label>

							</div>

						</div>

						<!-- END BEGIN STYLE CUSTOMIZER -->    

						<!-- BEGIN PAGE TITLE & BREADCRUMB-->

						<h3 class="page-title">

							Dashboard <small>statistics and more</small>

						</h3>

						<ul class="breadcrumb">

							<li>

								<i class="icon-home"></i>

								<a href="#">Home</a>

								<i class="icon-angle-right"></i>

							</li>

							<li class="pull-right no-text-shadow">

								<div id="dashboard-report-range" class="dashboard-date-range tooltips no-tooltip-on-touch-device responsive" data-tablet="" data-desktop="tooltips" data-placement="top" data-original-title="Change dashboard date range">

									<i class="icon-calendar"></i>

									<span></span>

									<i class="icon-angle-down"></i>

								</div>

							</li>
							
						</ul>
					</div>
					
					<div class="row-fluid" style="height: 800px; height: 1800px">
						<iframe name="showTable" height="800px" width="1650px">iframe</iframe>
					</div>
					
					</div>
					
				</div>

			</div>

		</div>
		
	</div>
	
	<div class="footer">

		<div class="footer-inner">

			2013 &copy; Metronic by keenthemes.Collect from <a href="http://www.cssmoban.com/" title="网站模板" target="_blank">网站模板</a> - More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a>

		</div>

		<div class="footer-tools">

			<span class="go-top">

			<i class="icon-angle-up"></i>

			</span>

		</div>

	</div>
	
	<script src="/Ying_Second/back_desk/media/js/jquery-1.10.1.min.js" type="text/javascript"></script>

	<script src="/Ying_Second/back_desk/media/js/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>

	<script src="/Ying_Second/back_desk/media/js/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>      

	<script src="/Ying_Second/back_desk/media/js/bootstrap.min.js" type="text/javascript"></script>

	<script src="/Ying_Second/back_desk/media/js/jquery.slimscroll.min.js" type="text/javascript"></script>

	<script src="/Ying_Second/back_desk/media/js/jquery.blockui.min.js" type="text/javascript"></script>  

	<script src="/Ying_Second/back_desk/media/js/jquery.cookie.min.js" type="text/javascript"></script>

	<script src="/Ying_Second/back_desk/media/js/jquery.uniform.min.js" type="text/javascript" ></script>

	<!-- END CORE PLUGINS -->

	<!-- BEGIN PAGE LEVEL PLUGINS -->

	<script src="/Ying_Second/back_desk/media/js/jquery.vmap.js" type="text/javascript"></script>   

	<script src="/Ying_Second/back_desk/media/js/jquery.vmap.russia.js" type="text/javascript"></script>

	<script src="/Ying_Second/back_desk/media/js/jquery.vmap.world.js" type="text/javascript"></script>

	<script src="/Ying_Second/back_desk/media/js/jquery.vmap.europe.js" type="text/javascript"></script>

	<script src="/Ying_Second/back_desk/media/js/jquery.vmap.germany.js" type="text/javascript"></script>

	<script src="/Ying_Second/back_desk/media/js/jquery.vmap.usa.js" type="text/javascript"></script>

	<script src="/Ying_Second/back_desk/media/js/jquery.vmap.sampledata.js" type="text/javascript"></script>  

	<script src="/Ying_Second/back_desk/media/js/jquery.flot.js" type="text/javascript"></script>

	<script src="/Ying_Second/back_desk/media/js/jquery.flot.resize.js" type="text/javascript"></script>

	<script src="/Ying_Second/back_desk/media/js/jquery.pulsate.min.js" type="text/javascript"></script>

	<script src="/Ying_Second/back_desk/media/js/date.js" type="text/javascript"></script>

	<script src="/Ying_Second/back_desk/media/js/daterangepicker.js" type="text/javascript"></script>     

	<script src="/Ying_Second/back_desk/media/js/jquery.gritter.js" type="text/javascript"></script>

	<script src="/Ying_Second/back_desk/media/js/fullcalendar.min.js" type="text/javascript"></script>

	<script src="/Ying_Second/back_desk/media/js/jquery.easy-pie-chart.js" type="text/javascript"></script>

	<script src="/Ying_Second/back_desk/media/js/jquery.sparkline.min.js" type="text/javascript"></script>  

	<script src="/Ying_Second/back_desk/media/js/app.js" type="text/javascript"></script>

	<script src="/Ying_Second/back_desk/media/js/index.js" type="text/javascript"></script>        

	<script>
		jQuery(document).ready(function() {    
		   App.init(); // initlayout and core plugins
		   Index.init();
		   Index.initJQVMAP(); // init index page's custom scripts
		   Index.initCalendar(); // init index page's custom scripts
		   Index.initCharts(); // init index page's custom scripts
		   Index.initChat();
		   Index.initMiniCharts();
		   Index.initDashboardDaterange();
		   Index.initIntro();
		});
	</script>

</body>
</html>