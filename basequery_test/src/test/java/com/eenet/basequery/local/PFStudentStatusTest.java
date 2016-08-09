package com.eenet.basequery.local;

import org.junit.Test;

import com.eenet.base.query.QueryCondition;
import com.eenet.basequery.local.env.SpringEnv;
import com.eenet.basequery.platform.PFStudentStatusService;
import com.eenet.util.EEBeanUtils;

public class PFStudentStatusTest extends SpringEnv {

	@Test
	public void crud(){
		PFStudentStatusService service = (PFStudentStatusService)super.getContext().getBean("PFStudentStatusService");		
		QueryCondition queryCondition = new QueryCondition();
		queryCondition.setMaxQuantity(10);
		queryCondition.setStartIndex(0);
		String result = EEBeanUtils.object2Json(service.getPFStudentStatus(queryCondition));
		System.out.println("result----"+result);
	}
}
