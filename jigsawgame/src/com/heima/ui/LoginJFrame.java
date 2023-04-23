package com.heima.ui;

import javax.swing.*;

/**
 * @ClassName LoginJFrame
 * @Description 登录界面
 * @Author AsuraTu
 * @Date 2023/4/23 11:12
 * @Version 1.0.0
 */
public class LoginJFrame extends JFrame {
    public LoginJFrame() {
        // 设置窗体的标题
        this.setTitle("登录拼图游戏");
        // 设置窗体的大小
        this.setSize(488, 500);
        // 设置窗体的位置
        this.setLocationRelativeTo(null);
        // 设置窗体的关闭方式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗体的可见性
        this.setVisible(true);
    }
}
