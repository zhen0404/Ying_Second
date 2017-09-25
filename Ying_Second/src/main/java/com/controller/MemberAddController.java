package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.MemberAddSerivce;

@Controller
@RequestMapping("fontmember")
public class MemberAddController {

	@Autowired
	@Qualifier("memberAddServiceImpl")
	private MemberAddSerivce mas;
	
	@RequestMapping("zhu")
	public String touzi(){
		return "font_desk/memberMain/memberDepositsHistory";
	}
	@RequestMapping("bbinrecord")
	public String bbin(){
		return "font_desk/memberMain/memberBbinRecord";
	}
	@RequestMapping("bound")
	public String bound(){
		return "font_desk/memberMain/memberBound";
	}
	@RequestMapping("czjl")
	public String czjl(){
		return "font_desk/memberMain/memberAccountCz";
	}
	@RequestMapping("woyaotikuan")
	public String woyaotikuan(){
		return "font_desk/memberMain/memberTiKuan";
	}
	
	@RequestMapping("safe")
	public String licaishi(){
		return "font_desk/memberMain/memberSafe";
	}
	
	@RequestMapping("bangkaRen")
	public String bangkaRen(){
		return "font_desk/memberMain/memberBoundRen";
	}
	
	@RequestMapping("updatepas")
	public String updatepas(){
		return "font_desk/memberMain/Updatepas";
	}
	

	@RequestMapping("tikuan")
	public String tikuan(){
		return "font_desk/memberMain/tikuanPas";
	}
	
	
}
