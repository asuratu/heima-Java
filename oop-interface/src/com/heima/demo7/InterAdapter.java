package com.heima.demo7;

/**
 * @ClassName InterAdapter
 * @Description com.heima.demo7.InterAdapter
 * @Author AsuraTu
 * @Date 2023/4/21 16:00
 * @Version 1.0.0
 */
public abstract class InterAdapter implements Inter {

    // 抽象类 InterAdapter 实现了 Inter 接口, 并重写了接口中的所有方法
    // 但是, 由于 InterAdapter 是抽象类, 所以 InterAdapter 的子类可以不重写所有方法
    // 从而实现了接口的适配器模式

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }

    abstract void method6();
}
