package com.serviceImpl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.bean.Finance_product_funds;
import com.bean.Finance_product_subscribe;
import com.dao.SimuDao;
import com.service.SimuService;

@Service
@Transactional
public class SimuServiceImpl implements SimuService{
	
	  @Autowired
       @Qualifier("simuDaoImpl")
       private SimuDao simuDaoImpl;

	public List<Finance_product_funds> showmoney() {
		return simuDaoImpl.showmoney();
	}


	public void addmoney(Finance_product_funds finance) {
		this.simuDaoImpl.addmoney(finance);
	}

	public Session getSession() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Finance_product_funds finance) {
		this.simuDaoImpl.update(finance);
		
	}

	public Finance_product_funds getById(int id) {
	Finance_product_funds fpr=this.simuDaoImpl.getById(id);
		return fpr;
	}

	public List<Finance_product_subscribe> showmoneyding(int id) {
		return this.simuDaoImpl.showmoneyding(id);
	}

	public Finance_product_subscribe getByIding(int id) {
		return this.simuDaoImpl.getByIding(id);
	}

	public void savehe(Finance_product_subscribe fina) {
		this.simuDaoImpl.savehe(fina);
		
	}


	public List<Finance_product_funds> query(String hql) {
		  return this.simuDaoImpl.query(hql);
	}


	public void updateq(Finance_product_subscribe fps) {
		this.simuDaoImpl.updateq(fps);
		
	}

}
