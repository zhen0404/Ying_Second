package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bean.Member_account;
import com.bean.Member_bankcards;
import com.bean.Member_profit_record;
import com.bean.Member_tally;
import com.bean.Member_trade_record;
import com.bean.Subject;
import com.bean.Subject_purchase_record;

public interface FrontProductService {

	Subject getById(int sid);

	void saveOrUpdateProduct(Subject subject);

	Member_account ListAllByMemberId(int memberId);

	Member_bankcards ListCardByMemberId(int memberId);

	Subject getSubjectById(int parseInt);

	void updateSubject(Subject subject);

	void updateMemberAccount(Member_account memberAccount);

	void saveMemberProfitRecord(Member_profit_record memberProfitRecord);

	void saveMemberTradeRecord(Member_trade_record memberTradeRecord);

	void saveMember_tally(Member_tally member_tally);

	void saveSubjectPurchaseRecord(Subject_purchase_record subjectPurchaseRecord);

	int getCntBySubjectIdAndMemberId(int parseInt, int memberId);

	List<Subject_purchase_record> listSubjectPurchaseRecordAll(int parseInt, int memberId);

	void updateSubjectPurchaseRecordAfterSave(Subject_purchase_record subjectPurchaseRecord2);
	
	
	
}
