package exercise;

public class ExerciseArray {

	public static void main(String[] args) {
		int[][] x =new int[][]{ { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] y =new int[][]{ { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] z =new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
		int sum = 0;

		System.out.println("陣列X");
		RandomArray(x);
		display(x);
		System.out.println("----------------");

		System.out.println("陣列Y");
		RandomArray(y);
		display(y);
		System.out.println("----------------");

		sum = sum(z, x, y);
		System.out.println("我是陣列Z=X+Y");
		display(z);
		System.out.println("----------------");
		System.out.println("總和" + sum);
		
	}

	private static void RandomArray(int[][] a) {
		
		for (int i = 0; i < a.length; i++) {
			//for(int i :a){
			for (int j = 0; j < a[i].length; j++) {
			//for(int j:a[i]){
				int r = (int) (30 * Math.random());
				a[i][j] = r;
			}
		}

	}

	private static void display(int[][] b) {
		for (int k = 0; k < b.length; k++) {
			for (int l = 0; l < b[k].length; l++) {
				int t = b[k][l];
				System.out.print(t + "  ");
			}
			System.out.println();

		}

	}

	private static int sum(int[][] z, int[][] x, int[][] y) {
		int sum = 0;
		for (int i = 0; i < z.length; i++) {

			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
				sum += z[i][j];
			}
		}
		return sum;
	}

}