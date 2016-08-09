package com.eenet.basequery.page;

import java.io.Serializable;

public class Pagination implements Serializable{

	private static final long serialVersionUID = -6687183856258414153L;
	private int pageSize = 10;//页面显示个数，默认10条
	private int pageCurrent = 1;//当前页面，默认第一页
	private int total;//记录总数
	private int indexCurrent;//当前记录行数
	private boolean hasPreviousPage;//是否有前一页
	private boolean hasNextPage;//是否有后一页
	
	public boolean isHasPreviousPage() {
		return pageCurrent-1<=0?false:true;
	}
	public void setHasPreviousPage(boolean hasPreviousPage) {
		this.hasPreviousPage = hasPreviousPage;
	}
	public boolean isHasNextPage() {
		return pageCurrent+1<=getPages()?true:false;
	}
	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	public int getIndexCurrent() {
		return (pageCurrent-1)*pageSize;
	}
	public void setIndexCurrent(int indexCurrent) {
		this.indexCurrent = indexCurrent;
	}
	private int pages;//总页数
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageCurrent() {
		return pageCurrent;
	}
	public void setPageCurrent(int pageCurrent) {
		this.pageCurrent = pageCurrent;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPages() {
		if(this.total % this.pageSize ==0){
			return (this.total / this.pageSize);
		}
		return (this.total / this.pageSize+1);
	}

}
