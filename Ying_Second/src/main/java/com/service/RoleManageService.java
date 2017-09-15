package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;

import com.bean.Member;
import com.bean.Roles;

public interface RoleManageService {

	List<Roles> listRole(int currentPage,Map m,String type,Model model);
	
	void saveRole(Member m);
	
	void deleteRole(int id);
	
	void updateRole(Member m);
	
	Roles getRole(int id);
	
}
