package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.Subject;
import com.bean.Subject_bbin_purchase_record;
import com.bean.Subject_purchase_record;
import com.service.SubjectService;

@Controller
@RequestMapping("/subject")
public class SubjectController {
                 //固收类/p2p   
	             @Autowired
	             @Qualifier("subjectServiceImpl")
	             private SubjectService subjectServiceImpl;
	  
	             
	             //固守类p2p显示
	     @RequestMapping("/list")
         public String menus1(Model model) {
			List<Subject> list = subjectServiceImpl.listSubject();
			model.addAttribute("list", list);
	 	  return "backModel/back_Manage/back_fixedprop";
	 	        }
            //p2p算总金额
			@RequestMapping("/getTotalMoney")
			@ResponseBody
			public void getTotalMoney(int id,HttpServletResponse response) {
				System.out.println("id:" + id);
				Subject sub = this.subjectServiceImpl.getById(id);
				double num = 0;
				Set<Subject_purchase_record> sets = sub.getSubjectPurchaseRecord();
				PrintWriter pw;
				try {
					pw = response.getWriter();
					if (sets.size() != 0) {
						Iterator<Subject_purchase_record> records = sets.iterator();
						while (records.hasNext()) {
							Subject_purchase_record rec = records.next();
							num += rec.getAmount();
						}
					}
					System.out.println(num);
					pw.print(num);
					pw.flush();
					pw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
	            //p2p模糊查询
	              @RequestMapping("/query")
	             public String query(String name,String stat,String type,Model model){
	            	 String  hql="from Subject where 0=0";
	            	 if(!"".equals(name)&&name!=null){
	            		 hql=hql+" and name like'%"+name+"%'";
	            	 }
	            	 if(!"-1".equals(stat)) {
	            		 hql=hql+" and status like'%"+stat+"%'";
	            	 }
	            	if(!"-1".equals(type)){
	            		 hql=hql+" and type like'%"+type+"%'";
	            	 }
	 				 List<Subject> list=subjectServiceImpl.query(hql);
	 				 model.addAttribute("list",list);
	 				 System.out.println(list.size());
	 				 return "backModel/back_Manage/back_fixedprop";
	             }
	           
		       @RequestMapping("/addjsp")	 
	           public String addJsp(){
	        	   return "backModel/back_Manage/back_fixedAdd";
	           }
		       //查询投资
		       @RequestMapping("/queryinvest")	 
	           public String invest(Model model){
		    	   List<Subject_bbin_purchase_record> list=subjectServiceImpl.listp2pton();
		    	    System.out.println("111");
	 	            model.addAttribute("investList", list);
	 	            System.out.println(list.size());
	        	   return "backModel/back_Manage/back_fixedinvest";
	           }
	            //添加
		        @RequestMapping("/addSubject")
	            public String save(Subject subject){
		        	System.out.println("11111");
		        	Date now =new Date();
		    		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		    		String hehe = dateFormat.format(now);
		    		Date date=null;
		    		try {
		    			date=dateFormat.parse(hehe);
		    		} catch (ParseException e) {
		    			e.printStackTrace();
		    		}
	                 subject.setSerial_number("00000");
	                 subject.setAmount(0);
	                 subject.setFirst_id(0);
	                 subject.setParent_id(0);
	                 subject.setRaise_start(date);
	                 subject.setRaise_end(date);
	                 subject.setRefund_way(0);
	                 subject.setYear_rate(0);
	                 subject.setFolder_id(0);
	                 subject.setDelflag(0);
	                 subject.setUpdate_date(date);
	                 subject.setCreate_date(date);
	                 subject.setBorrowerid(0);
	                 this.subjectServiceImpl.p2pAdd(subject);
	            	return "redirect:/subject/list";
	            }
		        
		     // 固守编辑修改
		    	@RequestMapping("/selectSub")
		    	public String selectSub(int id, Model model) {
		    		System.out.println(id);
		    		Subject sub = subjectServiceImpl.getById(id);
		    		List<Subject> list = subjectServiceImpl.listSubject();
		    		model.addAttribute("sub", sub);
		    		model.addAttribute("list", list);
		    		return "backModel/back_Manage/back_editp2p";
		    	}

		    	@RequestMapping("/update")
		    	public String update(Subject subject) {
		    		System.out.println("11111");
		        	Date now =new Date();
		    		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		    		System.out.println(now+"+++++++++++++-----");
		    		String hehe = dateFormat.format(now);
		    		Date date=null;
		    		try {
		    			date=dateFormat.parse(hehe);
		    		} catch (ParseException e) {
		    			e.printStackTrace();
		    		}
	                 subject.setSerial_number("00000");
	                 subject.setAmount(0);
	                 subject.setFirst_id(0);
	                 subject.setParent_id(0);
	                 subject.setRaise_start(date);
	                 subject.setRaise_end(date);
	                 subject.setRefund_way(0);
	                 subject.setYear_rate(0);
	                 subject.setFolder_id(0);
	                 subject.setDelflag(0);
	                 subject.setUpdate_date(date);
	                 subject.setCreate_date(date);
	                 subject.setBorrowerid(0);
		    		subjectServiceImpl.updateSub(subject);
		    		return "redirect:/subject/list";
		    	}
		         
		 
}
