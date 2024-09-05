package com.heima.process;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        // 输入一个数字
        System.out.println("请输入一个数字：");
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("输入的不是整数, 请重新输入。");
            sc.next();
        }
        int num = sc.nextInt();

        // java 不支持这种写法
//        switch  {
//            case num > 0 && num < 10:
//                System.out.println("输入的数字在0-10之间");
//                break;
//
//            case num >= 10 && num < 100:
//                System.out.println("输入的数字在10-100之间");
//                break;
//
//            case num >= 100 && num < 1000:
//                System.out.println("输入的数字在100-1000之间");
//                break;
//
//            default:
//                System.out.println("输入的数字不在0-1000之间");
//                break;
//        }

    }
}
