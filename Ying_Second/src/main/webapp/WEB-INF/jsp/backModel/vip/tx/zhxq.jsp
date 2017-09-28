<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />

	<title>账户详情</title>

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
<body class="page-header-fixed">



				<div class="row-fluid">

					<div class="span12">

						<div class="portlet box green">

							<div class="portlet-title">

								<div class="caption"><i class="icon-cogs"></i>Flip Scroll</div>

								<div class="tools">

									<a href="javascript:;" class="collapse"></a>

									<a href="#portlet-config" data-toggle="modal" class="config"></a>

									<a href="javascript:;" class="reload"></a>

									<a href="javascript:;" class="remove"></a>

								</div>

							</div>

							<div class="portlet-body flip-scroll">
								<%-- <form action="/Ying_Second/account/list"
											method="post">
											用户名：<input type="text" name="member_name" value="${member_name }">
											姓名：<input type="text" name="name" value="${name }"> <br>
											手机号：<input type="text" name="mobile_Phone" value="${mobile_Phone }">
											身份证号：<input type="text" name="identity" value="${identity }"><br>
											邀请码：<input type="text" name="invitationCode" value="${invitationCode }">
											创建日期：<input type="text" name="create_date" value="${create_date }"> <br>
											<input type="submit" value="提交"> 
										</form> --%>
								<table class="table-bordered table-striped table-condensed flip-content">
									<thead>
									<tr bgcolor="gray"><font>账户详情</font></tr>
										<tr>
											<th>用户名</th>
											<th>手机号</th>
											<th>姓名</th>
											<th>身份证</th>
											<th>邀请码</th>
											<th>被邀请码</th>
											<th>注册时间</th>
										</tr>
									</thead>
									 <tbody>
									          <tr>
									            <td>${member.name }</td>
									            <td>${member.mobile_Phone }</td>
									            <td>${member.member_name }</td>
									            <td>${member.identity }</td>
									            <td>${member.invitationCode }</td>
									            <td>${member.invitedCode }</td>
									            <td>${member.create_date }</td>
									          	<!-- <td><a href="/Ying_Second/account/list">返回</a></td> -->
									          </tr>
									          
									 </tbody>

									<%-- <tbody>
										 <c:forEach items="${listMember }" var="m" varStatus="stat">
										<tr class="">

											<td>${stat.index+1 }</td>

											<td>${m.member_name }</td>

											<td>${m.name }</td>
											
											<td>${m.mobile_Phone}</td>
											<td>${m.identity }</td>
											<td>${m.invitationCode }</td>
											<td>${m.create_date }</td>
											<td><a href="/Ying_Second/">账户详情</a></td>

											
										</tr>
									  </c:forEach>
										
									</tbody> --%>
									
								</table>
								<table class="table-bordered table-striped table-condensed flip-content">
									<thead>
									<tr bgcolor="gray"><font>资金信息</font></tr>
										<tr>
											<th>可用余额</th>
											<th>冻结金额</th>
											<th>累计收益</th>
											<th>投资总额</th>
											<th>红包金额</th>
											<th>体验金</th>
										</tr>
									</thead>
									 <tbody>
									          <tr>
									            <td>${member_account.useable_balance }</td>
									            <td>${member_account.imuseale_balance }</td>
									            <td>${member_account.total_profit }</td>
									            <td>${member_account.invest_amount }</td>
									            <td>${member_account.bonus_amount }</td>
									            <td>${member_account.bbin_amount }</td>
									          	<!-- <td><a href="/Ying_Second/account/list">返回</a></td> -->
									          </tr>
									          
									 </tbody>
								</table>
								<%-- <table class="table-bordered table-striped table-condensed flip-content">
									<thead>
									<tr bgcolor="gray"><font>理财师信息</font></tr>
										<tr>
											<th>真实姓名</th>
											<th>机构名称</th>
											<th>名片</th>
											<th>邮寄地址</th>
											<th>添加时间</th>
										</tr>
									</thead>
									 <tbody>
									          <tr>
									            <td>${financial_planner.member.member_name }</td>
									            <td>${financial_planner.orgname }</td>
									            <td>${financial_planner.mycard }</td>
									            <td>${financial_planner.address }</td>
									            <td>${financial_planner.create_date }</td>
									          	<!-- <td><a href="/Ying_Second/account/list">返回</a></td> -->
									          </tr>
									          
									 </tbody>
								</table> --%>
								<table class="table-bordered table-striped table-condensed flip-content">
									<thead>
									<tr bgcolor="gray"><font>投资记录</font></tr>
										<tr>
											<th>序号</th>
											<th>投资编号</th>
											<th>投资金额</th>
											<th>投资状态</th>
											<th>投资标的名称</th>
											<th>投资收益</th>
											<th>投资时间</th>
										</tr>
									</thead>
									 <tbody>
									          <tr>
									            <td>${spr.id }</td>
									            <td>${spr.serial_number }</td>
									            <td>${spr.amount }</td>
									            <td>
									            <c:if test="${spr.delflag==0 }">待付款</c:if>
									            <c:if test="${spr.delflag==1 }">已付款</c:if>
									            </td>
									            <td>${spr.subject.name }</td>
									            <td>${spr.amount*(interest/365)*30 }</td>
									            <td>${spr.create_date }</td>
									          	<!-- <td><a href="/Ying_Second/account/list">返回</a></td> -->
									          </tr>
									          
									 </tbody>
								</table>
								<table class="table-bordered table-striped table-condensed flip-content">
									<thead>
									<tr bgcolor="gray"><font>提现记录</font></tr>
										<tr>
											<th>序号</th>
											<th>提现编号</th>
											<th>提现金额</th>
											<th>提现状态</th>
											<th>提现银行</th>
											<th>提现卡号</th>
											<th>提现时间</th>
										</tr>
									</thead>
									 <tbody>
									          <tr>
									            <td>${mwr.id }</td>
									            <td>${mwr.serial_number }</td>
									            <td>${mwr.amount }</td>
									            <td>
									            <c:if test="${mwr.status==0 }">待审核</c:if>
									            <c:if test="${mwr.status==1 }">已打款</c:if>
									            <c:if test="${mwr.status==2 }">打款中</c:if>
									            <c:if test="${mwr.status==4 }">打款失败</c:if>
									            </td>
									            <td>${mwr.bank_name }</td>
									            <td>${mwr.bank_card }</td>
									            <td>${mwr.create_date }</td>
									          	<!-- <td><a href="/Ying_Second/account/list">返回</a></td> -->
									          </tr>
									          
									 </tbody>
								</table>
								<table class="table-bordered table-striped table-condensed flip-content">
									<thead>
									<tr bgcolor="gray"><font>充值记录</font></tr>
										<tr>
											<th>序号</th>
											<th>充值编号</th>
											<th>充值金额</th>
											<th>充值状态</th>
											<th>充值渠道</th>
											<th>充值渠道编号</th>
											<th>充值时间</th>
										</tr>
									</thead>
									 <tbody>
									          <tr>
									            <td>${mdr.id }</td>
									            <td>${mdr.serial_number }</td>
									            <td>${mdr.amount }</td>
									            <td>
									            <c:if test="${mdr.status==0 }">待付款</c:if>
									            <c:if test="${mdr.status==1 }">完成</c:if>
									           	</td>
									            <td>${mdr.pay_channel_name }</td>
									            <td>${mdr.pay_channel_order_no }</td>
									            <td>${mdr.create_date }</td>
									          	<!-- <td><a href="/Ying_Second/account/list">返回</a></td> -->
									          </tr>
									          
									 </tbody>
								</table>
								<table class="table-bordered table-striped table-condensed flip-content">
									<thead>
									<tr bgcolor="gray"><font>钱包记录</font></tr>
										<tr>
											<th>序号</th>
											<th>交易编号</th>
											<th>交易金额</th>
											<th>交易状态</th>
											<th>交易分类</th>
											<th>交易名称</th>
											<th>交易时间</th>
										</tr>
									</thead>
									 <tbody>
									          <tr>
									            <td>${mtr.id }</td>
									            <td>${mtr.trade_no }</td>
									            <td>${mtr.amount }</td>
									            <td>
									            <c:if test="${mtr.trade_status==0 }">待审核</c:if>
									            <c:if test="${mtr.trade_status==1 }">完成</c:if>
									            </td>
									            <td>${mtr.trade_type }</td>
									            <td>${mtr.trade_name }</td>
									            <td>${mtr.create_date }</td>
									          	<!-- <td><a href="/Ying_Second/account/list">返回</a></td> -->
									          </tr>
									          
									 </tbody>
								</table>

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
		jQuery(document).ready(function() {       
		   App.init();
		});
	</script>
</body>
</html>