package com.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Subj;
import com.bean.Subject;
import com.bean.Subject_bbin_purchase_record;
import com.bean.Subject_purchase_record;
import com.dao.BaseDao;

/**
 * 付息计划
 * @author Maibenben
 *
 */
@Component
public class ServicePlanDao implements BaseDao<Subject_purchase_record>{
	
	@Autowired
	private SessionFactory sf;
	
	public Session getSession(){
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Subject_purchase_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List listAll(Map map) {
		String sql="select * from(select s1.serial_no,s1.type,s1.name,s1.amount,"
				+ "SUM(s2.amount*s2.pay_interest_times) sumamount,s1.bought,s1.period,s1.year_rate,s1.status,s1.exper_status "
				+ "from subject s1 left join subject_purchase_record s2 on s1.id=s2.subject_id group by "
				+ "s1.serial_no,s1.type,s1.name,s1.amount,s1.bought,s1.period,s1.year_rate,s1.status,s1.exper_status)t where 0=0";
		sql=hqlData(sql, map);
		Session session=getSession();
		List list=session.createSQLQuery(sql).list();
		List<Subj> listSpr=new ArrayList<Subj>();
		for(int i=0;i<list.size();i++){
			Subj subj=new Subj();
			Object[] obj=(Object[]) list.get(i);
			subj.setSerial_no(obj[0].toString());
			subj.setType(Integer.parseInt(obj[1].toString()));
			subj.setName(obj[2].toString());
			subj.setAmount((int)Float.parseFloat(obj[3].toString()));
			if(obj[4]==null){
				subj.setAm(0);
			}else{
				subj.setAm(Double.valueOf(obj[4].toString()));
			}
			subj.setBought(Integer.parseInt(obj[5].toString()));
			subj.setPeriod(Integer.parseInt(obj[6].toString()));
			subj.setYear_rate((int)Float.parseFloat(obj[7].toString()));
			subj.setStatus(Integer.parseInt(obj[8].toString()));
			subj.setExper_status(Integer.parseInt(obj[9].toString()));
     	   listSpr.add(subj);
		}
		return listSpr;
//		String hql="from Subject where 0=0 ";
//		hql=hqlData(hql, map);
//		Session session=getSession();
//		List list=session.createQuery(hql).list();
//		return list;
	}
	public String hqlData(String hql,Map map){
		String name=(String)map.get("name");
		String type=(String)map.get("type");
		String status=(String)map.get("status");
		if(name!=null&&!name.equals("")){
			hql+="and name like '%"+name+"%'";
		}
		if(type!=null&&!type.equals("")){
			hql+="and type="+type;
		}
		if(status!=null&&!status.equals("")){
			hql+="and status ="+status;
		}
		return hql;
	}

	@Override
	public List<Subject_purchase_record> listAll(int id) {
		// TODO Auto-generated method stub
		return null;
	}


}
