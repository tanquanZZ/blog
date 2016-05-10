package com.endlessblue.basic.base.taglib;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.endlessblue.basic.base.util.AuthUtil;
import com.endlessblue.basic.base.util.LogWriter;


public class AuthTag  extends SimpleTagSupport {

	private String authCode="";
	
	@Override
	public void doTag() throws JspException ,IOException {
		try {
		JspFragment jf = this.getJspBody();  
		StringWriter jw =  new StringWriter();
		jf.invoke(jw);
		JspWriter out  =this.getJspContext().getOut();
		HttpServletRequest request = (HttpServletRequest)((PageContext)this.getJspContext()).getRequest();
		if(AuthUtil.menuIsAuth(request, authCode)){
			out.print(jw);
		}else{
			out.print("");
		}
	} catch (Exception e) {
		e.printStackTrace();
		LogWriter.error("AuthTag标签输出出现异常：");
		throw new JspTagException(e.getMessage());
	}
		
	};

	
	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	

}
