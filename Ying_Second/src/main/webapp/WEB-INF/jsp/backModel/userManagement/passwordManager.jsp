<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />

	<title>密码管理</title>

	<link  rel="stylesheet"  href="/Ying_Second/css/bootstrap.css" />
	
	<link rel="stylesheet"  href="/Ying_Second/css/bootstrapValidator.css">
	
</head>
<body>
	<br><br><br><br>
	   <form class="form-horizontal" role="form" action="/Ying_Second/password/update">
	   <input type="hidden" id="oldpassword" name="oldpassword" value="${userPs }">
	   <input type="hidden" id="userName" name="userName" value="${userName }">
	   <input type="hidden" id="newps1" name="newps1">
	   <div class="form-group">
	      <label for="password" class="col-sm-2 control-label">原密码：</label>
	      <div class="col-sm-10">
	         <input type="password" class="form-control" id="oldps" placeholder="请输入原密码" onkeyup="checkuse()">
	         <span style="display: none;color: red" id="yps">原密码不正确</span>
	      </div>
	   </div>
	   <div class="form-group">
	      <label for="password" class="col-sm-2 control-label">新密码：</label>
	      <div class="col-sm-10">
	         <input type="password" class="form-control" id="newps" name="newps"  placeholder="请输入新密码" >
	      </div>
	   </div>
	   <div class="form-group">
	      <label for="password" class="col-sm-2 control-label">重复新密码：</label>
	      <div class="col-sm-10">
	         <input type="password" class="form-control" id="renewps" placeholder="请再次输入新密码" onkeyup="checknewps()">
	         <span style="display: none;color: red" id="ylps">两次密码不一致</span>
	      </div>
	   </div>
	   <div class="form-group">
	      <div class="col-sm-offset-2 col-sm-10">
	         <button type="submit"  class="btn btn-primary">修改</button>
	      </div>
	   </div>
   </form>
   
   <script type="text/javascript" src="/Ying_Second/js/jquery.js"></script>
   
   <script type="text/javascript" src="/Ying_Second/js/bootstrap.js"></script>
   
   <script type="text/javascript" src="/Ying_Second/js/bootstrapValidator.js"></script>
   
   <script type="text/javascript">
   
    function checknewps(){
	   var newps=$("#newps").val();
	   var renewps=$("#renewps").val();
		if(newps!=renewps){
			$("#ylps").show();
		}
		if(newps==renewps){
			$("#ylps").hide();
		}
	  } 
   
   function checkuse(){
	   var oldps=$("#oldps").val();
	   var oldpassword=$("#oldpassword").val();
		if(oldps!=oldpassword){
			$("#yps").show();
			$("#oldps").focus();
		}
		if(oldps==oldpassword){
			$("#yps").hide();
			$("#newps").focus();
		}
	  } 
   	
   </script>
   
</body>
</html>