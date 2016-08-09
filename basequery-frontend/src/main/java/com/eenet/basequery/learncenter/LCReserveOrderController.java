package com.eenet.basequery.learncenter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eenet.base.SimpleResultSet;
import com.eenet.base.query.QueryCondition;
import com.eenet.basequery.page.Pagination;

@Controller
public class LCReserveOrderController {
	
	@Autowired
	private LCReserveOrderService lcRrserveOrderService;
	
	@RequestMapping(value="/getLCReserveOrder")
	public String getLCReserveOrder(QueryCondition queryCondition,Pagination pagination ,Model model){
		queryCondition.setMaxQuantity(pagination.getPageSize());
		queryCondition.setStartIndex(pagination.getIndexCurrent());
		SimpleResultSet<LCReserveOrder>  result =  lcRrserveOrderService.getLCReserveOrder(queryCondition);
		model.addAttribute("resultMap", result);
		pagination.setTotal(result.getCount());
		model.addAttribute("pagination", pagination);
		return "learncenter/lcReserveOrderList";
	}
	
}
