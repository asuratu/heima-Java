package com.heima.newdate;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @ClassName A01_ZoneDateTimeDemo
 * @Description com.heima.newdate.A01_ZoneDateTimeDemo
 * @Author AsuraTu
 * @Date 2023/4/26 15:28
 * @Version 1.0.0
 */
public class A01_ZoneDateTimeDemo {
    public static void main(String[] args) {
        // static ZoneDateTime now() 获取当前时间的 ZoneDateTime 对象
        // static ZoneDateTime ofXXX() 获取指定时间的 ZoneDateTime 对象
        // ZoneDateTime withXXX(时间) 修改时间系列的方法
        // ZoneDateTime minisXXX(时间) 减少时间系列的方法
        // ZoneDateTime plusXXX(时间) 增加时间系列的方法

        // 细节: ZoneDateTime 是不可变类, 所有的修改时间的方法都会返回一个新的 ZoneDateTime 对象

        // 1. 获取当前时间对象 (带时区)
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        System.out.println("==================================");

        // 2. 获取指定时间对象 (带时区)
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(2020, 10, 1, 12, 0, 0, 0, ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime1);

        System.out.println("==================================");

        // 3. 修改时间
        ZonedDateTime zonedDateTime2 = zonedDateTime1.withYear(2021);
        System.out.println(zonedDateTime2);

        System.out.println("==================================");

        // 4. 减少时间
        ZonedDateTime zonedDateTime3 = zonedDateTime1.minusYears(2);
        System.out.println(zonedDateTime3);

        System.out.println("==================================");

        // 5. 增加时间
        ZonedDateTime zonedDateTime4 = zonedDateTime1.plusYears(2);
        System.out.println(zonedDateTime4);


    }
}
