package com.example.session.w5;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

/**
 * @author PhongTT35
 * @description N/A
 **/
@WebFilter("/w5/cua-hau")
public class LaNhanVienFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        String laNhanVienStr = servletRequest.getParameter("isStaff");
        Boolean laNhanVien = Boolean.valueOf(laNhanVienStr);

        if (laNhanVien) { // Cho đi tiếp nếu là nhân viên
            filterChain.doFilter(servletRequest, servletResponse); // Pattern: Chain of Responsibility
        } else { // IN ra "FORBIDDEN, 403" nếu không phải là nhân viên
            servletResponse.getWriter().append("<h1> FORBIDDEN, 403 </h1>");
        }
    }
}
