package com.runoob.stringbuffer;

public class Test {
    public static void main(String[] args) {
        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        sBuffer.reverse();
        sBuffer.delete(14, 21);
        sBuffer.insert(14, new StringBuffer("网址为：").reverse());
        sBuffer.reverse();
        sBuffer.replace(0, 4, "");
        System.out.println(sBuffer);
        System.out.println(sBuffer.capacity());
        System.out.println(sBuffer.length());
    }
}
