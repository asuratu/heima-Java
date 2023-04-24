package com.heima.math;

/**
 * @ClassName MathDemo1
 * @Description com.heima.math.MathDemo1
 * @Author AsuraTu
 * @Date 2023/4/24 16:21
 * @Version 1.0.0
 */
public class MathDemo1 {
    public static void main(String[] args) {
// Math类的使用
        // 1. 获取绝对值
        System.out.println(Math.abs(-10)); // bug -2147483648 还是为 -2147483648
        System.out.println(Math.absExact(-10)); // JDK1.8
        // 2. 向上取整
        System.out.println(Math.ceil(3.14));
        // 3. 向下取整
        System.out.println(Math.floor(3.14));
        // 4. 四舍五入
        System.out.println(Math.round(3.14));
        // 5. 获取最大值
        System.out.println(Math.max(10, 20));
        // 6. 获取最小值
        System.out.println(Math.min(10, 20));
        // 7. 获取随机数
        System.out.println(Math.random());
        // 8. 获取随机数
        System.out.println(Math.random() * 100);
        // 9. 获取随机数
        System.out.println((int) (Math.random() * 100));
        // 10. 获取a的b次方
        System.out.println(Math.pow(2, 3));
        // 11. 获取平方根
        System.out.println(Math.sqrt(4));

    }
}
