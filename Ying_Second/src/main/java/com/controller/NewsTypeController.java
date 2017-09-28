package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.News_type;
import com.service.BaseService;

@Controller
@RequestMapping("/nt")
public class NewsTypeController {

	@Autowired
	@Qualifier("newsTypeService")
	private BaseService<News_type> baseService;
	
	@RequestMapping("/list")
	public String listTi(Model model){
		List<News_type>  listTi=baseService.listAll();
		model.addAttribute("listTi",listTi);
		return "font_desk/frontJournalism";
	}
}
