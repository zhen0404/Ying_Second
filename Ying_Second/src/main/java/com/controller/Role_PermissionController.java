package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.Role_PermissionService;

@Controller
@RequestMapping("roleper")
public class Role_PermissionController {

	@Autowired
	@Qualifier("role_PermissionServiceImpl")
	private Role_PermissionService r_p;
	
	@RequestMapping("listrp")
	@ResponseBody
	public List listR_P(int rid){
		System.out.println("rid:"+rid);
		
		return this.r_p.r_plist(rid);
	}
	
	@RequestMapping("updaterp")
	public String updaterp(int rid,String msg){
		System.out.println("rid:"+rid+"  msg:"+msg);
		return "";
	}
	
}
