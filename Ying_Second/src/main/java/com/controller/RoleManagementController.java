package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Roles;
import com.service.RoleManageService;

@Controller
@RequestMapping("role")
public class RoleManagementController {

	@Autowired
	@Qualifier("roleManageServiceImpl")
	private RoleManageService rs;
	
	@RequestMapping("listRole")
	public String listRole(Map m,String currentPage,Model model,String type){
		if(currentPage==null){
			currentPage="1";
		}
		model.addAttribute("currentPage", currentPage);
		List<Roles> rlist=this.rs.listRole(Integer.parseInt(currentPage), m, type, model);
		model.addAttribute("rlist", rlist);
		return "backModel/userManagement/roleManage";
	}
	
	@RequestMapping("rolesztree")
	public String roles(int rid){
		System.out.println("rid:"+rid);
		
		return "";
	}
	
	
}
