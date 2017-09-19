package com.service;

import java.util.List;

import com.bean.Oversea_config_subscribe;

public interface OverseaService<Oversea_config> {
	
	        List<Oversea_config> listAll();
	        List<Oversea_config_subscribe> All();
	        void overAdd(Oversea_config oc);
	        Oversea_config getById(int id);
	        void updateOver(Oversea_config oc);
}
