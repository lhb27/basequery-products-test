package com.eenet.basequery.resource;

import com.eenet.base.SimpleResultSet;
import com.eenet.base.query.QueryCondition;

public interface REStudentAssessService {

	/**
	 * 获取资源中心的课程考核情况
	 * @param condition
	 * @return
	 */
	public SimpleResultSet<REStudentAssess> getREStudentAssess(QueryCondition condition);
}
