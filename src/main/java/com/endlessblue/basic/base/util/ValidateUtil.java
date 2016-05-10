package com.endlessblue.basic.base.util;

import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUtil {
	/**
	 * 判断日期格式是否正确，YYYYMMDD
	 * 
	 * @return
	 */
	public static boolean isDate(String date) {
		boolean convertSuccess = true;
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		try {
			// 设置lenient为false.
			// 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
			format.setLenient(false);
			format.parse(date);
		} catch (Exception e) {
			// 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
			convertSuccess = false;
		}
		return convertSuccess;
	}

	/**
	 * 判断时间格式是否正确，HHmmss
	 * 
	 * @return
	 */
	public static boolean isTime(String time) {
		boolean convertSuccess = true;
		SimpleDateFormat format = new SimpleDateFormat("HHmmss");
		try {
			// 设置lenient为false.
			// 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
			format.setLenient(false);
			format.parse(time);
		} catch (Exception e) {
			// 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
			convertSuccess = false;
		}
		return convertSuccess;
	}

	/**
	 * 判断银行卡号格式是否正确
	 * 
	 * @param cardNo
	 * @return
	 */
	public static boolean isCardNo(String cardNo) {
		char bit = getBankCardCheckCode(cardNo.substring(0, cardNo.length() - 1));
        if(bit == 'N'){
            return false;
        }
        return cardNo.charAt(cardNo.length() - 1) == bit;
	}
	/**
     * 从不含校验位的银行卡卡号采用 Luhm 校验算法获得校验位
     * @param nonCheckCodeCardId
     * @return
     */
    private static char getBankCardCheckCode(String nonCheckCodeCardId){
        if(nonCheckCodeCardId == null || nonCheckCodeCardId.trim().length() == 0
                || !nonCheckCodeCardId.matches("\\d+")) {
            //如果传的不是数据返回N
            return 'N';
        }
        char[] chs = nonCheckCodeCardId.trim().toCharArray();
        int luhmSum = 0;
        for(int i = chs.length - 1, j = 0; i >= 0; i--, j++) {
            int k = chs[i] - '0';
            if(j % 2 == 0) {
                k *= 2;
                k = k / 10 + k % 10;
            }
            luhmSum += k;           
        }
        return (luhmSum % 10 == 0) ? '0' : (char)((10 - luhmSum % 10) + '0');
    }
	/**
	 * 判断金额格式是否正确，单位为分
	 * 
	 * @param amount
	 * @return
	 */
	public static boolean isMoney(String amount) {
		if (amount == null || amount.equals("") || amount.equals("0")) {
			return false;
		}
		for (int i = amount.length(); --i >= 0;) {
			int chr = amount.charAt(i);
			if (chr < 48 || chr > 57)
				return false;
		}
		return true;
	}

	/**
	 * 判断手机号格式是否正确
	 * 
	 * @param phoneNo
	 * @return
	 */
	public static boolean isPhoneNO(String phoneNo) {
		Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(17[^2,^4,^9,\\D])|(18[0-9]))\\d{8}$");  
		Matcher m = p.matcher(phoneNo);  
		return m.matches();
	}
	

	public static void main(String[] args) {
		// boolean flag = isDate("");
//		boolean flag = isTime("");
		// boolean flag = isMoney("");
//		boolean flag = isPhoneNO("aaa");
		boolean flag = isCardNo("6225758338194433");
		System.out.println(flag);
	}
}
