public class VariableDemo2 {
    public static void main(String[] args) {
        // 基本数据类型
        // 整数类型
        // byte 1字节 -128~127
        byte b = 10;
        System.out.printf("byte:\t%d%n", b);
        // short 2字节 -32768~32767
        short s = 10;
        System.out.printf("short:\t%d%n", s);
        // int 4字节 -2147483648~2147483647
        int i = 10;
        System.out.printf("int:\t%d%n", i);
        // long 8字节 -9223372036854775808~9223372036854775807
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

    }
}