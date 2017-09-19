package com.daoImpl;

import java.util.List;
import java.util.Map;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Subject;
import com.bean.Subject_bbin_purchase_record;
import com.dao.SubjectDao;;

@Component
public class SubjectDaoImpl implements SubjectDao {

	@Autowired
	public SessionFactory sessionFactory;

	
	public Session getSession() {
		 return sessionFactory.getCurrentSession();
	}

	public List<Subject> listSubject() {
		String hql="from Subject";
		  Session session=getSession();
		  List<Subject> list=session.createQuery(hql).list();
		  return list;
	}

	
	public Subject getById(int id) {
		Subject sub=(Subject)this.getSession().get(Subject.class, id);
		return sub;
	}

	
	public void updateSub(Subject sub) {
		Session session=getSession();
		session.update(sub);
	}

	
	public void p2pAdd(Subject sub) {
     Session session=getSession();
     session.save(sub);
	}


	public List<Subject_bbin_purchase_record> listp2pton() {
		String hql="from Subject_bbin_purchase_record";
		Session session=getSession();
		 List<Subject_bbin_purchase_record> list2=session.createQuery(hql).list();
		  return list2;
	}

	  public List<Subject> query(String hql) {
		  Session session=getSession();
		  List<Subject> list=session.createQuery(hql).list();
		  return list;
	}

	public List<Subject> listSubject(Map map) {
		String hql="from Subject where 0=0";
		  Session session=getSession();
		  List<Subject> list=session.createQuery(hql).list();
		  return list;
	}
	
	

}
