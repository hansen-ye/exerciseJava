package bubbleSorter;

import java.util.Comparator;

/** 
 * 
 * 排序器介面(策略模式: 將算法封裝到具有共同接口的獨立的類中使得它們可以相互替換) 
 * 
 */
public interface Sorter {
	/** * 排序 * @param list 待排序的數組 */
	public <T extends Comparable<T>> void sort(T[] list);

	/** * 排序 * @param list 待排序的數組 * @param comp 比較兩個對象的比較器 */
	public <T> void sort(T[] list, Comparator<T> comp);
}