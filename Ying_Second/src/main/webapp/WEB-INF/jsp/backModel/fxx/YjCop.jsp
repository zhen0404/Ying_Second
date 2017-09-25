<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />

	<title>财务统计</title>

	<meta content="width=device-width, height=device-height, initial-scale=1.0" name="viewport" />

	<meta content="" name="description" />

	<meta content="" name="author" />

	<!-- BEGIN GLOBAL MANDATORY STYLES -->

	<link href="/Ying_Second/back_desk/media/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/font-awesome.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/style-metro.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/style.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/style-responsive.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/default.css" rel="stylesheet" type="text/css" id="style_color"/>

	<link href="/Ying_Second/back_desk/media/css/uniform.default.css" rel="stylesheet" type="text/css"/>

	<!-- END GLOBAL MANDATORY STYLES -->

	<!-- BEGIN PAGE LEVEL STYLES -->

	<link rel="stylesheet" href="/Ying_Second/back_desk/media/css/DT_bootstrap.css" />

	<!-- END PAGE LEVEL STYLES -->

	<link rel="shortcut icon" href="/Ying_Second/back_desk/media/image/favicon.ico" />
</head>

<style>
	#t1{
	margin-top: 10px;
	}
	#t2{
	margin-top:10px;
	}
	*{
            margin:0;
            padding:0;
        }
        #left{
            width:320px;
            float:left;
            clear:right;
            height:20px;
        }
        #mid{
            width:320px;
            float:left;
            clear:right;
            height:60px;
        }
        #right{
            width:320px;
            float:left;
            clear:right;
            height:20px;
        }

</style>

<body class="page-header-fixed">

<div class="page-container row-fluid">

		<div class="page-content">

			<div class="container-fluid">

				<div class="row-fluid">

					<div class="span12">

						<div class="portlet box green">

							<div class="portlet-title">

								<div class="caption"><i class="icon-cogs"></i>➤财务统计</div>

								<div class="tools">

									<a href="javascript:;" class="collapse"></a>

									<a href="#portlet-config" data-toggle="modal" class="config"></a>

									<a href="javascript:;" class="reload"></a>

									<a href="javascript:;" class="remove"></a>

								</div>

							</div>

							<div class="portlet-body flip-scroll">
							<div class="tools">
							
                                            <form action="/Ying_Second/GongGao/serCop" method="post" >
											开始时间：<input type="date" name="creatTime" style="color: blue;width: 200px;height: 20px" id="t1">
											结束时间：<input type="date" name="endTime" style="color: blue;width: 200px;height: 20px" id="t2" >
											  &nbsp&nbsp&nbsp
											 <button type="submit">查询</button>
											  &nbsp&nbsp
                                             <button type="button"  onclick="finan()">重置</button>
                                             &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp &nbsp&nbsp&nbsp &nbsp&nbsp&nbsp
									         <button type="submit"  >当月</button>
									          &nbsp&nbsp&nbsp &nbsp&nbsp&nbsp
									         <button type="submit"  >上一个月</button>
									         &nbsp&nbsp&nbsp &nbsp&nbsp&nbsp
									         <button type="submit"  >最近三个月</button>
									</form>
        
                                             </div>
     
								<table border="0">
                           <c:forEach items="${list8 }" var="y" varStatus="stat">
                           <c:forEach items="${list9 }" var="u" varStatus="stat">
                           <c:forEach items="${list10 }" var="i" varStatus="stat">
                           <c:forEach items="${list11 }" var="o" varStatus="stat">
                           <c:forEach items="${list12 }" var="p" varStatus="stat">
                           <c:forEach items="${list13 }" var="s" varStatus="stat">
                           <c:forEach items="${list14 }" var="d" varStatus="stat">
                           <c:forEach items="${list15 }" var="f" varStatus="stat">
                           
                           <c:forEach items="${list }" var="m" varStatus="stat">
                           <c:forEach items="${list2 }" var="a" varStatus="stat">
                           <c:forEach items="${list3 }" var="q" varStatus="stat">
                           <c:forEach items="${list4 }" var="w" varStatus="stat">
                           <c:forEach items="${list5 }" var="e" varStatus="stat">
                           <c:forEach items="${list6 }" var="r" varStatus="stat">
                           <c:forEach items="${list7 }" var="t" varStatus="stat">
                          
                           
                           
                        
									<thead class="flip-content" >

										<tr>

											<th >
											<div  id="left">
        	<div class="in">
            	<p class="first" style="font-size:30px;"><img src="../img/ico1.jpg">${r+t+a+q+w+e+m}<span>元</span></p>
                <p class="txt">平台总资产</p>
            </div>
        </div>
        <br><br><br>
        </th >

											<th>   
											<div  id="mid">
        	<div class="in">
            	<p class="first" style="font-size:30px;"><img src="../img/ico2.jpg" >${r+t+a+q+w+e+m-y-u-i-o-p-s-d-f}<span>元</span></p>
                <p class="txt">平台余额</p>
            </div>
        </div></th>

											<th>
											<div  id="right">
        	<div class="in">
            	<p class="first" style="font-size:30px;"><img src="../img/ico2.jpg">${r+t-y-u}<span>元</span></p>
                <p class="txt">平台总净值/第三方账户总余额</p>
            </div>
        </div>
        <br><br><br>
        </th>
										</tr>
										
									</thead>
								</table>
                    <br><br><br> <br><br><br>
                   
                           <div class="portlet-body flip-scroll">
                           <table border="0">
                           
                          <tr>
                          <td><h4 style="text-align:left;">用户充值总额</h4></td>
                          <td><h3 style="text-align:right;">${r+t}<span>元</span></h3></td>
                          <td>&nbsp&nbsp&nbsp</td>
                          <td><h4 style="text-align:left;">用户总收益</h4></td>
                          <td><h3 style="text-align:right;">${a+q+w+e+m}<span>元</span></h3></td>
                          </tr> 
                           
                          </table>
                          </div>
                      <br>   
                    <table border="0">
                    <tr>
                    <td>
            <table class="table table-bordered listTab" style="margin-top:25px"  >
              <tr>
                <th>账户</th>
                <th>充值（元）</th>
                <th>取现（元）</th>
                <th>余额（元）</th>
              </tr>
              <tr>
                <td>富友</td>
                <td>${r}</td>
                <td>${y}</td>
                <td>${r-y}</td>
              </tr>
              <tr>
                <td>贝付</td>
                <td>${t}</td>
                <td>${u}</td>
                <td>${t-u}</td>
              </tr>
              <tr>
                <td>合计</td>
                <td>${r+t}</td>
                <td>${y+u}</td>
                <td>${r+t-y-u}</td>
              </tr>
              
              
            </table>
                    </td>
                    <td>&nbsp&nbsp&nbsp</td>
                    <td>
                    <h3 class="h3Tit">1.投资总收益</h3>
                    <table class="table table-bordered listTab" >
                    
                      <tr>
                        <th>项目</th>
                        <th>金额</th>
                      </tr>
                      <tr>
                        <td>固收理财</td>
                        <td>${e}</td>
                      </tr>
                       <tr>
                        <td>私募基金</td>
                        <td>${q}</td>
                      </tr>
                       <tr>
                        <td>海外配资</td>
                        <td>${w}</td>
                      </tr>
                       <tr>
                        <td>合计</td>
                        <td>${q+w+e}</td>
                      </tr>
                    
                    </table>
                    </td>
                    <td>&nbsp&nbsp&nbsp</td>
                    <td>
                    <h3 class="h3Tit">2.用户总红包</h3>
                    <table class="table table-bordered listTab"  >
                     
                      <tr>
                        <th>项目</th>
                        <th>金额</th>
                      </tr>
                      <tr>
                        <td>邀请注册红包</td>
                        <td>${m}</td>
                      </tr>
                      <tr>
                        <td>投资奖励红包</td>
                        <td>${a}</td>
                      </tr>
                     
                      <tr>
                        <td>合计</td>
                        <td>${m+a}</td>
                      </tr>
                     
                    </table>
                    </td>
                    </table>
                     <div class="portlet-body flip-scroll">
                           <table border="0">
                          <tr>
                          <td><h4 style="text-align:left;">平台总支出</h4></td>
                          <td><h3 style="text-align:right;">${y+u+i+o+p+s+d+f}<span>元</span></h3></td>
                          </table>
                          </div>
                      <br> 
                      <table>
                      <tr>
                      <td>
                      <h3 class="h3Tit">1.平台总投资</h3>
            <table class="table table-bordered listTab" width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <th>项目</th>
                <th>金额</th>
              </tr>
              <tr>
                <td>固收理财</td>
                <td>${i}</td>
              </tr>
               <tr>
                <td>私募基金</td>
                <td>${o}</td>
              </tr>
               <tr>
                <td>海外配资</td>
                <td>${p}</td>
              </tr>
               <tr>
                <td>合计</td>
                <td>${i+o+p}</td>
              </tr>
               
            </table>
                      </td>
                      <td>&nbsp&nbsp&nbsp</td>
                      <td>
                      <h3 class="h3Tit">2.平台总消费</h3>
            <table class="table table-bordered listTab" width="100%" border="0">
              <tr>
                <th>项目</th>
                <th>金额</th>
              </tr>
              <tr>
                <td>手机充值</td>
                <td>${s}</td>
              </tr>
              <tr>
                <td>加油卡充值</td>
                <td>${d}</td>
              </tr>
              <tr>
                <td>生活缴费</td>
                <td>${f}</td>
              </tr>
              <tr>
                <td>合计</td>
                <td>${s+d+f}</td>
              </tr>
              
            </table>
                      </td>
                      <td>&nbsp&nbsp&nbsp</td>
                      <td>
                      <h3 class="h3Tit">3.平台总提现</h3>
            <table class="table table-bordered listTab" width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <th>项目</th>
                <th>金额</th>
              </tr>
              <tr>
                <td>富友账户</td>
                <td>${y}</td>
              </tr>
               <tr>
                <td>贝付账户</td>
                <td>${u}</td>
              </tr>
               <tr>
                <td>合计</td>
                <td>${y+u}</td>
              </tr>
              </c:forEach>
              </c:forEach>
              </c:forEach>
              </c:forEach>
              </c:forEach>
              </c:forEach>
              </c:forEach>
              </c:forEach>
              </c:forEach>
              </c:forEach>
              </c:forEach>
              </c:forEach>
              </c:forEach>
              </c:forEach>
              </c:forEach>
            </table>
                      </td>
                      </tr>
                      </table>

					</div>

				</div>

			</div>

		</div>

	</div>
	
		</div>

	</div>

	<!-- END CONTAINER -->

	<!-- BEGIN FOOTER -->

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

	<script src="/Ying_Second/back_desk/media/js/excanvas.min.js"></script>

	<script src="/Ying_Second/back_desk/media/js/respond.min.js"></script>  

	<script src="/Ying_Second/back_desk/media/js/jquery.slimscroll.min.js" type="text/javascript"></script>

	<script src="/Ying_Second/back_desk/media/js/jquery.blockui.min.js" type="text/javascript"></script>  

	<script src="/Ying_Second/back_desk/media/js/jquery.cookie.min.js" type="text/javascript"></script>

	<script src="/Ying_Second/back_desk/media/js/jquery.uniform.min.js" type="text/javascript" ></script>

	<script src="/Ying_Second/back_desk/media/js/app.js"></script>      

	<script>

	 function fun(){
		 window.location.href="/Ying_Second/GongGao/YjTow";
		 
	 }
	 function finan(){
			$("input[name='startDate']").val("");
			$("input[name='endDate']").val("");
		}
		jQuery(document).ready(function() {       
		   App.init();
		});
	</script>
</body>
</html>