package com.heima.newdate;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @ClassName A02_InstantDemo
 * @Description com.heima.newdate.A02_InstantDemo
 * @Author AsuraTu
 * @Date 2023/4/26 14:37
 * @Version 1.0.0
 */
public class A02_InstantDemo {
    public static void main(String[] args) {
        // static Instant now()  获取当前时间的 Instant 对象 (标准时间)
        // static Instant ofXXX(long epochMilli)  获取指定(秒、毫秒、纳秒)值的 Instant 对象 (标准时间)
        // ZoneDateTime atZone(ZoneId zone)  获取指定时区的 ZoneDateTime 对象 (时区日期时间)
        // boolean isXXX(Instant otherInstant)  判断当前时间是否在指定时间之后
        // Instant minusXXX(long amountToSubtract)  在当前时间上减少指定的时间间隔
        // Instant plusXXX(long amountToAdd)  在当前时间上增加指定的时间间隔

        // 1.2. Instant 类, 时间戳类
        // 1.2.1. 获取当前的时间戳
        Instant now = Instant.now();
        System.out.println(now); // 2021-04-26T06:44:59.000Z

        System.out.println("------------------------");

        // 1.2.2. 获取指定的时间戳
        Instant instant = Instant.ofEpochMilli(1000L); // 1000毫秒
        System.out.println(instant);
        Instant instant1 = Instant.ofEpochSecond(1L); // 1秒
        System.out.println(instant1);
        Instant instant2 = Instant.ofEpochSecond(1L, 1000L); // 1秒 + 1000纳秒
        System.out.println(instant2);

        System.out.println("------------------------");

        // 1.2.3. 获取当前时间戳的毫秒值
        long epochMilli = Instant.now().toEpochMilli();
        System.out.println(epochMilli);

        System.out.println("------------------------");

        // 1.2.4. 获取当前时间戳的秒值
        long epochSecond = Instant.now().getEpochSecond();
        System.out.println(epochSecond);

        System.out.println("------------------------");

        // 1.2.5. 获取当前时间戳的纳秒值
        int nano = Instant.now().getNano();
        System.out.println(nano);

        System.out.println("------------------------");

        // 1.2.6. 指定时区
        ZonedDateTime zdt = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zdt);

        System.out.println("------------------------");

        // 1.2.7. 判断当前时间是否在指定时间之后或之前
        Instant instant3 = Instant.ofEpochMilli(1000L);
        boolean after = Instant.now().isAfter(instant3);
        System.out.println(after);
        boolean before = Instant.now().isBefore(instant3);
        System.out.println(before);

        System.out.println("------------------------");

        // 1.2.8. 在当前时间上减少或增加指定的时间间隔
        Instant instant4 = Instant.now().minusSeconds(3600L);
        System.out.println(instant4);
        Instant instant5 = Instant.now().plusSeconds(3600L);
        System.out.println(instant5);

        // UTC 是

    }
}
