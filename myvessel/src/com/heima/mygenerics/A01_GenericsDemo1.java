package com.heima.mygenerics;

/**
 * @ClassName A01_GenericsDemo1
 * @Description com.heima.mygenerics.A01_GenericsDemo1
 * @Author AsuraTu
 * @Date 2023/5/9 11:13
 * @Version 1.0.0
 */
public class A01_GenericsDemo1 {
    public static void main(String[] args) {
        // 没有泛型的时候, 集合是如何存储数据
        // 结论:
        // 如果我们没有给集合指定类型, 那么集合中的类型就是Object类型
        // 此时集合中可以存储任意类型的数据
        // 坏处: 多态的缺点, 不能使用子类特有的方法

        // 使用泛型
        // 1. 指定泛型的类型
        // 2. 在集合中只能存储指定泛型类型的数据
        // 3. 泛型只能是引用类型, 不能是基本类型
        // 4. 泛型在编译的时候会被擦除, 编译之后集合中的泛型就不存在了
        // 5. 泛型是给编译器看的, 看完之后就会被擦除
 
        // java中的泛型是伪泛型, 只在编译阶段有效, 编译过程中会进行类型擦除
    }
}
