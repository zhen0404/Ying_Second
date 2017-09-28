package com.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Member_trade_record;
import com.service.WalletService;

@Controller
@RequestMapping("/wallet")
public class FontWalletController {
	
		 @Autowired
	     @Qualifier("walletServiceImpl")
	     private WalletService walletServiceImpl;
		 
		 @RequestMapping("list")
		 public String listAll(Model model){
			 List<Member_trade_record> list=walletServiceImpl.listAll();
			 model.addAttribute("List", list);
			 return "backModel/userManagement/walletRecord";
		 }
		 
		 @RequestMapping("query")
		 public String query(String jyh,String sjh,String type,String stat,String time,Model model){
			 System.out.println(sjh);
			 String hql="from Member_trade_record m where 0=0";
        	 if(!"".equals(jyh)&&jyh!=null){
        		 hql=hql+" and m.trade_no like'%"+jyh+"%'";
        	 }
        	 if(!"".equals(sjh)&&sjh!=null){
        		 hql=hql+" and m.member.mobile_Phone like'%"+sjh+"%'";
        	 }
        	 if(!"-1".equals(type)) {
        		 hql=hql+" and m.trade_type like'%"+type+"%'";
        	 }
        	if(!"-1".equals(stat)){
        		 hql=hql+" and m.trade_status like'%"+stat+"%'";
        	 }
        	if(!"".equals(time)&&time!=null){
       		 hql=hql+" and m.create_date like'%"+time+"%'";
       	     }
        	 List<Member_trade_record> list=walletServiceImpl.query(hql);
        	 model.addAttribute("List", list);
        	 System.out.println(list.size());
			 return "backModel/userManagement/walletRecord";
		 }
		 

}
