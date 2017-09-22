package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.ExpiredCredentialsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Users;

@Controller
@RequestMapping("back")
public class BackDeskLoginController {
	
	//后台登录
	@RequestMapping("login")
	public String login(Users users,Model model,HttpServletRequest request){
		String msg="";
		System.out.println("userName:"+users.getUser_name()+"userPS:"+users.getPassword());
		Subject sub=SecurityUtils.getSubject();
		UsernamePasswordToken token=new UsernamePasswordToken(users.getUser_name(),users.getPassword());
		try {
			sub.login(token);
			request.getSession().setAttribute("userName", users.getUser_name());
			request.getSession().setAttribute("userPs", users.getPassword());
			return "backModel/back_desk";
		} catch (IncorrectCredentialsException e) {
	        msg = "��¼�������. Password for account " + token.getPrincipal() + " was incorrect.";  
	        model.addAttribute("message", msg);  
	        System.out.println(msg);
	    } catch (ExcessiveAttemptsException e) {  
	        msg = "��¼ʧ�ܴ�����";  
	        model.addAttribute("message", msg);  
	        System.out.println(msg);  
	    } catch (LockedAccountException e) {  
	        msg = "�ʺ��ѱ���. The account for username " + token.getPrincipal() + " was locked.";  
	        model.addAttribute("message", msg);  
	        System.out.println(msg);  
	    } catch (DisabledAccountException e) {  
	        msg = "�ʺ��ѱ�����. The account for username " + token.getPrincipal() + " was disabled.";  
	        model.addAttribute("message", msg);  
	        System.out.println(msg);  
	    } catch (ExpiredCredentialsException e) {  
	        msg = "�ʺ��ѹ���. the account for username " + token.getPrincipal() + "  was expired.";  
	        model.addAttribute("message", msg);  
	        System.out.println(msg);  
	    } catch (UnknownAccountException e) {  
	        msg = "�ʺŲ�����. There is no user with username of " + token.getPrincipal();  
	        model.addAttribute("message", msg);  
	        System.out.println(msg);  
	    } catch (UnauthorizedException e) {  
	        msg = "��û�еõ���Ӧ����Ȩ��" + e.getMessage();  
	        model.addAttribute("message", msg);  
	        System.out.println(msg);  
	    }
		return "backModel/back_login";
	}
	
}
