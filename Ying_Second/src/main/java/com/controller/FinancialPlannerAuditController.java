package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Financial_planner;
import com.service.BaseService;

@Controller
@RequestMapping("/fina")
public class FinancialPlannerAuditController {

	@Autowired
	@Qualifier("financialPlannerAuditService")
	private BaseService<Financial_planner> baseService;
	
	
}
