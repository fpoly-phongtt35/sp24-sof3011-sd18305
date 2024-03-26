package com.example.session.w4;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/**
 * @author PhongTT35
 * @description N/A
 **/
public class TestLoadProduct {

    public static void main(String[] args) {
        // Mở phiên kết nối
        Session session = HibernateUtil.getSession();

        // Tạo truy vấn
        Query<Product> query = session.createQuery("SELECT p FROM Product p", Product.class);

        // Lấy kết quả truy vấn
        List<Product> products = query.getResultList();

        // Hiển thị kết quả truy vấn
        for(Product product : products) {
            System.out.println(product.getProductId() + " - " + product.getProductName());
        }
    }
}
