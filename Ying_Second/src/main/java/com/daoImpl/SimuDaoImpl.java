package com.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Finance_product_funds;
import com.bean.Finance_product_subscribe;
import com.dao.SimuDao;

@Component
public class SimuDaoImpl implements SimuDao{
	
	@Autowired
	public SessionFactory sessionFactory;

	
	public Session getSession() {
		 return sessionFactory.getCurrentSession();
	}

	public List<Finance_product_funds> showmoney() {
		String hql="from Finance_product_funds";
		  Session session=getSession();
		  List<Finance_product_funds> list=session.createQuery(hql).list();
		  return list;
	
	}

	public void addmoney(Finance_product_funds finance) {
		Session session=getSession();
	     session.save(finance);
	}

	public void update(Finance_product_funds finance) {
		Session session=getSession();
	     session.update(finance);
		
	}

	public Finance_product_funds getById(int id) {
		Finance_product_funds fpr=(Finance_product_funds)this.getSession().get(Finance_product_funds.class, id);
		return fpr;
	}

	public List<Finance_product_subscribe> showmoneyding(int id) {
		String hql="from Finance_product_subscribe where product_id= " +id;
		Session session=getSession();
		List<Finance_product_subscribe>list=session.createQuery(hql).list();
		return list;
	}

	public Finance_product_subscribe getByIding(int id) {
		Finance_product_subscribe finance=(Finance_product_subscribe)this.getSession().get(Finance_product_subscribe.class, id);
		return finance;
	}

	public void savehe(Finance_product_subscribe fina) {
		Session session=getSession();
		  session.save(fina);
		
	}

	public List<Finance_product_funds> query(String hql) {
		Session session=getSession();
		  List<Finance_product_funds> list=session.createQuery(hql).list();
		  return list;
	}

	public void updateq(Finance_product_subscribe fps) {
		Session session=getSession();
		  session.update(fps);
		
	}

}
