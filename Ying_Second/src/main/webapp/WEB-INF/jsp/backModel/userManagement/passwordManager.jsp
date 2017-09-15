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
<!-- 	   <form class="form-horizontal" role="form" action="/Ying_Second/password/update"> -->
<!-- 	   <div class="form-group"> -->
<!-- 	      <label for="firstname" class="col-sm-2 control-label">原密码：</label> -->
<!-- 	      <div class="col-sm-10"> -->
<!-- 	         <input type="text" class="form-control" id="firstname" placeholder="请输入原密码"> -->
<!-- 	      </div> -->
<!-- 	   </div> -->
<!-- 	   <div class="form-group"> -->
<!-- 	      <label for="lastname" class="col-sm-2 control-label">新密码：</label> -->
<!-- 	      <div class="col-sm-10"> -->
<!-- 	         <input type="text" class="form-control" id="lastname"  placeholder="请输入新密码"> -->
<!-- 	      </div> -->
<!-- 	   </div> -->
<!-- 	   <div class="form-group"> -->
<!-- 	      <label for="lastname" class="col-sm-2 control-label">重复新密码：</label> -->
<!-- 	      <div class="col-sm-10"> -->
<!-- 	         <input type="text" class="form-control" id="lastname" placeholder="请再次输入新密码"> -->
<!-- 	      </div> -->
<!-- 	   </div> -->
<!-- 	   <div class="form-group"> -->
<!-- 	      <div class="col-sm-offset-2 col-sm-10"> -->
<!-- 	         <button type="submit"  class="btn btn-primary">修改</button> -->
<!-- 	      </div> -->
<!-- 	   </div> -->
<!--    </form> -->
   
   
   <form id="defaultForm" role="form" class="form-signin" action="registerAccount.do" method="post">

                <div class="form-group">
                    <label for="oldpassword">原密码：</label><input class="form-control"
                        type="password" name="oldpassword" id="password"/>
                </div>
                <div class="form-group">
                    <label for="newpassword">新密码：</label><input class="form-control"
                        type="password" name="password" id="password"/>
                </div>
                <div class="form-group">
                    <label for="renewpassword">确认新密码：</label><input class="form-control"
                        type="password" name="repassword" id="repassword" />
                </div>
            </form>
            
            
   
   <script type="text/javascript" src="/Ying_Second/js/jquery.js"></script>
   
   <script type="text/javascript" src="/Ying_Second/js/bootstrap.js"></script>
   
   <script type="text/javascript" src="/Ying_Second/js/bootstrapValidator.js"></script>
   
   <script type="text/javascript">
//    $(function(){
// 	   $("#firstname").bootstrapValidator({
// // 		    excluded:[":hidden",":disabled",":not(visible)"] , bootstrapValidator的默认配置
// 		    excluded:[":disabled"],
// 		   //关键配置，表示只对于禁用域不进行验证，其他的表单元素都要验证
// 		    fields: {
// 		        productId: {
// 		            validators: {
// 		                notEmpty: {
// 		                    message: '请填写原密码'
// 		                }
// 		            }
// 		        }
// 		    }
// 		});
//    });
   
   $(function(){/* 文档加载，执行一个函数*/
	     $('#defaultForm').bootstrapValidator({
	         message: 'This value is not valid',
	         feedbackIcons: {/*input状态样式图片*/
	             valid: 'glyphicon glyphicon-ok',
	             invalid: 'glyphicon glyphicon-remove',
	             validating: 'glyphicon glyphicon-refresh'
	         },
	         fields: {/*验证：规则*/
	        	 password: {
	                 message:'密码无效',
	                 validators: {
	                     notEmpty: {
	                         message: '密码不能为空'
	                     },
// 	                     identical: {//相同
// 	                         field: 'password', //需要进行比较的input name值
// 	                         message: '两次密码不一致'
// 	                     },
// 	                     different: {//不能和用户名相同
// 	                         field: 'username',//需要进行比较的input name值
// 	                         message: '不能和用户名相同'
// 	                     },
 						 remote: {//ajax验证。server result:{"valid",true or false} 向服务发送当前input name值，获得一个json数据。例表示正确：{"valid",true}  
                         url: 'password/verify',//验证地址
//                          message: '用户已存在',//提示消息
                         delay :  1000,//每输入一个字符，就发ajax请求，服务器压力还是太大，设置2秒发送一次ajax（默认输入一个字符，提交一次，服务器压力太大）
                         type: 'post', //请求方式
//                          自定义提交数据，默认值提交当前input value
                           data: function(validator) {
                               return {
                                   newpassword: $('[name="oldpassword"]').val(),
//                                    whatever: $('[name="whateverNameAttributeInYourForm"]').val()
                               };
                            }
                          
                     },
	                     regexp: {
	                         regexp: /^[a-zA-Z0-9_\.]+$/,
	                         message: 'The username can only consist of alphabetical, number, dot and underscore'
	                     }
	                 }
	             },
	             newpassword: {
	                 message:'密码无效',
	                 validators: {
	                     notEmpty: {
	                         message: '密码不能为空'
	                     },
	                     stringLength: {
	                         min: 6,
	                         max: 30,
	                         message: '用户名长度必须在6到30之间'
	                     },
	                     identical: {//相同
	                         field: 'password', //需要进行比较的input name值
	                         message: '两次密码不一致'
	                     },
	                     different: {//不能和用户名相同
	                         field: 'username',//需要进行比较的input name值
	                         message: '不能和用户名相同'
	                     },
	                     regexp: {
	                         regexp: /^[a-zA-Z0-9_\.]+$/,
	                         message: 'The username can only consist of alphabetical, number, dot and underscore'
	                     }
	                 }
	             },
	             repassword: {
	                 message: '密码无效',
	                 validators: {
	                     notEmpty: {
	                         message: '用户名不能为空'
	                     },
	                     stringLength: {
	                         min: 6,
	                         max: 30,
	                         message: '用户名长度必须在6到30之间'
	                     },
	                     identical: {//相同
	                         field: 'newpassword',
	                         message: '两次密码不一致'
	                     },
	                     different: {//不能和用户名相同
	                         field: 'username',
	                         message: '不能和用户名相同'
	                     },
	                     regexp: {//匹配规则
	                         regexp: /^[a-zA-Z0-9_\.]+$/,
	                         message: 'The username can only consist of alphabetical, number, dot and underscore'
	                     }
	                 }
	             },
	             email: {
	                 validators: {
	                     notEmpty: {
	                         message: '邮件不能为空'
	                     },
	                     emailAddress: {
	                         message: '请输入正确的邮件地址如：123@qq.com'
	                     }
	                 }
	             },
	             phone: {
	                 message: 'The phone is not valid',
	                 validators: {
	                     notEmpty: {
	                         message: '手机号码不能为空'
	                     },
	                     stringLength: {
	                         min: 11,
	                         max: 11,
	                         message: '请输入11位手机号码'
	                     },
	                     regexp: {
	                         regexp: /^1[3|5|8]{1}[0-9]{9}$/,
	                         message: '请输入正确的手机号码'
	                     }
	                 }
	             },
	             invite: {
	                 message: '邀请码',
	                 validators: {
	                     notEmpty: {
	                         message: '邀请码不能为空'
	                     },
	                     stringLength: {
	                         min: 8,
	                         max: 8,
	                         message: '请输入正确长度的邀请码'
	                     },
	                     regexp: {
	                         regexp: /^[\w]{8}$/,
	                         message: '请输入正确的邀请码(包含数字字母)'
	                     }
	                 }
	             },
	         }
	     })
	     .on('success.form.bv', function(e) {//点击提交之后
	         // Prevent form submission
	         e.preventDefault();

	         // Get the form instance
	         var $form = $(e.target);

	         // Get the BootstrapValidator instance
	         var bv = $form.data('bootstrapValidator');

	         // Use Ajax to submit form data 提交至form标签中的action，result自定义
	         $.post($form.attr('action'), $form.serialize(), function(result) {
	//do something...
	});
	     });
	});
   </script>
   
</body>
</html>