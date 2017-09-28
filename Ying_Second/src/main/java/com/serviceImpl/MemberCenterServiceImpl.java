package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bean.Member;
import com.bean.Member_bankcards;
import com.bean.Member_deposit_record;
import com.bean.Sys_region;
import com.dao.MemberCenterDao;
import com.service.MemberCenterService;

@Service
public class MemberCenterServiceImpl implements MemberCenterService  {

	@Autowired
	@Qualifier("memberCenterDaoImpl")
	private MemberCenterDao mcd;
	
	@Override
	public List getarAmount(int memberId) {
		// TODO Auto-generated method stub
		List list=this.mcd.getarAmount(memberId);
		list.add(0);
		return list;
	}

	@Override
	public List getmprAmount(int memberId) {
		// TODO Auto-generated method stub
		List list=this.mcd.getmprAmount(memberId);
		list.add(0);
		return list;
	}

	@Override
	public List getmaAmount(int memberId) {
		// TODO Auto-generated method stub
		List list=this.mcd.getmaAmount(memberId);
		list.add(0);
		return list;
	}

	@Override
	public List<Sys_region> getSheng() {
		// TODO Auto-generated method stub
		return this.mcd.getSheng();
	}

	@Override
	public List<Sys_region> getShi(int pid) {
		// TODO Auto-generated method stub
		return this.mcd.getShi(pid);
	}

	@Override
	public List<Sys_region> getxiang(int sid) {
		// TODO Auto-generated method stub
		return this.mcd.getxiang(sid);
	}

	@Override
	public List<Member> idcheck(String idcard) {
		// TODO Auto-generated method stub
		return this.mcd.idcheck(idcard);
	}

	@Override
	public List<Member_bankcards> bankCarkcheck(String bankCark) {
		// TODO Auto-generated method stub
		return this.mcd.bankCarkCheck(bankCark);
	}

	@Override
	public void boundCard(Member_bankcards mb) {
		// TODO Auto-generated method stub
		this.mcd.boundCard(mb);
	}

	@Override
	public Sys_region getRegion(int id) {
		// TODO Auto-generated method stub
		return this.mcd.getRegion(id);
	}

	@Override
	public List<Member_bankcards> bankCark(int memberID) {
		// TODO Auto-generated method stub
		List list=this.mcd.bankCark(memberID);
		list.add(0);
		return list;
	}

	@Override
	public void updateps(Member member) {
		// TODO Auto-generated method stub
		this.mcd.updateps(member);
	}

	@Override
	public void saveMoneyRecord(Member_deposit_record mdr) {
		// TODO Auto-generated method stub
		this.mcd.saveMoneyRecord(mdr);
	}

	@Override
	public List tikuanPscheck(String name,String ps) {
		// TODO Auto-generated method stub
		List mList=this.mcd.tikuanPscheck(name,ps);
		mList.add(0);
		return mList;
	}

}
