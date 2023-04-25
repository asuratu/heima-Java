package com.heima.calendar;

import java.util.Calendar;

/**
 * @ClassName demo
 * @Description com.heima.calendar.demo
 * @Author AsuraTu
 * @Date 2023/4/25 17:46
 * @Version 1.0.0
 */
public class demo {
    public static void main(String[] args) {
        // 1. 获取日历对象
        // Calendar 是一个抽象类, 无法直接创建对象. 使用 getInstance() 方法获取日历对象
        Calendar calendar = Calendar.getInstance();

        // 1.1 set() 方法, 设置日历对象
        calendar.add(Calendar.MONTH, 13); // 13 个月以后的日期

        // 2. 获取年
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);

        // 3. 获取月
        // 月份是从 0 开始的, 所以需要加 1
        int month = calendar.get(Calendar.MONTH) + 1;
        System.out.println(month);

        // 4. 获取日
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        // 5. 获取小时
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println(hour);

        // 6. 获取分钟
        int minute = calendar.get(Calendar.MINUTE);
        System.out.println(minute);

        // 7. 获取秒
        int second = calendar.get(Calendar.SECOND);
        System.out.println(second);

        // 8. 获取星期
        // 星期是从 1 开始的, 所以需要减 1
        int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.println(week);

        // 9. 获取当前时间是一年中的第几周
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR) + 1;
        System.out.println(weekOfYear);

        // 9. 获取一个月以后的日期
        calendar.add(Calendar.MONTH, 1);
        System.out.println(calendar.get(Calendar.YEAR) + "年" + (calendar.get(Calendar.MONTH) + 1) + "月" + calendar.get(Calendar.DAY_OF_MONTH) + "日");


    }
}
