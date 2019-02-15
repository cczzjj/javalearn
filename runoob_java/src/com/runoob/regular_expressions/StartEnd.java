package com.runoob.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartEnd {
    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT =
            "cat cat cat cattie cat";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        Matcher m2 = p.matcher(INPUT); // 获取 matcher 对象
        int count = 0;

        while (m2.find()) {
            count++;
            System.out.println("Match com.runoob.number " + count);
            System.out.println("start(): " + m2.start());
            System.out.println("end(): " + m2.end());
        }
    }
}
