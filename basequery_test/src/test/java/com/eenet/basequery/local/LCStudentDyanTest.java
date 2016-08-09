package com.eenet.basequery.local;

import org.junit.Test;

import com.eenet.base.query.QueryCondition;
import com.eenet.basequery.learncenter.LCStudentDynaService;
import com.eenet.basequery.local.env.SpringEnv;
import com.eenet.util.EEBeanUtils;

public class LCStudentDyanTest extends SpringEnv {

	@Test
	public void crud(){
		LCStudentDynaService service = (LCStudentDynaService)super.getContext().getBean("LCStudentDynaService");		
		QueryCondition queryCondition = new QueryCondition();
		queryCondition.setMaxQuantity(10);
		queryCondition.setStartIndex(0);
		String result = EEBeanUtils.object2Json(service.getLCStudentDyna(queryCondition));
		System.out.println("result----"+result);
	}
}
