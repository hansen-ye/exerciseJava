package exercise;

//[JAVA]IF的簡化
public class IfElseSimple {
	public static void main(String args[]) {
		aa();
		bb();
	}

	public static void aa() {
		int max = 0, x = 5, y = 10;
		if (x > y) {
			max = x;
		} else {
			max = y;
		}
		System.out.println(max);
	}

	// 相等於

	/**
	 * ? 前面為判斷式，若為真，則執行 :(冒號)前的程式碼，若不為真，則執行冒號後的程式碼。
	 */
	public static void bb() {
		int x = 5;
		int y = 10;
		System.out.println(x > y ? x : y);

	}
}
