package com.endlessblue.basic.base.util;

/**
 * @author aojiong
 *
 */
public class CHException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errcode;
	private String errInfo;
	/**
	 * 
	 */
	public CHException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param errcode
	 * @param errInfo
	 * @param throwable
	 */
	public CHException(String errcode,String errInfo,Throwable throwable){
		super(throwable);
		LogWriter.error(errInfo);
		this.errcode = errcode;
		this.errInfo = errInfo;
	}
	
	/**
	 * 
	 * @param errcode
	 * @param errInfo
	 * @param throwable
	 */
	public CHException(String errcode,String errInfo){
		LogWriter.error(errInfo);
		this.errcode = errcode;
		this.errInfo = errInfo;
	}
	/**
	 * @param arg0
	 */
	public CHException(String errInfo) {
		LogWriter.error(errInfo);
		this.errInfo = errInfo;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public CHException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public CHException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the errcode
	 */
	public String getErrcode() {
		return errcode;
	}

	/**
	 * @return the errInfo
	 */
	public String getErrInfo() {
		return errInfo;
	}

}
