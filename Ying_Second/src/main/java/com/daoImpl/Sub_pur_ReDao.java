package com.daoImpl;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Subject_purchase_record;
import com.dao.BaseDao;

/**
 * 投资记录
 * @author Maibenben
 *
 */
@Component
public class Sub_pur_ReDao implements BaseDao<Subject_purchase_record>{
	
	@Autowired
	private SessionFactory sf;
	
	private Session getSession(){
		return sf.getCurrentSession();
	}

	@Override
	public List<Subject_purchase_record> listAll() {
		// TODO Auto-generated method stub
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
		String hql="from Subject_purchase_record where member_id="+id;
		Session session=getSession();
		List<Subject_purchase_record> list=session.createQuery(hql).list();
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public void update(Subject_purchase_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Subject_purchase_record> listAll(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Subject_purchase_record> listAll(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
