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
	
	@RequestMapping("touzi")
	public String touzi(){
		return "";
	}
	
	
}
