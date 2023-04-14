package com.heima.test;

import java.util.Objects;

public class Role {
    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

    // 攻击描述
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    // 受伤描述
    String[] injured_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    private String name;
    private int hp;
    private String gender;
    private String appearance;

    // 空参构造函数
    public Role() {
    }

    // 全参构造函数
    public Role(String name, int hp, String gender) {
        this.name = name;
        this.hp = hp;
        this.gender = gender;
        if (Objects.equals(this.gender, "男")) {
            this.appearance = getRandomElement(boyfaces);
        } else {
            this.appearance = getRandomElement(girlfaces);
        }
    }

    // 随机获取数组中的元素
    public static String getRandomElement(String[] arr) {
        // 随机获取数组中的索引
        int index = (int) (Math.random() * arr.length);
        return arr[index];
    }

    // 攻击
    public void attack(Role r) {
        // r: 被攻击的角色
        // this: 攻击的角色
        // 随机攻击力
        int attackValue = (int) (Math.random() * 10 + 1);
        r.setHp(r.getHp() - attackValue);
        // 随机攻击描述
        String attack_desc = getRandomElement(attacks_desc);
        System.out.printf((attack_desc) + "%n", this.name, r.name);
        // 随机受伤描述
        String injured_desc = getRandomElement(this.injured_desc);
        System.out.printf((injured_desc) + "%n", r.name);
        // 剩余血量
        System.out.println(r.name + "剩余血量:" + r.hp);
    }

    // 判断是否死亡
    public boolean isDead() {
        return this.hp <= 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }
}


