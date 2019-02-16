package com.runoob.writing_filters;

import javax.servlet.*;
import java.io.IOException;

public class LogFilter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {
        String site = config.getInitParameter("Site");
        System.out.println("网站名称: " + site);
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        // 输出站点名称
        System.out.println("站点网址：http://www.runoob.com");

        // 把请求传回过滤链
        chain.doFilter(req, resp);
    }

    @Override
    public void destroy() {

    }
}
