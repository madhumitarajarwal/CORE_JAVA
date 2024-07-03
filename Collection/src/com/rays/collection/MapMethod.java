package com.rays.collection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethod {
       public static void main(String[] args) {
    	   Map map=new HashMap();
    	   map.put("1","one");
    	   map.put("2","two");
    	   map.put("a","three");
    	   
    	   int size=map.size();
    	   System.out.println("size of map"+size);
    	   
    	   String val=(String)map.get("2");
    	   System.out.println("get value "+val);
    	   map.remove("1");
    	   System.out.println(map);
    	   
    	   boolean flag1=map.containsKey("2");
    	   boolean flag=map.containsValue("five");
    	   
    	   System.out.println(flag1);
    	   
    	   Set keys = map.keySet();
    	   for(Object k:keys) {
    		   System.out.println("total keys are = "+k);
    	   }
    	   Collection value=map.values();
    	   System.out.println("value in map are = "+value);
    	   
    	   Set keyvalue=map.entrySet();
    	   System.out.println("total value in form of key and value pair = "+keyvalue);
    	   
    	   map.clear();
    	   System.out.println(map.isEmpty());
    	   System.out.println(flag);
    	   
       }
}
