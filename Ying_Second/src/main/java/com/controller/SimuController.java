package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Finance_product_funds;
import com.bean.Finance_product_subscribe;
import com.service.SimuService;

@Component
@RequestMapping("/simu")
public class SimuController {
			 @Autowired
		     @Qualifier("simuServiceImpl")
		     private SimuService simuServiceImpl;
			 
			 
			 @RequestMapping("/list")
			 public String list(Model model){
			 List<Finance_product_funds> list=simuServiceImpl.showmoney();
			 model.addAttribute("list",list);
			 return "backModel/back_Manage/back_simu";
			 }
			 
			 @RequestMapping("/query")
             public String query(String name,String stat,String type,Model model){
            	 String  hql="from Finance_product_funds where 0=0";
            	 if(!"".equals(name)&&name!=null){
            		 hql=hql+" and name like'%"+name+"%'";
            	 }
            	 if(!"-1".equals(stat)) {
            		 hql=hql+" and status like'%"+stat+"%'";
            	 }
            	if(!"-1".equals(type)){
            		 hql=hql+" and type like'%"+type+"%'";
            	 }
 				 List<Finance_product_funds> list=simuServiceImpl.query(hql);
 				 model.addAttribute("list",list);
 				 System.out.println(list.size());
 				 return "backModel/back_Manage/back_simu";
             }
			 
			 @RequestMapping("/toAdd")
			 public String toAdd(){
				 return "backModel/back_Manage/back_simuAdd";
			 }
			 
			 @RequestMapping("/add")
			 public String add(Finance_product_funds fpr){
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
		    		fpr.setCreate_date(date);
		    		fpr.setUpdate_date(date);
		    		fpr.setStart_date(date);
		    		fpr.setEnd_date(date);
		    		fpr.setInvest_points("");
		    		fpr.setProduct_manager_desc("");
		    		fpr.setProduct_manager_name("");
		    		fpr.setProduct_manager_pic("");
		    		fpr.setProduct_manager_title("");
		    		simuServiceImpl.addmoney(fpr);
		    		return "redirect:/simu/list";
			 }
			 
			 @RequestMapping("/selectId")
			 public String selectId(Model model,int id){
				Finance_product_funds fpr=this.simuServiceImpl.getById(id);
			    List<Finance_product_funds>list=simuServiceImpl.showmoney();
			    model.addAttribute("fpr",fpr);
			    model.addAttribute("list",list);
		        return "backModel/back_Manage/back_SimuEdit";
			 }
			 
			 @RequestMapping("/update")
			 public String update(Finance_product_funds fpr){
				 Date now =new Date();
		    		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		    		String hehe = dateFormat.format(now);
		    		Date date=null;
		    		try {
		    			date=dateFormat.parse(hehe);
		    		} catch (ParseException e) {
		    			e.printStackTrace();
		    		}
		    		fpr.setCreate_date(date);
		    		fpr.setUpdate_date(date);
		    		fpr.setStart_date(date);
		    		fpr.setEnd_date(date);
		    		fpr.setInvest_points("");
		    		fpr.setSubscribe_count(0);
		    		fpr.setProduct_topic("");
		    		fpr.setProduct_factor("");
		    		fpr.setProduct_strategy("");
		    		fpr.setProduct_manager("");
		    		fpr.setProduct_manager_name("");
		    		fpr.setProduct_manager_pic("");
		    		fpr.setProduct_manager_title("");
		    		fpr.setProduct_manager_desc("");
		    		fpr.setAmount(0);
		    		fpr.setSold_amount(0);
		    		fpr.setBuyer_count(0);
		    		fpr.setStart_date(date);
		    		fpr.setEnd_date(date);
		    		fpr.setContract("");
		    		fpr.setBank_account("");
		    		simuServiceImpl.update(fpr);
		    		return "redirect:/simu/list";
			 }
			 
			 @RequestMapping("/qianstat")
			 public String qianstat(Model model,int id,HttpServletRequest re){
			    List<Finance_product_subscribe>list=simuServiceImpl.showmoneyding(id);
			    model.addAttribute("list",list);
			    System.err.println(list.size());
			    re.getSession().setAttribute("id", id);
		        return "backModel/back_Manage/back_SimuQian";
			 }
			 
			 @RequestMapping("/qianyue")
			 public String qianyue(Model model,int id,HttpServletRequest re){
				 System.out.println("11");
				 System.out.println(id);
				 Finance_product_subscribe list=simuServiceImpl.getByIding(id);
				 list.setStatus(1);
				 this.simuServiceImpl.updateq(list);
			 int num=(Integer)re.getSession().getAttribute("id");
				return "redirect:/simu/qianstat?id="+num+"";
			 }
			 
			 @RequestMapping("/addQ")
			 public String addQ(Model model,Finance_product_subscribe fps){
				 System.out.println("22");
				 Date now =new Date();
		    		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		    		String hehe = dateFormat.format(now);
		    		Date date=null;
		    		try {
		    			date=dateFormat.parse(hehe);
		    		} catch (ParseException e) {
		    			e.printStackTrace();
		    		}
				 fps.setCreate_date(date);
			     fps.setUpdate_date(date);
			     simuServiceImpl.savehe(fps);
				 return "redirect:/simu/qianyue";
			 }
			 
			 
			 
			 
			 
			 
}
