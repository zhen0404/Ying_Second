package com.daoImpl;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.News_type;
import com.dao.BaseDao;

@Component
public class NewsTypeDao implements BaseDao<News_type>{
	
	@Autowired
	private SessionFactory sf;
	
	public Session getSession(){
		return sf.getCurrentSession();
	}

	@Override
	public List<News_type> listAll() {
		String hql="from News_type ";
		Session session=getSession();
		List<News_type> list=session.createQuery(hql).list();
		return list;
	}

	@Override
	public void save(News_type t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(News_type t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public News_type getById(int id) {
		
		return null;
	}

	@Override
	public void update(News_type t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<News_type> listAll(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<News_type> listAll(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
