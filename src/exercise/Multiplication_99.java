package exercise;

public class Multiplication_99 {
	//(1) 由左至右顯示九九乘法乘積之格式為「被乘數x乘數=乘積」，被乘數固定不變，乘數為1~9之變動數值
	//(2) 由上至下顯示九九乘法之乘積，乘數固定不變，被乘數為1~9之變動數值
	//(3) 顯示九九乘法表由上至下每一列須以「被乘數」對齊
	public static void main(String[] args) {
		int i;
		int j;
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= 9; j++) 
			//System.out.println(""+i+"*"+j+"="+(i*j)+"\t");
				System.out.println();
		}
		
	}
}
