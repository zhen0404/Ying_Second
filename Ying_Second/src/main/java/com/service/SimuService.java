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
		Finance_product_funds getById(int id);//˽ļ��Ʒ
		List<Finance_product_subscribe> showmoneyding(int id);//��ʾǩ��״̬
		Finance_product_subscribe getByIding(int id);//ǩ��Ͳ�Ʒ�������
		void updateq(Finance_product_subscribe fps);
		//����ǩ���ͬ
		void savehe(Finance_product_subscribe fina);
	
	      
}
