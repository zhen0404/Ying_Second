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

import com.bean.User_role;
import com.bean.Users;
import com.service.RoleManageService;
import com.service.UsersManagerService;

@Controller
@RequestMapping("usersManager")
public class UsersManagerController {

	@Autowired
	@Qualifier("usersManagerServiceImpl")
	private UsersManagerService userManagerService;
	
	@Autowired
	@Qualifier("roleManageServiceImpl")
	private RoleManageService rs;
	
	@RequestMapping("listMember")
	public String listMember(Map m,String currentPage,String type,String member_name,String name,String mobile_phone,String invitationCode,String create_date,Model model){
//		m.put("member_name", member_name);
//		m.put("name", name);
//		m.put("mobile_phone", mobile_phone);
//		m.put("invitationCode", invitationCode);
//		m.put("create_date", create_date);
		if(currentPage==null){
			currentPage="1";
		}
		List<User_role> rlist=this.rs.listRole(Integer.parseInt(currentPage), m, type, model);
		System.out.println(rlist.size());
		model.addAttribute("rlist", rlist);
		model.addAttribute("currentPage", currentPage);
		List<Users> mlist=this.userManagerService.listMember(Integer.parseInt(currentPage),m,type,model);
		model.addAttribute("userList", mlist);
//		model.addAttribute("member_name", member_name);
//		model.addAttribute("name", name);
//		model.addAttribute("mobile_phone", mobile_phone);
//		model.addAttribute("invitationCode", invitationCode);
//		model.addAttribute("create_date", create_date);
		return "backModel/userManagement/usersManage";
	}
	
	@RequestMapping("/delete")
	public String deleteUser(int id){
		this.userManagerService.deleteUser(id);
		return "redirect:/usersManager/listMember";
	}
	
	@RequestMapping("updateRole")
	public String updateRole(int uid,int rid){
		userManagerService.updateUserRole(uid,rid);
		return "redirect:/usersManager/listMember";
	}
	
	@RequestMapping("saveUsers")
	public String saveUsers(Users users,int rid){
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			users.setCreate_date(sdf.parse(sdf.format(date)));
			users.setUpdate_date(sdf.parse(sdf.format(date)));
			users.setDel_flag(0);
			users.setIdentity(rid);
			users.setUserrole(this.userManagerService.getUR(rid));
			users.setSalt("javamd");
			users.setName(users.getUser_name());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		userManagerService.saveUsers(users);
		return "redirect:/usersManager/listMember";
	}
	
}
