package exercise;

/**
 * <pre>
 * Varargs 語法: 它就代表可以傳入任意數量的參數，或者是 Array,
 * 只要在一個形參的"類型"與"參數名"之間加上三個連續的"."（即"..."，英文裡的句中省略號），
 * 就可以讓它和不確定個實參相匹配。
 * </pre>
 */
public class TestVarargs {

	public static void main(String[] args) {
		int sum = 0;
		sum = sumvarargs1( 10, 12, 33 );//使用Varargs,可以少打字
		sum = sumvarargs2(new int[] { 10, 12, 33 });
		System.out.println("相加和: " + sum);

	}

	//使用Varargs,也就是...
	static int sumvarargs1(int... intArrays) {
		int sum = 0;
		for (int i = 0; i < intArrays.length; i++) {
			sum += intArrays[i];
		}
		return sum;
	}
	
	//一般取法
	static int sumvarargs2(int[] intArrays) {
		int sum = 0;
		for (int i = 0; i < intArrays.length; i++) {
			sum += intArrays[i];
		}
		return sum;
	}
}