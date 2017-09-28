package com.controller;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.News;
import com.bean.News_type;
import com.bean.Page;
import com.service.BaseService;
import com.service.CollegeService;
import com.serviceImpl.BusinessService;
import com.serviceImpl.ClassifyService;
import com.controller.*;


@Controller
@RequestMapping("/business")
public class BusinessController {
	
	@Autowired
	@Qualifier("businessService")
	private CollegeService<News> collegeService;
	
	@Autowired
	private Page pb;
	
	@RequestMapping("/saveBusiness")
	public String save(News news,HttpServletResponse response,int typeId){
		System.out.println("执行保存");
		System.out.println("save");
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date=df.format(new Date());
		try {
			PrintWriter pw=response.getWriter();
			news.setAddTime(df.parse(date));
			news.setUpdTime(df.parse(date));
			News_type nType=collegeService.getTypeId(typeId);
			news.setNews_type(nType);
			pw.print("yes");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		collegeService.save(news);
		return "redirect:/business/ListNews";
	}


	@RequestMapping("/ListNews")
	public String ListNews(Model model,@ModelAttribute("qname")String qname,@ModelAttribute("typeId")String typeId,@RequestParam(required=true,defaultValue="1")int page,String flag){
		System.out.println("typeID:"+typeId);
		Map map=new HashMap();
		pb.setSize(10);
		pb.setCurrentPage(page);
		map.put("qname",qname);
		if(typeId!=null&&!"".equals(typeId)){
			int tyid=Integer.parseInt(typeId);
			System.out.println(tyid+" jdhkheh");
			map.put("typeId",tyid);
		}
		map.put("flag",flag);
		map.put("pb",pb);
		System.out.println("come in");
		List<News> list=collegeService.listAll(map);
		List<News_type> Tlist=collegeService.typeList();
		model.addAttribute("typeList",Tlist);
		System.out.println("tlistsize:"+Tlist.size());
		model.addAttribute("ListNews",list);
		model.addAttribute("pb",pb);
		return "/backModel/back_Business";
	}

	@RequestMapping("/deleteBusiness")
	public String delete(int id){
		News news=collegeService.getById(id);
		collegeService.delete(news);
		return "redirect:/business/ListNews";
	}
	
	@RequestMapping("/initData/{id}")
	public String initData(@PathVariable("id")int id,Model model){
		News news=collegeService.getById(id);
		List<News_type> Tlist=collegeService.typeList();
		model.addAttribute("typeList",Tlist);
		model.addAttribute("news",news);
		return "/backModel/BusinessEdit";
	}
	
	@RequestMapping("/updateBusiness")
	public String update(News news,int typeId,HttpServletResponse response){
		System.out.println("update");
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date=df.format(new Date());
		try {
			PrintWriter pw=response.getWriter();
			news.setAddTime(df.parse(date));
			news.setUpdTime(df.parse(date));
			News_type nType=collegeService.getTypeId(typeId);
			news.setNews_type(nType);
			pw.print("yes");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		this.collegeService.update(news);
		return "redirect:/business/ListNews";
	}
	
	@RequestMapping("/toBusinessAdd")
	public String toBusinessAdd(Model model){
		List<News> list=collegeService.listAll();
		List<News_type> Tlist=collegeService.typeList();
		model.addAttribute("typeList",Tlist);
		model.addAttribute("ListNews",list);
		return "/backModel/BusinessAdd";
		
	}
}
