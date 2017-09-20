package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Member;
import com.service.BuyService;

@Controller
@RequestMapping("buy")
public class BuyController {
	
	@Autowired
	@Qualifier("buyServiceImpl")
	private BuyService bs;
	
	public String getbalance(HttpServletRequest request){
		//获取登录人的mid
		Member member=(Member) request.getSession().getAttribute("member");
		int mid=member.getId();
		
		//根据登录人的mid获取登录人余额
		this.bs.getByMemberId(mid);
		
		
		
		return "";
	}
	
	//购买产品
		@RequestMapping("productBuy")
		public String productBuy(){
			return "font_desk/product/productBuy";
		}

}
