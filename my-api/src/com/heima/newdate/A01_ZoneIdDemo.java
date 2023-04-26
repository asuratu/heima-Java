package com.heima.newdate;

import java.time.ZoneId;

/**
 * @ClassName A01_ZoneIdDemo
 * @Description com.heima.newdate.A01_ZoneIdDemo
 * @Author AsuraTu
 * @Date 2023/4/26 14:28
 * @Version 1.0.0
 */
public class A01_ZoneIdDemo {
    public static void main(String[] args) {
        // 1.1. ZoneId 类, 时区类
        // 1.1.1. 获取所有的时区
        // ZoneId.getAvailableZoneIds().forEach(System.out::println);
        // 1.1.2. 获取指定的时区
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        System.out.println(zoneId);
        // 1.1.3. 获取默认的时区
//        ZoneId zoneId = ZoneId.systemDefault();
//        System.out.println(zoneId);
    }
}
