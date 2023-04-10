package com.heima.method;

public class MethodDemo1 {
    public static void main(String[] args) {
        // 方法的概述
        // 方法: 就是完成某一具体功能的代码块
        // 方法的好处:
        // 1. 提高了代码的复用性
        // 2. 提高了代码的维护性
        // 3. 缩短了代码的编写时间
        // 4. 降低了代码的耦合性

        // 方法的定义格式:
        // 修饰符 返回值类型 方法名(参数类型 参数名1, 参数类型 参数名2, ...) {
        //     方法体;
        //     return 返回值;
        // }

        // 修饰符: 用来修饰方法的, 修饰符可以省略
        // 返回值类型: 方法执行完毕后, 返回值的数据类型
        // 方法名: 用来给方法起名字, 遵循标识符的规则, 且方法名的首字母小写, 后面每个单词的首字母大写
        // 参数类型: 方法执行时, 需要传递的数据的类型
        // 参数名: 方法执行时, 需要传递的数据的变量名
        // 参数列表: 方法执行时, 需要传递的数据的类型和变量名的集合
        // 方法体: 方法执行的具体代码
        // return: 用来结束方法的执行, 并且将结果返回给调用者
        // 返回值: 方法执行完毕后, 返回给调用者的数据


        // 方法的调用格式:
        // 1. 单独调用
        // 方法名(参数列表);
        // 2. 打印调用
        // System.out.println(方法名(参数列表));
        // 3. 赋值调用
        // 数据类型 变量名 = 方法名(参数列表);

        // 调用方法
        System.out.println(getSum(10, 20));

    }

    // 定义一个方法, 用来获取两个整数的和
    public static int getSum(int a, int b) {
        // 方法体
        return a + b;
    }


}
