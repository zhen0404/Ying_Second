package com.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;

import com.bean.Member;
import com.bean.User_role;
import com.bean.Users;

public interface UsersManagerDao {

	List<Users> listMember(Map m,int currentPage);
	
	void saveMember(Member m);
	
	public void deleteUser(int uid);
	
	void updateMember(Member m);
	
	Member getMember(int id);
	
	Object count(Map map);
	
	String listDataHql(String hql,Map map);

	void updateUserRole(int uid, int rid);

	void saveUsers(Users users);
	
	User_role getUR(int rid);
	
}
