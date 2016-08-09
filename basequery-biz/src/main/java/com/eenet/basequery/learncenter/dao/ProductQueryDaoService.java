package com.eenet.basequery.learncenter.dao;

import com.eenet.base.SimpleResultSet;
import com.eenet.base.dao.BaseDAOService;
import com.eenet.base.query.QueryCondition;
import com.eenet.basequery.learncenter.ProductQuery;
import com.eenet.basequery.page.Pagination;
import com.eenet.common.exception.DBOPException;

public interface ProductQueryDaoService extends BaseDAOService {
	/**
	 * 查询产品销售情况
	 * @param product
	 * @param pagination
	 * @return
	 */
	public SimpleResultSet<ProductQuery> queryProductSales(ProductQuery product,Pagination pagination);
	
	/**
	 * 查询产品销售情况
	 * @param product
	 * @param pagination
	 * @return
	 */
	public SimpleResultSet<ProductQuery> queryProductSales(QueryCondition queryCondition) throws DBOPException;
	
	public SimpleResultSet<ProductQuery> getById(String id) throws DBOPException;
}
