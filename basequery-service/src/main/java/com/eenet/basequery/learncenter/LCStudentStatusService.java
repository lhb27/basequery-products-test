package com.eenet.basequery.learncenter;

import com.eenet.base.SimpleResultSet;
import com.eenet.base.query.QueryCondition;

public interface LCStudentStatusService {
	
	/**
	 * 获取学习中心的学员学籍情况
	 * @param condition
	 * @return
	 */
	public SimpleResultSet<LCStudentStatus> getLCStudentStatus(QueryCondition condition);

}
