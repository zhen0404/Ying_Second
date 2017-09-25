package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Finance_product_funds;
import com.service.SimuService;

@Component
@RequestMapping("/frontsimu")
public class FrontSiMuController {
			@Autowired
		    @Qualifier("simuServiceImpl")
		    private SimuService simuServiceImpl;
			
			 @RequestMapping("/list")
			 public String list(Model model){
			 List<Finance_product_funds> list=simuServiceImpl.showmoney();
			 model.addAttribute("list",list);
			 return "font_desk/product/privatePalcement";
			 }
           
	        
	                        
}
