package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.Resources;
import com.bean.Roles;
import com.bean.User_role;
import com.service.RoleManageService;

@Controller
@RequestMapping("role")
public class RoleManagementController {

	@Autowired
	@Qualifier("roleManageServiceImpl")
	private RoleManageService rs;
	
	@RequestMapping("listRole")
	public String listRole(Map m,String currentPage,Model model,String type){
		if(currentPage==null){
			currentPage="1";
		}
		model.addAttribute("currentPage", currentPage);
		List<User_role> rlist=this.rs.listRole(Integer.parseInt(currentPage), m, type, model);
		model.addAttribute("rlist", rlist);
		return "backModel/userManagement/roleManage";
	}
	
	@RequestMapping("rolesztree")
	@ResponseBody
	public String Ztree(Model model,int id) {
		System.out.println("初始化");
			 List<Resources> list=rs.ListAll(); 
			List<Integer> bool=rs.ListAlltrue(id);
		        StringBuffer json=new StringBuffer("[");  
		        String data="";  
		        for (int i = 0; i < list.size(); i++) {  
		            json.append("{id:"+list.get(i).getResources_id()+",");  
		            json.append("pId:"+list.get(i).getResources_higher()+",");  
		            json.append("name:\""+list.get(i).getResources_name()+"\",");  
		            if (list.get(i).getIsParent() !=0) {  
		                json.append("isParent:"+list.get(i).getIsParent()+",");  
		            }  
		            for (int y = 0; y < bool.size(); y++) {  
		            if (list.get(i).getResources_id() ==bool.get(y)) {  
		            	System.out.println(bool.get(y));
		            	//默认勾选
		                json.append("checked:true,");  
		                //勾选后默认打开
		                json.append("open:"+list.get(i).getResources_id()+",");  
		            }  
		            }
		            if (list.get(i).getChkDisabled()==1) {
		            	 json.append("checked:true,");  
		                json.append("chkDisabled:true,");  
		            }  
		            data=json.substring(0,json.lastIndexOf(","))+"},";  
		            json=new StringBuffer(data);  
		        }
		        data=json.substring(0, json.length()-1)+"]";  
		        System.out.println(data);  
		        return data;  
		}
	
	// 添加用户权限
	@RequestMapping("PM_RolesAdd")
	public String BgRight(String msg, int id) {
		rs.save(msg,id);
		return "BgUserRoles";
	}
	
	//添加角色
	@RequestMapping("saveRole")
	public String saveRole(User_role userRole,String role,String text){
		userRole.setCname(role);
		userRole.setEname("");
		userRole.setRemark(text);
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			userRole.setCreate_date(sdf.parse(sdf.format(date)));
			userRole.setUpdate_date(sdf.parse(sdf.format(date)));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		userRole.setCategory("SYS");
		userRole.setDel_flag(0);
		userRole.setSource_id(0);
		userRole.setSource_type(0);
		this.rs.saveRole(userRole);
		return "redirect:/role/listRole";
	}
	
}
