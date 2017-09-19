<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />

	<title>Metronic | Data Tables - Responsive Tables</title>

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
	
	<script src="/Ying_Second/back_desk/media/js/jquery-1.10.1.min.js" type="text/javascript"></script>
</head>
<body class="page-header-fixed">

				<div class="row-fluid">

					<div class="span12">

						<div class="portlet box green">

							<div class="portlet-title">

								<div class="caption"><i class="icon-cogs"></i>固收类/P2P</div>

								<div class="tools">

									<a href="javascript:;" class="collapse"></a>

									<a href="#portlet-config" data-toggle="modal" class="config"></a>

									<a href="javascript:;" class="reload"></a>

									<a href="javascript:;" class="remove"></a>

								</div>

							</div>

							<div class="portlet-body flip-scroll">
				 <form method="post" action="/Ying_Second/subject/query">
                                　　<font size="4">名称:</font>:  　　<input type="text" placeholder="名称" name="name">　　　　               
               <font size="4">状态:</font>   　　 
               <select name="stat" id="zz">               
                      <option value="-1">请选择</option>
                   <option value="0">未发布</option>
                   <option value="1">募集中</option>
                   <option value="2">已发布</option> 
                   </select>  
             　　　　      <font size="4">类型:</font>   　　 
              
             <select name="type" id="zz">
             <option value="-1">请选择</option>
             <option value="0">固收类</option>
			 <option value="1">P2P车贷</option>
			 <option value="2">P2P房贷</option>                    
                   </select>　            　　　　　
                   
                   <input type="submit" value="🔍查询" class="btn yellow">　　　　　　　　　　　
          <a href="/Ying_Second/subject/list" class="btn blue"><i class="icon-plus"></i> 重置</a>　　　
          <a href="/Ying_Second/subject/addjsp" class="btn green"><i class="icon-plus"></i> 添加</a>
          </form>
								<table class="table-bordered table-striped table-condensed flip-content">

									<thead class="flip-content">
										<tr>
											<th><font size="4">序号</font></th>
											<th><font size="4">合同编号</font></th>
											<th><font size="4">类型</font></th>
											<th><font size="4">名称</font></th>
											<th><font size="4">标的总金额</font></th>
											<th><font size="4">已投总金额</font></th>
											<th><font size="4">投资期限</font></th>
											<th><font size="4">起投金额</font></th>
											<th><font size="4">年化收益</font></th>
											<th><font size="4">状态</font></th>
											<th><font size="4">可使用体验金</font></th>
											<th><font size="4">添加时间</font></th>
											<th><font size="4">操作</font></th>
										</tr>
									</thead>

									<tbody>
                                   <c:forEach items="${list}" var="list"  varStatus="stat">
										<tr>
											<td class="numeric">${stat.index+1}</td>
											<td class="numeric">${list.serial_no}</td>
											<td>
											 <c:if test="${list.type==0}">固守类</c:if>
											 <c:if test="${list.type==1}">p2p车贷</c:if>
											 <c:if test="${list.type==2}">p2p房贷</c:if>
											 </td>
											<td class="numeric">${list.name}</td>
											      <td>
													<script type="text/javascript">
														var id = ${list.id};
														
														$.ajaxSetup({
 															async : false
 														});
														var num1 = 0;
														$.post("/Ying_Second/subject/getTotalMoney", {
															id : id
														}, function(data) {
															num1=data;
															
														});
														document.write("￥"+num1);
														</script>
														</td>
											<td class="numeric" align="center">${list.amount}</td>
                  
											   <td class="numeric" align="center">${list.period}天</td>

											<td class="numeric" align="center" >Y${list.floor_amount }</td>
											<td class="numeric" align="center" >${list.year_rate}</td>
											<td class="numeric">
											<c:if test="${list.status==0}">未发布</c:if>
											<c:if test="${list.status==1}">募集中</c:if>
											<c:if test="${list.status==2}">已结束</c:if>
											</td>
											<td class="numeric" align="center">
											<c:if test="${list.exper_status==0}">否</c:if>
											<c:if test="${list.exper_status==1}">是</c:if>
											</td>						
											<td class="numeric">${list.create_date }</td>
											<td class="numeric">
											<a href="/Ying_Second/subject/selectSub?id=${list.id}" class="btn yellow"><i class="icon-plus"></i> 编辑/查看</a>
											<a href="/Ying_Second/subject/queryinvest" class="btn blue"><i class="icon-plus"></i> 查看投资</a>
											</td>

										</tr>
                                       </c:forEach>
									</tbody>

								</table>
								<br><br><br><br><br><br><br><br><br><br><br>

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