package com.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.bean.Member;
import com.bean.Resources;
import com.bean.Roles;
import com.bean.User_role;

public interface RoleManagerDao {

List<User_role> listRole(Map m,int currentPage);
	
	void saveRole(User_role m);
	
	void deleteRole(int id);
	
	void updateRole(Member m);
	
	Member getRole(int id);
	
	Object count(Map map);
	
	List<Resources> ListAll();
	
	List ListAlltrue(int id);
	
	Set<String> ListAllByName(Object object);

	void save(Object[] objects);
	
}
