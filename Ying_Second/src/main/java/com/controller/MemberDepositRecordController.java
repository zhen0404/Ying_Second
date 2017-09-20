package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Member_deposit_record;
import com.service.BaseService;

@Controller
@RequestMapping("/dep")
public class MemberDepositRecordController {

	@Autowired
	@Qualifier("memberDepositRecordService")
	private BaseService<Member_deposit_record> baseService;
	
	@RequestMapping("/list")
	public String listAll(Model model,String serial_number,String mobile_Phone,
			String status,String pay_channel_order_no,String create_date){
		Map map=new HashMap<>();
		map.put("serial_number", serial_number);
		map.put("mobile_Phone", mobile_Phone);
		map.put("status", status);
		map.put("pay_channel_order_no", pay_channel_order_no);
		map.put("create_date", create_date);
		List<Member_deposit_record> list=baseService.listAll(map);
		model.addAttribute("list", list);
		model.addAttribute("serial_number", serial_number);
		model.addAttribute("mobile_Phone", mobile_Phone);
		model.addAttribute("status", status);
		model.addAttribute("pay_channel_order_no", pay_channel_order_no);
		model.addAttribute("create_date", create_date);
		return "backModel/vip/recharge/mdr";
	}
}
