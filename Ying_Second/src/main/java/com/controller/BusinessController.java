package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.News;
import com.bean.Page;
import com.service.BaseService;


@Controller
@RequestMapping("/business")
public class BusinessController {
	
	@Autowired
	@Qualifier("businessService")
	private BaseService<News> baseService;
	
	@Autowired
	private Page pb;
	
	@RequestMapping("/saveBusiness")
	public String save(News news){
		baseService.save(news);
		return "redirect:/business/ListNews";
	}
	
	@RequestMapping("/ListNews")
	public String ListNews(Model model,@ModelAttribute("qname")String qname,@RequestParam(required=true,defaultValue="1")int page,String flag){
	
		Map map=new HashMap();
		pb.setSize(10);
		pb.setCurrentPage(page);
		map.put("qname",qname);
		map.put("flag",flag);
		map.put("pb",pb);
		System.out.println("come in");
		List<News> list=baseService.listAll(map);
		model.addAttribute("ListNews",list);
		model.addAttribute("pb",pb);
		return "backModel/back_Business";
	}
	//
	@RequestMapping("/deleteBusiness")
	public String delete(News news){
		baseService.delete(news);
		return "redirect:/business/ListNews";
	}
	
	@RequestMapping("/initData/{id}")
	public String initData(@PathVariable("id")int id,Model model){
		News news=baseService.getById(id);
		model.addAttribute("news",news);
		return "backModel/BusinessEdit";
	}
	
	@RequestMapping("/updateBusiness")
	public String update(News news){
		this.baseService.update(news);
		return "redirect:/business/ListNews";
	}
	
	@RequestMapping("/toBusinessAdd")
	public String toBusinessAdd(Model model){
		return "backModel/BusinessAdd";
		
	}
}
