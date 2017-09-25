package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Oversea_config;
import com.bean.Oversea_config_subscribe;
import com.service.OverseaService;

//�������
@Controller
@RequestMapping("/oversea")
public class OverseaController {
                       
	 @Autowired
     @Qualifier("overseaServiceImpl")
     private OverseaService<Oversea_config> overseaServiceImpl;
	 //������ʾ
      @RequestMapping("/overList")
      public String overList(Model model){
     	List<Oversea_config> list=overseaServiceImpl.listAll();
     	model.addAttribute("osList", list);
     	return "backModel/back_Manage/back_Oversea";
     }
      
	     //�鿴Ͷ��
        @RequestMapping("/listding")
     	public String list(int id,Model model){
        	System.out.println(id);
         	List<Oversea_config_subscribe> list2 =overseaServiceImpl.All(id);
         	model.addAttribute("list2", list2);
     		return "backModel/back_Manage/back_OverseaYu";
     	}
        
        @RequestMapping("/toAdd")
     	public String list(){
        return "backModel/back_Manage/back_OverAdd";
        }
        
      //���
        @RequestMapping("/add")
     	public String add(Oversea_config oc){
        	Date now =new Date();
    		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    		String hehe = dateFormat.format(now);
    		Date date=null;
    		try {
    			date=dateFormat.parse(hehe);
    		} catch (ParseException e) {
    			e.printStackTrace();
    		}
    		oc.setContent("");
    		oc.setDescription("");
    		oc.setUser_type("");
    		oc.setAddTime(date);
    		oc.setEnd_date(date);
    		oc.setUpdTime(date);
    		oc.setStart_date(date);
         	this.overseaServiceImpl.overAdd(oc);
     		return "redirect:/oversea/overList";
     	}
        
        @RequestMapping("/queryId")
     	public String queryId(int id,Model model){
        	System.out.println(id);
	        Oversea_config oc=this.overseaServiceImpl.getById(id);
	        List<Oversea_config>list=overseaServiceImpl.listAll();
	        model.addAttribute("oc",oc);
	        model.addAttribute("list",list);
        		return "backModel/back_Manage/back_OverEdit";
        	    	
        	    }
        //�޸�
        @RequestMapping("/update")
     	public String update(Oversea_config oc){
        	Date now =new Date();
    		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    		String hehe = dateFormat.format(now);
    		Date date=null;
    		try {
    			date=dateFormat.parse(hehe);
    		} catch (ParseException e) {
    			e.printStackTrace();
    		}
    		oc.setContent(" ");
    		oc.setDescription(" ");
    		oc.setUser_type(" ");
    		oc.setAddTime(date);
    		oc.setEnd_date(date);
    		oc.setUpdTime(date);
    		oc.setStart_date(date);
    		oc.setEnd_time(date);
    		oc.setStart_time(date);
         	this.overseaServiceImpl.updateOver(oc);
     		return "redirect:/oversea/overList";
     	}
        
}
