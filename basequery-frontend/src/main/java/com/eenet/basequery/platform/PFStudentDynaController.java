package com.eenet.basequery.platform;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eenet.base.SimpleResultSet;
import com.eenet.base.query.QueryCondition;
import com.eenet.basequery.page.Pagination;

@Controller
public class PFStudentDynaController {
	
	@Autowired
	private PFStudentDynaService pfStudentDynaService;
	
	@RequestMapping(value="/getPFStudentDyna")
	public String getPFStudentDyna(QueryCondition queryCondition,Pagination pagination ,Model model){
		queryCondition.setMaxQuantity(pagination.getPageSize());
		queryCondition.setStartIndex(pagination.getIndexCurrent());
		SimpleResultSet<PFStudentDyna>  result =  pfStudentDynaService.getPFStudentDyna(queryCondition);
		model.addAttribute("resultMap", result);
		pagination.setTotal(result.getCount());
		model.addAttribute("pagination", pagination);
		return "platform/pfStudentDynaList";
	}
	
}
