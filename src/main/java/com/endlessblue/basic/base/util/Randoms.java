package com.endlessblue.basic.base.util;

import java.util.Random;

/**
 * 生成随机数
 * @author zzw
 * @date 2016-03-10
 */
public class Randoms {

    private static final String allChar = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
    private static final int allCharLen = allChar.length();
    private static final String letterChar = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
    private static final int letterCharLen = letterChar.length();
    private static final String numberChar = "0123456789"; 
    private static final int numberCharLen = numberChar.length();

    /** 
     * 返回一个定长的随机字符串(只包含大小写字母、数字) 
     * 
     * @param length 随机字符串长度 
     * @return 随机字符串 
     */ 
    public static String randomString(int length) { 
        StringBuffer sb = new StringBuffer(); 
        Random random = new Random(); 
        for (int i = 0; i < length; i++) { 
                sb.append(allChar.charAt(random.nextInt(allCharLen))); 
        } 
        return sb.toString(); 
    } 
    
    /** 
     * 返回一个定长的随机字符串(只包含大小写字母、数字) 
     * 
     * @param length 随机字符串长度 
     * @return 随机字符串 
     */ 
    public static String randomNumberString(int length) { 
        StringBuffer sb = new StringBuffer(); 
        Random random = new Random(); 
        for (int i = 0; i < length; i++) { 
                sb.append(numberChar.charAt(random.nextInt(numberCharLen))); 
        } 
        return sb.toString(); 
    } 
    

    /** 
     * 返回一个定长的随机纯字母字符串(只包含大小写字母) 
     * 
     * @param length 随机字符串长度 
     * @return 随机字符串 
     */ 
    public static String randomLetterString(int length) { 
        StringBuffer sb = new StringBuffer(); 
        Random random = new Random(); 
        for (int i = 0; i < length; i++) { 
                sb.append(letterChar.charAt(random.nextInt(letterCharLen))); 
        } 
        return sb.toString(); 
    } 

    /** 
     * 返回一个定长的随机纯大写字母字符串(只包含大小写字母) 
     * 
     * @param length 随机字符串长度 
     * @return 随机字符串 
     */ 
    public static String randomLowerString(int length) { 
        return randomLetterString(length).toLowerCase(); 
    } 

    /** 
     * 返回一个定长的随机纯小写字母字符串(只包含大小写字母) 
     * 
     * @param length 随机字符串长度 
     * @return 随机字符串 
     */ 
    public static String randomUpperString(int length) { 
        return randomLetterString(length).toUpperCase(); 
    } 

    /** 
     * 生成一个定长的纯0字符串 
     * 
     * @param length 字符串长度 
     * @return 纯0字符串 
     */ 
    public static String generateZeroString(int length) { 
        StringBuffer sb = new StringBuffer(); 
        for (int i = 0; i < length; i++) { 
                sb.append('0'); 
        } 
        return sb.toString(); 
    } 

    /** 
     * 根据数字生成一个定长的字符串，长度不够前面补0 
     * 
     * @param num           数字 
     * @param fixdlenth 	字符串长度 
     * @return 定长的字符串 
     */ 
    public static String toFixdLengthString(long num, int fixdlenth) { 
        StringBuffer sb = new StringBuffer(); 
        String strNum = String.valueOf(num); 
        if (fixdlenth - strNum.length() >= 0) { 
                sb.append(generateZeroString(fixdlenth - strNum.length())); 
        } else { 
                throw new RuntimeException("将数字" + num + "转化为长度为" + fixdlenth + "的字符串发生异常！"); 
        } 
        sb.append(strNum); 
        return sb.toString(); 
    } 
    
}
