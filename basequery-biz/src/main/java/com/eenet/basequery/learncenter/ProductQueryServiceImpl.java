package com.eenet.basequery.learncenter;

import java.util.ArrayList;

import com.eenet.base.SimpleResultSet;
import com.eenet.base.query.OrderBy;
import com.eenet.base.query.QueryCondition;
import com.eenet.base.query.Rank;
import com.eenet.basequery.learncenter.dao.ProductQueryDaoService;
import com.eenet.basequery.page.Pagination;
import com.eenet.common.exception.DBOPException;

public class ProductQueryServiceImpl implements ProductQueryService {
	
	private ProductQueryDaoService productQueryDaoService;

	@Override
	public SimpleResultSet<ProductQuery> getCenterProductsQuery(ProductQuery productQuyer, Pagination pagination) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SimpleResultSet<ProductQuery> getCenterProductsQuery(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SimpleResultSet<ProductQuery> getCenterProductsQuery(QueryCondition condition) {
		SimpleResultSet<ProductQuery> result = new SimpleResultSet<ProductQuery>();
		try {
			if(condition.getOrderBySet()== null ||condition.getOrderBySet().isEmpty()){
				ArrayList<OrderBy> orderList = new ArrayList<OrderBy>();
				OrderBy order = new OrderBy();
				order.setAttName("createdDt");
				order.setRank(Rank.DESC);
				orderList.add(order);
				condition.setOrderBySet(orderList);
			}
			result = productQueryDaoService.queryProductSales(condition);
			return result;
		} catch (DBOPException e) {
			result.setSuccessful(false);
			result.addMessage(e.toString());
			return result;
		}
	}

	public ProductQueryDaoService getProductQueryDaoService() {
		return productQueryDaoService;
	}

	public void setProductQueryDaoService(ProductQueryDaoService productQueryDaoService) {
		this.productQueryDaoService = productQueryDaoService;
	}



	
	

}
