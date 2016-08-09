package com.eenet.basequery.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.eenet.basequery.authen.Constant;

public class LoginInterceptor extends  HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//获取session，验证用户信息是否存在，不存在跳转到登录页面，存在继续往下走
		if(null==request.getSession().getAttribute(Constant.adminUserLoginInfoSession)){
			response.sendRedirect(request.getContextPath()+"/");
			return false;
		}
		return true;
	}

}
