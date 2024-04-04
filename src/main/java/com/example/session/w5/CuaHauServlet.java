package com.example.session.w5;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author PhongTT35
 * @description N/A
 **/
@WebServlet("/w5/cua-hau")
public class CuaHauServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String laNhanVienStr = req.getParameter("isStaff");
        Boolean laNhanVien = Boolean.valueOf(laNhanVienStr);

        if (laNhanVien) {
            resp.getWriter().append("<h1> Hello, Staff </h1>");
        } else {
            resp.getWriter().append("<h1> Hello, Stranger </h1>");
        }
    }
}
