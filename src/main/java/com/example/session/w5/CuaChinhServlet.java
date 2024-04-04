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
@WebServlet("/w5/cua-chinh")
public class CuaChinhServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().append("<h1> Welcome to Happy Restaurant!!! </h1>");

        String tuoiStr = req.getParameter("age");
        Integer tuoi = Integer.valueOf(tuoiStr);
        resp.getWriter().append("Your age is: " + tuoi);
    }
}
