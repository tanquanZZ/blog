package com.endlessblue.basic.base.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
/** 
 * 采用DOM4J方式 
 * @author Stone 
 * 
 */ 
public class XMLReader{ 
	 public static String xmlUrl=null;
	 public static String xmlStr=null;
	/** 
	 * 获取doc对象（org.dom4j.Document） 
	 * @return Document
	 */ 
	 public static Document getDocument(){ 
		  SAXReader sr = new SAXReader(); 
		  org.dom4j.Document doc = null; 
		  try { 
			  if(xmlUrl!=null){
				  doc = sr.read(new File(xmlUrl)); 
			  }else if(xmlStr!=null){
				  doc=sr.read(new ByteArrayInputStream(xmlStr.getBytes("utf-8")));
			  }
		  } catch (Exception e) { 
			  e.printStackTrace(); 
		  } 
		  return doc; 
	 } 
	 /**
	  * 
	  * @param nodeName:标签名称如》"/Configs/Config/Config-Name"
	  * @return 标签内值
	  */
	 public static String getXMLNodeValue(String nodeName){
		String rtnStr=null;
		Document doc = getDocument(); 
		List<?> valueList = doc.selectNodes(nodeName);
		if(valueList!=null){
			rtnStr=((Element)valueList.get(0)).getText();
		}
		return rtnStr;
	 }
	 public static void main(String[] args){
		 xmlStr="<?xml version='1.0' encoding='utf-8'?><alipay><is_success>T</is_success><request><param name='trade_no'>2013042241804840</param><param name='_input_charset'>utf-8</param><param name='transport_type'>DIRECT</param><param name='service'>send_goods_confirm_by_platform</param><param name='partner'>2088402828117414</param></request><response><tradeBase><buyer_account>20887020919064040156</buyer_account><buyer_actions>[REFUND, CONFIRM_GOODS]</buyer_actions><buyer_login_email>1170026004@qq.com</buyer_login_email><buyer_type>PRIVATE_ACCOUNT</buyer_type><buyer_user_id>2088702091906404</buyer_user_id><channel>interface/escrow</channel><create_time>2013-04-22 15:37:18</create_time><currency>156</currency><gathering_type>1</gathering_type><last_modified_time>2013-04-23 11:30:16</last_modified_time><operator_role>B</operator_role><out_trade_no>13042266045285</out_trade_no><partner_id>2088402828117414</partner_id><seller_account>20884028281174140156</seller_account><seller_actions>[EXTEND_TIMEOUT]</seller_actions><seller_login_email>495864367@qq.com</seller_login_email><seller_type>PRIVATE_ACCOUNT</seller_type><seller_user_id>2088402828117414</seller_user_id><service_fee>0.00</service_fee><service_fee_ratio>0.0</service_fee_ratio><stop_timeout>F</stop_timeout><total_fee>0.01</total_fee><trade_from>INST_PARTNER</trade_from><trade_no>2013042241804840</trade_no><trade_status>WAIT_BUYER_CONFIRM_GOODS</trade_status><trade_type>S</trade_type></tradeBase></response><sign>1d694bfc0ce6c5ecf9e29c3f40698fe0</sign><sign_type>MD5</sign_type></alipay>";
		 System.out.print(getXMLNodeValue("/alipay/is_success"));
	 }
}