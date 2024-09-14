package com.heima.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName demo
 * @Description com.heima.date.demo
 * @Author AsuraTu
 * @Date 2023/4/25 17:11
 * @Version 1.0.0
 */
public class demo {
    public static void main(String[] args) {
        // 1. 获取 Date 对象
        Date d1 = new Date();
        // Tue Apr 25 17:12:05 CST 2017
        System.out.println(d1);

        // 2. 获取指定时间的毫秒值
        // 表示从 1970 年 1 月 1 日 00:00:00 开始经过 0L 毫秒后的时间
        Date d2 = new Date(0L);
        long time = d2.getTime();
        // 1493138725000
        System.out.println(time);

        // 3. 获取时间原点之后一年的时间
        Date d3 = new Date(1000L * 60 * 60 * 24 * 365);
        // Wed Apr 25 17:12:05 CST 2018
        System.out.println(d3);

        // 4, 比较两个时间的先后, 返回 boolean 类型的值
        Date d4 = new Date(1000L * 60 * 60 * 24 * 365);
        // false
        System.out.println(d3.after(d4));
        // false
        System.out.println(d3.before(d4));
        // true
        System.out.println(d3.equals(d4));

        // 5. 获取标准时间格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(d1);
        // 2017-04-25 17:12:05
        System.out.println(s);

        // 6. 将字符串转换为 Date 对象
        String s1 = "2017-04-25 17:12:05";
        Date d5 = null;
        try {
            d5 = sdf.parse(s1);
            // Tue Apr 25 17:12:05 CST 2017
            System.out.println(d5);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 6.1 再转为 年月日 时分秒
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String s2 = sdf2.format(d5);
        // 2017年04月25日 17时12分05秒
        System.out.println(s2);

        //


    }
}
