package com.service;

import com.bean.Member;

public interface FontLoginService {

	Member getMember(String phone,String password);
	
	Member getMemberByPhone(String phone);
	
	void saveMember(Member m);
	
	String getIdentity();
	
}
