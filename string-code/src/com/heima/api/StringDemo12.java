package com.heima.api;

import java.util.Scanner;

/**
 * @author asura
 */
public class StringDemo12 {
    public static void main(String[] args) {
        // 已知正确的用户名密码, 验证用户名密码是否正确, 总共3次机会
        String correctUsername = "admin";
        String correctPassword = "123456";

        int count = 3;
        Scanner scanner = new Scanner(System.in);
        while (count > 0) {
            System.out.print("请输入用户名: ");
            String username = scanner.nextLine();
            System.out.print("请输入密码: ");
            String password = scanner.nextLine();
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("登录成功!");
                break;
            } else {
                if (count == 1) {
                    System.out.println("登录失败, 3次机会已用完!");
                    break;
                } else {
                    System.out.println("用户名或密码错误, 还剩" + (count - 1) + "次机会!");
                    count--;
                }
            }
        }
    }
}
