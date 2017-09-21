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

	<!-- END GLOBAL MANDATORY STYLES -->

	<!-- BEGIN PAGE LEVEL STYLES -->

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

								<div class="caption"><i class="icon-cogs"></i>➤添加公告</div>

								<div class="tools">

									<a href="javascript:;" class="collapse"></a>

									<a href="#portlet-config" data-toggle="modal" class="config"></a>

									<a href="javascript:;" class="reload"></a>

									<a href="javascript:;" class="remove"></a>

								</div>

							</div>

							<div class="portlet-body flip-scroll">
                                  <form action="/Ying_Second/GongGao/serTow" method="post">
											标题：<input type="text" name="title">
										
								<div class="row-fluid">
					          <div class="span12">
						 
								<div class="tools">
									<a href="javascript:;" class="collapse"></a>
									<a href="javascript:;" class="reload"></a>
								</div>
								<div class="control-group">
										<label class="control-label">➤内容</label>
										<div class="controls">
											<textarea class="span12 wysihtml5 m-wrap" rows="6" name="content"></textarea>
										</div>
									</div>
							    </div>
						     </div>
                                    <input type="submit" value="添加" style="text-align: center"> 
							</form>

							</div>

						</div>

					</div>

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

	<!-- END PAGE LEVEL PLUGINS -->

	<!-- BEGIN PAGE LEVEL SCRIPTS -->

	<script src="/Ying_Second/back_desk/media/js/app.js"></script>

	<script src="/Ying_Second/back_desk/media/js/form-components.js"></script>     

	<!-- END PAGE LEVEL SCRIPTS -->

	<script>

		jQuery(document).ready(function() {       

		   // initiate layout and plugins

		   App.init();

		   FormComponents.init();

		});

	 </script>
</body>
</html>