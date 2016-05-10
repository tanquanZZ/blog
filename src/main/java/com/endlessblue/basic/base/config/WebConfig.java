package com.endlessblue.basic.base.config;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.endlessblue.basic.base.filter.CheckURLFilter;


@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/style/").addResourceLocations("/style/**");
		registry.addResourceHandler("/images/").addResourceLocations("/images/**");
		registry.addResourceHandler("/res/").addResourceLocations("/res/**");
		registry.addResourceHandler("/js/").addResourceLocations("/js/**");
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new com.endlessblue.basic.base.interceptor.MyInterceptor());
	}

	/**
	 * 过滤器
	 * @return
	 */
	@Bean
	public FilterRegistrationBean checkUrlFilterRegistration(){
		FilterRegistrationBean registration = new FilterRegistrationBean();
	    registration.setFilter(new CheckURLFilter());
	    String[] interceptController = {"/public/*","/account/*","/role/*","/user/*","/accountCheck/*","/cash/*","/queryrefund/*","/refund/*","/trans/*"};
	    registration.addUrlPatterns(interceptController);
	    registration.setName("checkURLFilter");
	    return registration;
	}
	
	/**
	 * 错误页面
	 * @return
	 */
	@Bean
	public ServerProperties getErrorConfig() {
	    return new ServerConfig();
	}
	
}
