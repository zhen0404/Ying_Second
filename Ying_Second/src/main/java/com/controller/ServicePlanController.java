package com.controller;

import org.springframework.beans.factory.annotation.Qualifier;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Subject;
import com.service.BaseService;

@Controller
@RequestMapping("/plan")
public class ServicePlanController {

	@Autowired
	@Qualifier("servicePlanService")
	private BaseService<Subject> baseService;
	
	@RequestMapping("/list")
	public String listSP(Model model,String name,String type,String status){
		Map map=new HashMap<>();
		map.put("name",name);
		map.put("type",type);
		map.put("status",status);
		List<Subject> list=baseService.listAll(map);
		model.addAttribute("list",list);
		model.addAttribute("name",name);
		model.addAttribute("type",type);
		model.addAttribute("status",status);
		return "backModel/vip/splan/servicePlan";
	}
}
