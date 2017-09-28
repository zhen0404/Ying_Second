package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;

import com.bean.Member;
import com.bean.User_role;
import com.bean.Users;

public interface UsersManagerService {

	List<Users> listMember(int currentPage,Map m,String type,Model model);
	
	void saveMember(Member m);
	
	void deleteUser(int uid);
	
	void updateMember(Member m);
	
	Member getMember(int id);

	void updateUserRole(int uid, int rid);

	void saveUsers(Users users);
	
	User_role getUR(int rid);
	
}
