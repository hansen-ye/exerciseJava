package exercise;

import java.util.Scanner;

//1~100的顯示
public class NumberToNumberInScanner {
	
	public static void main(String[] args) {
		int n,m,count;
		  Scanner scan = new Scanner(System.in); 
		  System.out.println("數字幾開始?");
		  n = scan.nextInt(); 
		  System.out.println("數字幾結束?");
		  m = scan.nextInt();
		
		for (count = n; count <= m; count++) {
			System.out.print(count + (count != m ? "," : ""));

		}
	}
}
