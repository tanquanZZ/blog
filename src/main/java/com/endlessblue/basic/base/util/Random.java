package com.endlessblue.basic.base.util;

public class Random {
	public static String getTimeMillis(int rand) {
		return (String.valueOf(System.currentTimeMillis())).substring(13-rand);
	}
	public static void main(String[] args){
		
	}
	public static String RandomStr(int length){
		StringBuilder str=new StringBuilder();
		String[] strArr=new String[]{"H","A","B","o","p","q","J","w","x","y","K","L","M","N","O","P","Q","R","r","s","I","S","T","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","C","D","E","F","G","m","n","t","u","U","V","W","X","v","z","@","$","%","#","&"};
		java.util.Random random=new java.util.Random();
		for(int i=0;i<length;i++){
			str=str.append(strArr[random.nextInt(strArr.length)]);
		}
		return str.toString();
	}
	public static String getRandVerifyCode(int length){
		StringBuilder str=new StringBuilder();
		String[] strArr=new String[]{"3","2","4","5","6","7","8","9","0","1"};
		java.util.Random random=new java.util.Random();
		for(int i=0;i<length;i++){
			str=str.append(strArr[random.nextInt(strArr.length)]);
		}
		return str.toString();
	}
}
