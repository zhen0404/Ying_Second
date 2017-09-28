<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
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
	
	<link href="/Ying_Second/back_desk/media/css/uniform.default.css" rel="stylesheet" type="text/css"/>

	<link rel="stylesheet" type="text/css" href="/Ying_Second/back_desk/media/css/bootstrap-tree.css" />
	
	<link rel="shortcut icon" href="/Ying_Second/back_desk/media/image/favicon.ico" />
	
	<link rel="stylesheet" href="/Ying_Second/css/metro.css">
	
</head>
<body class="page-header-fixed">
				<shiro:hasPermission name="添加角色">
				<a class="btn green" data-toggle="modal" data-target="#myModal1"><i class="icon-plus"></i> 添加</a>
				</shiro:hasPermission>
				<div class="row-fluid">
					<div class="span12">
						<div class="portlet box green">
							<div class="portlet-title">
								<div class="caption"><i class="icon-cogs"></i>角色设置</div>
								<div class="tools">
									<a href="javascript:;" class="collapse"></a>
									<a href="#portlet-config" data-toggle="modal" class="config"></a>
									<a href="javascript:;" class="reload"></a>
									<a href="javascript:;" class="remove"></a>
								</div>
							</div>
							<div class="portlet-body flip-scroll">
								<table class="table-bordered table-striped table-condensed flip-content">
									<thead class="flip-content">
										<tr>
											<th>序号</th>	
											<th class="numeric">角色名</th>
											<th class="numeric">角色描述</th>
											<th class="numeric">创建时间</th>
											<th class="numeric">菜单配置</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${rlist }" var="r" varStatus="stat">
											<tr>
												<td>${stat.index+1 }</td>
												<td class="numeric">${r.cname }</td>
												<td class="numeric">${r.remark }</td>
												<td class="numeric">${r.create_date }</td>
												<td class="numeric" align="center">
													<input type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal" onclick="cc(${r.id })" value="菜单配置" />
												</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								<div class="pagination pagination-centered">
									<ul>
										<li><a href="/Ying_Second/role/listRole?type=last&currentPage=${currentPage }">Prev</a></li>
										<li><a href="#">1</a></li>
										<li><a href="#">2</a></li>
										<li class="active"><a href="#">3</a></li>
										<li><a href="#">4</a></li>
										<li><a href="#">5</a></li>
										<li><a href="/Ying_Second/role/listRole?type=next&currentPage=${currentPage }">Next</a></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
				
				<!-- 添加-->
	<div class="modal fade" id="myModal1" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">添加角色</h4>
				</div>
				<div class="modal-body">
					<div class="input-group">
						<span class="input-group-addon">角色名</span> <input type="text"
							class="form-control" placeholder="请输入角色名称" id="roleName" required="required"><br>
					</div>
					<br>
					<div class="input-group">
						<span class="input-group-addon">备 &nbsp 注</span> <input
							type="text" class="form-control" placeholder="备注信息" id="text" ><br>
					</div>
					<br>

					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭
						</button>
						<button type="button" class="btn btn-primary" data-dismiss="modal" onclick="saveRole()">提交更改</button>
					</div>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>
	<!-- 树插件 -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">角色权限管理</h4>
				</div>
				<div class="modal-body">
					<ul id="treeDemo" class="ztree"></ul>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭
						</button>
						<button type="button" class="btn btn-primary" data-dismiss="modal"
							onclick="GetCheckedAll()">提交更改</button>
					</div>
				</div>

			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>
   
   
	<div class="footer">
		<div class="footer-inner">
			2017 &copy; Metronic by keenthemes.Collect from <a href="http://www.cssmoban.com/" title="网站模板" target="_blank">网站模板</a> - More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a>
		</div>
	</div>
	
	<script type="text/javascript" src="/Ying_Second/js/jquery-1.8.0.min.js"></script>
	
<!-- 	<script src="/Ying_Second/back_desk/media/js/jquery-1.10.1.min.js" type="text/javascript"></script> -->

	<script src="/Ying_Second/back_desk/media/js/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>

	<script src="/Ying_Second/back_desk/media/js/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>      

	<script src="/Ying_Second/back_desk/media/js/bootstrap.min.js" type="text/javascript"></script>

	<script src="/Ying_Second/back_desk/media/js/excanvas.min.js"></script>

	<script src="/Ying_Second/back_desk/media/js/respond.min.js"></script>  

	<script src="/Ying_Second/back_desk/media/js/jquery.slimscroll.min.js" type="text/javascript"></script>

	<script src="/Ying_Second/back_desk/media/js/jquery.blockui.min.js" type="text/javascript"></script>  

	<script src="/Ying_Second/back_desk/media/js/jquery.cookie.min.js" type="text/javascript"></script>

	<script src="/Ying_Second/back_desk/media/js/jquery.uniform.min.js" type="text/javascript" ></script>
	
	<script src="/Ying_Second/back_desk/media/js/bootstrap-tree.js"></script> 
	
	<script src="/Ying_Second/back_desk/media/js/app.js"></script>   

	<script src="/Ying_Second/back_desk/media/js/ui-tree.js"></script>    
	
    <script type="text/javascript" src="/Ying_Second/js/jquery.easyui.min.js"></script>
    
    <script src="/Ying_Second/js/jquery.ztree.all-3.5.min.js"></script>

	<script type="text/javascript">
	$(document).ready(function() {
		$(".click").click(function() {
			$(".tip1").show();
		});

		$(".tiptop a").click(function() {
			$(".tip").fadeOut(200);
		});

		$(".sure").click(function() {
			$(".tip").fadeOut(100);
		});

		$(".cancel").click(function() {
			$(".tip").fadeOut(100);
		});

	});
</script>
<SCRIPT type="text/javascript">
		 var cid=0;
		 function cc(id) {  
			 cid=id;
		     var setting = {  
		        check: {  
		            enable: true,  
		            chkStyle: "checkbox",  
		            chkboxType : { "Y" : "ps", "N" : "ps" }  
		        },  
		        //获取json数据  
		        async : {    
		            enable : true,   
		            url : "rolesztree", // Ajax 获取数据的 URL 地址    
		            autoParam : [ "id", "name" ], //ajax提交的时候，传的是id值  
		            otherParam: { "id":id}
		        },    
		        data:{ // 必须使用data    
		            simpleData : {
		                enable : true,    
		                idKey : "id", // id编号命名     
		                pIdKey : "pId", // 父id编号命名      
		                rootId : 0  
		            }    
		            }, 
		            
		            
		        // 回调函数    
		        callback : {    
		            onClick : function(event, treeId, treeNode, clickFlag) { 
		            },    
		            //捕获异步加载出现异常错误的事件回调函数 和 成功的回调函数    
		            onAsyncSuccess : function(event, treeId, treeNode, msg){    
		            },  
		        }   
		            
		    };  
		 $.fn.zTree.init($("#treeDemo"), setting); 
		 }
		 //获取所有选中节点的值
		 function GetCheckedAll() {
		     var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
		     var nodes = treeObj.getCheckedNodes(true);
		     var msg = "";
		     for (var i = 0; i < nodes.length; i++) {
		         msg += nodes[i].id+",";
		     }
		     $.ajax({
		         async : false,
		         cache : false,
		         timeout: 1000,
		         url: '/Ying_Second/role/PM_RolesAdd?id='+cid,
		         type: "post",
		         data:{"msg":msg,"id":cid}
		     });
		     window.close();
		      
		 }    
		 
		 function saveRole(){
			 var role=$("#roleName").val();
			 var text=$("#text").val();
			 alert(role+":"+text);
			 window.location.href="/Ying_Second/role/saveRole?role="+role+"&text="+text+"";
		 }
</SCRIPT>
</body>
</html>