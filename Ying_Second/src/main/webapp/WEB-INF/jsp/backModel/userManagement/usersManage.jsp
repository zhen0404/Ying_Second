<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />

	<title>Metronic | Data Tables - Responsive Tables</title>

	<meta content="width=device-width, height=device-height, initial-scale=1.0" name="viewport" />

	<meta content="" name="description" />

	<meta content="" name="author" />

	<link href="/Ying_Second/back_desk/media/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/font-awesome.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/style-metro.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/style.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/style-responsive.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/default.css" rel="stylesheet" type="text/css" id="style_color"/>

	<link href="/Ying_Second/back_desk/media/css/uniform.default.css" rel="stylesheet" type="text/css"/>

	<link rel="stylesheet" href="/Ying_Second/back_desk/media/css/DT_bootstrap.css" />

	<link rel="shortcut icon" href="/Ying_Second/back_desk/media/image/favicon.ico" />
</head>
<body class="page-header-fixed">

				<div class="row-fluid">
					<div class="span12">
						<div class="portlet box green">
							<div class="portlet-title">
								<div class="caption"><i class="icon-cogs"></i>用户管理</div>
								<div class="tools">
									<a href="javascript:;" class="collapse"></a>
									<a href="#portlet-config" data-toggle="modal" class="config"></a>
									<a href="javascript:;" class="reload"></a>
									<a href="javascript:;" class="remove"></a>
								</div>
							</div>
							<div class="portlet-body flip-scroll">
								<form action="/Ying_Second/usersManager/listMember">
									用户名：<input name="name" type="text">　　手机号：<input name="mobile_Phone" type="text" >　　
									姓名：<input name="member_name" type="text">　　邀请码：<input name="invitationCode" type="text">　　
									注册时间：<input name="create_date" type="date">　
									<input type="submit" value="查询">
								</form>
								<table class="table-bordered table-striped table-condensed flip-content">
									<thead class="flip-content">
										<tr>
											<th>序号</th>
											<th class="numeric">手机号</th>
											<th class="numeric">用户名</th>
											<th class="numeric">姓名</th>
											<th class="numeric">身份证</th>
											<th class="numeric">邀请码</th>
											<th class="numeric">注册时间</th>
											<th class="numeric">操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${mlist }" var="m" varStatus="stat">
											<tr>
												<td>${stat.index+1 }</td>
												<td class="numeric">${m.mobile_Phone }</td>
												<td class="numeric">${m.member_name }</td>
												<td class="numeric">${m.name }</td>
												<td class="numeric">${m.identity }</td>
												<td class="numeric">${m.invitationCode }</td>
												<td class="numeric">${m.create_date }</td>
												<td class="numeric">账号详情</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								<div class="pagination pagination-centered">
									<ul>
										<li><a href="/Ying_Second/usersManager/listMember?type=last&currentPage=${currentPage }">Prev</a></li>
										<li><a href="#">1</a></li>
										<li><a href="#">2</a></li>
										<li class="active"><a href="#">3</a></li>
										<li><a href="#">4</a></li>
										<li><a href="#">5</a></li>
										<li><a href="/Ying_Second/usersManager/listMember?type=next&currentPage=${currentPage }">Next</a></li>
									</ul>
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