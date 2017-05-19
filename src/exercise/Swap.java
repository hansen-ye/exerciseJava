package exercise;

/**
 * 不使用暫存變數（temporary variable）交換兩個變數
 */
public class Swap {

	public static void main(String[] args) {
		int a = 3;
		int b = 9;  
		System.out.println("交換前 a 的值：" + a + "，b 的值：" + b);
		swap(a, b);
		
	}

	static void swap(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("交換後 a 的值：" + a + "，b 的值：" + b);
	}

}
