package com.runoob.writing_filters;

import javax.servlet.*;
import java.io.IOException;

public class AuthenFilter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {
        String testParam = config.getInitParameter("test-param");
        System.out.println(testParam);
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        // 输出站点名称
        System.out.println("登陆用户：Chen");

        chain.doFilter(req, resp);
    }

    @Override
    public void destroy() {

    }
}
