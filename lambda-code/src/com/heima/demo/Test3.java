package com.heima.demo;

/**
 * @ClassName Test3
 * @Description com.heima.demo.Test3
 * @Author AsuraTu
 * @Date 2023/5/4 16:06
 * @Version 1.0.0
 */
public class Test3 {
    public static void main(String[] args) {
        // 有一个很有名的数学逻辑题叫做不死神兔问题，有一对兔子，从出生后第三个月起每个月都生一对兔子
        // 小免子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第十二个月的兔子对数为多少？

        // 1.定义一个数组，用来存储兔子的数量
        int[] arr = new int[12];
        // 2.定义一个循环，用来计算每个月兔子的数量
        for (int i = 0; i < arr.length; i++) {
            // 3.判断月份，如果是前两个月，兔子的数量是1
            if (i == 0 || i == 1) {
                arr[i] = 1;
            } else {
                // 4.如果是第三个月以后，兔子的数量是前两个月之和
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        // 5.打印最后一个月的兔子数量
        System.out.println("第十二个月的兔子数量是：" + arr[11]);
    }
}
