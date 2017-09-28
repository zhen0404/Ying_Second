<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />

	<title>Metronic | Data Tables - Responsive Tables</title>

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
	
	<script src="/Ying_Second/back_desk/media/js/jquery-1.10.1.min.js" type="text/javascript"></script>
</head>
<body class="page-header-fixed">

				<div class="row-fluid">

					<div class="span12">

						<div class="portlet box green">

							<div class="portlet-title">

								<div class="caption"><i class="icon-cogs"></i>钱包管理</div>

								<div class="tools">

									<a href="javascript:;" class="collapse"></a>

									<a href="#portlet-config" data-toggle="modal" class="config"></a>

									<a href="javascript:;" class="reload"></a>

									<a href="javascript:;" class="remove"></a>

								</div>

							</div>

							<div class="portlet-body flip-scroll">
				 <form method="post" action="/Ying_Second/wallet/query">
                 <font size="4">交易号:</font><input type="text" placeholder="交易号" name="jyh">
         <font size="4">手机号:</font> <input type="text" placeholder="手机号" name="sjh">
         <font size="4">交易类型:</font>
               <select name="type" id="zz">               
                      <option value="-1">请选择</option>
                   <option value="SINOPEC_RECHARGE">石化充值</option>
                   <option value="MOBILE_RECHARGE">手机充值</option>
                   <option value="FINANCE">经费充值</option> 
                   </select>
     <font size="4">交易状态:</font>
             <select name="stat" id="zz">
             <option value="-1">请选择</option>
             <option value="0">等待付款</option>
			 <option value="2">处理中</option>                    
                   </select>
        <font size="4">交易时间:</font><input type="date" placeholder="交易时间" name="time"> 
               　<input type="submit" value="🔍查询" class="btn yellow">　　　　
          </form>
								<table class="table-bordered table-striped table-condensed flip-content">

									<thead class="flip-content">
										<tr>
											<th><font size="4">序号</font></th>
											<th><font size="4">交易号</font></th>
											<th><font size="4">交易人手机号</font></th>
											<th><font size="4">交易类型</font></th>
											<th><font size="4">交易名称</font></th>
											<th><font size="4">交易金额</font></th>
											<th><font size="4">交易状态</font></th>
											<th><font size="4">起投时间</font></th>
										</tr>
									</thead>

									<tbody>
                                   <c:forEach items="${List}" var="list"  varStatus="stat">
										<tr>
											<td class="numeric" align="center">${stat.index+1}</td>
											<td class="numeric" align="center">${list.trade_no}</td>
											<td class="numeric" align="center">${list.member.mobile_Phone}</td>
											<td class="numeric" align="center">
											<c:if test="${list.trade_type=='SINOPEC_RECHARGE'}">石化充值</c:if>
											<c:if test="${list.trade_type=='MOBILE_RECHARGE'}">手机充值</c:if>
											<c:if test="${list.trade_type=='FINANCE'}">经费充值</c:if>
											</td>
											<td class="numeric" align="center">${list.trade_name}</td>
											<td class="numeric" align="center" >Y${list.amount}</td>
											<td class="numeric" align="center" >
											<c:if test="${list.trade_status==0}">等待付款</c:if>
											 <c:if test="${list.trade_status==2}">处理中</c:if>
											</td>
											<td class="numeric" align="center" >${list.create_date}</td>
										</tr>
                                       </c:forEach>
									</tbody>

								</table>
								<br><br><br><br><br><br><br><br><br><br><br>

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
		jQuery(document).ready(function() {       
		   App.init();
		});
	</script>
</body>
</html>