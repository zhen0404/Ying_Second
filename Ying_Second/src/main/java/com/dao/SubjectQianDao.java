package com.dao;

import java.util.List;

import com.bean.Member_account;
import com.bean.Member_bankcards;
import com.bean.Member_profit_record;
import com.bean.Member_tally;
import com.bean.Member_trade_record;
import com.bean.Subject;
import com.bean.Subject_purchase_record;

public interface SubjectQianDao {

	Subject getById(int sid);

	void saveOrUpdateProduct(Subject subject);

	Member_account ListAllByMemberId(int memberId);

	Member_bankcards ListCardByMemberId(int memberId);

	Subject getSubjectById(int parseInt);

	void updateSubject(Subject subject);

	void updateMemberAccount(Object object);

	void saveMemberProfitRecord(Object object);

	void saveMemberTradeRecord(Object object);

	void saveMember_tally(Object object);

	void saveSubjectPurchaseRecord(Object object);

	int getCntBySubjectIdAndMemberId(int parseInt, int memberId);

	List<Subject_purchase_record> listSubjectPurchaseRecordAll(int parseInt, int memberId);

	void updateSubjectPurchaseRecordAfterSave(Object object);
	
}
