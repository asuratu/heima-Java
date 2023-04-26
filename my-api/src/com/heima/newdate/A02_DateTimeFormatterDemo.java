package com.heima.newdate;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName A02_DateTimeFormatter
 * @Description com.heima.newdate.A02_DateTimeFormatter
 * @Author AsuraTu
 * @Date 2023/4/26 15:57
 * @Version 1.0.0
 */
public class A02_DateTimeFormatterDemo {
    public static void main(String[] args) {
        // 获取格式对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // 获取当前时间
//        ZonedDateTime zdt = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        ZonedDateTime zdt = ZonedDateTime.now();
        // 按照指定方式格式化时间
        String format = dateTimeFormatter.format(zdt);
        System.out.println(format);
    }
}
