package com.heima.api;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // StringBuilder: 可变字符串
        // 1. 创建对象
        StringBuilder sb = new StringBuilder();
        // 2. 添加数据
        sb.append("abc");
        sb.append("def");
        sb.append("ghi");
        // 3. 转成字符串
        String s = sb.toString();
        System.out.println(s);
        // 4. 反转
        sb.reverse();
        // 因为 StringBuilder 是 Java 已经封装好了的类
        // Java 底层对它做了一些特殊处理
        // 所以, StringBuilder 的对象打印的时候, 不是地址值, 而是字符串
        System.out.println(sb);

        // 5. 长度
        System.out.println(sb.length());

        // 6. 删除
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
