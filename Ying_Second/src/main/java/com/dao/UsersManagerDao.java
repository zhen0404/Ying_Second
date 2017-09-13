package com.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.bean.Member;

public interface UsersManagerDao {

	List<Member> listMember(Map m,int currentPage);
	
	void saveMember(Member m);
	
	void deleteMember(int id);
	
	void updateMember(Member m);
	
	Member getMember(int id);
	
	Object count(Map map);
	
	String listDataHql(String hql,Map map);
	
}
