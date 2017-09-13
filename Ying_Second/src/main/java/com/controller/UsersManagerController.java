package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Member;
import com.service.UsersManagerService;

@Controller
@RequestMapping("usersManager")
public class UsersManagerController {

	@Autowired
	@Qualifier("usersManagerServiceImpl")
	private UsersManagerService userManagerService;
	
	@RequestMapping("listMember")
	public String listMember(Map m,String currentPage,String type,String member_name,String name,String mobile_phone,String invitationCode,String create_date,Model model){
		m.put("member_name", member_name);
		m.put("name", name);
		m.put("mobile_phone", mobile_phone);
		m.put("invitationCode", invitationCode);
		m.put("create_date", create_date);
		if(currentPage==null){
			currentPage="1";
		}
		model.addAttribute("currentPage", currentPage);
		List<Member> mlist=this.userManagerService.listMember(Integer.parseInt(currentPage),m,type,model);
		model.addAttribute("mlist", mlist);
		model.addAttribute("member_name", member_name);
		model.addAttribute("name", name);
		model.addAttribute("mobile_phone", mobile_phone);
		model.addAttribute("invitationCode", invitationCode);
		model.addAttribute("create_date", create_date);
		return "backModel/userManagement/usersManage";
	}
	
}
