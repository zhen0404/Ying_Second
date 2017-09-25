<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />

	<title>用户综合统计</title>

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


<body class="page-header-fixed" onload="fun(),fun2(),fun3(),fun4(),fun5(),fun6()">

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
							<form action="/Ying_Second/Fin/listall" method="post" >
							<table  border="0">
							<thead class="flip-content" >
							<tr >
							<td  style="text-align: center">手机号码：<input class="form-control" type="text" name="iphone" value=""></td>
							<td  style="text-align:left;">交易类型：<select class="form-control" name="type" id="type">
	            	<option value="">全部</option>
	            	<option value="1">充值</option>
	            	<option value="2">投资</option>
	            	<option value="3">生活消费</option>
	            	<option value="4">红包返利</option>
	            	<option value="5">提现</option>
	                                       </select>	</td>
							</tr>
							<tr>
							<td style="text-align: center">开始时间：<input type="date" name="start" style="color: blue;width: 200px;height: 20px" id="t1"></td>
							<td style="text-align:left;">交易方式：<select class="form-control" name="zhifu" id="dealway">
	            	<option value="">全部</option>
	            	<option value="1">富友</option>
	            	<option value="2">贝付</option>
	                                    </select></td>
							</tr>
							<tr>
							<td style="text-align: center">结束时间：<input type="date" name="endDate" style="color: blue;width: 200px;height: 20px" id="t2" ></td>
							<td style="text-align:left;">&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
							                    <button type="submit">查询</button>
											  &nbsp&nbsp &nbsp&nbsp&nbsp
                                             <button type="button"  onclick="finan()">重置</button></td>
							</tr>
							</thead>
                                        </table>     
                                         
									</form>
                               
                                             </div>
                      
                    <table border="0">
<%--                      <c:forEach items="${list8 }" var="y" varStatus="stat"> --%>
<%--                            <c:forEach items="${list9 }" var="u" varStatus="stat"> --%>
<%--                            <c:forEach items="${list10 }" var="i" varStatus="stat"> --%>
<%--                            <c:forEach items="${list11 }" var="o" varStatus="stat"> --%>
<%--                            <c:forEach items="${list12 }" var="p" varStatus="stat"> --%>
<%--                            <c:forEach items="${list13 }" var="s" varStatus="stat"> --%>
<%--                            <c:forEach items="${list14 }" var="d" varStatus="stat"> --%>
<%--                            <c:forEach items="${list15 }" var="f" varStatus="stat"> --%>
                           
                          
<%--                            <c:forEach items="${list2 }" var="a2" varStatus="stat"> --%>
<%--                            <c:forEach items="${list3 }" var="a3" varStatus="stat"> --%>
<%--                            <c:forEach items="${list4 }" var="a4" varStatus="stat"> --%>
<%--                            <c:forEach items="${list5 }" var="a5" varStatus="stat"> --%>
<%--                            <c:forEach items="${list6 }" var="a6" varStatus="stat"> --%>
<%--                            <c:forEach items="${list7 }" var="a7" varStatus="stat"> --%>
                    <tr>
                    <td>
                    <h3 class="h3Tit">基本信息</h3>
            <table class="table table-bordered listTab" style="margin-top:25px"  >
            
              <tr>
                <td style="text-align: center">真实姓名</td>
                <td ><span id="z1"></span></td>
                <td style="text-align: center">身份证号</td>
                <td ><span id="z2"></span></td>
              </tr>
              <tr>
                <td style="text-align: center">手机</td>
                <td ><span id="z3"></span></td>
                <td style="text-align: center">注册时间</td>
                <td ><span id="z4"></span></td>
              </tr>
              <tr>
                <td style="text-align: center">微信账号</td>
                <td ><span id="z5"></span></td>
                <td style="text-align: center">QQ账号</td>
                <td ><span id="z6"></span></td>
              </tr>
              <tr>
                <td style="text-align: center">邀请码</td>
                <td ><span id="z7"></span ></td>
                <td style="text-align: center">被邀请码</td>
                <td ><span id="z8"></span></td>
              </tr>
              
            </table>
                    </td>
                    <td>&nbsp&nbsp&nbsp</td>
                    <td>
                    <h3 class="h3Tit">基本信息</h3>
                    <table class="table table-bordered listTab" >
                    
                      <tr>
                      
                <td style="text-align: center">充值金额</td>
                <td><span id="c2"></span></td>
                <td style="text-align: center">提现金额</td>
                <td><span id="c3"></span></td>
                  </tr>
                      <tr>
                <td style="text-align: center">投资金额</td>
                <td><span id="ly1"></span></td>
                <td style="text-align: center">生活消费</td>
                <td><span id="sj1"></span></td>
                      </tr>
                       <tr>
                <td style="text-align: center">收益金额</td>
                <td><span id="ly2"></span></td>
                <td style="text-align: center">红包返利</td>
                <td><span id="h1"></span></td>
                        </tr>
                       <tr>
                <td style="text-align: center">可用余额</td>
                <td><span id="ly3"></span></td>
                <td style="text-align: center">冻结余额</td>
                <td><span id="t5"></span></td>
              </tr>
                       <tr>
                <td style="text-align: center">红包余额</td>
                <td><span id="t6"></span></td>
                <td style="text-align: center">体验金</td>
                <td><span id="t7"></span></td>
                </tr>
                
                    </table>
                    </td>
                    </table>
                    <h3 class="h3Tit">交易记录</h3>
                     <table class="table-bordered table-striped table-condensed flip-content">

									<thead class="flip-content">         
										<tr>

											<th>序号</th>

											<th>交易编号</th>

											<th>交易类型</th>

											<th>金额</th>

											<th>具体项目</th>
											
											<th>交易状态</th>

											<th>交易时间</th>

											<th>备注</th>

										</tr>
				<c:forEach items="${a7}" var="a7" varStatus="stat">
                   <tr> 
                   <td>${a7.id }</td><td>${a7.trade_no }</td><td>${a7.trade_type }</td><td>${a7.amount }</td><td>${a7.trade_name }</td><td>${a7.trade_status }</td>
                         <td>${a7.create_date }</td><td>${a7.ext_field_1 }</td>
                         </tr>
                       </c:forEach>
									</thead>

									<tbody>
										<tr class="">

											<td style="text-align: center"></td>

											<td style="text-align: center"></td>

											<td style="text-align: center"></td>
								
											<td style="text-align: center"></td>
											
											<td style="text-align: center">
											
										</tr>


									</tbody>

<%--               </c:forEach> --%>
<%--               </c:forEach> --%>
<%--               </c:forEach> --%>
<%--               </c:forEach> --%>
<%--               </c:forEach> --%>
<%--               </c:forEach> --%>
<%--               </c:forEach> --%>
<%--               </c:forEach> --%>
<%--               </c:forEach> --%>
<%--               </c:forEach> --%>
<%--               </c:forEach> --%>
<%--               </c:forEach> --%>
<%--               </c:forEach> --%>
<%--               </c:forEach> --%>
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
	  <c:forEach items="${a2}" var="a2" varStatus="stat">
             <input type="hidden" id="b1" value="${a2.member_name } ">
              <input type="hidden" id="b2" value=" ${a2.identity } ">
               <input type="hidden" id="b3" value=" ${a2.mobile_Phone } ">
                <input type="hidden" id="b4" value=" ${a2.create_date }  ">
                 <input type="hidden" id="b5" value=" ${a2.weixinAccount } ">
                  <input type="hidden" id="b6" value=" ${ a2.qqNumber} ">
                   <input type="hidden" id="b7" value="${a2.invitationCode} ">
                  <input type="hidden" id="b8" value="${a2.invitedCode } ">
              
              </c:forEach>
              <c:forEach items="${a4}" var="a4" varStatus="stat">
                    <input type="hidden" id="c1" value="${a4 }">  
                       </c:forEach>
                       <c:forEach items="${a6}" var="a6" varStatus="stat">
                    <input type="hidden" id="a6" value="${a6 }">  
                       </c:forEach>
                        <c:forEach items="${a1}" var="a1" varStatus="stat">
                    <input type="hidden" id="a1" value="${a1 }">  
                       </c:forEach>
                         <c:forEach items="${a3}" var="a3" varStatus="stat">
                    <input type="hidden" id="a11" value="${a3.useable_balance }"> <!-- 可用余额 --> 
                     <input type="hidden" id="a12" value="${a3.imuseale_balance }"> <!-- 冻结余额 -->
                      <input type="hidden" id="a13" value="${a3.total_profit }"> <!--累计收益  -->
                       <input type="hidden" id="a14" value="${a3.bonus_amount }"> <!--红包金额  -->
                        <input type="hidden" id="a15" value="${a3.invest_amount }"><!-- 投资总额  -->
                         <input type="hidden" id="a16" value="${a3.bbin_amount }"> <!-- 体验金 -->
                       </c:forEach>
 					<c:forEach items="${a5}" var="a5" varStatus="stat">
                    <input type="hidden" id="a5" value="${a5 }">  
                       </c:forEach>
                           
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
	<script type="text/javascript">
	function fun2(){
		var c1=document.getElementById("c1");
		if(!c1){
			var c2="NuLL";
				document.getElementById("c2").innerHTML=document.getElementById("c2").value;
		}else{
		document.getElementById("c2").innerHTML=c1.value;}
	}
	function fun(){
		var b1=document.getElementById("b1").value;
		var b2=document.getElementById("b2").value;
		var b3=document.getElementById("b3").value;
		var b4=document.getElementById("b4").value;
		var b5=document.getElementById("b5").value;
		var b6=document.getElementById("b6").value;
		var b7=document.getElementById("b7").value;
		var b8=document.getElementById("b8").value;
	
		
		
		
		
		
		document.getElementById("z1").innerHTML=b1;
		document.getElementById("z2").innerHTML=b2;
		document.getElementById("z3").innerHTML=b3;
		document.getElementById("z4").innerHTML=b4;
		document.getElementById("z5").innerHTML=b5;
		document.getElementById("z6").innerHTML=b6;
		document.getElementById("z7").innerHTML=b7;
		document.getElementById("z8").innerHTML=b8;
	
		
	}
	function fun3(){
		var a11=document.getElementById("a11");
		var a12=document.getElementById("a12");
		var a13=document.getElementById("a13");
		var a14=document.getElementById("a14");
		var a15=document.getElementById("a15");
		var a16=document.getElementById("a16");
		if(!a15){
			var c2="NuLL";
				document.getElementById("ly1").innerHTML=document.getElementById("c2").value;
		}else{
		document.getElementById("ly1").innerHTML=a15.value;}
		if(!a13){
			var c2="NuLL";
				document.getElementById("ly2").innerHTML=document.getElementById("c2").value;
		}else{
		document.getElementById("ly2").innerHTML=a13.value;}
		if(!a11){
			var c2="NuLL";
				document.getElementById("ly3").innerHTML=document.getElementById("c2").value;
		}else{
		document.getElementById("ly3").innerHTML=a11.value;}
		if(!a14){
			var c2="NuLL";
				document.getElementById("t6").innerHTML=document.getElementById("c2").value;
		}else{
		document.getElementById("t6").innerHTML=a14.value;}
		if(!a12){
			var c2="NuLL";
				document.getElementById("t5").innerHTML=document.getElementById("c2").value;
		}else{
		document.getElementById("t5").innerHTML=a12.value;}
		if(!a16){
			var c2="NuLL";
				document.getElementById("t7").innerHTML=document.getElementById("c2").value;
		}else{
		document.getElementById("t7").innerHTML=a16.value;}
	}
	function fun4(){
		var a1=document.getElementById("a1");
		if(!a1){
			var c2="NuLL";
				document.getElementById("h1").innerHTML=document.getElementById("c2").value;
		}else{
		document.getElementById("h1").innerHTML=a1.value;}
	}
	function fun5(){
		var a6=document.getElementById("a6");
		if(!a6){
			var c2="NuLL";
				document.getElementById("c3").innerHTML=document.getElementById("c2").value;
		}else{
		document.getElementById("c3").innerHTML=a6.value;}
	}
	function fun6(){
		var a5=document.getElementById("a5");
		if(!a5){
			var c2="NuLL";
				document.getElementById("sj1").innerHTML=document.getElementById("c2").value;
		}else{
		document.getElementById("sj1").innerHTML=a5.value;
	}}
	</script>  
	<script>

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