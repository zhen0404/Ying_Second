package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FontDeskController {
	
	//前台首页
	@RequestMapping("home")
	public String fontHome(){
		return "font_desk/frontHome";
	}

	//头部显示
	@RequestMapping("top")
	public String fontTop(){
		return "font_desk/frontTopIframe";
	}
	
	//中间部分显示
	@RequestMapping("middle")
	public String fontMiddle(){
		return "font_desk/frontMiddleIframe";
	}
	
	//网上体验中心
	@RequestMapping("exploration")
	public String fontExploration(){
		return "font_desk/frontExploration";
	}
	
	//登录页面
	@RequestMapping("product")
	public String fontProduct(){
		return "font_desk/frontProduct";
	}
	
	//新闻中心
	@RequestMapping("frontJournalism")
	public String frontJournalism(){
		return "font_desk/frontJournalism";
	}
	
	//下载中心
	@RequestMapping("frontLoad")
	public String frontLoad(){
		return "font_desk/frontLoad";
	}
	
	//商学院
	@RequestMapping("frontCollege")
	public String frontCollege(){
		return "font_desk/frontCollege";
	}
	
	//投研中心
	@RequestMapping("frontStudy")
	public String frontStudy(){
		return "font_desk/frontStudy";
	}
	
	@RequestMapping("frontLast")
	public String frontLast(){
		return "font_desk/frontStudy";
	}
	
	//登录
	@RequestMapping("frontIframeLogin")
	public String frontLogin(){
		return "font_desk/frontIframeLogin";
	}
	
}
