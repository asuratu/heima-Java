package com.heima.mygenerics.test;

/**
 * @ClassName EnglishShortCat
 * @Description com.heima.mygenerics.test.EnglishShortCat
 * @Author AsuraTu
 * @Date 2023/5/10 10:13
 * @Version 1.0.0
 */
public class EnglishShortCat extends Cat {
    public EnglishShortCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做" + this.getName() + "的，" + this.getAge() + "岁的英短，正在吃小鱼干");
    }
}
