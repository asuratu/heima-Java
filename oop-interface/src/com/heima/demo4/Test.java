package com.heima.demo4;

/**
 * @ClassName Test
 * @Description com.heima.demo4.Test
 * @Author AsuraTu
 * @Date 2023/4/21 14:03
 * @Version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        // 接口中默认方法的定义格式
        // 格式：public default 返回值类型 方法名(参数列表）{}
        // 接口中默认方法的注意事项
        // 1.默认方法不是抽象方法，所以不强制被重写。但是如果被重写，重写的时候去掉default关键字
        // 2.public可以省略，default不能省略
        // 3.如果实现了多个接口，多个接口中存在相同名字的默认方法，子类就必须对该方法进行重写

        Demo d = new Demo();
        d.method();
        d.show(); // 可以直接调用接口中的默认方法

    }
}
