package com.eenet.basequery.local;

import org.junit.Test;

import com.eenet.base.query.QueryCondition;
import com.eenet.basequery.learncenter.ProductQueryService;
import com.eenet.basequery.local.env.SpringEnv;
import com.eenet.util.EEBeanUtils;

public class ProductQueryTest extends SpringEnv {

	@Test
	public void crud(){
		ProductQueryService service2 = (ProductQueryService)super.getContext().getBean("productQueryService");		
		QueryCondition queryCondition = new QueryCondition();
		queryCondition.setMaxQuantity(10);
		queryCondition.setStartIndex(0);
		String result = EEBeanUtils.object2Json(service2.getCenterProductsQuery(queryCondition));
		System.out.println("result----"+result);
	}
}
