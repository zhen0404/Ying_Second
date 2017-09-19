package com.daoImpl;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Member_deposit_record;
import com.dao.BaseDao;

/**
 * 充值管理
 * @author Maibenben
 *
 */
@Component
public class MemberDepositRecordDao implements BaseDao<Member_deposit_record>{

	@Autowired
	private SessionFactory sf;
	
	private Session getSession(){
		return sf.getCurrentSession();
	}
	
	@Override
	public List<Member_deposit_record> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Member_deposit_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Member_deposit_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Member_deposit_record getById(int id) {
		String hql="from Member_deposit_record where member_id="+id;
		Session session=getSession();
		List<Member_deposit_record> list=session.createQuery(hql).list();
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public void update(Member_deposit_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Member_deposit_record> listAll(Map map) {
		String hql="from Member_deposit_record m where 0=0 ";
		hql=hqlData(hql, map);
		Session session=getSession();
		List<Member_deposit_record> list=session.createQuery(hql).list();
		return list;
	}

	@Override
	public List<Member_deposit_record> listAll(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String hqlData(String hql,Map map){
		String serial_number=(String)map.get("serial_number");
		String mobile_Phone=(String)map.get("mobile_Phone");
		String status=(String)map.get("status");
		String pay_channel_order_no=(String)map.get("pay_channel_order_no");
		String create_date=(String)map.get("create_date");
		if(serial_number!=null&&!serial_number.equals("")){
			hql+=" and serial_number like '%"+serial_number+"%'";
		}
		if(mobile_Phone!=null&&!mobile_Phone.equals("")){
			hql+=" and m.member.mobile_Phone like '%"+mobile_Phone+"%'";
		}
		if(status!=null&&!status.equals("")){
			hql+=" and status like '%"+status+"%'";
		}
		if(pay_channel_order_no!=null&&!pay_channel_order_no.equals("")){
			hql+=" and pay_channel_order_no like '%"+pay_channel_order_no+"%'";
		}
		if(create_date!=null&&!create_date.equals("")){
			hql+=" and create_date like '%"+create_date+"%'";
		}
		return hql;
	}
}
