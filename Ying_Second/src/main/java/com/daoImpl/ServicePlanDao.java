package com.daoImpl;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Subject;
import com.bean.Subject_bbin_purchase_record;
import com.dao.BaseDao;

/**
 * 付息计划
 * @author Maibenben
 *
 */
@Component
public class ServicePlanDao implements BaseDao<Subject>{
	
	@Autowired
	private SessionFactory sf;
	
	public Session getSession(){
		return sf.getCurrentSession();
	}

	@Override
	public List<Subject> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Subject t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Subject t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Subject getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Subject t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Subject> listAll(Map map) {
		String hql="from Subject  where 0=0 ";
		hql=hqlData(hql, map);
		Session session=getSession();
		List<Subject> list=session.createQuery(hql).list();
		return list;
	}
	public String hqlData(String hql,Map map){
		String name=(String)map.get("name");
		String type=(String)map.get("type");
		String status=(String)map.get("status");
		if(name!=null&&!name.equals("")){
			hql+="and name like '%"+name+"%'";
		}
		if(type!=null&&!type.equals("")){
			hql+="and type like '%"+type+"%'";
		}
		if(status!=null&&!status.equals("")){
			hql+="and status like '%"+status+"%'";
		}
		return hql;
	}

	@Override
	public List<Subject> listAll(int id) {
		// TODO Auto-generated method stub
		return null;
	}


}
