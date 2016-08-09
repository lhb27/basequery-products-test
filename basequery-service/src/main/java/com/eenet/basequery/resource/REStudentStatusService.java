package com.eenet.basequery.resource;

import com.eenet.base.SimpleResultSet;
import com.eenet.base.query.QueryCondition;

public interface REStudentStatusService {
	
	/**
	 * 获取资源中心的学员报读情况
	 * @param condition
	 * @return
	 */
	public SimpleResultSet<REStudentStatus> getREStudentStatus(QueryCondition condition);

}
