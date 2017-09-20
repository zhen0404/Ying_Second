package com.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Member_profit_record;
import com.dao.MemberAddDao;

@Component
public class MemberAddDaoImpl implements MemberAddDao {

	@Autowired
	private SessionFactory sf;
	
	public Session getSession(){
		return sf.getCurrentSession();
	}
	
	@Override
	public Member_profit_record getMemberProfitRecordByMid(int mid) {
		// TODO Auto-generated method stub
		String hql="from Member_profit_record where member_id="+mid+"";
		List<Member_profit_record> mprList=getSession().createQuery(hql).list();
		if(mprList.size()>0){
			return mprList.get(0);
		}
		return null;
	}

}
