package com.endlessblue.basic.base.util;
import java.util.List;

public class SmsCodeModel {
	
	private String mobileNo;
	
	private String code;
	
	private long sendTime;
	
	
	public long getSendTime() {
		return sendTime;
	}

	public void setSendTime(long sendTime) {
		this.sendTime = sendTime;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public static SmsCodeModel getSmsCode(List<SmsCodeModel> list,String mobi) {
		SmsCodeModel smsCode = null;
		for(SmsCodeModel code : list){
			if(mobi.equals(code.getMobileNo())){
				smsCode = code;
				break;
			}
		}
		return smsCode;
	}

	

	
	
	

}
