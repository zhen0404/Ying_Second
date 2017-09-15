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

import com.bean.News_type;
import com.bean.Page;
import com.service.BaseService;


@Controller
@RequestMapping("/classify")
public class ClassifyController {

	
	@Autowired
	@Qualifier("classifyService")
	private BaseService<News_type> baseService;
	
	@Autowired
	private Page pb;
	
	@RequestMapping("/saveNews_type")
	public String save(News_type news_type){
		baseService.save(news_type);
		return "redirect:/classify/ListNews_type";
	}

	@RequestMapping("/ListNews_type")
	public String ListNews_type(Model model,@ModelAttribute("tname")String tname,@RequestParam(required=true,defaultValue="1")int page,String flag){
		Map map=new HashMap();
		pb.setSize(10);
		pb.setCurrentPage(page);
		map.put("tname",tname);
		map.put("flag",flag);
		map.put("pb",pb);
		List<News_type> list=baseService.listAll(map);
		model.addAttribute("ListNews_type",list);
		System.out.println("list.size"+list.size());
		model.addAttribute("pb",pb);
		return "backModel/back_Classify";
	}
	//
	@RequestMapping("/deleteNews_type")
	public String delete(News_type news_type){
		baseService.delete(news_type);
		return "redirect:/classify/ListNews_type";
	}
	
	@RequestMapping("/initData/{id}")
	public String initData(@PathVariable("id")int id,Model model){
		News_type news_type=baseService.getById(id);
		model.addAttribute("news_type",news_type);
		return "backModel/ClassifyEdit";
	}
	
	@RequestMapping("/updateNews_type")
	public String update(News_type news_type){
		this.baseService.update(news_type);
		return "redirect:/classify/ListNews_type";
	}
	
	@RequestMapping("/toClassifyAdd")
	public String toClassifyAdd(){
		return "backModel/ClassifyAdd";
	}
}
