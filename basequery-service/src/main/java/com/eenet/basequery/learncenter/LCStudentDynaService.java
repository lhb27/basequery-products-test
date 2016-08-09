package com.eenet.basequery.learncenter;

import com.eenet.base.SimpleResultSet;
import com.eenet.base.query.QueryCondition;

public interface LCStudentDynaService {
	
	/**
	 * 获取学习中心的学员学习情况
	 * @param condition
	 * @return
	 */
	public SimpleResultSet<LCStudentDyna> getLCStudentDyna(QueryCondition condition);

}
