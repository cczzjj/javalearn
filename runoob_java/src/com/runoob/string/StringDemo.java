package com.runoob.string;

public class StringDemo {
    public static void main(String args[]) {
        char[] helloArray = {'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray);
        System.out.println(helloString);

        String site = "www.runoob.com";
        int len = site.length();
        System.out.println("菜鸟教程网址长度 : " + len);

        System.out.println("我的名字是 ".concat("Runoob"));

        String string1 = "菜鸟教程网址：";
        System.out.println("1、" + string1 + "www.runoob.com");

        System.out.printf("浮点型变量的值为 " +
                "%f, 整型变量的值为 " +
                " %d, 字符串变量的值为 " +
                "is %s\n", 0.1f, 1, "chen");
        System.out.println(String.format("浮点型变量的值为 " +
                "%f, 整型变量的值为 " +
                " %d, 字符串变量的值为 " +
                "is %s", 0.1f, 1, "chen"));
    }
}
