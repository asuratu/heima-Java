package com.heima.system;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @ClassName demo1
 * @Description com.heima.system.demo1
 * @Author AsuraTu
 * @Date 2023/4/24 17:46
 * @Version 1.0.0
 */
public class demo1 {
    public static void main(String[] args) {
        // exit 终止当前正在运行的Java虚拟机
        // 0 表示正常退出 非0表示非正常退出 一般使用0
//        System.exit(0);

        // 返回当前的时间戳毫秒值
        long current = System.currentTimeMillis();
        System.out.println(current);
        System.out.println(toDate(current));

        // 拷贝数组
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr.length];
        // 从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束
        // 参数1：源数组
        // 参数2：源数组的起始位置
        // 参数3：目标数组
        // 参数4：目标数组的起始位置
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        System.out.println(Arrays.toString(arr2));

        // 获取当前系统的环境变量
        System.out.println(System.getenv());

        // 获取当前系统的运行环境
        Runtime runtime = Runtime.getRuntime();
        // 获取当前系统的CPU核数
        System.out.println(runtime.availableProcessors());
    }

    public static String toDate(long time) {
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
}
