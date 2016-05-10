package com.endlessblue.basic.base.filter;



import java.io.IOException;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.endlessblue.basic.base.util.LogWriter;

public class CheckURLFilter implements Filter {


	@Override
	public void init(FilterConfig filterconfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest servletrequest,
			ServletResponse servletresponse, FilterChain filterchain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) servletrequest;  
		//HttpServletResponse res = (HttpServletResponse) servletresponse;

		     
		String urlString = req.getRequestURI();
		
		
		if(servletrequest.getCharacterEncoding() == null || !servletrequest.getCharacterEncoding().toUpperCase().equals("UTF-8")){
			servletrequest.setCharacterEncoding("UTF-8");
		}
		long bt = System.currentTimeMillis();
		Map<String, String[]> map = servletrequest.getParameterMap();
		for(String m:map.keySet()){
			if(m.indexOf("password") != -1 || m.indexOf("Password") != -1)
				continue;
			String[] v = (String[]) map.get(m);
			LogWriter.info(m+":"+v[0]);
		}
		filterchain.doFilter(servletrequest, servletresponse);
		long et = System.currentTimeMillis();
		LogWriter.debug(urlString+"执行完毕! 耗时："+(et-bt));
	}
	

	@Override
	public void destroy() {

	}
}
