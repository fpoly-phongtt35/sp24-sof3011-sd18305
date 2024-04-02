package com.example.session.w4;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.io.IOException;
import java.util.List;

/**
 * @author PhongTT35
 * @description N/A
 **/
@WebServlet("/w4/product")
public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Session session = HibernateUtil.getSession();
        Query<Product> query = session.createQuery("SELECT p FROM Product p", Product.class);
        List<Product> products = query.getResultList();

        req.setAttribute("products", products);
        req.getRequestDispatcher("/WEB-INF/view/product.jsp").forward(req, resp);
    }
}
