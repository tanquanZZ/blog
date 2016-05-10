package com.endlessblue.basic.base.util;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.endlessblue.basic.base.vo.http.HttpRequester;
import com.endlessblue.basic.base.vo.http.HttpResponser;

public class HttpDataGetor {
	public static List<Object> getDataListFromHttpRequest(String url){
        List<Object> dataList=null;
        HttpRequester hrq=new HttpRequester();
        HttpResponser hrp=new HttpResponser();
        try{
            //url:http://www.pkarea.com:8080/dldx_eshop/do?s=119
            hrp=hrq.sendPost(url);
        }catch(Exception e){
            hrp=null;
        }
        if(hrp!=null){
            if(!"null".equals(hrp.getContent().toString())&&hrp.getContent().toString().contains("[{")){
                String temp="";
				try {
					temp = java.net.URLDecoder.decode(hrp.getContent().toString(),"UTF-8");
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	dataList=JsonUtil.toList(temp);
            }else{
                dataList=null;
            }
        }else{
            Map<String,Object> m=new HashMap<String,Object>();
            m.put("code", "100");
            dataList=new ArrayList<Object>();
            dataList.add(m);
        }
        return dataList;
    }
	public static String getDataStrFromHttpRequest(String url){
		String rtnStr=null;
		HttpRequester hrq=new HttpRequester();
		HttpResponser hrp=new HttpResponser();
		try{
			//url:http://www.pkarea.com:8080/dldx_eshop/do?s=119
			hrp=hrq.sendPost(url);
		}catch(Exception e){
			hrp=null;
		}
		if(hrp!=null){
			if(!"null".equals(hrp.getContent().toString())){
				String temp="";
				try {
					temp = java.net.URLDecoder.decode(hrp.getContent().toString(),"UTF-8");
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				rtnStr=temp;
			}else{
				rtnStr=null;
			}
		}
		return rtnStr;
	}
}
