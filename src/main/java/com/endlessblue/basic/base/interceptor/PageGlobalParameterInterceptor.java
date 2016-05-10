package com.endlessblue.basic.base.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.view.RedirectView;

/**
 * 将页面所需全局参数注入拦截器
 * 
 * 	用于将全局参数，如 contextPath、basePath 注入到当前的 request 上下文中，以用于后续的 jsp 页面渲染过程
 * 
 */
public class PageGlobalParameterInterceptor extends HandlerInterceptorAdapter {

	@Override
	public void postHandle(final HttpServletRequest request, final HttpServletResponse response,
			final Object arg2, final ModelAndView mav) throws Exception {
		// 当在 Controller 中直接返回数据，不需要 jsp 等页面渲染的时候，mav 为空，不处理
		if (mav == null)
			return;
		
		if (isRedirectView(mav))
			return;
		
		final String contextPath = request.getContextPath() + "/";
		mav.addObject("contextPath", contextPath);
		
		final String basePath = request.getScheme() + "://"
				+ request.getServerName() + ":" + request.getServerPort()
				+ contextPath;
		
		mav.addObject("basePath", basePath);
	}

	private boolean isRedirectView(ModelAndView mav) {
		final View view = mav.getView();
		if (view != null && view instanceof RedirectView)
			return true;
		
		final String viewName = mav.getViewName();
		if (viewName != null && viewName.startsWith("redirect"))
			return true;
		
		return false;
	}

}
