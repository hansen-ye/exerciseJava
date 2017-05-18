package exercise;

import java.util.Arrays;
import java.util.Collections;
/**
 * 一堆字串陣列 要先按開頭英文字母反向排列 之後如果開頭字母有重覆的 就順向排列
 */
public class StringSort {

	public static void main(String[] args) {
		String[] names = {"Aaaa","Accc","Abbb","Bxxx","Daaa","Dbbb","Zxxx"};
		for(String name:exercise(names)){
			System.out.println(name);
		}
	}
	private static void sort(String[] strings){
		//strings.length-1 : 因為會ArrayIndexOutOfBoundsException
		for(int i=0;i<strings.length-1;i++){
			//strings[i].charAt(0):取陣列第i筆=>strings[i]的字串的第一個值=>charAt(0)
			if(strings[i].charAt(0) == strings[i+1].charAt(0)){
				//compareTo : 返回的值是比較前後兩個字符串的asc碼的差值
				if(strings[i].compareTo(strings[i+1])>0){
					String temp = strings[i];
					strings[i] = strings[i+1];
					strings[i+1] = temp;
					sort(strings);
				}
			}
		}
	}
	private static String[] exercise(String[] names){
		//Arrays.sort蠻多好用的東西...建議去看API
		//先排第一個字
		Arrays.sort(names,Collections.reverseOrder());
		//上面的方法...後面的字兩兩比較做排列...
		sort(names);
		return names;
	}


}
