package com.eenet.basequery.local;

import org.junit.Test;

import com.eenet.base.query.ConditionItem;
import com.eenet.base.query.QueryCondition;
import com.eenet.base.query.RangeType;
import com.eenet.basequery.local.env.SpringEnv;
import com.eenet.basequery.resource.RECourseService;
import com.eenet.util.EEBeanUtils;

public class RECourseTest extends SpringEnv {

	@Test
	public void crud(){
		RECourseService service = (RECourseService)super.getContext().getBean("RECourseService");		
		QueryCondition queryCondition = new QueryCondition();
		queryCondition.setMaxQuantity(10);
		queryCondition.setStartIndex(0);
		String result = EEBeanUtils.object2Json(service.getRECourse(queryCondition));
		System.out.println("result----"+result);
		
//		queryCondition.addCondition(new ConditionItem("courseName", RangeType.INCLUDE, "汽车传动系",""));
//		result = EEBeanUtils.object2Json(service.getRECourse(queryCondition));
		
		queryCondition.addCondition(new ConditionItem("publishDt", RangeType.LESS2GREAT, "2016-1-1","2016-7-1"));
		result = EEBeanUtils.object2Json(service.getRECourse(queryCondition));
		System.out.println("result----"+result);
	}
}
