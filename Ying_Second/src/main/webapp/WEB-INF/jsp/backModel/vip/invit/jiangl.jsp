<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />

	<title>奖励记录</title>

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
									<!-- <tr bgcolor="gray"><font>详情</font></tr> -->
										<tr>
											<th>序号</th>
											<th>邀请手机号</th>
											<th>被邀请手机号</th>
											<th>奖励类型</th>
											<th>奖励金额</th>
											<th>奖励时间</th>
										</tr>
									</thead>
									 <tbody>
									 <c:forEach items="${list2 }" var="j" varStatus="sta">
									          <tr>
									          	<td>${sta.index+1 }</td>
									          	<td>${j.im }</td>
									          	<td>${j.bm}</td>
									          	<td>
									          	<c:if test="${j.type==0}">注册奖励</c:if>
									          	<c:if test="${j.type==1}">投资奖励</c:if>
									          	</td>
									          	<td>${j.amount}</td>
									          	<td>${j.addTime}</td>
									          </tr>
									  </c:forEach>        
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