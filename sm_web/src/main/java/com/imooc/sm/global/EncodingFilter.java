package com.imooc.sm.global;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author: dtvikey
 * @Date: 18-11-8 下午4:30
 * @Version 1.0
 */
public class EncodingFilter implements Filter {

    private String encoding="UTF-8";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        if (filterConfig.getInitParameter("ENCODING")!=null)
       encoding = filterConfig.getInitParameter("ENCODING");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        servletRequest.setCharacterEncoding(encoding);
        servletResponse.setCharacterEncoding(encoding);
        filterChain.doFilter(servletRequest,servletResponse);

    }

    @Override
    public void destroy() {
        encoding=null;
    }
}
