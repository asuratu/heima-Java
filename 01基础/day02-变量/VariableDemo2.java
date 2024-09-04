public class VariableDemo2 {
    public static void main(String[] args) {
        // 基本数据类型
        // 整数类型

        // byte 1字节 -128~127 2^8 = 256, 分为负数 -128 ~ -1 和 非负数 0 ~ 127
        // short 2字节 -32768~32767 2^16, 分为负数 -32768 ~ -1 和 非负数 0 ~ 32767
        // int 4字节 -2147483648~2147483647 2^32, 分为负数 -2147483648 ~ -1 和 非负数 0 ~ 2147483647
        // long 8字节 -9223372036854775808~9223372036854775807 2^64, 分为负数 -9223372036854775808 ~ -1 和 非负数 0 ~ 9223372036854775807

        // byte 1字节 -128~127 2^8
        byte b = 10;

        // Q: golang 中的 byte 是什么类型?
        // A: byte 是 uint8 的别名, 占用 1 个字节, 范围是 0~255

        System.out.printf("byte:\t%d%n", b);
        // short 2字节 -32768~32767 2^16
        short s = 10;
        System.out.printf("short:\t%d%n", s);
        // int 4字节 -2147483648~2147483647 2^32
        int i = 10;
        System.out.printf("int:\t%d%n", i);
        // long 8字节 -9223372036854775808~9223372036854775807 2^64
        long l = 10L; // L 表示后面的数字是long类型
        System.out.printf("long:\t%d%n", l);
        System.out.println("----------------------------");
        // 浮点类型
        // q: float 和 double 的区别
        // a: float 占用的内存空间小，精度低，double 占用的内存空间大，精度高
        // float 4字节
        float f = 10.0F; // F 表示后面的数字是float类型
        System.out.printf("float:\t\t%f%n", f);
        // double 8字节
        double d = 10.0;
        System.out.printf("double:\t\t%f%n", d);
        // 字符类型Sn5diphone6
        // char 2字节
        char c = '中';
        System.out.printf("char:\t\t%c%n", c);
        // 布尔类型
        // boolean 1字节
        boolean bool = true;
        System.out.printf("boolean:\t%b%n", bool);
        System.out.println("----------------------------");
        // 引用数据类型
        // 类
        // 接口
        // 数组
        
        // 整数和小数的取值范围
        // double > float > long > int > short > byte

    }
}
