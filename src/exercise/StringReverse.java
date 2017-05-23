package exercise;

/**
 * <pre>
 * 字串反轉方式  :
 * 1.使用遞迴 (提示：用遞歸編寫程序時一定要牢記兩點：1. 遞歸公式；2. 收斂條件（什麼時候就不再繼續遞歸）)
 * 2.使用 function - StringBuffer
 * </pre>
 */
public class StringReverse {

	public static void main(String[] args) {
		System.out.println("使用遞迴 : " + reverse("Java"));
		System.out.println("------------");
		System.out.print("使用StringBuffer : " + reverse());

	}

	// 遞迴
	public static String reverse(String originStr) {
		if (null == originStr || originStr.length() <= 1)
			return originStr;
		return reverse(originStr.substring(1)) + originStr.charAt(0);
	}

	// 使用StringBuffer
	public static String reverse() {
		StringBuffer buffer = new StringBuffer("Java");
		String originStr = buffer.reverse().toString();
		return originStr;
	}
}
