package com.heima.a01staticdemo2;

/**
 * @ClassName ArrUtil
 * @Description com.heima.a01staticdemo1.ArrUtil
 * @Author AsuraTu
 * @Date 2023/4/17 16:56
 * @Version 1.0.0
 */
public class ArrUtil {
    // 需求：在实际开发中，经常会遇到一些数组使用的工具类。
    // 请按照如下要求编写一个数组的工具类：ArrUtil
    // 提供一个工具类方法printArr，用于返回整数数组的内容。
    // 返回的字符串格式如：[10, 20, 50, 34,100]（只考虑整数数组，且只考虑一维数组）
    // 提供这样一个工具方法getAerage，用于返回平均分。（只考虑浮点型数组，且只考虑一维数组）
    // 定义一个测试类TestDemo，调用该工具类的工具方法，并返回结果。

    // 1. 私有化构造方法，防止被实例化
    private ArrUtil() {
    }
 
    // 2. 定义一个工具类方法printArr，用于返回整数数组的内容。
    public static String printArr(int[] arr) {
        // 2.1 定义一个字符串，用于拼接数组中的元素
        StringBuilder str = new StringBuilder("[");
        // 2.2 遍历数组
        for (int i = 0; i < arr.length; i++) {
            // 2.3 判断是否是最后一个元素
            if (i == arr.length - 1) {
                str.append(arr[i]).append("]");
            } else {
                str.append(arr[i]).append(", ");
            }
        }
        // 2.4 返回字符串
        return str.toString();
    }

    // 3. 定义一个工具类方法 getAvg，用于返回平均分。（只考虑浮点型数组，且只考虑一维数组）
    public static double getAvg(double[] arr) {
        // 3.1 定义一个变量，用于存储数组中的元素之和
        double sum = 0;
        // 3.2 遍历数组
        for (double v : arr) {
            // 3.3 累加数组中的元素
            sum += v;
        }
        // 3.4 返回平均分
        return sum / arr.length;
    }
}
