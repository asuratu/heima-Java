package com.heima.test;

public class RoleTest {
    public static void main(String[] args) {
// 1. 选定角色
        Role r1 = new Role("张三", 100, "男");
        Role r2 = new Role("李四", 100, "女");

        // 2. 开始游戏
        while (true) {
            // 3. 交替攻击
            r1.attack(r2);
            r2.attack(r1);

            // 4. 判断是否结束
            if (r1.isDead()) {
                System.out.println(r1.getName() + "被击败了");
                break;
            }
            if (r2.isDead()) {
                System.out.println(r2.getName() + "被击败了");
                break;
            }
        }
    }
}
