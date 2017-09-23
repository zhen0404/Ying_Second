package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Oversea_config;
import com.bean.Oversea_config_subscribe;
import com.bean.Subject;
import com.dao.OverseaDao;
import com.service.OverseaService;

@Service
@Transactional
public class OverseaServiceImpl implements OverseaService<Oversea_config>{
                
	   @Autowired
       @Qualifier("overseaDaoImpl")
       private OverseaDao<Oversea_config> overseaDaoImpl;
	   
	   public List<Oversea_config> listAll() {
		
		   return overseaDaoImpl.listAll();
	}

	public List<Oversea_config_subscribe> All(int id) {
	
		return overseaDaoImpl.All(id);
	}

	public void overAdd(Oversea_config oc) {
		 this.overseaDaoImpl.overAdd(oc);
	}

	public Oversea_config getById(int id) {
	 Oversea_config oc=this.overseaDaoImpl.getById(id);
		return oc;
	}

	public void updateOver(Oversea_config oc) {
		this.overseaDaoImpl.updateOver(oc);
		
	}

}
