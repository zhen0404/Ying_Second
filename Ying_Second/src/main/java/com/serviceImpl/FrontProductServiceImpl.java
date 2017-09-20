package com.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bean.Member_account;
import com.bean.Member_bankcards;
import com.bean.Member_profit_record;
import com.bean.Member_tally;
import com.bean.Member_trade_record;
import com.bean.Subject;
import com.bean.Subject_purchase_record;
import com.service.FrontProductService;

@Service
public class FrontProductServiceImpl implements FrontProductService {

	public Subject getById(int sid) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveOrUpdateProduct(Subject subject) {
		// TODO Auto-generated method stub
		
	}

	public Member_account ListAllByMemberId(int memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Member_bankcards ListCardByMemberId(int memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Subject getSubjectById(int parseInt) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateSubject(Subject subject) {
		// TODO Auto-generated method stub
		
	}

	public void updateMemberAccount(Member_account memberAccount) {
		// TODO Auto-generated method stub
		
	}

	public void saveMemberProfitRecord(Member_profit_record memberProfitRecord) {
		// TODO Auto-generated method stub
		
	}

	public void saveMemberTradeRecord(Member_trade_record memberTradeRecord) {
		// TODO Auto-generated method stub
		
	}

	public void saveMember_tally(Member_tally member_tally) {
		// TODO Auto-generated method stub
		
	}

	public void saveSubjectPurchaseRecord(Subject_purchase_record subjectPurchaseRecord) {
		// TODO Auto-generated method stub
		
	}

	public int getCntBySubjectIdAndMemberId(int parseInt, int memberId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Subject_purchase_record> listSubjectPurchaseRecordAll(int parseInt, int memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateSubjectPurchaseRecordAfterSave(Subject_purchase_record subjectPurchaseRecord2) {
		// TODO Auto-generated method stub
		
	}

}
