package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Member;
import com.bean.Member_profit_record;
import com.service.MemberAddSerivce;

@Controller
public class FontDeskController {
	
	@Autowired
	@Qualifier("memberAddServiceImpl")
	private MemberAddSerivce mas;
	
	//前台首页
	@RequestMapping("home")
	public String fontHome(){
		return "font_desk/frontHome";
	}

	//顶部iframe
	@RequestMapping("top")
	public String fontTop(){
		return "font_desk/frontTopIframe";
	}
	
	//中部iframe
	@RequestMapping("middle")
	public String fontMiddle(){
		return "font_desk/frontMiddleIframe";
	}
	
	//网上体验中心
	@RequestMapping("exploration")
	public String fontExploration(){
		return "font_desk/fontOnlineExperience";
	}
	
	//产品中心
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
	
	@RequestMapping("frontCollege")
	public String frontCollege(){
		return "font_desk/frontCollege";
	}
	
	//盈+商学院 
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
	public String frontLogin(String url,Model model){
		model.addAttribute("url", url);
		return "font_desk/frontIframeLogin";
	}
	
	//注册
	@RequestMapping("toSign")
	public String toSign(){
		return "font_desk/fontSign";
	}
	
	//加法库
	@RequestMapping("myadd")
	public String myselfAdd(HttpSession session){
		//先判断用户是否登录成功  或  登录超时
		Member member=(Member) session.getAttribute("member");
		if(member!=null){
			//查询收益记录
			int mid=member.getId();
			Member_profit_record mpr=this.mas.getMemberProfitRecordByMid(mid);
			session.setAttribute("mpr", mpr);
			return "font_desk/memberMain/memberDepositsHistory";
		}
		return "redirect:/frontIframeLogin";
	}
	
}
