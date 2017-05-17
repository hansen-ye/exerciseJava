package exercise;
/**
 * 陣列轉型String[]->Integer[]
 * @author hansen.sen
 *
 */
public class ArrayStringToIntArray {

	public static void main(String[] args) {
		String[] s =  {"5","6","7"};
		System.out.println(arrayStringToIntArray(s));
		
	}

	private static Integer[]  arrayStringToIntArray(String[] arrayString) {
		    Integer[] intarray = new Integer[arrayString.length];
		    int i = 0;
		    for (String str : arrayString) {
		      try {
		        intarray[i] = Integer.parseInt(str.trim());
		        i++;
		      } catch (NumberFormatException e) {
		        throw new IllegalArgumentException("Not a number: " + str + " at index " + i, e);
		      }
		    }
		    return intarray;
		  }
}
