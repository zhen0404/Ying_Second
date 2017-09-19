package com.daoImpl;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Member_trade_record;
import com.dao.BaseDao;

/**
 * 钱包记录
 * @author Maibenben
 *
 */
@Component
public class Member_trade_recordDao implements BaseDao<Member_trade_record>{

	@Autowired
	private SessionFactory sf;
	
	private Session getSession(){
		return sf.getCurrentSession();
	}
	
	@Override
	public List<Member_trade_record> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Member_trade_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Member_trade_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Member_trade_record getById(int id) {
		String hql="from Member_trade_record where member_id="+id;
		Session session=getSession();
		List<Member_trade_record> list=session.createQuery(hql).list();
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public void update(Member_trade_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Member_trade_record> listAll(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member_trade_record> listAll(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
