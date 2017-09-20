package com.controller;

import javax.servlet.http.HttpServletRequest;

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
		return "font_desk/fontOnlineExperience";
	}
	
	//产品
	@RequestMapping("product")
	public String fontProduct(){
		return "font_desk/product/frontProduct";
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
	
	//去购买
	@RequestMapping("frontLast")
	public String frontLast(){
		return "font_desk/fontAddition";
	}
	
	//登录
	@RequestMapping("frontIframeLogin")
	public String frontLogin(){
		return "font_desk/frontIframeLogin";
	}
	
	//注册
	@RequestMapping("toSign")
	public String toSign(){
		return "font_desk/fontSign";
	}
	
	//加法库
	@RequestMapping("myadd")
	public String myselfAdd(){
		return "font_desk/memberMain/memberDepositsHistory";
	}
	
//	//网上体验中心
//	@RequestMapping("onlineExp")
//	public String onlineExp(){
//		return "font_desk/fontOnlineExperience";
//	}
	
}
