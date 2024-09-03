public class ValueDemo1 {
    public static void main(String[] args) {
        // 字符串类型
        String str = "Hello World";
        System.out.println(str);

        // 字符类型
        char ch = 'a';
        System.out.println(ch);

        // 整数类型
        byte b = 10; // 1个字节
        short s = 20; // 2个字节
        int i = 30; // 4个字节
        long l = 40L;  // 8个字节
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        // 浮点类型
        float f = 3.14F;
        double d = 3.14;
        System.out.println(f);
        System.out.println(d);

        // float
        // 32位（4字节）存储
        // 32位（4字节）存储。
        // 有效数字大约为7位小数。
        // 适用于内存有限且对精度要求不高的场景。


        // double
        // 64位（8字节）存储
        // 有效数字大约为15位小数。
        // Java 默认将带小数点的数值视为 double 类型，所以定义 double 类型的常量时，不需要加任何后缀。
        // 适用于对精度要求较高的场景。

        // 布尔类型
        boolean flag = true;
        System.out.println(flag);

        // 空类型
        // null 是一个关键字, 代表空, 只能赋值给引用类型
        String nullStr = null;
        System.out.println(nullStr);

    }

}