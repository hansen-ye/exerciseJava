package exercise;

/** 
 *	<pre>
 *  底線格式數值 :
 *  一個數值(整數或浮點數)的表示方式，除了數字、型別符號、正負符號、小數點外，
 *  還能加上底線來增加數值的可讀性。
 *  </pre>
 */
public class BottomLineFormatValues {

	public static void main(String[] args) {
		int a = 1_2_3_4_5; // 10進位
		int b = 0x30_39; // 16進位
		int c = 0_30071; // 8進位
		int d = 0b11_0000_0011_1001; // 2進位
		float f = 3.14_15_92_6f; // 浮點數
		double db = 12.34_56_78; // 雙精確浮點數

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(f);
		System.out.println(db);

	}

}
