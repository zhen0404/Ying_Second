package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BackDeskController {

	@RequestMapping("backHome")
	public String backHome(){
		return "backModel/back_desk";
	}
	
	@RequestMapping("backLogin")
	public String backLogin(){
		return "backModel/back_login";
	}
}
