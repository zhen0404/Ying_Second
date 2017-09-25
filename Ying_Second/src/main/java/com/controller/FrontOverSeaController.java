package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Oversea_config;
import com.service.OverseaService;

@Component
@RequestMapping("/frontSea")
public class FrontOverSeaController {
	
			@Autowired
		    @Qualifier("overseaServiceImpl")
		    private OverseaService<Oversea_config> overseaServiceImpl;
		    
		    @RequestMapping("/list")
		      public String overList(Model model){
		     	List<Oversea_config> list=overseaServiceImpl.listAll();
		     	model.addAttribute("list", list);
		     	return "font_desk/product/seaout";
		     }

}
