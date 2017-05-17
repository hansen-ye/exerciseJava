package binarySearch;

// 分治法，概念如字面上的意義，將問題先切分成小問題後再解決，再將結果合併求出原始問題的答案
public class DivideAndConquer {
    static public int Search(int[] array, int num)
    {
        return Search(array, num, 0, array.length - 1);
    }
 
    static public int Search(int[] array, int num, int left, int right)
    {
        if (left > right)
            return -1;
 
        int middle = (right + left) / 2;
 
        if (array[middle] == num)
            return middle;
 
        if (array[middle] > num)
            return Search(array, num, left, middle - 1);
 
        return Search(array, num, middle + 1, right);
    }
}