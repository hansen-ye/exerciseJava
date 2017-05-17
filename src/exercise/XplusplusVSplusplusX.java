package exercise;

/**
解釋1:x++是先進行條件的判斷，如果條件成立再進行++操作
     ++x是每次都先進行++操作後，再進行條件陳述式的判斷

解釋2:操作相同，都是將x加一，返回的值不同
     x++返回的是原來x值
	  而++x返回的是原來x加一後的值 
	 x++要使用一個temp變數記住原來的x值以作返回，如果在不需要返回值的時候，應該選擇用++x
	 
*
*/
public class XplusplusVSplusplusX{
	public static void main(String[] atgs) {
		int x = 10;
		int a = x++;
		int b = ++x;
		int c = 10 * x++ ;
		int d = 10 * ++x ;
		System.out.println("a="+ a);
		System.out.println("b="+ b);
		System.out.println("c="+ c);
		System.out.println("d="+ d);
	}
}
