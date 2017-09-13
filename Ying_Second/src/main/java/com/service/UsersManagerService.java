package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;

import com.bean.Member;

public interface UsersManagerService {

	List<Member> listMember(int currentPage,Map m,String type,Model model);
	
	void saveMember(Member m);
	
	void deleteMember(int id);
	
	void updateMember(Member m);
	
	Member getMember(int id);
	
}
