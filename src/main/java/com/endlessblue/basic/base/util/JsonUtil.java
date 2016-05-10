package com.endlessblue.basic.base.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;



public class JsonUtil {
	/** 
	* 获取JsonObject 
	* @param jsonStr 
	* @return 
	*/  
	public static JsonObject parseJsonAsObject(String jsonStr){  
        JsonParser parser = new JsonParser();
        JsonObject jsonObj =null;
        try{
        	jsonObj= parser.parse(jsonStr).getAsJsonObject();  
        }catch(Exception e){}
        return jsonObj;  
    }  
	public static JsonArray parseJsonAsArray (String jsonStr) {
		JsonParser parser = new JsonParser();
		JsonArray jsonArray = null;
		try{
			jsonArray= parser.parse(jsonStr).getAsJsonArray();  
        }catch(Exception e){}
        return jsonArray;  
	}
	/** 
	* 根据json字符串返回Map对象 
	* @param jsonStr 
	* @return 
	*/  
    public static Map<String,Object> toMap(String jsonStr){
    	Map<String,Object> jsonMap=null;
    	if(jsonStr!=null){
    		jsonMap=JsonUtil.toMap(JsonUtil.parseJsonAsObject(jsonStr));  
    	}
    	return jsonMap;
    }
    /** 
     * 将JSONObjec对象转换成Map-List集合 
    * @param json 
    * @return 
    */  
	public static Map<String, Object> toMap(JsonObject json) {
		Map<String, Object> map = null;
		if(json!=null){
			map=new HashMap<String, Object>();
			Set<Entry<String, JsonElement>> entrySet = json.entrySet();
			for (Iterator<Entry<String, JsonElement>> iter = entrySet.iterator(); iter
					.hasNext();) {
				Entry<String, JsonElement> entry = iter.next();
				String key = entry.getKey();
				Object value = entry.getValue();
				if (value instanceof JsonArray)
					map.put((String) key, toList((JsonArray) value));
				else if (value instanceof JsonObject)
					map.put((String) key, toMap((JsonObject) value));
				else
					map.put(key, value != null ? value.toString().replaceAll("^\"|\"$", "") : value);
			}
		}
		return map;
	}

	/**
	 * 将JSONArray对象转换成List集合
	 * 
	 * @param json
	 * @return
	 */
	public static List<Object> toList(JsonArray json) {
		List<Object> list = new ArrayList<Object>();
		for (int i = 0; i < json.size(); i++) {
			Object value = json.get(i);
			if (value instanceof JsonArray) {
				list.add(toList((JsonArray) value));
			} else if (value instanceof JsonObject) {
				list.add(toMap((JsonObject) value));
			} else {
				list.add(value);
			}
		}
		return list;
	}
	public static List<Object> toList(String jsonStr) {
		return toList(parseJsonAsArray(jsonStr));
	}

}
