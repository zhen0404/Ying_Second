package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FontDeskController {
	
	//ǰ̨��ҳ
	@RequestMapping("home")
	public String fontHome(){
		return "font_desk/frontHome";
	}

	//ͷ����ʾ
	@RequestMapping("top")
	public String fontTop(){
		return "font_desk/frontTopIframe";
	}
	
	//�м䲿����ʾ
	@RequestMapping("middle")
	public String fontMiddle(){
		return "font_desk/frontMiddleIframe";
	}
	
	//������������
	@RequestMapping("exploration")
	public String fontExploration(){
		return "font_desk/frontExploration";
	}
	
	//��¼ҳ��
	@RequestMapping("product")
	public String fontProduct(){
		return "font_desk/frontProduct";
	}
	
	//��������
	@RequestMapping("frontJournalism")
	public String frontJournalism(){
		return "font_desk/frontJournalism";
	}
	
	//��������
	@RequestMapping("frontLoad")
	public String frontLoad(){
		return "font_desk/frontLoad";
	}
	
	//��ѧԺ
	@RequestMapping("frontCollege")
	public String frontCollege(){
		return "font_desk/frontCollege";
	}
	
	//Ͷ������
	@RequestMapping("frontStudy")
	public String frontStudy(){
		return "font_desk/frontStudy";
	}
	
	@RequestMapping("frontLast")
	public String frontLast(){
		return "font_desk/frontStudy";
	}
	
	//��¼
	@RequestMapping("frontIframeLogin")
	public String frontLogin(){
		return "font_desk/frontIframeLogin";
	}
	
}
