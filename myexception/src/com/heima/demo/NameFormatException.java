package com.heima.demo;

/**
 * @ClassName NameFormatException
 * @Description 自定义异常
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class NameFormatException extends RuntimeException {
    // 自定义的异常类
    // 命名: 异常类名+Exception

    // 空参构造函数
    public NameFormatException() {
    }

    // 带参构造函数
    public NameFormatException(String message) {
        super(message);
    }
}
