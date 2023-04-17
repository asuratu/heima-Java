package com.heima.a01staticdemo2;

/**
 * @ClassName ArrUtilTest
 * @Description com.heima.a01staticdemo1.ArrUtilTest
 * @Author AsuraTu
 * @Date 2023/4/17 16:56
 * @Version 1.0.0
 */
public class ArrUtilTest {
    public static void main(String[] args) {
        // 创建数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // 调用方法
        String str = ArrUtil.printArr(arr);
        System.out.println(str);

        // 创建数组 
        double[] arr2 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
        // 调用方法
        double avg = ArrUtil.getAvg(arr2);
        System.out.println(avg);
    }
}
