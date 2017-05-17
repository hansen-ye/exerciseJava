package cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CacheManager {

	// Description: 管理緩存
	// 可擴展的功能：當chche到內存溢出時必須清除掉最早期的一些緩存對象，這就要求對每個緩存對象保存創建時間
	private static HashMap<String, Object> cacheMap = new HashMap<String, Object>();

	// 單實例構造方法
	private CacheManager() {
		super();
	}

	// 獲取布爾值的緩存
	public static boolean getSimpleFlag(String key) {
		try {
			return (Boolean) cacheMap.get(key);
		} catch (NullPointerException e) {
			return false;
		}
	}

	public static long getServerStartdt(String key) {
		try {
			return (Long) cacheMap.get(key);
		} catch (Exception ex) {
			return 0;
		}
	}

	// 設置布爾值的緩存
	public synchronized static boolean setSimpleFlag(String key, boolean flag) {
		if (flag && getSimpleFlag(key)) {// 假如為真不允許被覆蓋
			return false;
		} else {
			cacheMap.put(key, flag);
			return true;
		}
	}

	public synchronized static boolean setSimpleFlag(String key,
			long serverbegrundt) {
		if (cacheMap.get(key) == null) {
			cacheMap.put(key, serverbegrundt);
			return true;
		} else {
			return false;
		}
	}

	// 得到緩存。同步靜態方法
	private synchronized static Cache getCache(String key) {
		return (Cache) cacheMap.get(key);
	}

	// 判斷是否存在一個緩存
	private synchronized static boolean hasCache(String key) {
		return cacheMap.containsKey(key);
	}

	// 清除所有緩存
	public synchronized static void clearAll() {
		cacheMap.clear();
	}

	// 清除某一類特定緩存,通過遍歷HASHMAP下的所有對象，來判斷它的KEY與傳入的TYPE是否匹配
	public synchronized static void clearAll(String type) {
		Iterator<Entry<String, Object>> i = cacheMap.entrySet().iterator();
		String key;
		ArrayList<Object> arr = new ArrayList<Object>();
	//	Map<String, Object> map = new HashMap<String, Object>();
		try {
			while (i.hasNext()) {
				Map.Entry<String, Object> entry = i.next();
				key = (String) entry.getKey();
				if (key.startsWith(type)) { // 如果匹配則刪除掉
					arr.add(key);
				}
			}
			for (int k = 0; k < arr.size(); k++) {
				clearOnly(arr.get(k).toString());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// 清除指定的緩存
	public synchronized static void clearOnly(String Key) {
		cacheMap.remove(Key);
	}

	// 載入緩存
	public synchronized static void putCache(String key, Cache obj) {
		cacheMap.put(key, obj);
	}

	// 獲取緩存信息
	public static Cache getCacheInfo(String key) {

		if (hasCache(key)) {
			Cache cache = getCache(key);
			if (cacheExpired(cache)) { // 調用判斷是否終止方法
				cache.setExpired(true);
			}
			return cache;
		} else
			return null;
	}

	// 載入緩存信息
	public static void putCacheInfo(String key, Cache obj, long dt,
			boolean expired) {
		Cache cache = new Cache();
		cache.setKey(key);
		cache.setTimeOut(dt + System.currentTimeMillis()); // 設置多久後更新緩存
		cache.setValue(obj);
		cache.setExpired(expired); // 緩存默認載入時，終止狀態為FALSE
		cacheMap.put(key, cache);
	}

	// 重寫載入緩存信息方法
	public static void putCacheInfo(String key, Cache obj, long dt) {
		Cache cache = new Cache();
		cache.setKey(key);
		cache.setTimeOut(dt + System.currentTimeMillis());
		cache.setValue(obj);
		cache.setExpired(false);
		cacheMap.put(key, cache);
	}

	// 判斷緩存是否終止
	public static boolean cacheExpired(Cache cache) {
		if (null == cache) { // 傳入的緩存不存在
			return false;
		}
		long nowDt = System.currentTimeMillis(); // 系統當前的毫秒數
		long cacheDt = cache.getTimeOut(); // 緩存內的過期毫秒數
		if (cacheDt <= 0 || cacheDt > nowDt) { // 過期時間小於等於零時,或者過期時間大於當前時間時，則為FALSE
			return false;
		} else { // 大於過期時間 即過期
			return true;
		}
	}

	// 獲取緩存中的大小
	public static int getCacheSize() {
		return cacheMap.size();
	}

	// 獲取指定的類型的大小
	public static int getCacheSize(String type) {
		int k = 0;
		Iterator<Entry<String, Object>> i = cacheMap.entrySet().iterator();
		String key;
		try {
			while (i.hasNext()) {
				Map.Entry<String, Object> entry = i.next();
				key = (String) entry.getKey();
				if (key.indexOf(type) != -1) { // 如果匹配則刪除掉
					k++;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return k;
	}

	// 獲取緩存對象中的所有鍵值名稱

	public static ArrayList<Object> getCacheAllkey() {
		ArrayList<Object> a = new ArrayList<Object>();
		try {
			Iterator<Entry<String, Object>> i = cacheMap.entrySet().iterator();
			while (i.hasNext()) {
				Map.Entry<String, Object> entry = i.next();
				a.add((String) entry.getKey());
			}
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
		return a;
	}

	// 獲取緩存對象中指定類型 的鍵值名稱
	public static ArrayList<Object> getCacheListkey(String type) {
		ArrayList<Object> a = new ArrayList<>();
		String key;
		try {
			Iterator<Entry<String, Object>> i = cacheMap.entrySet().iterator();
			while (i.hasNext()) {
				Map.Entry<String, Object> entry = i.next();
				key = (String) entry.getKey();
				if (key.indexOf(type) != -1) {
					a.add(key);
				}
			}
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
		return a;
	}

}