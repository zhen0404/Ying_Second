<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Metronic | Form Stuff - Form Components</title>

	<meta content="width=device-width, initial-scale=1.0" name="viewport" />

	<meta content="" name="description" />

	<meta content="" name="author" />

	<!-- BEGIN GLOBAL MANDATORY STYLES -->

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

      </head>
<body>
		<div class="row-fluid">
			<div class="span12">
				<div class="portlet box blue">
					<div class="portlet-title">
							
						<div class="caption"><i class="icon-reorder"></i>海外配置添加</div>
								   <div class="tools">
							<a href="javascript:;" class="collapse"></a>
							<a href="javascript:;" class="reload"></a>
								    </div>
							       </div>

					  <div class="portlet-body form">
						<form action="/Ying_Second/oversea/add" class="form-horizontal" method="post">					
									<div class="control-group">
										<label class="control-label">标题 ：</label>
										<div class="controls">
											<input class="span6 m-wrap" type="text" name="title" required="required"/>
										</div>
									</div>

									<div class="control-group">
										<label class="control-label">子标题： </label>
										<div class="controls">
											<input class="span6 m-wrap" type="text" name="child_title" required="required"/>                                
										</div>
									</div>

									<div class="control-group">
										<label class="control-label">状态：</label>
										<div class="controls">
											<select  tabindex="1" name="status">
												<option value="-1">请选择</option>
												<option value="0">未募集</option>
                                                <option value="1">募集中</option>
											</select>
										</div>
									</div>

									<div class="control-group">
									<label class="control-label">图标:</label>
										<div class="controls">
											<input class="span6 m-wrap" type="text" name="oversea_icon" required="required"/>											
										</div>
									</div>
									
									<div class="control-group">
									<label class="control-label">排序值:</label>
										<div class="controls">
											<input class="span6 m-wrap" type="text" name="sortColum" required="required"/>											
										</div>
									</div>
						     <div class="form-actions" align="center">
						  <input type="submit" class="btn blue" value="提交">　　　　　　         
									</div>
						</form>

							</div>
						</div>
					</div>
				</div>

	<script src="/Ying_Second/back_desk/media/js/jquery-1.10.1.min.js" type="text/javascript"></script>
	<script src="/Ying_Second/back_desk/media/js/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
	<script src="/Ying_Second/back_desk/media/js/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>      
	<script src="/Ying_Second/back_desk/media/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="/Ying_Second/back_desk/media/js/jquery.slimscroll.min.js" type="text/javascript"></script>
	<script src="/Ying_Second/back_desk/media/js/jquery.blockui.min.js" type="text/javascript"></script>  
	<script src="/Ying_Second/back_desk/media/js/jquery.cookie.min.js" type="text/javascript"></script>
	<script src="/Ying_Second/back_desk/media/js/jquery.uniform.min.js" type="text/javascript" ></script>
	<script type="text/javascript" src="/Ying_Second/back_desk/media/js/ckeditor.js"></script>  
	<script type="text/javascript" src="/Ying_Second/back_desk/media/js/bootstrap-fileupload.js"></script>
	<script type="text/javascript" src="/Ying_Second/back_desk/media/js/chosen.jquery.min.js"></script>
	<script type="text/javascript" src="/Ying_Second/back_desk/media/js/select2.min.js"></script>
	<script type="text/javascript" src="/Ying_Second/back_desk/media/js/wysihtml5-0.3.0.js"></script> 
	<script type="text/javascript" src="/Ying_Second/back_desk/media/js/bootstrap-wysihtml5.js"></script>
	<script type="text/javascript" src="/Ying_Second/back_desk/media/js/jquery.tagsinput.min.js"></script>
	<script type="text/javascript" src="/Ying_Second/back_desk/media/js/jquery.toggle.buttons.js"></script>
	<script type="text/javascript" src="/Ying_Second/back_desk/media/js/bootstrap-datepicker.js"></script>
	<script type="text/javascript" src="/Ying_Second/back_desk/media/js/bootstrap-datetimepicker.js"></script>
	<script type="text/javascript" src="/Ying_Second/back_desk/media/js/clockface.js"></script>
	<script type="text/javascript" src="/Ying_Second/back_desk/media/js/date.js"></script>
	<script type="text/javascript" src="/Ying_Second/back_desk/media/js/daterangepicker.js"></script> 
	<script type="text/javascript" src="/Ying_Second/back_desk/media/js/bootstrap-colorpicker.js"></script>  
	<script type="text/javascript" src="/Ying_Second/back_desk/media/js/bootstrap-timepicker.js"></script>
	<script type="text/javascript" src="/Ying_Second/back_desk/media/js/jquery.inputmask.bundle.min.js"></script>   
	<script type="text/javascript" src="/Ying_Second/back_desk/media/js/jquery.input-ip-address-control-1.0.min.js"></script>
	<script type="text/javascript" src="/Ying_Second/back_desk/media/js/jquery.multi-select.js"></script>   
	<script src="/Ying_Second/back_desk/media/js/bootstrap-modal.js" type="text/javascript" ></script>
	<script src="/Ying_Second/back_desk/media/js/bootstrap-modalmanager.js" type="text/javascript" ></script> 
	<script src="/Ying_Second/back_desk/media/js/app.js"></script>
	<script src="/Ying_Second/back_desk/media/js/form-components.js"></script>     
	<script>
		jQuery(document).ready(function() {       
		   App.init();
		   FormComponents.init();
		});
	 </script>
</body>
</html>