package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Member;
import com.service.TouziService;

@Component
@RequestMapping("memberCenter")
public class MemberCenterController {
	          
		  @Autowired
		  @Qualifier("touziServiceImpl")
		  private TouziService touziServiceImpl;
		  
		  @RequestMapping("list")
		  public String listTouziAll(HttpSession se,Model model,HttpServletRequest he){
			 Member member=(Member)se.getAttribute("member");
			 int id=member.getId();
             //投资记录
			 List list=touziServiceImpl.listAll(id);
			  model.addAttribute("List", list);
			  he.setAttribute("size", list.size());
			  //预约记录
			  List list2=touziServiceImpl.listAllyu(id);
			  model.addAttribute("List2", list2);
			  he.setAttribute("size2", list2.size());
			    return "font_desk/memberMain/touZi";
		  }
		  
		  @RequestMapping("cz")
		  public String Cz(HttpSession se,Model model){
			 Member member=(Member)se.getAttribute("member");
			 int id=member.getId();
			 List list=touziServiceImpl.listAllchong(id);
			 model.addAttribute("List",list);
			  return "font_desk/memberMain/ChongZi";
		  }
		  
		  @RequestMapping("tiKuan")
		  public String tiKuan(HttpSession se,Model model){
			 Member member=(Member)se.getAttribute("member");
			 int id=member.getId();
			 List list=touziServiceImpl.listAllti(id);
			 model.addAttribute("List",list);
			  return "font_desk/memberMain/tikuan";
		  }
		  
		  @RequestMapping("tiyanj")
		  public String tiyanj(HttpSession se,Model model){
			 Member member=(Member)se.getAttribute("member");
			 int id=member.getId();
			 List list=touziServiceImpl.listAlltiyanj(id);
			 model.addAttribute("List",list);
			  return "font_desk/memberMain/tiyanjin";
		  }
	      
               
}
