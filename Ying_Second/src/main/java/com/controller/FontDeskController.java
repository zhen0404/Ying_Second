package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FontDeskController {
	
	@RequestMapping("home")
	public String fontHome(){
		return "font_desk/frontHome";
	}

	@RequestMapping("top")
	public String fontTop(){
		return "font_desk/frontTopIframe";
	}
	
	@RequestMapping("middle")
	public String fontMiddle(){
		return "font_desk/frontMiddleIframe";
	}
	
	@RequestMapping("exploration")
	public String fontExploration(){
		return "font_desk/frontExploration";
	}
	
	@RequestMapping("product")
	public String fontProduct(){
		return "font_desk/frontProduct";
	}
	
	@RequestMapping("frontJournalism")
	public String frontJournalism(){
		return "font_desk/frontJournalism";
	}
	
	@RequestMapping("frontLoad")
	public String frontLoad(){
		return "font_desk/frontLoad";
	}
	
	@RequestMapping("frontCollege")
	public String frontCollege(){
		return "font_desk/frontCollege";
	}
	
	@RequestMapping("frontStudy")
	public String frontStudy(){
		return "font_desk/frontStudy";
	}
	
	@RequestMapping("frontLast")
	public String frontLast(){
		return "font_desk/frontStudy";
	}
	
	@RequestMapping("frontLogin")
	public String frontLogin(){
		return "font_desk/frontIframeLogin";
	}
}
