package com.eenet.basequery.platform;

import com.eenet.base.SimpleResultSet;
import com.eenet.base.query.QueryCondition;

public interface PFStudentDynaService {
	
	/**
	 * 获取平台中心的学员学习情况
	 * @param condition
	 * @return
	 */
	public SimpleResultSet<PFStudentDyna> getPFStudentDyna(QueryCondition condition);

}
