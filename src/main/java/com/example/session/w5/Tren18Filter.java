package com.example.session.w5;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

/**
 * @author PhongTT35
 * @description N/A
 **/
@WebFilter({"/w5/cua-chinh", "/w5/cua-hau"})
public class Tren18Filter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        // Lấy thông tin tuổi
        String tuoiStr = servletRequest.getParameter("age");
        Integer tuoi = Integer.valueOf(tuoiStr); // Chuyển sang kiểu số

        if (tuoi > 18) { // Nếu tuổi lớn hơn 18 thì CHO QUA
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            servletResponse.getWriter().append("<h1> DENY Young Buffalo!! </h1>");
        }
    }
}
