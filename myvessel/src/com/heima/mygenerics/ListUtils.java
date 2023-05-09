package com.heima.mygenerics;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName ListUtils
 * @Description com.heima.mygenerics.ListUtils
 * @Author AsuraTu
 * @Date 2023/5/9 15:06
 * @Version 1.0.0
 */
public class ListUtils {
    // 私有化构造方法, 不能创建对象
    private ListUtils() {
    }

    // 类中定义一个静态方法, 用来添加多个集合元素
    @SafeVarargs // 压制警告
    public static <T> void addAll(ArrayList<T> list, T... ts) {
        Collections.addAll(list, ts);
    }
}
