package exercise;

import java.util.Scanner;

/* 
 * 兩個數取中間質數
 */
public class Primenumber {
	//判斷一個數是否質數
	static boolean isPrime(int n){
		//判斷1不是質數
		if(n == 1){ 
			return false;
		}
		//若開平方根的數有小數點,用(int)強制取整數部份
		int nn = (int)Math.sqrt(n);
		boolean yes = true;
		//最小的質數是2(i從2開始)
		for(int i = 2; i <= nn; i++){
			//判斷整除不是質數
			if(n % i == 0){
				return false;
			}
		}
		return yes;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		//輸入第一個數
		Scanner s1 = new Scanner(System.in);
		System.out.println("輸入第一個數:");
		int a = s1.nextInt();
		//輸入第二個數
		Scanner s2 = new Scanner(System.in);
		System.out.println("輸入第二個數:");
		int b = s2.nextInt();
		
		if((a < 0) || (b < 0)){
			throw new Exception("輸入的數不能為負數");
		}
		
		if(b < a){
			throw new Exception("第二個數要大於第一個數");
		}

		if(b == a){
			throw new Exception("2個數不能一樣");
		}
		
		int count = 0;
		for(int i = a ; a <= i && i < b; i++){
			if(isPrime(i)){
				count++;
				System.out.print(i+",");
			}
		}
	System.out.println("質數有"+ count +"個");
		
	}
}