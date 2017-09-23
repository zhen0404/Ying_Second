package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.News;
import com.service.NService;

@Controller
@RequestMapping("/new")
public class NewsController {

	@Autowired
	@Qualifier("newsService")
	private NService<News> newService;
	
	@RequestMapping("/list")
	public String listAll(Model model){
		List<News> list=newService.listAll();
		model.addAttribute("list", list);
		return "font_desk/frontJournalism";
	}
	@RequestMapping("/listTi/{id}")
	public String listTi(@PathVariable("id")int id,Model model){
		List<News> listTi=newService.listAll(id);
		model.addAttribute("listTi", listTi);
		return "font_desk/frontJournalism";
	}
	@RequestMapping("/listTe/{id}")
	public String listTe(@PathVariable("id")int id,Model model){
		News news=newService.getById(id);
		model.addAttribute("news",news);
		return "font_desk/newsText";
	}
}
