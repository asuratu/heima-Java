package com.heima.system;

import java.math.BigInteger;
import java.util.Random;

/**
 * @ClassName BigIntegerDemo
 * @Description com.heima.system.BigIntegerDemo
 * @Author AsuraTu
 * @Date 2023/4/25 14:57
 * @Version 1.0.0
 */
public class BigIntegerDemo {
    public static void main(String[] args) {
        // 二进制的第一个 1 代表正数，第一个 0 代表负数

        // BigInteger 类, 大整数类
        // 1. 用于表示超过 64 位的整数

        // 细节: 对象一旦创建，不可改变

        // 获取一个指定的大整数
        BigInteger bi1 = new BigInteger("123456789");
        System.out.println(bi1);
        // 获取一个随机的 BigInteger 对象
        BigInteger bi2 = new BigInteger(4, new Random()); // 0 到 2^4 - 1 之间的随机数
        System.out.println(bi2);
        // 获取一个指定进制的大整数
        BigInteger bi3 = new BigInteger("110", 2); // 2 进制的 110
        System.out.println(bi3);
        // valueOf() 方法, 获取一个指定的大整数
        // 1. 只能是 long 类型的取值范围, 如果超过 long 类型的取值范围, 会抛出异常
        // 2. 在内部对常用的数字, -16 到 16 之间的数字进行了缓存, 如果在这个范围内, 会直接从缓存中获取
        BigInteger bi4 = BigInteger.valueOf(123456789L);
        System.out.println(bi4);
        BigInteger bi5 = BigInteger.valueOf(16);
        BigInteger bi6 = BigInteger.valueOf(16);
        System.out.println(bi5 == bi6); // true

    }
}
