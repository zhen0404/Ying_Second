<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />

	<title>用户综合统计</title>

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

								<div class="caption"><i class="icon-cogs"></i>➤财务统计</div>

								<div class="tools">

									<a href="javascript:;" class="collapse"></a>

									<a href="#portlet-config" data-toggle="modal" class="config"></a>

									<a href="javascript:;" class="reload"></a>

									<a href="javascript:;" class="remove"></a>

								</div>

							</div>

							<div class="portlet-body flip-scroll">
							<div class="tools">
							<form action="/Ying_Second/GongGao/serTop" method="post" >
							<table  border="0">
							<thead class="flip-content" >
							<tr >
							<td  style="text-align: center">手机号码：<input class="form-control" type="text" name="mobilePhone" value=""></td>
							<td  style="text-align:left;">交易类型：<select class="form-control" name="type" id="type">
	            	<option value="">全部</option>
	            	<option value="充值">充值</option>
	            	<option value="投资">投资</option>
	            	<option value="生活消费">生活消费</option>
	            	<option value="红包返利">红包返利</option>
	            	<option value="提现">提现</option>
	                                       </select>	</td>
							</tr>
							<tr>
							<td style="text-align: center">开始时间：<input type="date" name="startDate" style="color: blue;width: 200px;height: 20px" id="t1"></td>
							<td style="text-align:left;">交易方式：<select class="form-control" name="dealway" id="dealway">
	            	<option value="">全部</option>
	            	<option value="富友">富友</option>
	            	<option value="贝付">贝付</option>
	                                    </select></td>
							</tr>
							<tr>
							<td style="text-align: center">结束时间：<input type="date" name="endDate" style="color: blue;width: 200px;height: 20px" id="t2" ></td>
							<td style="text-align:left;">&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
							                    <button type="submit">查询</button>
											  &nbsp&nbsp &nbsp&nbsp&nbsp
                                             <button type="button"  onclick="finan()">重置</button></td>
							</tr>
							</thead>
                                        </table>     
                                         
									</form>
                               
                                             </div>
                      
                    <table border="0">
                    <tr>
                    <td>
                    <h3 class="h3Tit">基本信息</h3>
            <table class="table table-bordered listTab" style="margin-top:25px"  >
             
              <tr>
                <td style="text-align: center">真实姓名</td>
                <td></td>
                <td style="text-align: center">身份证号</td>
                <td></td>
              </tr>
              <tr>
                <td style="text-align: center">手机</td>
                <td></td>
                <td style="text-align: center">注册时间</td>
                <td></td>
              </tr>
              <tr>
                <td style="text-align: center">微信账号</td>
                <td></td>
                <td style="text-align: center">QQ账号</td>
                <td></td>
              </tr>
              <tr>
                <td style="text-align: center">邀请码</td>
                <td></td>
                <td style="text-align: center">被邀请码</td>
                <td></td>
              </tr>
              
            </table>
                    </td>
                    <td>&nbsp&nbsp&nbsp</td>
                    <td>
                    <h3 class="h3Tit">基本信息</h3>
                    <table class="table table-bordered listTab" >
                      <tr>
                <td style="text-align: center">充值金额</td>
                <td></td>
                <td style="text-align: center">提现金额</td>
                <td></td>
                  </tr>
                      <tr>
                <td style="text-align: center">投资金额</td>
                <td></td>
                <td style="text-align: center">生活消费</td>
                <td></td>
                      </tr>
                       <tr>
                <td style="text-align: center">收益金额</td>
                <td></td>
                <td style="text-align: center">红包返利</td>
                <td></td>
                        </tr>
                       <tr>
                <td style="text-align: center">可用余额</td>
                <td></td>
                <td style="text-align: center">冻结余额</td>
                <td></td>
              </tr>
                       <tr>
                <td style="text-align: center">红包余额</td>
                <td></td>
                <td style="text-align: center">体验金</td>
                <td></td>
                </tr>
                    </table>
                    </td>
                    </table>
                    <h3 class="h3Tit">交易记录</h3>
                     <table class="table-bordered table-striped table-condensed flip-content">

									<thead class="flip-content">         
										<tr>

											<th>序号</th>

											<th>交易编号</th>

											<th>交易类型</th>

											<th>金额</th>

											<th>具体项目</th>
											
											<th>交易状态</th>

											<th>交易时间</th>

											<th>备注</th>

										</tr>

									</thead>

									<tbody>
										<c:forEach items="${list }" var="m" varStatus="stat">
										<tr class="">

											<td style="text-align: center"></td>

											<td style="text-align: center"></td>

											<td style="text-align: center"></td>
								
											<td style="text-align: center"><f:formatDate value="${m.create_date }" pattern="yyyy-MM-dd"/></td>
											
											<td style="text-align: center">
											
										</tr>
									  </c:forEach>


									</tbody>

								</table>
                      

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

	 function fun(){
		 window.location.href="/Ying_Second/GongGao/YjTow";
		 
	 }
	 function finan(){
			$("input[name='startDate']").val("");
			$("input[name='endDate']").val("");
		}
		jQuery(document).ready(function() {       
		   App.init();
		});
	</script>
</body>
</html>