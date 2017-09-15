package com.dao;

import java.util.List;
import java.util.Map;

import com.bean.Member;
import com.bean.Roles;

public interface RoleManagerDao {

List<Roles> listRole(Map m,int currentPage);
	
	void saveRole(Member m);
	
	void deleteRole(int id);
	
	void updateRole(Member m);
	
	Member getRole(int id);
	
	Object count(Map map);
	
}
