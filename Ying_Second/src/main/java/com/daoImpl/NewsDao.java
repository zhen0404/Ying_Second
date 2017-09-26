package com.daoImpl;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.News;
import com.dao.BaseDao;
import com.dao.NDao;

/**
 * qian tai xin wen
 * @author Maibenben
 *
 */
@Component
public class NewsDao implements NDao<News>{
	
	@Autowired
	private SessionFactory sf;
	
	public Session getSession(){
		return sf.getCurrentSession();
	}

	@Override
	public List<News> listAll() {
		String sql="select n1.name as name from news_type n1,news n2 where n1.id=n2.typeId GROUP BY n1.id";
		Session session=getSession();
		List<News> list=session.createSQLQuery(sql).list();
		System.out.println("listTi="+list.size());
		return list;
	}

	@Override
	public void save(News t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(News t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public News getById(int id) {
		String hql="from News where id="+id;
		Session session=getSession();
		List<News> list=session.createQuery(hql).list();
		System.out.println("listTe="+list);
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public void update(News t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<News> listAll(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<News> listAll(int id) {
		String hql="from News where typeId="+id;
		Session session=getSession();
		List<News> list=session.createQuery(hql).list();
		return list;
	}

	@Override
	public List listT(int id) {
		String hql="from News where id="+id;
		Session session=getSession();
		List list=session.createQuery(hql).list();
		return null;
	}

	
	
}
