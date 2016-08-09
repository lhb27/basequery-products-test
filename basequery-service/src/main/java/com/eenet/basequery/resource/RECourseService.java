package com.eenet.basequery.resource;

import com.eenet.base.SimpleResultSet;
import com.eenet.base.query.QueryCondition;

public interface RECourseService {

	/**
	 * 获取资源中心的课程制作、上线等状态情况
	 * @param condition
	 * @return
	 */
	public SimpleResultSet<RECourse> getRECourse(QueryCondition condition);
	
}
