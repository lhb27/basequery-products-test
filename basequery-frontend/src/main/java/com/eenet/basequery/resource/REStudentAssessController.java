package com.eenet.basequery.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eenet.base.SimpleResultSet;
import com.eenet.base.query.QueryCondition;
import com.eenet.basequery.page.Pagination;

@Controller
public class REStudentAssessController {
	@Autowired
	private REStudentAssessService reStudentAssessService;
	
	@RequestMapping(value="/getREStudentAssess")
	public String getREStudentAssess(QueryCondition queryCondition,Pagination pagination ,Model model){
		queryCondition.setMaxQuantity(pagination.getPageSize());
		queryCondition.setStartIndex(pagination.getIndexCurrent());
		SimpleResultSet<REStudentAssess>  result =  reStudentAssessService.getREStudentAssess(queryCondition);
		model.addAttribute("resultMap", result);
		pagination.setTotal(result.getCount());
		model.addAttribute("pagination", pagination);
		return "resource/reStudentAssessList";
	}
	
}
