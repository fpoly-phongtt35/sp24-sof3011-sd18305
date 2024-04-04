package com.example.session.w5;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

/**
 * @author PhongTT35
 * @description N/A
 **/
@WebFilter("/w5/cua-chinh")
public class ContainKeywordFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        String password = (String) req.getSession().getAttribute("matKhau");

        if (password == null || password.isEmpty()
                || !password.contains("sof3011")) {
            servletResponse.getWriter().append("<h1> Not correct password </h1>");
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }
}
