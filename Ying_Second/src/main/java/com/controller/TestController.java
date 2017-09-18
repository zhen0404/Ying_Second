package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.serviceImpl.TestServiceImpl;

@Controller
public class TestController {
	
	@Autowired
	private TestServiceImpl ts;
	
	@RequestMapping("/select")
    public String select(){
    	return "backModel/backFirst";
    }
	
	@RequestMapping("/select1")
    public String selec(){
    	return "backModel/back_desk";
    }
	
	@RequestMapping("/manage")
    public String manage(){
    	return "redirect:/usersManager/listMember";
    }
	
	@RequestMapping("/role")
    public String role(){
    	return "redirect:/role/listRole";
    }
	
	@RequestMapping("/font")
    public String font(){
    	return "font_desk/frontHome";
    }
	
	@RequestMapping("/font1")
    public String font1(){
    	return "font_desk/fontFirst";
    }

        @RequestMapping("/table1")
        public String select1(){
        	return "table/testTable";
        }
        
        @RequestMapping("/table2")
        public String select2(){
        	return "backModel/testTable/table2";
        }
        
        @RequestMapping("/table3")
        public String select3(){
        	return "backModel/testTable/table3";
        }
        
        @RequestMapping("/yanzheng")
        public String table4(){
        	return "backModel/testTable/table4";
        }
        
        @RequestMapping("/testjsp")
        public String table5(){
        	return "table/testTable";
        }
}
