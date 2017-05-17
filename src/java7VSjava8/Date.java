package java7VSjava8;

import java.sql.Timestamp;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Date {

	public static void main(String args[]) {
		Date java8tester = new Date();
		java8tester.testLocalDateTime();
	}

	public void testLocalDateTime() {

		// 獲取當前的日期時間
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("當前時間:" + currentTime);

		LocalDate date1 = currentTime.toLocalDate();
		System.out.println("date1:" + date1);
		
		//獲取當前的日期
		LocalDate currentDate = LocalDate.now();
		System.out.println("當前的日期:" + currentDate);
		
		// 獲取當前的時區日期時間
		ZonedDateTime currentZone = ZonedDateTime.now();
		System.out.println("當前時區 :" + currentZone); 
		
		// 獲取當前的時區日期時間轉int
//		LocalDateTime currentDateTime = LocalDateTime.now();
//		ZonedDateTime zonedCurrentDateTime  = currentDateTime.atZone(ZoneId.of("+8"));
//		Instant zonedCurrentInstant = ZonedDateTime.now().toInstant();
//		System.out.println("ooo:"+ zonedCurrentDateTime);
//		System.out.println("xxx:"+ zonedCurrentInstant);
		
		//時間戳記表示
		 long timestampInt = Instant.now().getEpochSecond();
		 System.out.println("時間戳記表示 int:" + timestampInt );
		 Instant timestamp = Instant.now();
		 System.out.println("時間戳記表示 :" + timestamp );
		 Timestamp sqlTimestamp = new Timestamp(System.currentTimeMillis()); 
		 System.out.println("時間戳記表示 sql:" + sqlTimestamp );
		
		 
		 
		Month month = currentTime.getMonth();
		int day = currentTime.getDayOfMonth();
		int seconds = currentTime.getSecond();

		System.out.println("月: " + month + ", 日: " + day + ", 秒: " + seconds);

		LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
		System.out.println("date2: " + date2);

		// 12 december 2014
		LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
		System.out.println("date3: " + date3);

		// 22 小時 15 分鐘
		LocalTime date4 = LocalTime.of(22, 15);
		System.out.println("date4: " + date4);

		// 解析字符串
		LocalTime date5 = LocalTime.parse("20:15:30");
		System.out.println("date5: " + date5);
		
		//捨棄分鐘小的單位
		LocalTime truncatedTime = LocalTime.now().truncatedTo(ChronoUnit.HOURS);
		System.out.println("捨棄分鐘小的時間單位: " + truncatedTime);

	}
}