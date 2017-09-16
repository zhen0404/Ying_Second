package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
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
	public String updatePassword(String newps,String userName,HttpServletRequest request){
		System.out.println("newps:"+newps);
		System.out.println(userName);
		this.ups.updateUserPassword(userName, newps);
		return "redirect:/backLogin";
	}
	
	@RequestMapping("show")
	public String show(){
		return "backModel/userManagement/passwordManager";
	}
	
	@RequestMapping("verify")
	public String verify(String newpassword,HttpServletRequest request){
		System.out.println("password—È÷§");
		boolean b=false;
		if(newpassword.equals(request.getSession().getAttribute("userPs"))){
			b=true;
		}
		Map<String,Boolean> map=new HashMap<String,Boolean>(); 
		map.put("valid", b);
		System.out.println(b);
		ObjectMapper mapper=new ObjectMapper();
		String res="";
				try {
					res =mapper.writeValueAsString(map);
				} catch (JsonGenerationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (JsonMappingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(res);
		return "";
	}
	
	@RequestMapping("old")
	public void oldps(String oldps, HttpServletResponse response,HttpServletRequest request){
		System.out.println("ps:come in");
		try {
			PrintWriter pw=response.getWriter();
			if(request.getSession().getAttribute("userPs").equals(oldps)){
				pw.print("ok");
				pw.flush();
				pw.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
