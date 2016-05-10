package com.endlessblue.basic.base.util;

import java.util.Date;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import com.endlessblue.basic.base.vo.mail.MyAuthenticator;

public class Mail extends Thread{
	private String target,subject,content;
	public Mail(String target,String subject,String content){
		this.target=target;
		this.subject=subject;
		this.content=content;
	}
	public void run() {
		SendMail();
	}
	public  boolean SendMail(){
		return SendMail(this.target,this.subject,this.content);
	}
	public static boolean SendMail(String target,String subject,String content){
		String userName = "dldxkjxh@163.com";  
		String password = "#dldxkx";
		Properties props = new Properties();  
	    props.setProperty("mail.smtp.host", "smtp.163.com");  
	    props.setProperty("mail.smtp.auth", "true");  
	      
	    Authenticator authenticator = new MyAuthenticator(userName, password);  
	      
	    javax.mail.Session mailSession = javax.mail.Session.getDefaultInstance(props,authenticator);  
	    mailSession.setDebug(true);  
	      
	    try{  
	        Address from = new InternetAddress(userName);  
	        Address to = new InternetAddress(target);  
	          
	        MimeMessage msg = new MimeMessage(mailSession);  
	        msg.setFrom(from);  
	        msg.setSubject(subject);  
	        msg.setSentDate(new Date());  
	        msg.setContent(content, "text/html;charset=utf-8");  
	        msg.setRecipient(RecipientType.TO, to);  
	        /* 
	        Transport transport = session.getTransport("smtp"); 
	        transport.connect("smtp.163.com", userName, password); 
	        transport.sendMessage(msg,msg.getAllRecipients()); 
	        transport.close(); 
	        */  
	        Transport.send(msg);  
	    } catch(MessagingException e){  
	        e.printStackTrace();  
	        return false;
	    }
	    return true;
	}
}
