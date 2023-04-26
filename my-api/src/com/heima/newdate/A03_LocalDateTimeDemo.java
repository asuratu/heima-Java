package com.heima.newdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName A03_LocalDateTimeDemo
 * @Description com.heima.newdate.A03_LocalDateTimeDemo
 * @Author AsuraTu
 * @Date 2023/4/26 16:25
 * @Version 1.0.0
 */
public class A03_LocalDateTimeDemo {
    public static void main(String[] args) {
        // LocalDateTime 类 可以转成 LocalDate 和 LocalTime
        // 1. 获取当前日期时间
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // 2. 转换为 LocalDate
        LocalDate localDate = ldt.toLocalDate();
        System.out.println(localDate);

        // 3. 转换为 LocalTime
        LocalTime localTime = ldt.toLocalTime();
        System.out.println(localTime);

        // 4. 转换日期时间格式 yyyy-MM-dd HH:mm:ss
        String format = ldt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(format);

        System.out.println("====================================");

        // 判断今天是否是你的生日
        // 1. 获取当前日期
        LocalDate now = LocalDate.now();
        // 2. 获取你的生日
        LocalDate birthday = LocalDate.of(1999, 4, 26);

        // 3. 判断是否是你的生日 月份和日期相同
        if (now.getMonthValue() == birthday.getMonthValue() && now.getDayOfMonth() == birthday.getDayOfMonth()) {
            System.out.println("今天是你的生日");
        } else {
            System.out.println("今天不是你的生日");
        }

        // 3. 判断是否是你的生日: 月份和日期相同
        // 3.1. 获取月份和日期 MonthDay
        MonthDay monthDay = MonthDay.of(birthday.getMonth(), birthday.getDayOfMonth()); // 12月12日
        MonthDay monthDay1 = MonthDay.from(now); // 4月26日
        if (monthDay.equals(monthDay1)) {
            System.out.println("今天是你的生日");
        } else {
            System.out.println("今天不是你的生日");
        }

    }
}
