package come.heima.arrayDemo;

import java.util.Arrays;

public class ArrayTest3 {
    public static void main(String[] args) {
        // 遍历数组得到每一个元素。
        //要求：
        //1，如果是奇数，则将当前数字扩大两倍, 并且将结果保存在当前元素中
        //2，如果是偶数，则将当前数字变成二分之一, 并且将结果保存在当前元素中

        // 定义一个数组
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            // 判断元素是否是奇数
            if (arr[i] % 2 != 0) {
                // 如果是奇数, 将当前数字扩大两倍, 并且将结果保存在当前元素中
                arr[i] *= 2;
            } else {
                // 如果是偶数, 将当前数字变成二分之一, 并且将结果保存在当前元素中
                arr[i] /= 2;
            }
        }

        System.out.println("arr = " + Arrays.toString(arr));

    }
}
