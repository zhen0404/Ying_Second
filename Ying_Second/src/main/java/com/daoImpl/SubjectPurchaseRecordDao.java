package com.daoImpl;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Subject_bbin_purchase_record;
import com.bean.Subject_purchase_record;
import com.dao.BaseDao;

/**
 * 付息列表
 * @author Maibenben
 *
 */
@Component
public class SubjectPurchaseRecordDao implements BaseDao<Subject_purchase_record>{

	@Autowired
	private SessionFactory sf;
	
	public Session getSession(){
		return sf.getCurrentSession();
	}
	
	@Override
	public List<Subject_purchase_record> listAll() {
		return null;
	}

	@Override
	public void save(Subject_purchase_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Subject_purchase_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Subject_purchase_record getById(int id) {
		Session session=getSession();
		Subject_purchase_record subject_purchase_record=(Subject_purchase_record)session.get(Subject_purchase_record.class, id);
		return subject_purchase_record;
	}

	@Override
	public void update(Subject_purchase_record spr) {
		Session session=getSession();
		session.update(spr);
	}

	@Override
	public List<Subject_purchase_record> listAll(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Subject_purchase_record> listAll(int id) {
		System.out.println("come in");
		String hql="from Subject_purchase_record where sid="+id;
		Session session=getSession();
		List<Subject_purchase_record> list=session.createQuery(hql).list();
		System.out.println(hql);
		System.out.println(list.size());
		return list;
	}

}
