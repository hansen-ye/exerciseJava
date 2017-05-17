package exercise;

import java.util.*;

/**
 * 取明天時間(時間點可自行定義)
 * 
 * @author hansen.sen
 *
 */
public class NextDay {
	public static void main(String[] args) {

		// today
		Calendar date = getNextDay();
		System.out.println(date.getTime());
	}

	private static Calendar getNextDay() {
		Calendar date = new GregorianCalendar();
		// reset hour, minutes, seconds and millis
		date.set(Calendar.HOUR_OF_DAY, 0);
		date.set(Calendar.MINUTE, 0);
		date.set(Calendar.SECOND, 0);
		date.set(Calendar.MILLISECOND, 0);

		// next day
		date.add(Calendar.DAY_OF_MONTH, 1);
		return date;

	}

}
