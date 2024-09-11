package com.heima.demo6;

/**
 * @ClassName ShariPei
 * @Description 沙皮狗
 * @Author AsuraTu
 * @Date 2024/9/11
 */
public class ShariPei extends Dog {
    public ShariPei() {
        // 这里默认有一个 super() 调用，所以不需要显式调用
        System.out.println("子类被创建");
    }

    @Override
    public void eat() {
        System.out.println("吃饭(吃狗粮, 吃骨头)");
    }
}
