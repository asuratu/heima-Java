package com.heima.ui;

import javax.swing.*;

/**
 * @ClassName Test
 * @Description com.heima.ui.Test
 * @Author AsuraTu
 * @Date 2023/4/23 10:51
 * @Version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        // 1. 创建游戏主界面
        // 创建窗体对象
        JFrame gameJf = new JFrame("Game");
        // 设置窗体的大小
        gameJf.setSize(603, 680);
        gameJf.setLocation(630, 170);
        // 设置窗体的可见性, 默认为不可见
        gameJf.setVisible(true);

        // 2. 创建游戏登录面板
        // 创建面板对象
        JFrame loginJf = new JFrame("Login");
        // 设置窗体的大小
        loginJf.setSize(488, 430);
        // 设置窗体的位置
        loginJf.setLocation(690, 220);
        // 设置窗体的可见性, 默认为不可见
        loginJf.setVisible(true);

        // 3. 创建注册面板
        // 创建面板对象
        JFrame registerJf = new JFrame("Register");
        // 设置窗体的大小
        registerJf.setSize(488, 430);
        // 设置窗体的位置
        registerJf.setLocation(690, 220);
        // 设置窗体的可见性, 默认为不可见
        registerJf.setVisible(true);

    }
}
