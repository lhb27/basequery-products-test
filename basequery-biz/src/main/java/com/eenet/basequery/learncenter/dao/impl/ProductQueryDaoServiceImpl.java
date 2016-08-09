package com.eenet.basequery.learncenter.dao.impl;

import com.eenet.base.SimpleResultSet;
import com.eenet.base.dao.BaseDAOImpl;
import com.eenet.base.query.ConditionItem;
import com.eenet.base.query.QueryCondition;
import com.eenet.basequery.learncenter.ProductQuery;
import com.eenet.basequery.learncenter.dao.ProductQueryDaoService;
import com.eenet.basequery.page.Pagination;
import com.eenet.common.exception.DBOPException;

public class ProductQueryDaoServiceImpl extends BaseDAOImpl implements ProductQueryDaoService {

	@Override
	public SimpleResultSet<ProductQuery> queryProductSales(ProductQuery product, Pagination pagination) {
		//把传递进来的SQL改造成可count(*) ,用于分页查询
		//把传递进来的SQL改造成追加分页参数的SQL，
		//返回分页结果，返回分页数据 
		QueryCondition condition = new QueryCondition();
		condition.setMaxQuantity(pagination.getPageSize());
		condition.setStartIndex((pagination.getPageCurrent()-1)*pagination.getPageSize());
		return null;
	}

	@Override
	public SimpleResultSet<ProductQuery> getById(String id) throws DBOPException {
		return this.getBatisSession().selectOne("com.eenet.basequery.learncenter.ProductQuery.getById", id);
	}


	@Override
	public SimpleResultSet<ProductQuery> queryProductSales(QueryCondition queryCondition) throws DBOPException {
		return super.query(queryCondition, ProductQuery.class);
	}
	
	

}
