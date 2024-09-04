package com.heima.arithmetic;

public class Test1 {
    // 键盘录入一个4位数，将其拆分为个位、十位、百位、千位，并输出
    public static void main(String[] args) {
        // 1. 创建一个扫描器对象，用于接收键盘输入
        java.util.Scanner sc = new java.util.Scanner(System.in);
        // 2. 提示用户输入一个4位数
        System.out.println("请输入一个4位数：");
        // 如果是整数，就接收, 如果不是整数，就报错
        while (!sc.hasNextInt()) {
            System.out.println("输入的不是整数, 请重新输入。");
            sc.next();
        }
        // 3. 接收用户输入的4位数
        int num = sc.nextInt();
        Test1.handle1(num);
    }

    public static void handle1(int num) {
        // 转成字符串, 然后拆分成字符
        String str = String.valueOf(num);
        char[] chars = str.toCharArray();
        // 5. 打印结果
        System.out.println("个位：" + chars[3]);
        System.out.println("十位：" + chars[2]);
        System.out.println("百位：" + chars[1]);
        System.out.println("千位：" + chars[0]);
    }

    public static void handle(int num) {
        // 4. 拆分4位数
        int ge = num % 10;
        int ten = num / 10 % 10;
        int hundred = num / 100 % 10;
        int thousand = num / 1000 % 10;
        // 5. 打印拆分后的结果
        System.out.println("个位：" + ge);
        System.out.println("十位：" + ten);
        System.out.println("百位：" + hundred);
        System.out.println("千位：" + thousand);
    }
}
