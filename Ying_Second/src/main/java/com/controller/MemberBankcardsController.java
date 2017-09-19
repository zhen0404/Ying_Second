package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Member_bankcards;
import com.service.BaseService;
import com.serviceImpl.MemberBankcardsService;

@Controller
@RequestMapping("/cards")
public class MemberBankcardsController {

	@Autowired
	@Qualifier("memberBankcardsService")
	private BaseService<Member_bankcards> baseService;
	
	@RequestMapping("/list")
	public String listC(Model model,String member_name,String mobile_Phone,
			String card_no,String create_date){
		Map map=new HashMap<>();
		map.put("member_name", member_name);
		map.put("mobile_Phone", mobile_Phone);
		map.put("card_no", card_no);
		map.put("create_date", create_date);
		List<Member_bankcards> listC=baseService.listAll(map);
		model.addAttribute("listC", listC);
		model.addAttribute("member_name", member_name);
		model.addAttribute("mobile_Phone", mobile_Phone);
		model.addAttribute("card_no", card_no);
		model.addAttribute("create_date", create_date);
		System.out.println(listC.size());
		System.out.println(mobile_Phone);
		System.out.println();
		return "backModel/vip/m_cards/memberBankcards";
	}
	@RequestMapping("/update/{id}")
	public String update(@PathVariable("id")int id){
		baseService.update(id);
		return "redirect:/cards/list";
	}
}
