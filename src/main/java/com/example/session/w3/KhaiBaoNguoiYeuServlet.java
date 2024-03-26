package com.example.session.w3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author PhongTT35
 * @description N/A
 **/
@WebServlet("/khai-bao-nguoi-yeu")
public class KhaiBaoNguoiYeuServlet extends HttpServlet {

    private NguoiYeuRepository repository = new NguoiYeuRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        NguoiYeu ny = repository.getNguoiYeu(id);
        if (ny != null) {
            req.setAttribute("nguoiYeu", ny);
        }

        req.setAttribute("dsTinhThanh", TinhThanh.values());
        req.getRequestDispatcher("/WEB-INF/view/tao-nguoi-yeu.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        NguoiYeu nguoiYeu = new NguoiYeu();

        String hoTen = req.getParameter("hoTen"); nguoiYeu.setHoTen(hoTen);

        String sinhNhatStr = req.getParameter("sinhNhat");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date sinhNhat = sdf.parse(sinhNhatStr);
            nguoiYeu.setSinhNhat(sinhNhat);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String canNangStr = req.getParameter("canNang");
        Integer canNang = Integer.valueOf(canNangStr); nguoiYeu.setCanNang(canNang);

        String chieuCaoStr = req.getParameter("chieuCao");
        Float chieuCao = Float.valueOf(chieuCaoStr); nguoiYeu.setChieuCao(chieuCao);

        String gioiTinhStr = req.getParameter("gioiTinh");
        Boolean gioiTinh = "Nam".equals(gioiTinhStr); nguoiYeu.setGioiTinh(gioiTinh);

        String queQuanStr = req.getParameter("queQuan");
        TinhThanh queQuan = TinhThanh.valueOf(queQuanStr); nguoiYeu.setQueQuan(queQuan);

        // Thêm người yêu mới vào CSDL
        repository.addNguoiYeu(nguoiYeu);

        // Chuyển trang về xem danh sách
        resp.sendRedirect("/nguoi-yeu");
    }
}
