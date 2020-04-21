package demoobject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 * @ClassName DemoDate
 * @Description 日期练习类
 * @Author sq_lw
 * @Date 2020/4/11 23:44
 * @Version 1.0
 */
public class DemoDate {
    public static void main(String[] args) {
        fun01();
    }
    private static void fun01(){
        LocalDateTime localDate = LocalDateTime.now();
        //自定义格式化
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //String和LocalDateTime互转
        String s1 = localDate.format(dateTimeFormatter);
        LocalDateTime localDateTime2 = LocalDateTime.parse(s1,dateTimeFormatter);
        System.out.println(s1);
        //日历类
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar);
    }
}
