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
import com.bean.News_type;
import com.bean.Page;
import com.service.BaseService;
import com.service.CollegeService;
import com.controller.*;


@Controller
@RequestMapping("/business")
public class BusinessController {
	
	@Autowired
	@Qualifier("businessService")
	private CollegeService<News> collegeService;
	
	@Autowired
	private Page pb;
	
	@RequestMapping("/saveBusiness")
	public String save(News news){
		collegeService.save(news);
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
		List<News> list=collegeService.listAll(map);
		List<News_type> Tlist=collegeService.typeList();
		model.addAttribute("typeList",Tlist);
		System.out.println("tlistsize:"+Tlist.size());
		model.addAttribute("ListNews",list);
		model.addAttribute("pb",pb);
		return "backModel/back_Business";
	}

	@RequestMapping("/deleteBusiness")
	public String delete(int id){
		News news=collegeService.getById(id);
		collegeService.delete(news);
		return "redirect:/business/ListNews";
	}
	
	@RequestMapping("/initData/{id}")
	public String initData(@PathVariable("id")int id,Model model){
		News news=collegeService.getById(id);
		List<News_type> Tlist=collegeService.typeList();
		model.addAttribute("typeList",Tlist);
		model.addAttribute("news",news);
		return "backModel/BusinessEdit";
	}
	
	@RequestMapping("/updateBusiness")
	public String update(News news){
		
		this.collegeService.update(news);
		return "redirect:/business/ListNews";
	}
	
	@RequestMapping("/toBusinessAdd")
	public String toBusinessAdd(Model model){
		List<News> list=collegeService.listAll();
		List<News_type> Tlist=collegeService.typeList();
		model.addAttribute("typeList",Tlist);
		model.addAttribute("ListNews",list);
		return "backModel/BusinessAdd";
		
	}
}
