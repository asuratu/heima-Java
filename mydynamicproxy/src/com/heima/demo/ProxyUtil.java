package com.heima.demo;

/**
 * @ClassName ProxyUtil
 * @Description 代理类
 * @Author AsuraTu
 * @Date 2024/9/20
 */
public class ProxyUtil {
    public static StarInterface getProxy(Star star) {
        return (StarInterface) java.lang.reflect.Proxy.newProxyInstance(star.getClass().getClassLoader(), star.getClass().getInterfaces(), (_, method, args) -> {
            System.out.println("before invoke");
            Object result = method.invoke(star, args);
            // result 是方法的返回值
            System.out.printf("方法的返回值：%s\n", result);
            System.out.println("after invoke");
            return result;
        });
    }
}
