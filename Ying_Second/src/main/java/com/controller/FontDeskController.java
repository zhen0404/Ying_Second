package com.controller;

import javax.servlet.http.HttpServletRequest;

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
		return "font_desk/fontOnlineExperience";
	}
	
	//��Ʒ
	@RequestMapping("product")
	public String fontProduct(){
		return "font_desk/product/frontProduct";
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
	
	//ȥ����
	@RequestMapping("frontLast")
	public String frontLast(){
		return "font_desk/fontAddition";
	}
	
	//��¼
	@RequestMapping("frontIframeLogin")
	public String frontLogin(){
		return "font_desk/frontIframeLogin";
	}
	
	//ע��
	@RequestMapping("toSign")
	public String toSign(){
		return "font_desk/fontSign";
	}
	
	//�ӷ���
	@RequestMapping("myadd")
	public String myselfAdd(){
		return "font_desk/memberMain/memberDepositsHistory";
	}
	
//	//������������
//	@RequestMapping("onlineExp")
//	public String onlineExp(){
//		return "font_desk/fontOnlineExperience";
//	}
	
}
