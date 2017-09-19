package com.service;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;

import com.bean.Finance_product_funds;
import com.bean.Finance_product_subscribe;
import com.bean.Subject;

public interface SimuService {
		List<Finance_product_funds> showmoney();
		 List<Finance_product_funds > query(String hql); 
		void addmoney(Finance_product_funds finance);
		Session getSession();
		void update(Finance_product_funds finance);
		Finance_product_funds getById(int id);//私募产品
		List<Finance_product_subscribe> showmoneyding(int id);//显示签署状态
		Finance_product_subscribe getByIding(int id);//签署和产品外键关联
		void updateq(Finance_product_subscribe fps);
		//保存签署合同
		void savehe(Finance_product_subscribe fina);
	
	      
}
