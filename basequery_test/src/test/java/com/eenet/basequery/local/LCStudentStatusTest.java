package com.eenet.basequery.local;

import org.junit.Test;

import com.eenet.base.query.QueryCondition;
import com.eenet.basequery.learncenter.LCStudentStatusService;
import com.eenet.basequery.local.env.SpringEnv;
import com.eenet.util.EEBeanUtils;

public class LCStudentStatusTest extends SpringEnv {

	@Test
	public void crud(){
		LCStudentStatusService service = (LCStudentStatusService)super.getContext().getBean("LCStudentStatusService");		
		QueryCondition queryCondition = new QueryCondition();
		queryCondition.setMaxQuantity(10);
		queryCondition.setStartIndex(0);
		String result = EEBeanUtils.object2Json(service.getLCStudentStatus(queryCondition));
		System.out.println("result----"+result);
	}
}
