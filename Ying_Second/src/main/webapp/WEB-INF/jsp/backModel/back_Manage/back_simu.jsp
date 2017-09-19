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
</head>
<body class="page-header-fixed">



				<div class="row-fluid">

					<div class="span12">

						<div class="portlet box green">

							<div class="portlet-title">

								<div class="caption"><i class="icon-cogs"></i>私募/股权类</div>

								<div class="tools">

									<a href="javascript:;" class="collapse"></a>

									<a href="#portlet-config" data-toggle="modal" class="config"></a>

									<a href="javascript:;" class="reload"></a>

									<a href="javascript:;" class="remove"></a>

								</div>

							</div>

							<div class="portlet-body flip-scroll">
				 <form method="post" action="/Ying_Second/simu/query">
                                　　<font size="4">名称:</font>　　<input type="text" placeholder="名称" name="name">　　　　               
               <font size="4">状态:</font>   　　 
               <select name="stat" id="zz">               
                      <option value="-1">请选择</option>
                   <option value="0">募集中</option>
                   <option value="1">未募集</option>
                   <option value="2">还款中</option> 
                   </select>  
             　　　　      <font size="4">类型:</font>   　　 
             <select name="type" id="zz">
             <option value="-1">请选择</option>
             <option value="SIMU">私募类</option>
			 <option value="GUQUAN">股权类</option>             
                   </select>　            　　　　　
                   
                   <input type="submit" value="🔍查询" class="btn yellow">　　　　　　　　　　　
          <a href="/Ying_Second/simu/list" class="btn blue"><i class="icon-plus"></i> 重置</a>　　　
          <a href="/Ying_Second/simu/toAdd" class="btn green"><i class="icon-plus"></i> 添加</a>
          </form>
								<table class="table-bordered table-striped table-condensed flip-content">

									<thead class="flip-content">
										<tr>
											<th><font size="4">序号</font></th>
											<th><font size="4">名称</font></th>
											<th><font size="4">类型</font></th>
											<th><font size="4">状态</font></th>
											<th><font size="4">年化收益</font></th>
											<th><font size="4">返佣比例</font></th>
											<th><font size="4">投资期限</font></th>
											<th><font size="4">起投金额</font></th>
											<th><font size="4">添加时间</font></th>
											<th><font size="4">操作</font></th>
										</tr>
									</thead>

									<tbody>
                                   <c:forEach items="${list}" var="list"  varStatus="stat">
										<tr>
											<td class="numeric">${stat.index+1}</td>
											<td class="numeric">${list.name}</td>
											<td class="numeric">
											<c:if test="${list.type=='SIMU'}">私募类</c:if>
											 <c:if test="${list.type=='GUQUAN'}">股权类</c:if>
											</td>
											<td>
											 <c:if test="${list.status==0}">募集中</c:if>
											 <c:if test="${list.status==1}">未募集</c:if>
											 <c:if test="${list.status==2}">还款中</c:if>
											 </td>
											<td class="numeric" align="center">${list.year_rate}%</td>
											<td class="numeric" align="center">${list.ratio}</td>
										    <td class="numeric" align="center">${list.period}天</td>
											<td class="numeric" align="center" >${list.floor_amount }</td>
											<td class="numeric" align="center" >${list.create_date}</td>
											<td class="numeric" align="center">
											<a href="/Ying_Second/simu/selectId?id=${list.id}" class="btn yellow"><i class="icon-plus"></i> 编辑/查看</a>
											<a href="/Ying_Second/simu/qianstat?id=${list.id}" class="btn blue"><i class="icon-plus"></i> 签署状态</a>
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