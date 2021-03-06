package com.runoob.first_example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorld extends HttpServlet {
    private String message;

    public void init() throws ServletException {
        // 执行必需的初始化
        message = "Hello World";
        System.out.println("HelloWorld新建了！");
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置响应内容类型
        resp.setContentType("text/html");

        // 实际的逻辑是在这里
        PrintWriter out = resp.getWriter();
        out.println("<h1>" + message + "</h1>");
    }

    public void destroy() {
        // 什么也不做
    }
}
