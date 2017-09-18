<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />

	<title>资讯分类</title>

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

								<div class="caption"><i class="icon-cogs"></i>咨询分类</div>

								<div class="tools">

									<a href="javascript:;" class="collapse"></a>

									<a href="#portlet-config" data-toggle="modal" class="config"></a>

									<a href="javascript:;" class="reload"></a>

									<a href="javascript:;" class="remove"></a>

								</div>

							</div>

							<div class="portlet-body flip-scroll">
							<form action="" method="post" id="ClassifyForm">
							
								<input type="button" value="新增" id="addClassify" />
										
								<table class="table-bordered table-striped table-condensed flip-content">

									<thead class="flip-content">
										<tr>

											<th>序号</th>

											<th>名称</th>

											<th>上级类别</th>
											
											<th>简介</th>

											<th>排序</th>

											<th>添加时间</th>

											<th>操作</th>

										</tr>

									</thead>
									
									<tbody>
										
										<c:forEach items="${ListNews_type }" var="t" varStatus="stat">
									
										<tr>

											<td>${stat.index+1 }</td>
											
											<td>${t.name }</td>

											<td>
											<c:if test="${t.supType==0 }">根目录</c:if>
											<c:if test="${t.supType==1 }">子目录</c:if>
											</td>
											
											
											<td>${t.info }</td>

											<td>${t.sort }</td>

											<td>${t.addTime }</td>

											<td>
											<a href="/Ying_Second/classify/initData/${t.id}"><input type="button" value="编辑" ></a>
											</td>


										</tr>
									  </c:forEach>
									</tbody>

								</table>
								第${pb.currentPage }页 /共${pb.allPage }页
								<a href="/Ying_Second/classify/ListNews_type?flag=first&page=${pb.currentPage }">首页</a>
								<a href="/Ying_Second/classify/ListNews_type?flag=up&page=${pb.currentPage }">上一页</a>
								<a href="/Ying_Second/classify/ListNews_type?flag=next&page=${pb.currentPage }">下一页</a>
								<a href="/Ying_Second/classify/ListNews_type?flag=last&page=${pb.currentPage }">末页</a>
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
			$("#addClassify").click(function(){
				document.forms[0].action="/Ying_Second/classify/toClassifyAdd";
				document.forms[0].submit();
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