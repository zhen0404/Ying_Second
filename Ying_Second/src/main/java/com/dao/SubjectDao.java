package com.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;

import com.bean.Subject;
import com.bean.Subject_bbin_purchase_record;

public interface SubjectDao {
		 Session getSession();
		 List<Subject >listSubject();
		 List<Subject >listSubject(Map map);
		 List<Subject > query(String hql);         
		  Subject getById(int id);
		  void updateSub(Subject sub);
		  void p2pAdd(Subject sub);
		List<Subject_bbin_purchase_record> listp2pton();//��ѯͶ�ʱ�
		
}
