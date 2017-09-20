package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("product")
public class FontProductController {

	//���������
	@RequestMapping("solidClass")
	public String solidClass(){
		return "font_desk/product/frontProduct";
	}
	
	//˽ļ����
	@RequestMapping("privatePalcement")
	public String privatePalcement(){
		return "font_desk/product/privatePalcement";
	}
	
	//��������
	@RequestMapping("seaout")
	public String seaout(){
		return "font_desk/product/seaout";
	}
	
	//��Ȩ����
	@RequestMapping("stockfund")
	public String stockfund(){
		return "font_desk/product/stockfund";
	}
	
}
