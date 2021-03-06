package com.dao;

import java.util.List;

import com.bean.Member;
import com.bean.Member_bankcards;
import com.bean.Member_deposit_record;
import com.bean.Sys_region;

public interface MemberCenterDao {

	List getarAmount(int memberId);
	
	List getmprAmount(int memberId);
	
	List getmaAmount(int memberId);
	
	List<Sys_region> getSheng();
	
	List<Sys_region> getShi(int pid);
	
	List<Sys_region> getxiang(int sid);
	
	List<Member> idcheck(String idcard);

	List<Member_bankcards> bankCarkCheck(String bankCark);
	
	void boundCard(Member_bankcards mb);
	
	Sys_region getRegion(int id);
	
	List<Member_bankcards> bankCark(int memberID);
	
	void updateps(Member member);
	
	void saveMoneyRecord(Member_deposit_record mdr);

	List<Member> tikuanPscheck(String name,String ps);
	
}
