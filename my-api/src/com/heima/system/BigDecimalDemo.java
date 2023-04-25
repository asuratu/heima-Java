package com.heima.system;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @ClassName BigDecimalDemo
 * @Description com.heima.system.BigDecimalDemo
 * @Author AsuraTu
 * @Date 2023/4/25 15:48
 * @Version 1.0.0
 */
public class BigDecimalDemo {
    public static void main(String[] args) {
        // BigDecimal 类, 大小数类

        // 1. 用于表示超过 64 位的小数

        // 细节: 对象一旦创建，不可改变

        BigDecimal bd1 = new BigDecimal("0.09");
        BigDecimal bd2 = new BigDecimal("0.01");

        // 1. add() 方法, 两个大数相加
        System.out.println(bd1.add(bd2));

        // 2. subtract() 方法, 两个大数相减
        System.out.println(bd1.subtract(bd2));

        // 3. multiply() 方法, 两个大数相乘
        System.out.println(bd1.multiply(bd2));

        // 4. divide() 方法, 两个大数相除
        // 4.1. 如果除不尽, 会抛出异常
        // System.out.println(bd1.divide(bd2));
        // 4.2. 如果除不尽, 可以指定保留小数的位数, 以及舍入模式
        System.out.println(bd1.divide(bd2, 2, RoundingMode.HALF_UP));

        // 5. compareTo() 方法, 比较两个大数的大小, 返回值为 int 类型, 0 表示相等, 1 表示大于, -1 表示小于
        System.out.println(bd1.compareTo(bd2)); // 1
        System.out.println(bd1.compareTo(new BigDecimal("0.1"))); // 0

        // 6. equals() 方法, 判断两个大数是否相等
        System.out.println(bd1.equals(new BigDecimal("0.09"))); // true

        // 7. valueOf() 方法, 将基本数据类型转换为大数
        // 如果传递的是 0 - 10 之间的整数, 直接返回缓存中的对象
        BigDecimal bd3 = BigDecimal.valueOf(0.09);
        System.out.println(bd3); // 0.09


    }
}
