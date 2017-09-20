package com.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Member_account;
import com.dao.BuyDao;

@Component
public class BuyDaoImpl implements BuyDao {

	@Autowired
	private SessionFactory sf;
	
	public Session getSession(){
		return sf.getCurrentSession();
	}
	
	//根据memberId获取用户余额
	public Member_account getByMemberId(int mid) {
		// TODO Auto-generated method stub
		String hql="from Member_account where member_id = "+mid+"";
		List<Member_account> malist=getSession().createQuery(hql).list();
		if(malist.size()>0){
			return malist.get(0);
		}
		return null;
	}
	
	//

}
