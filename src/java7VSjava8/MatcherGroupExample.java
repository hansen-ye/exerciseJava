package java7VSjava8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatcherGroupExample {

	public static void main(String[] args) {

		try {
			BufferedReader buf = new BufferedReader(
					new InputStreamReader(System.in));
			System.out.println("please input integer");
			int input = Integer.parseInt(buf.readLine());
			System.out.println("input * 10 = "+(input*10));
		} catch (NumberFormatException e) { // runtime exception
			System.out.println("輸入必須為整數"); 
			e.printStackTrace();
		} catch (IOException e) {
			 // checked exception
            System.out.println("I/O錯誤"); 
           
		}
	}
}
