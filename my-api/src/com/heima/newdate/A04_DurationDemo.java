package com.heima.newdate;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @ClassName A04_DurationA04_Duration
 * @Description com.heima.newdate.A04_DurationA04_Duration
 * @Author AsuraTu
 * @Date 2023/4/26 17:00
 * @Version 1.0.0
 */
public class A04_DurationDemo {
    public static void main(String[] args) {
        // 4.1. Duration 类, 时间间隔类 (秒, 纳秒)
        // 4.2. Period 类, 日期间隔类 (年, 月, 日)
        // 4.3. ChronoUnit 类, 时间单位类 (秒, 纳秒, 年, 月, 日)

        // 开始时间
        LocalDateTime start = LocalDateTime.of(2020, 1, 1, 0, 0, 0);
        // 结束时间
        LocalDateTime end = LocalDateTime.now();

        // 4.1. Duration 类, 时间间隔类 (秒, 纳秒)
        Duration duration = Duration.between(start, end);
        System.out.println(duration.getSeconds());
        System.out.println(duration.getNano());

        System.out.println("====================================");

        // 4.2. Period 类, 日期间隔类 (年, 月, 日)
        Period period = Period.between(start.toLocalDate(), end.toLocalDate());
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println("====================================");

        // 4.3. ChronoUnit 类, 时间单位类 (秒, 纳秒, 年, 月, 日)
        System.out.println("年: " + ChronoUnit.YEARS.between(start, end));
        System.out.println("月: " + ChronoUnit.MONTHS.between(start, end));
        System.out.println("日: " + ChronoUnit.DAYS.between(start, end));
        System.out.println("时: " + ChronoUnit.HOURS.between(start, end));
        System.out.println("分: " + ChronoUnit.MINUTES.between(start, end));
        System.out.println("秒: " + ChronoUnit.SECONDS.between(start, end));
        System.out.println("纳秒: " + ChronoUnit.NANOS.between(start, end));

        // enum 关键字修饰的类, 表示枚举类


    }
}
