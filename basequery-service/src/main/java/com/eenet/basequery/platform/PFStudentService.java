package com.eenet.basequery.platform;

import com.eenet.base.SimpleResultSet;
import com.eenet.base.query.QueryCondition;

public interface PFStudentService {

	/**
	 * 获取平台中心的学员情况
	 * @param condition
	 * @return
	 */
	public SimpleResultSet<PFStudent> getPFStudent(QueryCondition condition);
}
