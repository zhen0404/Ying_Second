package com.service;

import java.util.List;

import com.bean.Bbin_info;
import com.bean.Finance_product_subscribe;
import com.bean.Member_deposit_record;
import com.bean.Member_withdraw_record;
import com.bean.Subject_purchase_record;

public interface TouziService {
	List<Subject_purchase_record> listAll(int id);
	List<Finance_product_subscribe> listAllyu(int id);
	List<Member_deposit_record> listAllchong(int id);
	List<Member_withdraw_record> listAllti(int id);
	 List<Bbin_info> listAlltiyanj(int id);

}
