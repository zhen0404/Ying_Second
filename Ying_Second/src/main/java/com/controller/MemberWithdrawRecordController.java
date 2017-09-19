package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Member_withdraw_record;
import com.service.BaseService;

@Controller
@RequestMapping("/with")
public class MemberWithdrawRecordController {

	@Autowired
	@Qualifier("memberWithdrawRecordService")
	private BaseService<Member_withdraw_record> baseService;
	
	@RequestMapping("/list")
	public String listAll(Model model,String member_name,String mobile_Phone,
			String bank_card,String status,String create_date){
		Map map=new HashMap<>();
		map.put("member_name", member_name);
		map.put("mobile_Phone", mobile_Phone);
		map.put("bank_card", bank_card);
		map.put("status", status);
		map.put("create_date", create_date);
		List<Member_withdraw_record> list=baseService.listAll(map);
		model.addAttribute("list", list);
		model.addAttribute("member_name", member_name);
		model.addAttribute("mobile_Phone", mobile_Phone);
		model.addAttribute("bank_card", bank_card);
		model.addAttribute("status", status);
		model.addAttribute("create_date", create_date);
		return "backModel/vip/tx/mwr";
	}
//	@RequestMapping("/list/{id}")
//	public String listD(Model model,@PathVariable("id")int id){
//		Member_withdraw_record member_withdraw_record=baseService.getById(id);
//		model.addAttribute("member_withdraw_record", member_withdraw_record);
//		return "backModel/vip/tx/zhxq";
//	}
	/**
	 * 查询 hql 语句
	 * from biao1 b1,biao2 b2,biao3 b3,biao4 b4 where b1.id=b2.id and b1.id=b3.id and
	 * b1.id=b4.id and b1.id=id
	 */
}
