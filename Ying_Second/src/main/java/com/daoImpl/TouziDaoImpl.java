package com.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Bbin_info;
import com.bean.Finance_product_subscribe;
import com.bean.Member_deposit_record;
import com.bean.Member_withdraw_record;
import com.bean.Subject_purchase_record;
import com.dao.TouziDao;

@Component
public class TouziDaoImpl implements TouziDao{
			@Autowired
			public SessionFactory sessionFactory;
		
			
			public Session getSession() {
				 return sessionFactory.getCurrentSession();
			}

	@Override
	public List<Subject_purchase_record> listAll(int id) {
		String hql="from Subject_purchase_record where member_id="+id;
		  Session session=getSession();
		  List<Subject_purchase_record> list=session.createQuery(hql).list();
		  return list;
	}

	@Override
	public List<Finance_product_subscribe> listAllyu(int id) {
		String hql="from Finance_product_subscribe where member_id="+id;
		  Session session=getSession();
		  List<Finance_product_subscribe> listyu=session.createQuery(hql).list();
		  return listyu;
	}

	@Override
	public List<Member_deposit_record> listAllchong(int id) {
		String hql="from Member_deposit_record where member_id="+id;
		  Session session=getSession();
		  List<Member_deposit_record> listchong=session.createQuery(hql).list();
		  return listchong;
	}

	@Override
	public List<Member_withdraw_record> listAllti(int id) {
		String hql="from Member_withdraw_record where member_id="+id;
		  Session session=getSession();
		  List<Member_withdraw_record> listti=session.createQuery(hql).list();
		  return listti;
	}

	@Override
	public List<Bbin_info> listAlltiyanj(int id) {
		String hql="from Bbin_info where member_id="+id;
		  Session session=getSession();
		  List<Bbin_info> listtiyanj=session.createQuery(hql).list();
		  return listtiyanj;
	}

}
