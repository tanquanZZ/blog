package com.endlessblue.basic.base.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateUtil {
	public static void main(String[] args){
		System.out.println(getDate("yyyyMMdd00000000"));
	}
	/**
	 * 
	 * @param begin :��ʼ����
	 * @param targetDate :��������
	 * @return :�����������
	 */
	public static long dateCompareByDay(String begin,String end){
		begin=begin.replaceAll("[^0-9]","");
		begin=begin.substring(0,8);
		end=end.replaceAll("[^0-9]","");
		end=end.substring(0,8);
		long dis=-1;
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		Date nDate=null;
		Date tDate=null;
		try {
			nDate = df.parse(begin);
			tDate = df.parse(end);
			dis= (tDate.getTime()-nDate.getTime())/1000/60/60/24;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dis;
	}
	/**
	 * 
	 * @param beginDate :���Ƚ�����
	 * @param endDate :Ŀ������
	 * @return :����Ŀ�����������������������
	 */
	public static long dateCompareByMiliSec(String beginDate,String endDate){
		beginDate=beginDate.replaceAll("[^0-9]","");
		endDate=endDate.replaceAll("[^0-9]","");
		long dis=-1;
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		Date bDate=null;
		Date eDate=null;
		try {
			bDate = df.parse(beginDate);
			eDate = df.parse(endDate);
			dis= (eDate.getTime()-bDate.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dis;
	}
	public static String getDate(){
		return getDate("yyyyMMddHHmmss");
	}
	/**
	 * 
	 * @param date_mode:yyyyMMddHHmmss
	 * @return
	 */
	public static String getDate(String date_mode){
		Date d = new Date();
		SimpleDateFormat date = new SimpleDateFormat(date_mode);
		date.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
		String datename = date.format(d).toString();
		return datename;
	}
	/**
	 * 
	 * @param dateTime :����ʱ��
	 * @param days :����MiliSec
	 * @return �Ӻ�ʱ���ַ���
	 */
	public static String dateTimeAddByMiliSec(String dateTime,long sec){
		return dateTimeAddByMiliSec(dateTime,sec,"yyyyMMddHHmmss");
	}
	/**
	 * 
	 * @param dateTime :����ʱ��
	 * @param days :����MiliSec
	 * @param outPutMode :�����ʽ
	 * @return �Ӻ�ʱ���ַ���
	 */
	public static String dateTimeAddByMiliSec(String dateTime,long sec,String outPutMode){
		SimpleDateFormat df = new SimpleDateFormat(outPutMode);
		Date dealDate=new Date();
		try {
			dealDate = df.parse(dateTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date addedDate = new Date( dealDate.getTime()+sec );  
		return df.format(addedDate);    
	}
	/**
	 * 
	 * @param dateTime :����ʱ��
	 * @param days :��������
	 * @param outPutMode :�����ʽ
	 * @return �Ӻ�ʱ���ַ���
	 */
	public static String dateTimeAddByDays(String dateTime,long days,String outPutMode){
		SimpleDateFormat df = new SimpleDateFormat(outPutMode);
		Date dealDate=new Date();
		try {
			dealDate = df.parse(dateTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		long s=days*24*60*60*1000;
		Date addedDate = new Date( dealDate.getTime()+s );  
		return df.format(addedDate);    
	}
	/**
	 * 
	 * @param dateTime :����ʱ��
	 * @param days :��������
	 * @return �Ӻ�ʱ���ַ���
	 */
	public static String dateTimeAddByDays(String dateTime,long days){
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		Date dealDate=new Date();
		try {
			dealDate = df.parse(dateTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		long s=days*24*60*60*1000;
	    Date addedDate = new Date( dealDate.getTime()+s );  
	    return df.format(addedDate);    
	}
	/**
	 * ��ϵͳ��ǰ���ڽ����ۼ�
	 * @param days :��������
	 * @return �Ӻ�ʱ���ַ���
	 */
	public static String dateTimeAddByDays(long days,String outPutMode){
		SimpleDateFormat df = new SimpleDateFormat(outPutMode);
		Date dealDate=new Date();
		long s=days * 24 * 60 * 60 * 1000;
		Date addedDate = new Date(dealDate.getTime() +s );  
		return df.format(addedDate);    
	}
}
