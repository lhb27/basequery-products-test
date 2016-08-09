package com.eenet.basequery.local;

import org.junit.Test;

import com.eenet.base.query.QueryCondition;
import com.eenet.basequery.local.env.SpringEnv;
import com.eenet.basequery.platform.PFStudentDynaService;
import com.eenet.util.EEBeanUtils;

public class PFStudentDynaTest extends SpringEnv {

	@Test
	public void crud(){
		PFStudentDynaService service = (PFStudentDynaService)super.getContext().getBean("PFStudentDynaService");		
		QueryCondition queryCondition = new QueryCondition();
		queryCondition.setMaxQuantity(10);
		queryCondition.setStartIndex(0);
		String result = EEBeanUtils.object2Json(service.getPFStudentDyna(queryCondition));
		System.out.println("result----"+result);
	}
}
