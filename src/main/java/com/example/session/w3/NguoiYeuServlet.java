package com.example.session.w3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

/**
 * @author PhongTT35
 * @description N/A
 **/
@WebServlet("/nguoi-yeu")
public class NguoiYeuServlet extends HttpServlet {

    private NguoiYeuRepository repository = new NguoiYeuRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        List<NguoiYeu> dsNguoiYeu;
        String keyword = req.getParameter("keyword");

        if (keyword == null || "".equals(keyword)) {
            dsNguoiYeu = repository.getDsNguoiYeu();
        } else {
            keyword = keyword.toLowerCase(Locale.ROOT);
            dsNguoiYeu = repository.searchNguoiYeu(keyword);
        }

        req.setAttribute("dsNguoiYeu", dsNguoiYeu);
        req.getRequestDispatcher("/WEB-INF/view/nguoi-yeu.jsp").forward(req,resp);
    }
}
