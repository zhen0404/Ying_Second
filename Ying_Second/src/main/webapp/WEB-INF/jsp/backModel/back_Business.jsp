<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />

	<title>资讯管理</title>

	<meta content="width=device-width, height=device-height, initial-scale=1.0" name="viewport" />

	<meta content="" name="description " />

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

								<div class="caption"><i class="icon-cogs"></i>资讯管理</div>

								<div class="tools">

									<a href="javascript:;" class="collapse"></a>

									<a href="#portlet-config" data-toggle="modal" class="config"></a>

									<a href="javascript:;" class="reload"></a>

									<a href="javascript:;" class="remove"></a>

								</div>

							</div>

							<div class="portlet-body flip-scroll">
							<form action="" method="post" id="BusinessForm">
							<input type="hidden" name="id" id="id">
									标题： <input type="text" name="qname" value="${qname }"> 
									所属类别：<select name="typeId" id="typeId">
												<option value="-1">全选</option>
												<c:forEach items="${ListNews_type }" var="t">
												<option value="${t.id }">${t.name }</option>
												</c:forEach>
											</select>
<input type="submit" value="查找" id="find">
<input type="reset" value="重置" id="reset">
										<input type="button" value="新增" id="addBusiness" />
										
								<table class="table-bordered table-striped table-condensed flip-content">

									<thead class="flip-content">
										<tr>

											<th>序号</th>

											<th>标题</th>

											<th>所属类别</th>

											<th>排序</th>

											<th>添加时间</th>

											<th>操作</th>

										</tr>

									</thead>
									
									<tbody>
										
										<c:forEach items="${ListNews }" var="n" varStatus="stat">
									
										<tr>

											<td>${stat.index+1 }</td>
											
											<td>${n.title }</td>

											<td>${n.news_type.name }</td>

											<td>${n.sort }</td>

											<td>${n.addTime }</td>

											<td>
											<a href="/Ying_Second/business/initData/${n.id}"><input type="button" value="编辑"></a>
											<a href="/Ying_Second/business/deleteBusiness/${n.id}"><input type="button" value="删除"></a>
											</td>


										</tr>
									  </c:forEach>
									</tbody>

								</table>
								<a href="/Ying_Second/business/ListNews?flag=first&page=${pb.page }">首页</a>
								<a href="/Ying_Second/business/ListNews?flag=up&page=${pb.page }">上一页</a>
								<a href="/Ying_Second/business/ListNews?flag=next&page=${pb.page }">下一页</a>
								<a href="/Ying_Second/business/ListNews?flag=last&page=${pb.page }">末页</a>
							</form>

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

	<script type="text/javascript">
		$(document).ready(function(){
			$("#addBusiness").click(function(){
				document.forms[0].action="/Ying_Second/business/toBusinessAdd";
				document.forms[0].submit();
			});
			
			$("#find").click(function(){
				$("#BusinessForm").attr("action","/Ying_Second/business/ListNews");
				$("#BusinessForm").submit();
			});
			
		 });
	</script>
	
	<script>
		jQuery(document).ready(function() {       
		   App.init();
		});
	</script>
</body>
</html>