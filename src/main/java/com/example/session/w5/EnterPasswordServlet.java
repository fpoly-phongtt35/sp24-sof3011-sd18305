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
@WebServlet("/w5/enter-password")
public class EnterPasswordServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String matKhau = (String) req.getSession().getAttribute("matKhau");

        if (matKhau == null || matKhau.isEmpty()) {
            resp.getWriter().append("<h1> Enter password here: </h1>")
                    .append("<form method='POST'>")
                    .append("<input type='text' name='password'/>")
                    .append("<input type='submit' value='Enter'/>")
                    .append("</form>")
            ;
        } else {
            resp.getWriter().append("<h1>")
                        .append("Your current password is: ").append(matKhau)
                    .append("</h1>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String matKhau = req.getParameter("password");
        // Lưu vào session
        req.getSession().setAttribute("matKhau", matKhau);
        resp.sendRedirect("/w5/enter-password"); // Chuyển trang
    }
}
