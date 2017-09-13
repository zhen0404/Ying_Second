package com.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daoImpl.TestDao;

@Service
public class TestServiceImpl {

	@Autowired
	private TestDao td;
	
}
