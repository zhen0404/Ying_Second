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
	
	<link href="/Ying_Second/back_desk/media/css/uniform.default.css" rel="stylesheet" type="text/css"/>

	<link rel="stylesheet" type="text/css" href="/Ying_Second/back_desk/media/css/bootstrap-tree.css" />
	
	<link rel="shortcut icon" href="/Ying_Second/back_desk/media/image/favicon.ico" />
	
	<link rel="stylesheet" href="/Ying_Second/css/metro.css">
	
</head>
<body class="page-header-fixed">

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
												<td class="numeric">${r.rname }</td>
												<td class="numeric">${r.rname }</td>
												<td class="numeric">${r.createTime }</td>
												<td class="numeric" align="center"><button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal" onclick="show(${r.id})">菜单配置</td>
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
				
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	   <div >
	      <div class="modal-content">
		         <div class="modal-header">
		            <button type="button" class="close"  data-dismiss="modal" aria-hidden="true">
		            </button>
		            <h4 class="modal-title" id="myModalLabel">
		               	权限设置
		            </h4>
		         </div>
	         <div class="modal-body">
	         	<input type="hidden" id="rid">
				<ul id="tree" class="ztree" style="width:560px; overflow:auto;"></ul>
	         </div>
	         <div class="modal-footer">
	            <button type="button" class="btn btn-default" data-dismiss="modal">关闭 </button>
	            <button type="button" class="btn btn-primary" onclick='updatePermission()' >
	               	提交更改           
	            </button>
	         </div>
	      </div>
	   </div>
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
    
<!--     tree2模板 -->
<!-- 	 <script type="text/javascript" src="/Ying_Second/js/jquery-1.4.4.min.js"></script> -->
    <script src="/Ying_Second/js/jquery.ztree.all-3.5.min.js"></script>
<!--     end tree2模板 -->

	<script>
		jQuery(document).ready(function() {   
		   App.init();
// 		   UITree.init(); //tree模板1
		});
		// begin  tree模板2
		
		function show(rid){
			alert(rid)
			$("#rid").val(rid);
			var zTree;
		    var demoIframe;

		    function addHoverDom(treeId, treeNode) {
		        var sObj = $("#" + treeNode.tId + "_span");
		        if (treeNode.editNameFlag || $("#addBtn_"+treeNode.tId).length>0) return;
		        var addStr = "<span class='button remove' id='removeBtn_" + treeNode.tId
		                + "' title='add node' onfocus='this.blur();'></span>";

		        addStr += "<span class='button add' id='addBtn_" + treeNode.tId + "'></span>";
		        addStr += "<span class='button edit' id='editBtn_" + treeNode.tId + "'></span>";
		        sObj.after(addStr);
		        var btn = $("#addBtn_"+treeNode.tId);
		        if (btn) btn.bind("click", function(){
		            var zTree = $.fn.zTree.getZTreeObj("treeDemo");
		            zTree.addNodes(treeNode, {id:(1000 + newCount), pId:treeNode.id, name:"new node" + (newCount++)});
		            return false;
		        });
		    };

		    function removeHoverDom(treeId, treeNode) {
		        $("#addBtn_"+treeNode.tId).unbind().remove();
		        $("#removeBtn_"+treeNode.tId).unbind().remove();
		        $("#editBtn_"+treeNode.tId).unbind().remove();
		    };

		    var setting = {
		        check: {
		            enable: true
		        },
		        view: {
		            addHoverDom: addHoverDom,
		            removeHoverDom: removeHoverDom,
		            dblClickExpand: false,
		            showLine: true,
		            selectedMulti: false
		        },
		        data: {
		            simpleData: {
		                enable:true,
		                idKey: "id",
		                pIdKey: "pId",
		                rootPId: ""
		            }
		        },
		        callback: {
		            beforeClick: function(treeId, treeNode) {
		                var zTree = $.fn.zTree.getZTreeObj("tree");
		                if (treeNode.isParent) {
		                    zTree.expandNode(treeNode);
		                    return false;
		                } else {
		                    demoIframe.attr("src",treeNode.file + ".html");
		                    return true;
		                }
		            }
		        }
		    };

		    var zNodes =[
		        {id:1, pId:0, name:"理财产品", open:true},
		        {id:101, pId:1, name:"固收类", file:"core/standardData"},
		        {id:102, pId:1, name:"私募/股权类", file:"core/simpleData"},
		        {id:103, pId:1, name:"海外配置", file:"core/noline"},

		        {id:2, pId:0, name:"钱包管理", open:false},
		        {id:201, pId:2, name:"钱包缴费记录", file:"excheck/checkbox"},

		        {id:3, pId:0, name:"学院管理", open:false},
		        {id:301, pId:3, name:"资讯分类", file:"exedit/drag"},
		        {id:302, pId:3, name:"资讯管理", file:"exedit/drag_super"},

		        {id:4, pId:0, name:"会员管理", open:false},
		        {id:401, pId:4, name:"账号管理", file:"bigdata/common"},
		        {id:402, pId:4, name:"理财师审核", file:"bigdata/diy_async"},
		        {id:403, pId:4, name:"绑卡管理", file:"bigdata/page"},
		        {id:404, pId:4, name:"付息计划", file:"bigdata/page"},
		        {id:405, pId:4, name:"充值管理", file:"bigdata/page"},
		        {id:406, pId:4, name:"体现管理", file:"bigdata/page"},
		        {id:407, pId:4, name:"邀请奖励", file:"bigdata/page"},

		        {id:5, pId:0, name:"盈+ 统计", open:false},
		        {id:501, pId:5, name:"财务统计", file:"super/oneroot"},
		        {id:502, pId:5, name:"用户综合统计", file:"super/oneclick"},

		        {id:6, pId:0, name:"盈+ 设置", open:false},
		        {id:601, pId:6, name:"公告管理", file:"exhide/common"},
		        {id:602, pId:6, name:"意见反馈", file:"exhide/checkbox"},
		        
		        {id:7, pId:0, name:"系统设置", open:false},
		        {id:701, pId:7, name:"用户管理", open:false},
		        	{id:70101,pId:701 ,name:"用户新增",file:"exhide/checkbox"},
		        	{id:70102,pId:701 ,name:"查看用户详情",file:"exhide/checkbox"},
		        {id:702, pId:7, name:"权限设置", file:"exhide/checkbox"},
		        	{id:70201,pId:702 ,name:"用户新增",file:"exhide/checkbox"},
		        {id:702, pId:7, name:"密码设置", file:"exhide/checkbox"}
		        
		    ];

		    $(document).ready(function(){
		        var t = $("#tree");
		        t = $.fn.zTree.init(t, setting, zNodes);
		        demoIframe = $("#testIframe");
		        demoIframe.bind("load", loadReady);
		        var zTree = $.fn.zTree.getZTreeObj("tree");
		        zTree.selectNode(zTree.getNodeByParam("id", 101));

		    });

		    function loadReady() {
		        var bodyH = demoIframe.contents().find("body").get(0).scrollHeight,
		                htmlH = demoIframe.contents().find("html").get(0).scrollHeight,
		                maxH = Math.max(bodyH, htmlH), minH = Math.min(bodyH, htmlH),
		                h = demoIframe.height() >= maxH ? minH:maxH ;
		        if (h < 530) h = 530;
		        demoIframe.height(h);
		    }
		    
		}
		
		
	    //end tree模板2
	    
	    
	    function updatePermission(){
		    	var rid=$("#rid").val();
		    	var treeObj=$.fn.zTree.getZTreeObj("tree");
		    	var nodes=treeObj.getCheckedNodes(true);
		    	var msg="";
		    	for(var i=0;i<nodes.length;i++){
		    		alert(nodes[i].id);
		    		msg+=nodes[i].id+",";
		    	}
		    	$.ajax({
		    		async : false,
		    		cache:false,
		    		timeout:1000,
		    		url:"/Ying_Second/roleper/updaterp?rid="+rid,
		    		type:"post",
		    		data:{"msg":msg,"rid":rid}
		    	});
		    	window.close();
		    }
// 	    function roles(rid){
// 	    	var setting={
// 	    			check:{
// 	    				enable:true,
// 	    				chStyle:"checkbox",
// 	    				chkboxType:{"Y":"ps","N":"ps"}
// 	    			},
// 	    			async:{
// 	    				enable:true,
// 	    				url:"/Ying_Second/roleper/listrp",
// 	    				autoParam:["id", "name"],
// 	    				otherParam:{"rid":rid}
// 	    			},
// 	    			data:{
// 	    				simpleData:{
// 	    					enable:true,
// 	    					idKey:"id",
// 	    					pIdKey:"pId",
// 	    					rootId:0
// 	    				}
// 	    			},
// 	    			callback:{
// 	    				onClick:function(event, treeId, treeNode,clickFlag){
// 	    				},
// 	    				asyncSuccess: zTreeOnAsyncSuccess,
// 	    			}
// 	    	};
// 	    	$.fn.zTree.init($("#tree"), setting);
// 	    };
	    
// 	    $(document).ready(function(){
// 	    	alert("come in");
           
//         }); 
	    
// 	    function zTreeOnAsyncSuccess(event, treeId, treeNode, msg){};
	    
	</script>
</body>
</html>