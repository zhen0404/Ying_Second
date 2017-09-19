package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Subject_purchase_record;
import com.service.BaseService;

@Controller
@RequestMapping("/pur")
public class SubjectPurchaseRecordController {

	@Autowired
	@Qualifier("subjectPurchaseRecordService")
	private BaseService<Subject_purchase_record> baseService;
	
	@RequestMapping("/list/{id}")
	public String listAll(Model model,@PathVariable("id")int id){
		List<Subject_purchase_record> list=baseService.listAll(id);
		model.addAttribute("list",list);
		return "backModel/vip/splan/purchase";
	}
	@RequestMapping("/update/{id}")
	public String listAll(@PathVariable("id")int id){
		baseService.update(id);
		return "backModel/vip/splan/purchase";
	}
}
