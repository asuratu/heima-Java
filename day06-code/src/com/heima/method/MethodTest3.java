package com.heima.method;

public class MethodTest3 {
    public static void main(String[] args) {
        // 定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处
        int[] arr = {1, 2, 3, 4, 5};
        int num = 15;
        boolean exist = isExist(arr, num);
        System.out.println("exist = " + exist);
    }

    // 定义一个方法, 用来判断数组中的某一个数是否存在
    public static boolean isExist(int[] arr, int num) {
        // 1. 遍历数组
        for (int n : arr) {
            // 2. 判断元素是否等于num
            if (n == num) {
                // 3. 如果等于, 就返回true
                return true;
            }
        }
        // 4. 如果不等于, 就返回false
        return false;
    }
}
