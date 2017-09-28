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
							<a class="btn green" data-toggle="modal" data-target="#myModal1"><i class="icon-plus"></i> 添加用户</a>
								<table class="table-bordered table-striped table-condensed flip-content">
									<thead class="flip-content">
										<tr>
								        <th>用户名</th>
								         <th>昵称</th>
								          <th>密码</th>
								           <th>密码盐</th>
								           <th>电话</th>
								           <th>状态</th>
								        <th>是否删除</th>
								        <th>身份</th>
								        <th>创建时间</th>
								         <th>修改时间</th>
								          <th>角色</th>
								        </tr>
									</thead>
									<tbody>
										<c:forEach items="${userList}" var="e" varStatus="state" >
									        <tr>
									        <td>${e.user_name }</td>
									        <td>${e.name}</td>
									        <td>${e.password }</td>
									        <td>${e.salt }</td>
									        <td>${e.mobile_Phone}</td>
									        <td>${e.status }</td>
									        <td>${e.del_flag}</td>
									        <td>${e.identity}</td>
									        <td>${e.create_date}</td>
									        <td>${e.update_date}</td>
									        <td>${e.userrole.cname}</td>
									          <td>
									          	<a class="btn yellow" href="/Ying_Second/usersManager/delete?id=${e.id }">删除</a>
									          </td>
									          <td>
									          	<a class="btn green" data-toggle="modal" data-target="#myModal2"><i class="icon-plus"></i> 修改用户</a>
									          	<a href="/Ying_Second/usersManager/initData?id=${e.id }"></a>
									          	<div class="modal fade" id="myModal2" tabindex="-1" role="dialog"
													aria-labelledby="myModalLabel" aria-hidden="true">
													<div class="modal-dialog">
														<div class="modal-content">
															<div class="modal-header">
																<button type="button" class="close" data-dismiss="modal"
																	aria-hidden="true">&times;</button>
																<h4 class="modal-title" id="myModalLabel">修改用户</h4>
															</div>
															<div class="modal-body">
															<input type="hidden" value="${e.id }" id="uid${state.index+1}">
																<div class="input-group">
																	<span class="input-group-addon">角色</span>
																	<select id="role${state.index+1}" >
																		<c:forEach items="${rlist }" var="r">
																			<option value="${r.id }">${r.cname }</option>
																		</c:forEach>
																	</select>
																</div>
																<br>
<!-- 																<div class="input-group"> -->
<!-- 																	<span class="input-group-addon">备 &nbsp 注</span> <input -->
<!-- 																		type="text" class="form-control" placeholder="备注信息" id="text" ><br> -->
<!-- 																</div> -->
																<br>
											
																<div class="modal-footer">
																	<button type="button" class="btn btn-default" data-dismiss="modal">关闭
																	</button>
																	<button type="button" class="btn btn-primary" data-dismiss="modal" onclick="updateRole(${state.index+1})">提交更改</button>
																</div>
															</div>
														</div>
														<!-- /.modal-content -->
													</div>
													<!-- /.modal -->
												</div>
									          </td>
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
	<div class="modal fade" id="myModal1" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">添加用户</h4>
				</div>
				<div class="modal-body">
					<div class="input-group">
						<span class="input-group-addon">用户名：</span> <input type="text"
							class="form-control" placeholder="请输入用户名" id="userName" required="required"><br>
					</div>
					<br>
					<div class="input-group">
						<span class="input-group-addon">密码：</span> <input type="text"
							class="form-control" placeholder="请输入密码" id="ps" required="required"><br>
					</div>
					<br>
					<div class="input-group">
						<span class="input-group-addon">手机号：</span> 
						<input type="text" class="form-control" placeholder="请输入手机号" id="phone" required="required" ><br>
					</div>
					<br>
					<div class="input-group">
						<select id="rid" >
							<c:forEach items="${rlist }" var="r">
								<option value="${r.id }">${r.cname }</option>
							</c:forEach>
						</select>
					</div>
					
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭
						</button>
						<button type="button" class="btn btn-primary" data-dismiss="modal" onclick="saveUsers()">提交更改</button>
					</div>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
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
	<script type="text/javascript">
		function updateRole(rid){
			var rid=$("#role"+rid+"").val();
			var uid=$("#uid"+rid+"").val();
			alert(rid+":"+uid);
			window.location.href="/Ying_Second/usersManager/updateRole?uid="+uid+"&rid="+rid+"";
		}
		
		function saveUsers(){
			var rid=$("#rid").val();
			var userName=$("#userName").val();
			var phone=$("#phone").val();
			var ps=$("#ps").val();
			window.location.href="/Ying_Second/usersManager/saveUsers?rid="+rid+"&user_name="+userName+"&mobile_Phone="+phone+"&password="+ps+"";
		}
	</script>
</body>
</html>