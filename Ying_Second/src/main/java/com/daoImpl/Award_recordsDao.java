package com.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Arcords;
import com.bean.Award_records;
import com.dao.BaseDao;

/**
 * 邀请奖励显示表
 * @author Maibenben
 *
 */
@Component
public class Award_recordsDao implements BaseDao<Award_records>{
	
	@Autowired
	private SessionFactory sf;
	
	public Session getSession(){
		return sf.getCurrentSession();
	}

	@Override
	public List<Award_records> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Award_records t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Award_records t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Award_records getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Award_records t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Award_records> listAll(Map map) {
		String sql="select * from (select mobile_Phone,member_name,"
				+ "invitationCode,invitedCode,sum(amount) amount,case when"
				+ " max(enroll)=1 then '已注册奖励'else '未注册奖励' end enroll,"
				+ " case when max(invest)=1 then '已投资奖励'else '未投资奖励' "
				+ "end invest,max(create_date) create_date from"
				+ "(select m.mobile_Phone,m.member_name,m.invitationCode,"
				+ "m.invitedCode,a.amount,case when a.type=0 and a.isAward=1 "
				+ "then '1'else '0' end enroll,case when a.type=1  "
				+ "and a.isAward=1 then '1'else '0' end invest,m.create_date "
				+ "from award_records a,member m where a.invitingid=m.id )t "
				+ "group by t.mobile_Phone,t.member_name,"
				+ "t.invitationCode,t.invitedCode)tt where 0=0 ";
		Session session=getSession();
		sql=hqlData(map, sql);
		List list=session.createSQLQuery(sql).list();
		List list2=new ArrayList<>();
		for(int i=0;i<list.size();i++){
			Object[] obj=(Object[])list.get(i);
			Arcords arcords=new Arcords();
			arcords.setMobile_Phone(obj[0].toString());
			arcords.setMember_name(obj[1].toString());
			arcords.setInvitationCode(obj[2].toString());
			arcords.setInvitedCode(obj[3].toString());
			arcords.setAmount(obj[4].toString());
			arcords.setEnroll(obj[5].toString());
			arcords.setInvest(obj[6].toString());
			arcords.setCreate_date(obj[7].toString());
			list2.add(arcords);
		}
		return list2;
	}
	public String hqlData(Map map,String sql){
		String member_name=(String)map.get("member_name");
		String mobile_Phone=(String)map.get("mobile_Phone");
		String invitationCode=(String)map.get("invitationCode");
		String invitedCode=(String)map.get("invitedCode");
		String enroll=(String)map.get("enroll");
		String invest=(String)map.get("invest");
		if(member_name!=null&&!member_name.equals("")){
			sql+=" and tt.member_name like '%"+member_name+"%'";
		}
		if(mobile_Phone!=null&&!mobile_Phone.equals("")){
			sql+=" and tt.mobile_Phone like '%"+mobile_Phone+"%'";
		}
		if(invitationCode!=null&&!invitationCode.equals("")){
			sql+=" and tt.invitationCode like '%"+invitationCode+"%'";
		}
		if(invitedCode!=null&&!invitedCode.equals("")){
			sql+=" and tt.invitedCode like '%"+invitedCode+"%'";
		}
		if(enroll!=null&&!enroll.equals("")){
			sql+=" and tt.enroll like '%"+enroll+"%'";
		}
		if(invest!=null&&!invest.equals("")){
			sql+=" and tt.invest like '%"+invest+"%'";
		}
		return sql;
	}

	@Override
	public List<Award_records> listAll(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
