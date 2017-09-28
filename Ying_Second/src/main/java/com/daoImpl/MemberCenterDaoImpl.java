package com.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Award_records;
import com.bean.Member;
import com.bean.Member_account;
import com.bean.Member_bankcards;
import com.bean.Member_deposit_record;
import com.bean.Member_profit_record;
import com.bean.Sys_region;
import com.dao.MemberCenterDao;

@Component
public class MemberCenterDaoImpl implements MemberCenterDao {

	@Autowired
	private SessionFactory sf;
	
	public Session getSession(){
		return sf.getCurrentSession();
	}
	
	//奖励记录的金额
	@Override
	public List getarAmount(int memberId) {
		// TODO Auto-generated method stub
		String sql="select sum(amount) from award_records where invitingid = (select invitationCode from member where id='"+memberId+"')";
		List jList=getSession().createSQLQuery(sql).list();
		return jList;
	}

	//成员利润记录表金额
	@Override
	public List getmprAmount(int memberId) {
		// TODO Auto-generated method stub
		String sql="select sum(amount) from member_profit_record where member_id='"+memberId+"'";
		List jList=getSession().createSQLQuery(sql).list();
		return jList;
	}

	//成员账户表 红包金额
	@Override
	public List getmaAmount(int memberId) {
		// TODO Auto-generated method stub
		String sql="select bonus_amount from member_account where member_id='"+memberId+"'";
		List jList=getSession().createSQLQuery(sql).list();
		return jList;
	}

	@Override
	public List<Sys_region> getSheng() {
		// TODO Auto-generated method stub
		String sql="from Sys_region where region_level=1";
		return getSession().createQuery(sql).list();
	}

	@Override
	public List<Sys_region> getShi(int pid) {
		// TODO Auto-generated method stub
		String sql="from Sys_region where region_level=2 and parent_id = "+pid+"";
		return getSession().createQuery(sql).list();
	}

	@Override
	public List<Sys_region> getxiang(int sid) {
		// TODO Auto-generated method stub
		String sql="from Sys_region where region_level=3 and parent_id = "+sid+"";
		return getSession().createQuery(sql).list();
	}

	@Override
	public List<Member> idcheck(String idcard) {
		// TODO Auto-generated method stub
		String sql="from Member where identity = '"+idcard+"' ";
		return getSession().createQuery(sql).list();
	}

	@Override
	public List<Member_bankcards> bankCarkCheck(String bankCark) {
		// TODO Auto-generated method stub
		String sql="from Member_bankcards where card_no = '"+bankCark+"' ";
		return getSession().createQuery(sql).list();
	}

	@Override
	public void boundCard(Member_bankcards mb) {
		// TODO Auto-generated method stub
		getSession().save(mb);
	}

	@Override
	public Sys_region getRegion(int id) {
		// TODO Auto-generated method stub
		String hql="from Sys_region where id="+id+"";
		return null;
	}

	@Override
	public List<Member_bankcards> bankCark(int memberID) {
		// TODO Auto-generated method stub
		String sql="from Member_bankcards where member_id = '"+memberID+"' ";
		return getSession().createQuery(sql).list();
	}

	@Override
	public void updateps(Member member) {
		// TODO Auto-generated method stub
		getSession().update(member);
	}

	@Override
	public void saveMoneyRecord(Member_deposit_record mdr) {
		// TODO Auto-generated method stub
		getSession().save(mdr);
	}

	@Override
	public List<Member> tikuanPscheck(String name,String ps) {
		// TODO Auto-generated method stub
		String sql="from Member where member_name='"+name+"' withdraw_password = '"+ps+"' ";
		return getSession().createQuery(sql).list();
	}

	
	
}
