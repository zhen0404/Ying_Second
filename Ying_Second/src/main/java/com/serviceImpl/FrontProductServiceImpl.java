package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bean.Member_account;
import com.bean.Member_bankcards;
import com.bean.Member_profit_record;
import com.bean.Member_tally;
import com.bean.Member_trade_record;
import com.bean.Subject;
import com.bean.Subject_purchase_record;
import com.dao.SubjectQianDao;
import com.service.FrontProductService;

@Service
public class FrontProductServiceImpl implements FrontProductService {

	@Autowired
	@Qualifier("subjectQianDaoImpl")
	private SubjectQianDao sq;
	
	public Subject getById(int sid) {
		// TODO Auto-generated method stub
		return this.sq.getById(sid);
	}

	public void saveOrUpdateProduct(Subject subject) {
		// TODO Auto-generated method stub
		this.sq.saveOrUpdateProduct(subject);
	}

	public Member_account ListAllByMemberId(int memberId) {
		// TODO Auto-generated method stub
		return this.sq.ListAllByMemberId(memberId);
	}

	public Member_bankcards ListCardByMemberId(int memberId) {
		// TODO Auto-generated method stub
		return this.sq.ListCardByMemberId(memberId);
	}

	public Subject getSubjectById(int parseInt) {
		// TODO Auto-generated method stub
		return this.sq.getSubjectById(parseInt);
	}

	public void updateSubject(Subject subject) {
		// TODO Auto-generated method stub
		this.sq.updateSubject(subject);
	}

	public void updateMemberAccount(Member_account memberAccount) {
		// TODO Auto-generated method stub
		this.sq.updateMemberAccount(memberAccount);
	}

	public void saveMemberProfitRecord(Member_profit_record memberProfitRecord) {
		// TODO Auto-generated method stub
		this.sq.saveMemberProfitRecord(memberProfitRecord);
	}

	public void saveMemberTradeRecord(Member_trade_record memberTradeRecord) {
		// TODO Auto-generated method stub
		this.sq.saveMemberTradeRecord(memberTradeRecord);
	}

	public void saveMember_tally(Member_tally member_tally) {
		// TODO Auto-generated method stub
		this.sq.saveMember_tally(member_tally);
	}

	public void saveSubjectPurchaseRecord(Subject_purchase_record subjectPurchaseRecord) {
		// TODO Auto-generated method stub
		this.sq.saveSubjectPurchaseRecord(subjectPurchaseRecord);
	}

	public int getCntBySubjectIdAndMemberId(int parseInt, int memberId) {
		// TODO Auto-generated method stub
		return this.sq.getCntBySubjectIdAndMemberId(parseInt, memberId);
	}

	public List<Subject_purchase_record> listSubjectPurchaseRecordAll(int parseInt, int memberId) {
		// TODO Auto-generated method stub
		return this.sq.listSubjectPurchaseRecordAll(parseInt, memberId);
	}

	public void updateSubjectPurchaseRecordAfterSave(Subject_purchase_record subjectPurchaseRecord2) {
		// TODO Auto-generated method stub
		this.sq.updateSubjectPurchaseRecordAfterSave(subjectPurchaseRecord2);
	}

}
