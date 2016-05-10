package com.endlessblue.basic.base.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener  implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent event) {
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		/*MerLoginUser userInf = (MerLoginUser) event.getSession().getAttribute(Constants.LOGIN_SESSION);
		if(userInf !=null){
			LogWriter.info("===session销毁,ID:"+userInf.getId()+",sessionID:"+Constants.LOGIN_SESSION_ID_MAP.get(userInf.getId()));
			Constants.LOGIN_SESSION_ID_MAP.remove(userInf.getId());
		}*/
	}

}
