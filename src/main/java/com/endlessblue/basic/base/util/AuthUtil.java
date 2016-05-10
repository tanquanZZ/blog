package com.endlessblue.basic.base.util;

import javax.servlet.http.HttpServletRequest;

/**
 * 权限
 * @author aojiong
 *
 */
public class AuthUtil {
	
	public static boolean  menuIsAuth(HttpServletRequest request,String authCode){
	/*	List<MerMenu> menuInfList = (List<MerMenu>) request.getSession().getAttribute(Constants.LOGIN_MENU);
		for(MerMenu menuInf:menuInfList){
			if(authCode.equals(menuInf.getId())){
				return true;
			}
		}*/
		return true;
	}
	
}
