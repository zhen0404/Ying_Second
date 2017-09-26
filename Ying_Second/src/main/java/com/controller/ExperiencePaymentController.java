package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Subject_bbin_purchase_record;
import com.service.BaseService;

@Controller
@RequestMapping("/pay")
public class ExperiencePaymentController {

	@Autowired
	@Qualifier("experiencePaymentService")
	private BaseService<Subject_bbin_purchase_record> baseService;
	
	@RequestMapping("/list/{id}")
	public String listll(Model model,@PathVariable("id")int id){
		List<Subject_bbin_purchase_record> list=baseService.listAll(id);
		model.addAttribute("list", list);
		System.out.println(id);
		System.out.println(list.size());
		
		return "backModel/vip/splan/exoeriencePay";
	}
	@RequestMapping("update/{id}")
	public String update(@PathVariable("id")int id,Model model){
		baseService.update(id);
		return "redirect:/pay/list/{sid}";
	}
}
