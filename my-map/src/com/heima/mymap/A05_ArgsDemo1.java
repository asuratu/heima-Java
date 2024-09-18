package com.heima.mymap;

/**
 * @ClassName A05_ArgsDemo1
 * @Description com.heima.mymap.A05_ArgsDemo1
 * @Author AsuraTu
 * @Date 2023/5/15 15:52
 * @Version 1.0.0
 */
public class A05_ArgsDemo1 {
    public static void main(String[] args) {
        // 可变参数
        // 作用：当调用这个方法的时候，传递的参数个数是可变的，可以是0个或者多个
        // 格式：数据类型...变量名

        // 细节:
        // 1. 一个方法的参数列表中，可变参数只能有一个
        // 2. 如果方法的参数有多个，那么可变参数必须写在参数列表的末尾

        // 定义一个方法，计算 n 个int类型数据的和
        // 定义一个数组
        int[] arr = {1, 2, 3, 4, 5};
//        int r = sum(1, 2, 3, 4, 5);
        int r = sum(arr);
        System.out.println(r);

        int r2 = sum();
        System.out.println(r2);

    }

    // 可变参数
    public static int sum(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

}
