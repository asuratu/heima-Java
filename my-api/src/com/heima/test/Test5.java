package com.heima.test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName Test5
 * @Description com.heima.test.Test5
 * @Author AsuraTu
 * @Date 2023/4/27 10:30
 * @Version 1.0.0
 */
public class Test5 {
    public static void main(String[] args) {
        // 判断 2000年 是闰年还是平年

        int year = 1904;

        // JDK7 的方式
        System.out.println(isLeapYearWithJDK7(year));

        // JDK8 的方式
        System.out.println(isLeapYearWithJDK8(year));

    }

    public static boolean isLeapYearWithJDK8(int year) {
        // 使用 JDK8 的方式
        // 1. 定义一个时间对象
        LocalDate localDate = LocalDate.of(year, 3, 1);

        // 2. 减去一天
        localDate = localDate.minusDays(1);

        // 3. 获取天数
        int day = localDate.getDayOfMonth();

        return day == 29;
    }

    public static boolean isLeapYearWithJDK7(int i) {
        // 将时间设置到 2000-03-01, 然后减去一天, 判断是 29 还是 28
        // 使用 Calendar 类

        Calendar calendar = Calendar.getInstance();
        calendar.set(i, Calendar.MARCH, 1);

        // 2. 减去一天
        calendar.add(Calendar.DAY_OF_MONTH, -1);

        // 3. 获取天数
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        return day == 29;
    }

    private static Date strToDate(String str) {
        // 5. 获取标准时间格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        try {
            date = "".equals(str) ? new Date() : sdf.parse(str);
            return date;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
