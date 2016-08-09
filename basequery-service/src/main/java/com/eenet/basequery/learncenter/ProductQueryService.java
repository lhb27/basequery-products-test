package com.eenet.basequery.learncenter;

import com.eenet.base.SimpleResultSet;
import com.eenet.base.query.QueryCondition;
import com.eenet.basequery.page.Pagination;

/**
 * 
 * @author lhb
 *
 */
public interface ProductQueryService {

	/**
	 * 根据页面获取参数获取产品销售详情
	 * @param productQuyer
	 * @param pagination
	 * @return
	 */
	public  SimpleResultSet<ProductQuery> getCenterProductsQuery(ProductQuery productQuyer,Pagination pagination);
	
	public SimpleResultSet<ProductQuery> getCenterProductsQuery(String id) ;
	
	/**
	 * 查询产品信息
	 * @param condition
	 * @return
	 */	
	public SimpleResultSet<ProductQuery> getCenterProductsQuery (QueryCondition condition);
}
