package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("product")
public class FontProductController {

	//固收类理财
	@RequestMapping("solidClass")
	public String solidClass(){
		return "font_desk/product/frontProduct";
	}
	
	//私募基金
	@RequestMapping("privatePalcement")
	public String privatePalcement(){
		return "font_desk/product/privatePalcement";
	}
	
	//海外配置
	@RequestMapping("seaout")
	public String seaout(){
		return "font_desk/product/seaout";
	}
	
	//股权基金
	@RequestMapping("stockfund")
	public String stockfund(){
		return "font_desk/product/stockfund";
	}
	
}
