public class VariableDemo1 {
    // 只能存一个值
    // 变量名不允许重复定义
    // 一条语句可以定义多个变量
    // 变量在使用之前一定要进行赋值
    // 变量的作用域范围

    public static void main(String[] args) {
        // 定义变量
        // 数据类型 变量名 = 初始值;
        int i = 10;
        System.out.println(i);

        // 变量的使用
        int j = 30;
        System.out.println(j + i);

        // 在一条语句中, 可以定义多个变量
        int a = 10, b = 20, c = 30;
        System.out.println(a + b + c);

        
    }
}