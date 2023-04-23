package com.heima.ui;

import javax.swing.*;

/**
 * @ClassName Test2
 * @Description com.heima.ui.Test2
 * @Author AsuraTu
 * @Date 2023/4/23 15:03
 * @Version 1.0.0
 */
public class Test2 {
    public static void main(String[] args) {
        // 事件演示
        // 1. 创建窗体对象
        JFrame jf = new JFrame("事件演示");
        // 2. 设置窗体的大小
        jf.setSize(500, 500);
        // 3. 设置窗体的位置
        jf.setLocationRelativeTo(null);
        // 4. 设置窗体的关闭方式
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // 6. 创建按钮对象
        JButton jb = new JButton("按钮");
        // 按钮的大小
        jb.setSize(50, 50);
        // 按钮的位置
        jb.setBounds(100, 100, 50, 50);

        // 8. 为按钮添加事件
        jb.addActionListener(e -> System.out.println("按钮被点击了"));

        // 7. 将按钮添加到窗体中
        jf.getContentPane().add(jb);

        // 5. 设置窗体的可见性
        jf.setVisible(true);
    }
}
