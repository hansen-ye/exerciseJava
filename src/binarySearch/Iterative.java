package binarySearch;

// 用迭代法
public class Iterative {
	static public int  Search(int[] array, int num) {
		int left = 0, right = array.length - 1;
		while (left <= right) {
			int middle = (right + left) / 2; //取出list中點

			if (array[middle] == num)
				return middle;
			// 比目標大，再搜索左半邊
			if (array[middle] > num)
				right = middle - 1;
			// 比目標小，再搜索右半邊
			else
				left = middle + 1;
		}
		return -1;
	}
}
