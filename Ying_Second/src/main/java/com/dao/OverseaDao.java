package com.dao;

import java.util.List;

import com.bean.Oversea_config_subscribe;
import com.bean.Subject;



public interface OverseaDao<Oversea_config> {

	List<Oversea_config> listAll();
	
	List<Oversea_config_subscribe> All(int id);
	
	 void overAdd(Oversea_config oc);
	 
	 Oversea_config getById(int id);
	 
	 void updateOver(Oversea_config oc);
}
