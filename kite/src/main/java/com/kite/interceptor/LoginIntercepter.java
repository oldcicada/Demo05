package com.kite.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginIntercepter implements HandlerInterceptor{

	private static Logger logger=Logger.getLogger(LoginIntercepter.class);
	
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object object, Exception exception)
			throws Exception {
		//统一异常处理，打印日志
		if(exception != null){
			logger.error(object, exception);
		}
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView modelAndView) throws Exception {
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object object) throws Exception {
		//获取请求资源uri地址
		String uri=request.getRequestURI();
		if(uri.contains("/user")){
			if(request.getSession().getAttribute("user") == null){
				response.sendRedirect(request.getContextPath()+"/login");
				return false;
			}
		}
		return true;
	}
}
