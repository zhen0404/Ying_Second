package com.daoImpl;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Financial_planner;
import com.bean.Member;
import com.dao.BaseDao;

/**
 * 鐞嗚储甯堝鏍�
 * @author Maibenben
 *
 */
@Component
public class FinancialPlannerAuditDao implements BaseDao<Financial_planner>{
	
	@Autowired
	private SessionFactory sf;
	
	public Session getSession(){
		return sf.getCurrentSession();
	}

	public List<Financial_planner> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Financial_planner t) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Financial_planner t) {
		// TODO Auto-generated method stub
		
	}

	public Financial_planner getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Financial_planner t) {
		// TODO Auto-generated method stub
		
	}

	public List<Financial_planner> listAll(Map map) {
		String hql="from Financial_planner ";
		hql=sqlData(hql, map);
		Session session=getSession();
		List<Financial_planner> list=session.createQuery(hql).list();
		return list;
	}
	
	public String sqlData(String sql,Map map){
		String mobile_Phone=(String)map.get("mobile_Phone");
		String member_name=(String)map.get("member_name");
		String status=(String)map.get("status");
		String create_date=(String)map.get("create_date");
		if(mobile_Phone!=null&&!mobile_Phone.equals("")){
			sql+=" and mobile_Phone like '%"+mobile_Phone+"%'";
		}
		if(member_name!=null&&!member_name.equals("")){
			sql+=" and member_name like '%"+member_name+"%'";
		}
		if(status!=null&&!status.equals("")){
			sql+=" and status like '%"+status+"%'";
		}
		if(create_date!=null&&!create_date.equals("")){
			sql+=" and create_date like '%"+create_date+"%'";
		}
		return sql;
	}
	

}
