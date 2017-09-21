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

import com.service.GgManagerService;
import com.bean.Push_notice;

@Controller
@RequestMapping("GongGao")
public class YjTopController {

	@Autowired
	@Qualifier("ggManagerServiceImpl")
	private GgManagerService ggManagerService;
	//根据id查询公告内容
	@RequestMapping("/YjToo")
	public String YjToo(int id,Model model){
		Push_notice push_notice=ggManagerService.chakan(id);
		model.addAttribute("pushNotice",push_notice);
		return "backModel/fxx/YjToo";
	}
	//修改内容,標題
	@RequestMapping("/serTor")
	public String serTor(Push_notice push,int id,String title,String content){
		Date date=new Date();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
		String sun=simpleDateFormat.format(date);
		Date me=null;
		try {
			me=simpleDateFormat.parse(sun);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		push.setCreate_date(me);  
//		push.setUpdate_Date(new Date());
		this.ggManagerService.updatelist(id,title,content);
	
		return "redirect:/GongGao/manager";
	}
	//添加标题
		@RequestMapping("/serTow")
		public String serTow(Push_notice push_notice,Date create_date){
			Date date = new Date();  
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
	        String dateNowStr = sdf.format(date); 
	        Date me=null;
	        try {
				me=sdf.parse(dateNowStr);
				System.out.println(me);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			push_notice.setCreate_date(me);
			this.ggManagerService.save(push_notice);
			return "redirect:/GongGao/manager";
		}
	//编辑公告
	@RequestMapping("/YjTom")
	public String YjTom(int id,Model model){
		Push_notice push_notice=ggManagerService.chakan(id);
		model.addAttribute("pushNotice",push_notice);
		System.out.println(push_notice.getTitle());
		return "backModel/fxx/YjTom";
	}
	    //查询所有公告，新闻
		@RequestMapping("/manager")
		public String menus1(Model model){
	    	List list =this.ggManagerService.listSubject();
	    	model.addAttribute("list", list);
			return "backModel/fxx/YjTop";
		}
		//查询所有反馈意见表
		@RequestMapping("/YjFom")
		public String YjFom(Model model){
			List list=this.ggManagerService.listfeedback();
			model.addAttribute("list",list);
			return "backModel/fxx/YjFom";
		}
		//查询是否有该标题
	@RequestMapping("/serTop")
	public String serTop(String title,Model model){
		
		String hql="from Push_notice where title like '%"+title+"%'";
					List list=this.ggManagerService.listPush_notice(hql);
					System.out.println(list.size());
					model.addAttribute("list", list);
					
						return "backModel/fxx/YjTop";
	}
	//跳轉添加
	@RequestMapping("/serTou")
	public String serTou(){
		return "backModel/fxx/YjTow";
	}
	//跳转财务统计
	@RequestMapping("/serCop")
	public String serCop(){
		return "backModel/fxx/YjCop";
	}
	//跳转用户综合统计
		@RequestMapping("/serHow")
		public String serHow(){
			return "backModel/fxx/YjHow";
		}
	
	
}
