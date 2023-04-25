package com.heima;

import java.math.BigInteger;

/**
 * @ClassName BigIntegerDemo2
 * @Description com.heima.BigIntegerDemo2
 * @Author AsuraTu
 * @Date 2023/4/25 15:31
 * @Version 1.0.0
 */
public class BigIntegerDemo2 {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("135");
        BigInteger bi2 = new BigInteger("7");

        // 1. add() 方法, 两个大整数相加
        BigInteger bi3 = bi1.add(bi2);
        System.out.println(bi3);

        // 2. subtract() 方法, 两个大整数相减
        BigInteger bi4 = bi1.subtract(bi2);
        System.out.println(bi4);

        // 3. multiply() 方法, 两个大整数相乘
        BigInteger bi5 = bi1.multiply(bi2);
        System.out.println(bi5);

        // 4. divide() 方法, 两个大整数相除
        BigInteger bi6 = bi1.divide(bi2);
        System.out.println(bi6);

        // 5. remainder() 方法, 两个大整数相除, 返回余数
        BigInteger bi7 = bi1.remainder(bi2);
        System.out.println(bi7);

        // 6. divideAndRemainder() 方法, 两个大整数相除, 返回商和余数
        BigInteger[] bigIntegers = bi1.divideAndRemainder(bi2);
        System.out.println("商: " + bigIntegers[0] + ", 余数: " + bigIntegers[1]); // "商: 19, 余数: 2"

        // 7. mod() 方法, 两个大整数相除, 返回余数
        BigInteger bi8 = bi1.mod(bi2);
        System.out.println(bi8);

        // 8. pow() 方法, 两个大整数相乘, 返回幂运算后的结果
        BigInteger bi9 = bi1.pow(2);
        System.out.println(bi9);

        // 9. gcd() 方法, 两个大整数的最大公约数
        BigInteger bi10 = bi1.gcd(bi2);
        System.out.println(bi10);

        // 10. abs() 方法, 大整数的绝对值
        BigInteger bi11 = new BigInteger("-135");
        BigInteger bi12 = bi11.abs();
        System.out.println(bi12);

        // 11. equals() 方法, 判断两个大整数是否相等
        BigInteger bi13 = new BigInteger("135");
        BigInteger bi14 = new BigInteger("135");
        System.out.println(bi13.equals(bi14)); // true

        // 12. compareTo() 方法, 比较两个大整数的大小, 如果相等, 返回 0, 大于返回 1, 小于返回 -1
        System.out.println(bi1.compareTo(bi2)); // 1

        // 13. max() 方法, 返回两个大整数中的较大值
        System.out.println(bi1.max(bi2)); // 135
        System.out.println(bi2.max(bi1)); // 135

        // 14. min() 方法, 返回两个大整数中的较小值
        System.out.println(bi1.min(bi2)); // 7
        System.out.println(bi2.min(bi1)); // 7

        // 15. negate() 方法, 返回大整数的相反数
        System.out.println(bi1.negate()); // -135

        // 16. intValue() 方法, 将大整数转换为 int 类型, 如果大整数超过了 int 类型的取值范围, 会截取低 32 位
        System.out.println(bi1.intValue()); // 135
    }
}
