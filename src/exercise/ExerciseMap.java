package exercise;

public class ExerciseMap<E> {

	public static void main(String[] args) {

	}
}
// // MAP 初始化,10W次賦值
// Map<Integer, Integer> map = new HashMap<Integer, Integer>();
// for (int i = 0; i < 1000000; i++) {
// map.put(i, i);
// }
//
// /** 增強for循環，keySet */
// long start = System.currentTimeMillis();
// for (Integer key : map.keySet()) {
// map.get(key);
//
// }
// long end = System.currentTimeMillis();
// System.out.println("增強for循環，keySet迭代 -> " + (end - start) + " ms");
//
// /** 增強for循環，entrySet */
// start = System.currentTimeMillis();
// for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
// entry.getKey();
// entry.getValue();
// }
// end = System.currentTimeMillis();
// System.out.println("增強for循環，entrySet迭代 -> " + (end - start) + " ms");
// }

