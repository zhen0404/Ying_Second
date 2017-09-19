package com.daoImpl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Subject_bbin_purchase_record;
import com.dao.BaseDao;

/**
 * 体验金付息
 * @author Maibenben
 *
 */
@Component
public class ExperiencePaymentDao implements BaseDao<Subject_bbin_purchase_record>{

	@Autowired
	private SessionFactory sf;
	
	public Session getSession(){
		return sf.getCurrentSession();
	}
	
	@Override
	public List<Subject_bbin_purchase_record> listAll(int id) {
		System.out.println("come in");
		String hql="from Subject_bbin_purchase_record where sid="+id;
		Session session=getSession();
		List<Subject_bbin_purchase_record> list=session.createQuery(hql).list();
		return list;
	}

	@Override
	public void save(Subject_bbin_purchase_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Subject_bbin_purchase_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Subject_bbin_purchase_record getById(int id) {
		Session session=getSession();
		Subject_bbin_purchase_record sRecord=(Subject_bbin_purchase_record)session.get(Subject_bbin_purchase_record.class, id);
		return sRecord;
	}

	@Override
	public void update(Subject_bbin_purchase_record sRecord) {
		Session session=getSession();
		Date date=new Date();
		sRecord.setUpdate_date(date);
		session.update(sRecord);
		
	}

	@Override
	public List<Subject_bbin_purchase_record> listAll(Map map) {
		return null;
	}

	@Override
	public List<Subject_bbin_purchase_record> listAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
