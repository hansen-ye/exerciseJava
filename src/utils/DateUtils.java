package utils;

import java.text.SimpleDateFormat;   
import java.util.ArrayList;   
import java.util.Calendar;   
import java.util.Date;   
import java.util.List;   
import java.util.Locale;   
import java.util.TimeZone;   
  
/**  
 * @author: Frank  
 * @site: <a href="http://www.mingketang.com">名课堂企业管理培训网</a>  
 * @company: http://www.sellyell.com  
 * @blog: http://crazysheep.javaeye.com/  
 */  
public class DateUtils {   
  
    //http响应头Expire属性时间格式   
    public static final String HTTP_RESPONSE_DATE_HEADER = "EEE, dd MMM yyyy HH:mm:ss zzz";   
           
    //http响应头Expire属性时间格式工具   
    public static final SimpleDateFormat responseHeaderFormat = new SimpleDateFormat(HTTP_RESPONSE_DATE_HEADER,Locale.US);   
  
    static{   
        responseHeaderFormat.setTimeZone(TimeZone.getTimeZone("GMT"));   
    }   
       
    /**  
     * 某个时间点的下个月的第一天  
     * @param day  
     * @return  
     */  
    public static Date firstDayInNextMonth(Date day){   
        Calendar c = Calendar.getInstance();   
        c.setTime(day);   
        c.set(Calendar.MONTH, c.get(Calendar.MONTH)+1);   
        c.set(Calendar.DAY_OF_MONTH, 1);   
        c.set(Calendar.HOUR_OF_DAY, 0);   
        c.set(Calendar.MINUTE, 0);   
        c.set(Calendar.SECOND, 0);   
        return c.getTime();   
    }   
  
    /**  
     * 获取某天在星期中的排序值：  
     * 星期日 -> 星期六 对应为：1 -> 7  
     * @param date  
     * @return  
     */  
    public static int getDateInWeek(Date date) {   
        Calendar c = Calendar.getInstance();   
        c.setTime(date);   
        return c.get(Calendar.DAY_OF_WEEK);   
    }   
  
    /**  
     * 获取指定日期后n天的凌晨  
     * @param date  
     * @param n  
     * @return  
     */  
    public static Date getDateNextDay(Date date, int n) {   
        Calendar c = Calendar.getInstance();   
        c.setTime(date);   
        c.add(Calendar.DATE, n);   
        return c.getTime();   
    }   
       
    /**  
     * 获取下n个月后的日期  
     * @param n 月份偏移量  
     * @return  
     */  
    public static Date getDateNextMonth(int n) {   
        Calendar now = Calendar.getInstance();   
        now.set(Calendar.MONTH, now.get(Calendar.MONTH) + n);// 设置时间向前进n个月   
        now.set(Calendar.HOUR_OF_DAY, 0);   
        now.set(Calendar.MINUTE, 0);   
        now.set(Calendar.SECOND, 0);   
        return now.getTime();   
    }   
  
    /**  
     * 获取今天在本月中的号码  
     * @return  
     */  
    public static int getDateOfMoth() {   
        return Calendar.getInstance().get(Calendar.DAY_OF_MONTH);   
    }   
       
    /**  
     * 本月的所有日期集合  
     * @return  
     */  
    public static List<Date> getDatesInMonth() {   
  
        List<Date> dates = new ArrayList<Date>();   
  
        Calendar c = Calendar.getInstance();   
  
        // 设置代表的日期为1号   
        c.set(Calendar.DATE, 1);   
  
        // 获得当前月的最大日期数   
        int maxDay = c.getActualMaximum(Calendar.DATE);   
  
        for (int i = 1; i <= maxDay; i++) {   
            c.set(Calendar.DATE, i);   
            dates.add(c.getTime());   
        }   
  
        return dates;   
    }   
       
    /**  
     * 获取某个时间所在的月份  
     * @param date  
     * @return  
     */  
    public static int getMonth(Date date) {   
        Calendar c = Calendar.getInstance();   
        c.setTime(date);   
        return c.get(Calendar.MONTH) + 1;   
    }   
  
    /**  
     * 获取本月最后一天  
     * @return  
     */  
    public static Date getMonthEnd() {   
        int length = getDateOfMoth();   
        Calendar c = Calendar.getInstance();   
        c.set(Calendar.DATE, length);   
        c.set(Calendar.HOUR, 24);   
        c.set(Calendar.MINUTE, 0);   
        c.set(Calendar.SECOND, 0);   
        return c.getTime();   
    }   
  
    /**  
     * 获取某个时间所在月份的最后一秒  
     * @param date   
     * @return  
     */  
    public static Date getMonthEnd(Date date){   
        if(date == null){   
            return null;   
        }   
        Calendar start = Calendar.getInstance();   
        start.setTime(date);   
        start.set(Calendar.MONTH, start.get(Calendar.MONTH)+1);   
        start.set(Calendar.DAY_OF_MONTH, 1);   
        start.set(Calendar.HOUR, 0);   
        start.set(Calendar.MINUTE, 0);   
        start.set(Calendar.SECOND, 0);   
        return start.getTime();        
    }   
           
    /**  
     * 获取某个时间所在月份的第一天凌晨  
     * @param date   
     * @return  
     */  
    public static Date getMonthStart(Date date){   
        if(date == null){   
            return null;   
        }   
        Calendar start = Calendar.getInstance();   
        start.setTime(date);   
        start.set(Calendar.DAY_OF_MONTH, 1);   
        start.set(Calendar.HOUR, 0);   
        start.set(Calendar.MINUTE, 0);   
        start.set(Calendar.SECOND, 0);   
        return start.getTime();        
    }   
       
    /**  
     * 获取今天凌晨  
     * @return  
     */  
    public static Date getMorning() {   
        return getMorning(new Date());   
    }   
  
    /**  
     * 获取指定时间当天的凌晨  
     * @param date 给定时间当天的凌晨  
     * @return  
     */  
    public static Date getMorning(Date date) {   
        Calendar c = Calendar.getInstance();   
        c.setTime(date);   
        c.set(Calendar.HOUR_OF_DAY, 0);   
        c.set(Calendar.MINUTE, 0);   
        c.set(Calendar.SECOND, 0);   
        return c.getTime();   
    }   
  
    /**  
     * 获取当前时间N天后的凌晨  
     */  
    public static Date getMorningNextDate(int n) {   
        Calendar now = Calendar.getInstance();   
        now.set(Calendar.DATE, now.get(Calendar.DATE) + n); //设置时间向前进n天   
        now.set(Calendar.HOUR_OF_DAY, 0);   
        now.set(Calendar.MINUTE, 0);   
        now.set(Calendar.SECOND, 0);   
        return now.getTime();   
    }   
       
    /**  
     * 系统当前时间过N个月后的时间  
     * @param nextStep 月份偏移量  
     * @return  
     */  
    public static Date getNextMonth(int nextStep){   
        Calendar c = Calendar.getInstance();   
        int m = c.get(Calendar.MONTH);   
        c.set(Calendar.MONTH, m + nextStep);   
        return c.getTime();   
    }   
  
    /**  
     * 计算给定时间推进一个月对应的时间  
     * @param date 给定时间  
     * @return 某时间过一个月后所在的时间  
     */  
    public static Date getNextMonthToday(Date date){   
        Calendar c = Calendar.getInstance();   
        c.setTime(date);   
        c.set(Calendar.MONTH, c.get(Calendar.MONTH)+1);        
        return c.getTime();   
    }   
       
    /**  
     * 获取系统当前时间所在的年份  
     * @return  
     */  
    public static int getYear() {   
        return Calendar.getInstance().get(Calendar.YEAR);   
    }   
       
    /**  
     * 获取给定时间所在的年份  
     * @param date 时间  
     * @return 时间所在的年份  
     */  
    public static int getYear(Date date){   
        Calendar c = Calendar.getInstance();   
        c.setTime(date);   
        return c.get(Calendar.YEAR);   
    }   
  
    /**  
     * 获取某年分的最后一天结束的时间  
     * @param year 年份  
     * @return 指定年份的最后一天结束  
     */  
    public static Date getYearEnd(int year) {   
        Calendar c = Calendar.getInstance();   
        c.set(Calendar.YEAR, year);   
        c.set(Calendar.MONTH,Calendar.DECEMBER);   
        c.set(Calendar.DAY_OF_MONTH, 31);   
        c.set(Calendar.HOUR_OF_DAY, 23);   
        c.set(Calendar.MINUTE, 59);   
        c.set(Calendar.SECOND, 59);   
        return c.getTime();   
    }   
  
    /**  
     * 获取某年份的第一天凌晨  
     * @param year 年份  
     * @return 指定年份的第一天凌晨  
     */  
    public static Date getYearStart(int year) {   
        Calendar c = Calendar.getInstance();   
        c.set(Calendar.YEAR, year);   
        c.set(Calendar.MONTH, Calendar.JANUARY);   
        c.set(Calendar.DAY_OF_MONTH,1);   
        c.set(Calendar.HOUR_OF_DAY, 0);   
        c.set(Calendar.MINUTE, 0);   
        c.set(Calendar.SECOND, 0);   
        return c.getTime();   
    }   
}  