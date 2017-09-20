package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Arcords;
import com.bean.Award_records;
import com.service.BaseService;

@Controller
@RequestMapping("/arc")
public class Award_recordsController {

	@Autowired
	@Qualifier("award_recordsService")
	private BaseService<Award_records> baseService;
	
	@RequestMapping("/list")
	public String list(Model model,String member_name,String mobile_Phone,
			String invitationCode,String invitedCode,String enroll,String invest){
		Map map=new HashMap<>();
		map.put("member_name", member_name);
		map.put("mobile_Phone", mobile_Phone);
		map.put("invitationCode", invitationCode);
		map.put("invitedCode", invitedCode);
		map.put("enroll", enroll);
		map.put("invest", invest);
		List<Award_records> list=baseService.listAll(map);
		model.addAttribute("list", list);
		model.addAttribute("member_name", member_name);
		model.addAttribute("mobile_Phone", mobile_Phone);
		model.addAttribute("invitationCode", invitationCode);
		model.addAttribute("invitedCode", invitedCode);
		model.addAttribute("enroll", enroll);
		model.addAttribute("invest", invest);
		return "backModel/vip/invit/invited";
	}
}
