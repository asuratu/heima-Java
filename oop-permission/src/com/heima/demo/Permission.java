package com.heima.demo;

/**
 * @ClassName permission
 * @Description com.heima.demo.permission
 * @Author AsuraTu
 * @Date 2023/4/19 13:44
 * @Version 1.0.0
 */
public class Permission {
    public static void main(String[] args) {
        // 权限范围: public > protected > (default) > private (由大到小)
        // public: 公共的, 任何地方都可以访问
        // protected: 受保护的, 同一个包中可以访问, 不同包中的子类可以访问
        // (default): 默认的, 同一个包中可以访问
        // private: 私有的, 只能在本类中访问
    }
}
