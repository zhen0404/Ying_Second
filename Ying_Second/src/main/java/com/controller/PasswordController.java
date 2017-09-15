package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.UserPasswordService;

@Controller
@RequestMapping("password")
public class PasswordController {

	@Autowired
	@Qualifier("userPasswordServiceImpl")
	private UserPasswordService ups;
	
	@RequestMapping("update")
	public String updatePassword(String newpassword,HttpServletRequest request){
		String userName=(String) request.getSession().getAttribute("userName");
		this.ups.updateUserPassword(userName, newpassword);
		return "";
	}
	
	@RequestMapping("show")
	public String show(){
		return "backModel/userManagement/passwordManager";
	}
	
	@RequestMapping("verify")
	public String verify(String newpassword,HttpServletRequest request){
		String msg="";
		boolean b=false;
		if(newpassword.equals(request.getSession().getAttribute("userPs"))){
			b=true;
		}
		Map<String,Boolean> map=new HashMap<String,Boolean>(); 
		map.put("valid", b);
		System.out.println(b);
//		ObjectMapper mapper=new ObjectMapper();
//		String res="";
//			try {
//				res =mapper.writeValueAsString(map);
//				System.out.println(res);
//			} catch (JsonProcessingException e) {
//				e.printStackTrace();
//			}
		return "";
	}
	
	
}
