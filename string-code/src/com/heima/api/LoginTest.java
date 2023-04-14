package com.heima.api;

import java.util.Scanner;

public class LoginTest {
    public static void main(String[] args) {
        // 用户登录
        // 需求：已知正确的用户名和密码，请用程序实现模拟用户登录。
        // 总共给三次机会，登录之后，给出相应提示

        // 1. 定义用户名和密码
        String username = "admin";
        String password = "123456";

        // 尝试次数
        int count = 3;

        while (count >= 1) {
            // 2. 键盘录入
            // 输入用户名
            System.out.println("请输入用户名");
            Scanner scName = new Scanner(System.in);
            String name = scName.nextLine();
            // 输入密码
            System.out.println("请输入密码");
            Scanner scPwd = new Scanner(System.in);
            String pwd = scPwd.nextLine();

            // 3. 判断
            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                count--;
                if (count > 0) {
                    System.out.println("登录失败, 还有" + count + "次机会");
                    continue;
                }
                System.out.println("登录失败, 请稍后再试");
            }
        }
    }
}
