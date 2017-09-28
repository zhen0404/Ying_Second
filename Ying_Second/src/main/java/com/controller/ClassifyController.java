package com.controller;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.News_type;
import com.bean.Page;
import com.service.BaseService;
import com.service.CollegeService;


@Controller
@RequestMapping("/classify")
public class ClassifyController {
	
	@Autowired
	@Qualifier("classifyService")
	private CollegeService<News_type> collegeService;
	
	@Autowired
	private Page pb;
	
	@RequestMapping("/toClassifyAdd")
	public String toClassifyAdd(Model model){
		System.out.println("this is toAdd");
		List<News_type> listNews_type=collegeService.typeList();
		model.addAttribute("listNews_type", listNews_type);
		System.out.println("toAdd:"+listNews_type.size());
		return "/backModel/ClassifyAdd";
	}
	@RequestMapping("/saveNews_type")
	public String save(News_type news_type,HttpServletResponse response){
		System.out.println("save");
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date=df.format(new Date());
		try {
			PrintWriter pw=response.getWriter();
			news_type.setAddTime(df.parse(date));
			news_type.setUpdTime(df.parse(date));
			pw.print("yes");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		collegeService.save(news_type);
		System.out.println("  "+news_type.getName());
		return "redirect:/classify/ListNews_type";
	}

	@RequestMapping("/ListNews_type")
	public String ListNews_type(Model model,@ModelAttribute("tname")String tname,@RequestParam(required=true,defaultValue="1")int page,String flag){
		Map map=new HashMap();
		pb.setSize(10);
		pb.setCurrentPage(page);
		map.put("tname",tname);
		map.put("flag",flag);
		map.put("pb",pb);
		List<News_type> ListNews_type=collegeService.listAll(map);
		model.addAttribute("ListNews_type",ListNews_type);
		System.out.println("长度："+ListNews_type.size());
		model.addAttribute("pb",pb);
		return "backModel/back_Classify";
	}

	@RequestMapping("/initData/{id}")
	public String initData(@PathVariable("id")int id,Model model){
		News_type news_type=collegeService.getById(id);
		System.out.println(collegeService.getById(id));
		System.out.println("news_type:"+news_type);
		model.addAttribute("news_type",news_type);
		List<News_type> listNews_type=collegeService.typeList();
		
		model.addAttribute("listNews_type", listNews_type);
		System.out.println("this is toUpdate:"+listNews_type.size());
		return "/backModel/ClassifyEdit";
	}
	
	@RequestMapping("/updateNews_type")
	public String update(News_type news_type,HttpServletResponse response){
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date=df.format(new Date());
		try {
			PrintWriter pw=response.getWriter();
			news_type.setAddTime(df.parse(date));
			news_type.setUpdTime(df.parse(date));
			pw.print("yes");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		this.collegeService.update(news_type);
		return "redirect:/classify/ListNews_type";
	}
}
