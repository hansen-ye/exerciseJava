package bubbleSorter;

import java.util.Arrays;

public class BubbleSorterMain {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		Comparable[] list = { 45, 23, 18, 10, 6, 8, 67, 98, 30, 50 };
		BubbleSorter bubbleSorter = new BubbleSorter();

		bubbleSorter.sort(list);
	
		System.out.println(Arrays.toString(list));

	}

}
