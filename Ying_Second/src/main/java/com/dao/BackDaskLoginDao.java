package com.dao;

import java.util.Set;

import com.bean.Users;

public interface BackDaskLoginDao {

	Set<String> getRolesByName(String username);
	
	Set<String> getPermissions(String userName);
	
	int getIdByUname(String uname);
	
	Users getUserBuUname(String uname);
	
}
