package com.heima.practice;

public class Test6 {
    public static void main(String[] args) {
        // 数字加密
        // 需求：
        // 某系统的数字密码（大于0），比如1983，采用加密方式进行传输。
        // 规则如下：
        // 先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数。

        // 1. 输入一个数字
        System.out.println("请输入一个数字:");
        int num = new java.util.Scanner(System.in).nextInt();

        // 2. 将数字转换为字符串
        String str = String.valueOf(num);

        // 3. 将字符串转换为字符数组
        char[] chs = str.toCharArray();

        // 4. 遍历字符数组
        for (int i = 0; i < chs.length; i++) {
            // 5. 将字符转换为数字
            int n = chs[i] - '0';
            // 6. 将数字加5
            n += 5;
            // 7. 对10求余
            n %= 10;
            // 8. 将数字转换为字符
            chs[i] = (char) (n + '0');
        }

        // 9. 将字符数组反转
        for (int i = 0; i < chs.length / 2; i++) {
            char temp = chs[i];
            chs[i] = chs[chs.length - 1 - i];
            chs[chs.length - 1 - i] = temp;
        }

        // 10. 将字符数组转换为字符串
        String newStr = new String(chs);

        // 11. 将字符串转换为数字
        int newNum = Integer.parseInt(newStr);

        // 12. 输出结果
        System.out.println("加密后的数字为:" + newNum);
    }
}
