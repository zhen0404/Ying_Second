package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.BuyService;

@Controller
@RequestMapping("buy")
public class BuyController {
	
	@Autowired
	@Qualifier("buyServiceImpl")
	private BuyService bs;
	
	public String getbalance(int mid){
		return "";
	}

}
