package com.heima.mygenerics.test;

/**
 * @ClassName PersianCat
 * @Description com.heima.mygenerics.test.PersianCat
 * @Author AsuraTu
 * @Date 2023/5/9 16:57
 * @Version 1.0.0
 */
public class PersianCat extends Cat {
    public PersianCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做" + this.getName() + "的，" + this.getAge() + "岁的波斯猫，正在吃小饼干");
    }
}
