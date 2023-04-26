package com.heima.newdate;

import java.time.LocalDate;

/**
 * @ClassName A03_LocalDateDemo
 * @Description com.heima.newdate.A03_LocalDateDemo
 * @Author AsuraTu
 * @Date 2023/4/26 16:06
 * @Version 1.0.0
 */
public class A03_LocalDateDemo {
    public static void main(String[] args) {
        // 3.1. LocalDate 类, 本地日期类
        // 3.1.1. 获取当前日期
        LocalDate now = LocalDate.now();
        System.out.println(now);

        System.out.println("==============");

        // 3.1.2. 获取指定日期
        LocalDate of = LocalDate.of(2021, 10, 1);
        System.out.println(of);

        System.out.println("==============");

        // 3.1.3. 获取日历中的年月日时分秒等信息
        int year = now.getYear(); // 年份
        System.out.println(year);
        int monthValue = now.getMonthValue(); // 月份
        System.out.println(monthValue);
        int dayOfMonth = now.getDayOfMonth(); // 一个月中的第几天
        System.out.println(dayOfMonth);
        int dayOfYear = now.getDayOfYear(); // 一年中的第几天
        System.out.println(dayOfYear);
        int dayOfWeek = now.getDayOfWeek().getValue(); // 一周中的第几天
        System.out.println(dayOfWeek);

        System.out.println("==============");

        // 3.1.4. isXXX() 判断时间先后
        boolean after = now.isAfter(of); // 判断当前时间是否在指定时间之后
        System.out.println(after);
        boolean before = now.isBefore(of); // 判断当前时间是否在指定时间之前
        System.out.println(before);

        System.out.println("==============");

        // 3.1.5. withXXX() 修改时间
        LocalDate localDate = now.withYear(2022); // 修改年份
        System.out.println(localDate);

        System.out.println("==============");

        // 3.1.6. plusXXX() 增加时间, minusXXX() 减少时间
        LocalDate localDate1 = now.plusYears(2); // 增加两年
        System.out.println(localDate1);
        LocalDate localDate2 = now.minusYears(2); // 减少两年
        System.out.println(localDate2);

    }
}
