package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Member;
import com.service.BaseService;

/**
 * 账号管理
 * @author Maibenben
 * @param <T>
 *
 */
@Controller
@RequestMapping("/account")
public class AccountManagementController {
	
//	@Autowired
//	private AccountManagementService accountManagementService;
	
	@Autowired
	@Qualifier("accountManagementService")
	private BaseService<Member> baseService;
	
//	@Resource(name="accountManagementService")
//	private BaseService<Member> baseService;
	
//
	@RequestMapping("/list")
	public String listMember(Model model,String member_name,
			String name,String mobile_Phone,
			String identity,String invitationCode,String create_date){
		Map map=new HashMap();
		map.put("member_name", member_name);
		map.put("name", name);
		map.put("mobile_Phone", mobile_Phone);
		map.put("identity", identity);
		map.put("invitationCode", invitationCode);
		map.put("create_date", create_date);
		List<Member> listMember=baseService.listAll(map);
		model.addAttribute("listMember", listMember);
		model.addAttribute("member_name", member_name);
		model.addAttribute("name", name);
		model.addAttribute("mobile_Phone", mobile_Phone);
		model.addAttribute("identity", identity);
		model.addAttribute("invitationCode", invitationCode);
		model.addAttribute("create_date", create_date);
		System.out.println(listMember.size());
		return "backModel/acc/accountManagement";
	}
	@RequestMapping("/list2/{id}")
	public String list2(@PathVariable("id")int id,Model model){
		Member member=baseService.getById(id);
		model.addAttribute("member", member);
		return "backModel/acc/accountdetail";
	}
}
