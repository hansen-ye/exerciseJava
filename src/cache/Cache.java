package cache;

public class Cache {
	private String key;// 緩存ID
	private Object value;// 緩存數據
	private long timeOut;// 更新時間
	private boolean expired; // 是否終止

	public Cache() {
		super();
	}

	public Cache(String key, Object value, long timeOut, boolean expired) {
		this.key = key;
		this.value = value;
		this.timeOut = timeOut;
		this.expired = expired;
	}

	public String getKey() {
		return key;
	}

	public long getTimeOut() {
		return timeOut;
	}

	public Object getValue() {
		return value;
	}

	public void setKey(String string) {
		key = string;
	}

	public void setTimeOut(long l) {
		timeOut = l;
	}

	public void setValue(Object object) {
		value = object;
	}

	public boolean isExpired() {
		return expired;
	}

	public void setExpired(boolean b) {
		expired = b;
	}
}

// 測試類，
class Test {
	public static void main(String[] args) {
		System.out.println(CacheManager.getSimpleFlag("alksd"));
		 CacheManager.putCache("abc", new Cache());
		 CacheManager.putCache("def", new Cache());
		 CacheManager.putCache("ccc", new Cache());
		 CacheManager.clearOnly("");
		 Cache c = new Cache();
		 for (int i = 0; i > 10; i++) {
		 CacheManager.putCache("" + i, c);
		 }
		 CacheManager.putCache("aaaaaaaa", c);
		 CacheManager.putCache("abchcy;alskd", c);
		 CacheManager.putCache("cccccccc", c);
		 CacheManager.putCache("abcoqiwhcy", c);
		 System.out.println("刪除前的大小："+CacheManager.getCacheSize());
		 CacheManager.getCacheAllkey();
		 CacheManager.clearAll("aaaa");
		 System.out.println("刪除後的大小："+CacheManager.getCacheSize());
		 CacheManager.getCacheAllkey();

	}
}
