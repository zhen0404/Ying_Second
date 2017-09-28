package com.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.ui.Model;

import com.bean.Member;
import com.bean.Resources;
import com.bean.Roles;
import com.bean.User_role;

public interface RoleManageService {

	List<User_role> listRole(int currentPage,Map m,String type,Model model);
	
	void saveRole(User_role m);
	
	void deleteRole(int id);
	
	void updateRole(Member m);
	
	Roles getRole(int id);
	
	List ListAlltrue(int id);
	
	Set<String> ListAllByName(Object object);
	
	public <T>List<T> ListAll(Object...objects) ;

	public void save (Object...objects);
	
}
