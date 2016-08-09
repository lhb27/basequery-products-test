package com.eenet.basequery.platform;

import com.eenet.base.SimpleResultSet;
import com.eenet.base.query.QueryCondition;

public interface PFStudentStatusService {

	/**
	 * 获取平台中心的学员学籍情况
	 * @param condition
	 * @return
	 */
	public SimpleResultSet<PFStudentStatus> getPFStudentStatus(QueryCondition condition);
}
