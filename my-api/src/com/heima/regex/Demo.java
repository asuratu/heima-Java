package com.heima.regex;

/**
 * @ClassName Demo
 * @Description com.heima.regex.Demo
 * @Author AsuraTu
 * @Date 2023/4/25 16:22
 * @Version 1.0.0
 */
public class Demo {
    public static void main(String[] args) {
        // [abc] 只能是a,b，或c
        // [^abc] 除了a,b，c之外的任何宇符
        // [a-zA-z] a到z A到Z，包括（范围）
        // [a-d[m-p]] a到d或m到p（并集）
        // [a-z&&[def]] a-z和d,e,f的交集（交集）
        // [a-z&&[^bc]] a到z，除了b和c（减去）
        // [a-z&&[^m-p]] a到z，而不是m到p（减去）

        // . 任何字符（与行结束符可能匹配也可能不匹配）
        // \d 数字：[0-9]
        // \D 非数字：[^\d]
        // \s 空白字符：[ \t\n\x0B\f\r]
        // \S 非空白字符：[^\s]
        // \w 单词字符：[a-zA-Z_0-9]
        // \W 非单词字符：[^\w]
        // ? 重复0次或1次
        // * 重复0次或多次
        // + 重复1次或多次
        // {n} 重复n次
        // {n,} 重复n次或更多次
        // {n,m} 重复n到m次
        // x|y x或y
        // ( ) 标记一个子表达式的开始和结束位置
        // \ 转义符


        // 1. 规则:  6 - 20 位数字, 且 0 不能开头
        String qq = "123456789";
        String regex = "^[1-9]\\d{5,19}$";
        System.out.println(qq.matches(regex));

        // 2. 规则: 6 - 20 位字符, 不能以数字0开头, 且只能包含数字和字母
        String qq2 = "a1234";
        String regex2 = "^[1-9a-zA-Z][0-9a-zA-Z]{5,19}$";
        System.out.println(qq2.matches(regex2));

        // 3. 规则: 6 - 20 位字符, 必须以非abc的字母开头
        String qq3 = "a1234";
        String regex3 = "^[^abc][0-9a-zA-Z]{5,19}$";
        System.out.println(qq3.matches(regex3));

        // 4. 24小时制时间 00:00:00 - 23:59:59
        String time = "13:59:59";
        String regex4 = "^([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d$";
        System.out.println(time.matches(regex4));

        // 5. 规则: 4 - 16位字符, 大小写字母, 数字, 下划线, 不能以数字开头
        String username = "a1234";
        String regex5 = "^[a-zA-Z_][0-9a-zA-Z_]{3,15}$";
        System.out.println(username.matches(regex5));

        // 6. 规则: 二代身份证号
        String id = "11010119900307771X";
        String regex6 = "^[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}[0-9Xx]$";
        System.out.println(id.matches(regex6));


    }
}
