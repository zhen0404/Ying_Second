package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.bean.Bbin_info;
import com.bean.Finance_product_subscribe;
import com.bean.Member_deposit_record;
import com.bean.Member_withdraw_record;
import com.bean.Subject_purchase_record;
import com.dao.TouziDao;
import com.service.TouziService;

@Component
public class TouziServiceImpl implements TouziService{
	
		@Autowired
	    @Qualifier("touziDaoImpl")
      private TouziDao touziDaoImpl;

	@Override
	public List<Subject_purchase_record> listAll(int id) {
		return this.touziDaoImpl.listAll(id);
	}

	@Override
	public List<Finance_product_subscribe> listAllyu(int id) {
		return this.touziDaoImpl.listAllyu(id);
	}

	@Override
	public List<Member_deposit_record> listAllchong(int id) {
		return this.touziDaoImpl.listAllchong(id);
	}

	@Override
	public List<Member_withdraw_record> listAllti(int id) {
		return this.touziDaoImpl.listAllti(id);
	}

	@Override
	public List<Bbin_info> listAlltiyanj(int id) {
		return this.touziDaoImpl.listAlltiyanj(id);
	}

}
