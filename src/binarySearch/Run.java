package binarySearch;

public class Run {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int num = 6;

		int iterativeSearchCounts = Iterative.Search(array, num);
		int divideAndConquerSearchCounts = DivideAndConquer.Search(array, num);

		System.out.println(iterativeSearchCounts);
		System.out.println("--------------------");
		System.out.println(divideAndConquerSearchCounts);

	}

}
