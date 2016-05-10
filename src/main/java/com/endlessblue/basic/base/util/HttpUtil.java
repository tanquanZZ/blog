package com.endlessblue.basic.base.util;

import javax.servlet.http.HttpServletRequest;

import com.google.common.base.Strings;

public class HttpUtil {

	/**
	 * 获取ip
	 * @param 	request
	 * @return	ip
	 */
	public static String getIp(HttpServletRequest request){
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
            ip = request.getRemoteAddr();
        }
        if (!Strings.isNullOrEmpty(ip) && ip.contains(",")){
            String[] ips = ip.split(",");
            ip = ips[ips.length - 1];
        }
        return ip;
    }
}
