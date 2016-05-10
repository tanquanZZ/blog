package com.endlessblue.basic.base.util;

import java.util.HashMap;
import java.util.Map;

public class Constants {
	public static final  String LOGIN_SESSION="LOGIN_SESSION";
	public static final  String LOGIN_MENU="LOGIN_MENU";
	public static final  String CHARSET_NAME="UTF-8";
	public static final  int SHOW_NUM = 10;
	public static final  int FILE_DOWNLOAD_NUM = 3000;
	public static final  String SMS_CODE="SMS_CODE";
	public static final  String EMAIL_CODE="EMAIL_CODE";
	public static final  String LOGINSMS_CODE="LOGINSMS_CODE";
	public static Map<String,Long> seqCurMap=new HashMap<String,Long>();//当前数据库序列
	public static Map<String,Integer> seqStepMap=new HashMap<String,Integer>();//已取到值[1-10000]
	
	
	public static final  String EMAIL_USER_NAME="chen_hengtong@163.com";
	public static final  String EMAIL_USER_PWD="******";
	public static final  String EMAIL_TITLE="易势支付-找回密码验证码";
	public static final  String EMAIL_CONTENT="您好:\n      您的验证码为{0}，30分钟之内有效。【易势支付】\n";
	
	/**sessionID**/
	public static Map<String,String> LOGIN_SESSION_ID_MAP = new HashMap<String, String>();
	
}
