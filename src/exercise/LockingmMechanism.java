package exercise;

import java.util.HashMap;
import java.util.Map;

	public class LockingmMechanism {  
	    private static Map<String, Object> map = new HashMap<String, Object>();  
	    private static Map<String, Object> preMap = new HashMap<String, Object>();  
	  
	    // 加锁机制  
	    public static synchronized boolean setCartMap(Map<String, Object> checkMap) {  
	        preMap = map;  
	        System.out.println("oldMap:" + map.toString());  
	        for (Map.Entry<String, Object> entry : checkMap.entrySet()) {  
	            if (null != map.get(entry.getKey())) {  
	                map = preMap;  
	                System.out.println("newMap:" + map.toString());  
	                return false;  
	            } else {  
	                map.put(entry.getKey(), entry.getValue());  
	            }  
	        }  
	        System.out.println("newMap:" + map.toString());  
	        // map.clear();  
	        return true;  
	    }  
	}  

