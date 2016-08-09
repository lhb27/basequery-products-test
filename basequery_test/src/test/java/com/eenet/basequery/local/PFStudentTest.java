package com.eenet.basequery.local;

import org.junit.Test;

import com.eenet.base.query.QueryCondition;
import com.eenet.basequery.local.env.SpringEnv;
import com.eenet.basequery.platform.PFStudentService;
import com.eenet.util.EEBeanUtils;

public class PFStudentTest extends SpringEnv {

	@Test
	public void crud(){
		PFStudentService service = (PFStudentService)super.getContext().getBean("PFStudentService");		
		QueryCondition queryCondition = new QueryCondition();
		queryCondition.setMaxQuantity(10);
		queryCondition.setStartIndex(0);
		String result = EEBeanUtils.object2Json(service.getPFStudent(queryCondition));
		System.out.println("result----"+result);
	}
}
