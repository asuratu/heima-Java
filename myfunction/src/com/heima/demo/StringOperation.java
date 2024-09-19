package com.heima.demo;

/**
 * @ClassName StringOperation
 * @Description StringOperation
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class StringOperation {
    public Boolean stringJudge(String str) {
        return str.startsWith("张") && str.length() == 3;
    }
}
