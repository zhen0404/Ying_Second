<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />

	<title>添加资讯管理</title>

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
	
	
	
	<link href="/Ying_Second/back_desk/media/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/style-metro.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/style.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/style-responsive.css" rel="stylesheet" type="text/css"/>

	<link href="/Ying_Second/back_desk/media/css/default.css" rel="stylesheet" type="text/css" id="style_color"/>

	<link href="/Ying_Second/back_desk/media/css/uniform.default.css" rel="stylesheet" type="text/css"/>

	<link rel="stylesheet" type="text/css" href="/Ying_Second/back_desk/media/css/bootstrap-fileupload.css" />

	<link rel="stylesheet" type="text/css" href="/Ying_Second/back_desk/media/css/jquery.gritter.css" />

	<link rel="stylesheet" type="text/css" href="/Ying_Second/back_desk/media/css/chosen.css" />

	<link rel="stylesheet" type="text/css" href="/Ying_Second/back_desk/media/css/select2_metro.css" />

	<link rel="stylesheet" type="text/css" href="/Ying_Second/back_desk/media/css/jquery.tagsinput.css" />

	<link rel="stylesheet" type="text/css" href="/Ying_Second/back_desk/media/css/clockface.css" />

	<link rel="stylesheet" type="text/css" href="/Ying_Second/back_desk/media/css/bootstrap-wysihtml5.css" />

	<link rel="stylesheet" type="text/css" href="/Ying_Second/back_desk/media/css/datepicker.css" />

	<link rel="stylesheet" type="text/css" href="/Ying_Second/back_desk/media/css/timepicker.css" />

	<link rel="stylesheet" type="text/css" href="/Ying_Second/back_desk/media/css/colorpicker.css" />

	<link rel="stylesheet" type="text/css" href="/Ying_Second/back_desk/media/css/bootstrap-toggle-buttons.css" />

	<link rel="stylesheet" type="text/css" href="/Ying_Second/back_desk/media/css/daterangepicker.css" />

	<link rel="stylesheet" type="text/css" href="/Ying_Second/back_desk/media/css/datetimepicker.css" />

	<link rel="stylesheet" type="text/css" href="/Ying_Second/back_desk/media/css/multi-select-metro.css" />

	<link href="media/css/bootstrap-modal.css" rel="stylesheet" type="text/css"/>

	<link rel="shortcut icon" href="/Ying_Second/back_desk/media/image/favicon.ico" />
	
	<script type="text/javascript" charset="utf-8" src="/yingJiaFinancing/js/utf8-jsp/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="/yingJiaFinancing/js/utf8-jsp/ueditor.all.min.js"> </script>
    <!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
    <!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
    <script type="text/javascript" charset="utf-8" src="/Ying_Second/js/utf8-jsp/zh-cn/zh-cn.js"></script>
    	<style type="text/css">
.fin{
	color:white;
	background-color: limegreen;
}
</style>
</head>
<body class="page-header-fixed">

<div class="page-container row-fluid">

		<div class="page-content">

			<div class="container-fluid">

				<div class="row-fluid">

					<div class="span12">

						<div class="portlet box green">

							<div class="portlet-title">

								<div class="caption"><i class="icon-cogs"></i>添加资讯</div>

								<div class="tools">

									<a href="javascript:;" class="collapse"></a>

									<a href="#portlet-config" data-toggle="modal" class="config"></a>

									<a href="javascript:;" class="reload"></a>

									<a href="javascript:;" class="remove"></a>

								</div>

							</div>

							<div class="portlet-body flip-scroll">

								<form action="/Ying_Second/business/saveBusiness" method="post">
									所属类别<font color="red">*</font>：<select name="typeId" id="typeId" required placeholder="必填">
												<c:forEach items="${typeList }" var="t">
												<option value="${t.id }">${t.name }</option>
												</c:forEach>                                                                                                                                                                                                                                                                           
											</select><br><br>
									标题<font color="red">*</font>：<input type="text" name="title" required placeholder="必填"><br><br>
									排序<font color="red">*</font>：<input type="number" name="sort" required placeholder="必填"><br><br>
									简介：<input type="text" name="info"><br><br>
									显示属性：<input type="checkbox" id="top" name="top">是否置顶<br><br>
									<div class="row-fluid">
					          <div class="span12">
								<div class="tools">
									<a href="javascript:;" class="reload"></a>
								</div>
								<div class="control-group">
										<label class="control-label">简介</label>
										<div class="controls">
											<textarea class="span12 wysihtml5 m-wrap" rows="6" name="comment"></textarea>
										</div>
									</div>
							 </div>
						</div><br><br>
									
									<input type="submit" value="保存" class="fin">
								
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

	<script>
		jQuery(document).ready(function() {       
		   App.init();
		});
		
	</script>
</body>
</html>