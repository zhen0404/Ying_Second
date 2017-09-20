package com.daoImpl;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Member_withdraw_record;
import com.dao.BaseDao;

/**
 * 提现管理
 * @author Maibenben
 *
 */
@Component
public class MemberWithdrawRecordDao implements BaseDao<Member_withdraw_record>{

	
	@Autowired
	private SessionFactory sf;
	
	private Session getSession(){
		return sf.getCurrentSession();
	}
	@Override
	public List<Member_withdraw_record> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Member_withdraw_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Member_withdraw_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Member_withdraw_record getById(int id) {
		String hql="from Member_withdraw_record where member_id="+id;
		Session session=getSession();
		List<Member_withdraw_record> list=session.createQuery(hql).list();
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public void update(Member_withdraw_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Member_withdraw_record> listAll(Map map) {
		String hql="from Member_withdraw_record m where 0=0 ";
		Session session=getSession();
		hql=hqlData(hql, map);
		List<Member_withdraw_record> list=session.createQuery(hql).list();
		return list;
	}

	@Override
	public List<Member_withdraw_record> listAll(int id) {
		
		return null;
	}
	public String hqlData(String hql,Map map){
		String member_name=(String)map.get("member_name");
		String mobile_Phone=(String)map.get("mobile_Phone");
		String bank_card=(String)map.get("bank_card");
		String status=(String)map.get("status");
		String create_date=(String)map.get("create_date");
		if(member_name!=null&&!member_name.equals("")){
			hql+="and m.member.member_name like '%"+member_name+"%'";
		}
		if(mobile_Phone!=null&&!mobile_Phone.equals("")){
			hql+="and m.member.mobile_Phone like '%"+mobile_Phone+"%'";
		}
		if(bank_card!=null&&!bank_card.equals("")){
			hql+="and bank_card like '%"+bank_card+"%'";
		}
		if(status!=null&&!status.equals("")){
			hql+="and status like '%"+status+"%'";
		}
		if(create_date!=null&&!create_date.equals("")){
			hql+="and create_date like '%"+create_date+"%'";
		}
		return hql;
	}

}
