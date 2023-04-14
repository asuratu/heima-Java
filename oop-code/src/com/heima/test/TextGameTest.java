package com.heima.test;

public class TextGameTest {
    // 文字版格斗游戏
    // 格斗游戏，每个游戏角色的姓名，血量，都不相同，在选定人物的时候（new对象的时候），这些信息就应该被确定下来。

    public static void main(String[] args) {

        // 1. 选定角色
        TextGame r1 = new TextGame("张三", 100);
        TextGame r2 = new TextGame("李四", 100);

        // 2. 开始游戏
        while (true) {
            // 3. 交替攻击
            r1.attack(r2);
            r2.attack(r1);

            // 4. 判断是否结束
            if (r1.isDead()) {
                System.out.println(r1.getName() + "死了");
                break;
            }
            if (r2.isDead()) {
                System.out.println(r2.getName() + "死了");
                break;
            }
        }

    }
}
