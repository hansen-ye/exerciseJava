package java7VSjava8;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest2 {

	public static void main(String[] args) {
   	 List<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(13);
        list.add(30); 
        list.add(100);
      //java 8 的 lambda
        //removeIf會把Collection物件內所有符合條件的元素刪除，在這裡就是把奇數全部刪除。
        list.removeIf(e -> e % 2 != 0);
        System.out.println(list);
   
   }
}
