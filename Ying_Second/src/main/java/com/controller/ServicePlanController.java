package com.controller;

import org.springframework.beans.factory.annotation.Qualifier;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.Subj;
import com.bean.Subject;
import com.bean.Subject_purchase_record;
import com.service.BaseService;
import com.service.SubjectService;

@Controller
@RequestMapping("/plan")
public class ServicePlanController {

	@Autowired
	@Qualifier("servicePlanService")
	private BaseService<Subject_purchase_record> baseService;
//	@Autowired
//    @Qualifier("subjectServiceImpl")
//    private SubjectService subjectServiceImpl;
	
	@RequestMapping("/list")
	public String listSP(Model model,String name,String type,String status){
		Map map=new HashMap<>();
		map.put("name",name);
		map.put("type",type);
		map.put("status",status);
		List list=baseService.listAll(map);
		model.addAttribute("list",list);
		model.addAttribute("name",name);
		model.addAttribute("type",type);
		model.addAttribute("status",status);
		return "backModel/vip/splan/servicePlan";
	}
//	@RequestMapping("/getTotalMoney")
//	@ResponseBody
//	public void getTotalMoney(int id,HttpServletResponse response) {
//		System.out.println("id:" + id);
//		Subject sub = subjectServiceImpl.getById(id);
//		double num = 0;
//		Set<Subject_purchase_record> sets = sub.getSubjectPurchaseRecord();
//		PrintWriter pw;
//		try {
//			pw = response.getWriter();
//			if (sets.size() != 0) {
//				Iterator<Subject_purchase_record> records = sets.iterator();
//				while (records.hasNext()) {
//					Subject_purchase_record rec = records.next();
//					num += rec.getAmount();
//				}
//			}
//			System.out.println(num);
//			pw.print(num);
//			pw.flush();
//			pw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
}
