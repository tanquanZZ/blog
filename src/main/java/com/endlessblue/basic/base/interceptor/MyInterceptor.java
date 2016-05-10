package com.endlessblue.basic.base.interceptor;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		  //String url=request.getServletPath();    
	        /*if (url.startsWith("/public/")||url.equals("/")||url.equals("/secret/random")||url.equals("")){
	        	request.setAttribute("head", "index");
	        	return true;  
			}else{
				if(request.getSession().getAttribute(Constants.LOGIN_SESSION)==null){
					if(url.equals("/mchntCenter")){
						request.setAttribute("out_tp", "1");
					}
					request.getRequestDispatcher("/sessionTimeOut.jsp").forward(request, response);
					return false;
				}
				MerLoginUser userInf = (MerLoginUser) request.getSession().getAttribute(Constants.LOGIN_SESSION);
				if(!request.getSession().getId().equals(Constants.LOGIN_SESSION_ID_MAP.get(userInf.getId()))){
					request.getSession().removeAttribute(Constants.LOGIN_SESSION);
					request.getSession().removeAttribute(Constants.LOGIN_MENU);
					request.setAttribute("out_tp", "3");
					request.getRequestDispatcher("/sessionTimeOut.jsp").forward(request, response);
					return false;
				}
				
				 if(url.startsWith("/mchntCenter")){
			        	request.getSession().removeAttribute("leftfid");
			        	request.getSession().removeAttribute("leftid");
			        }
				 if(StringUtils.isNotEmpty(request.getParameter("leftfid"))){
					 request.getSession().setAttribute("leftfid",  request.getParameter("leftfid"));
				 }
				 if(StringUtils.isNotEmpty(request.getParameter("leftid"))){
					 request.getSession().setAttribute("leftid",  request.getParameter("leftid"));
				 }
				if(defaultAuth(url)){//默认权限
					return true;
				}
		        if(!urlIsAuth(request, url)){
		            request.getRequestDispatcher("/authError.jsp").forward(request, response);  
		            return false;
		        }
		        return true;  
			}*/
		  return true;
	}
	 /**
     *默认权限
     * @return
     */
    public boolean defaultAuth(String url){
    	List<String> list = new ArrayList<String>();
    	list.add("/home");
    	list.add("/secret/random");
    	list.add("/mchntCenter");
    	list.add("/loginOut");
    	list.add("/error");
    	
    	list.add("/user/checkPwd");//检查密码
    	list.add("/user/checkPayPwd");//检查支付密码
    	list.add("/user/sendEmail");//发送邮件验证
    	list.add("/user/checkCode");//检查验证码
    	list.add("/user/checkUserId");//检查用户名
    	list.add("/user/updPwdSucc");//密码修改成功跳转
    	list.add("/user/sendSmsCode");//发送验证码
    	list.add("/user/hideKey");//隐藏密钥
    	
    	list.add("/cash/cash");//提现
    	list.add("/cash/cashConfirm");//提现
    	list.add("/cash/cashSub");//提现
    	list.add("/trans/transAccount");//转账
    	list.add("/trans/verifyInAccount");//转账
    	list.add("/trans/transAccountConfirm");//转账
    	list.add("/trans/transAccountSub");//转账
    	list.add("/trans/verifyPayPwd");//转账
    	
    	//
    	list.add("/user/forGetPayPwd");//忘记支付密码
    	list.add("/user/newPayPwd");//忘记支付密码
    	list.add("/user/payPwd");//支付密码
    	list.add("/user/loginPwd");//登录密码
    	
    	
    	list.add("/user/forGetPayPwd");//忘记支付密码
    	list.add("/user/newPayPwd");//忘记支付密码
    	list.add("/user/payPwd");//支付密码
    	list.add("/user/loginPwd");//登录密码
    	list.add("/user/updLoginPwd");//登录密码保存
    	list.add("/user/updNewPayPwd");//忘记支付密码保存
    	list.add("/user/updPayPwd");//修改支付密码保存
    	
    	
    	
    	for(String l:list){
    		if(url.startsWith(l)){
    			return true;
    		}
    	}
    	return false;
    }

    /**
	 * url是否有访问权限
	 * @return
	 */
	public boolean urlIsAuth(HttpServletRequest request,String url){
		/*List<MerMenu> menuInfList = (List<MerMenu>) request.getSession().getAttribute(Constants.LOGIN_MENU);
		for(MerMenu menuInf:menuInfList){
			try {
				if(StringUtils.isNotEmpty(menuInf.getUrl().trim())&&url.startsWith(menuInf.getUrl())){
					return true;
				}
			} catch (Exception e) {
				LogWriter.error("异常菜单:"+menuInf);
				e.printStackTrace();
			}
		}*/
		return false;
	}
}
