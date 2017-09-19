<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />

	<title>付息计划</title>

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

<div class="page-container row-fluid">

		<div class="page-content">

			<div class="container-fluid">

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
								<form action="/Ying_Second/plan/list"
											method="post">
											标的名称：<input type="text" name="name" value="${name }">
											标的类型：<input type="text" name="type" value="${type }">
											标的状态：<input type="text" name="status" value="${status }"><br>
											<input type="submit" value="提交"> 
										</form>
								<table class="table-bordered table-striped table-condensed flip-content">

									<thead class="flip-content">

										<tr>

											
										<tr>

											<th>序号</th>

											<th>合同编号</th>

											<th>标的类别</th>

											<th>标的名称</th>

											<th>标的总金额</th>

											<th>已投金额</th>
											
											<th>已投人数</th>
											
											<th>标的期限</th>

											<th>年化收益</th>

											<th>标的状态</th>
											
											<th>可否体验金购买</th>

											<th>操作</th>

										</tr>
									</thead>

									<tbody>
										 <c:forEach items="${list }" var="s" varStatus="stat">
										<tr class="">
											<td>${stat.index+1 }</td>
											<td>${s.serial_no }</td>
											<td>${s.type}</td>
											<td>${s.name}</td>
											<td>${s.amount }</td>
											<td>未算</td>
											<td>${s.bought}</td>
											<td>${s.period*7 }天</td>
											<td>未算</td>
											<td>
											<c:if test="${s.status==1}">正在筹集</c:if>
											</td>
											<td>
											<c:if test="${s.exper_status==0 }">否</c:if>
											<c:if test="${s.exper_status==1 }">是</c:if>
											</td>
											<td>
											<c:if test="${s.exper_status==0 }">体验金付息||<a href="/Ying_Second/pur/list/${s.id }">付息列表</a></c:if>
											<c:if test="${s.exper_status==1 }"><a href="/Ying_Second/pay/list/${s.id }">体验金付息<a></a>||<a href="/Ying_Second/pur/list/${s.id }">付息列表</a></c:if>
											</td>
										</tr>
									  </c:forEach>
										
									</tbody>
							
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
		jQuery(document).ready(function() {       
		   App.init();
		});
	</script>
</body>
</html>