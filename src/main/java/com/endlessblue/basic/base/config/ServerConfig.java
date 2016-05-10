package com.endlessblue.basic.base.config;

import org.springframework.boot.context.embedded.ErrorPage;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.http.HttpStatus;

public class  ServerConfig extends ServerProperties{

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		super.customize(container);
		container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND,"/404.jsp"));
		container.addErrorPages(new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/500.jsp"));
		container.addErrorPages(new ErrorPage("/error.jsp"));
	}
	
}
