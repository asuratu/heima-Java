package com.heima.test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * @ClassName Test4
 * @Description com.heima.test.Test4
 * @Author AsuraTu
 * @Date 2023/4/27 09:48
 * @Version 1.0.0
 */
public class Test4 {
    public static void main(String[] args) {
        // 计算 1992-09-28 到今天 2021-04-27 一共有多少天

        // 1. 定义一个字符串
//        String s = "1992-09-28";
        String s = "2022-04-22";

        System.out.println(calculateDaysWithJDK7(s));

        System.out.println(calculateDaysWithJDK8(s));
    }

    private static int calculateDaysWithJDK8(String start) {
        // 获取 年月日
        String[] split = start.split("-");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);

        // 开始时间
        LocalDate startDate = LocalDate.of(year, month, day);
        // 结束时间
        LocalDate endDate = LocalDate.now();

        return (int) ChronoUnit.DAYS.between(startDate, endDate);
    }

    public static int calculateDaysWithJDK7(String start) {
        // 2. 将字符串转换为 milliseconds
        // 2.1 定义一个日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 2.2 调用 parse 方法
        Date startDate = null;
        // 2.3 获取时间戳
        try {
            startDate = sdf.parse(start);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 3. 获取时间戳
        long startTime = 0;

        if (startDate != null) {
            startTime = startDate.getTime();
        }

        return (int) ((System.currentTimeMillis() - startTime) / 1000 / 60 / 60 / 24);
    }

}
