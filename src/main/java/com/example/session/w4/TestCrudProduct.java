package com.example.session.w4;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author PhongTT35
 * @description N/A
 **/
public class TestCrudProduct {

    public static void main(String[] args) {
        // Get All
//        for(Product product : getAll()) {
//            System.out.println(product.getProductId() + " " + product.getProductName());
//        }

        // Find By Name
//        for(Product product : getByName("Rush")) {
//            System.out.println(product.getProductId() + " " + product.getProductName());
//        }

//        // Find By Quantity
//        for(Product product : getByQuantity(50, 100)) {
//            System.out.println(product.getProductName() + " " + product.getQuantity());
//        }

//        Product newProduct = new Product();
//        newProduct.setProductName("Ahehe");
//        newProduct.setPrice(BigDecimal.valueOf(94324));
//        newProduct.setQuantity(74);
//        add(newProduct);

//        Product updateProduct = new Product();
//        updateProduct.setProductId(5018);
//        updateProduct.setProductName("Ahee Updated");
//        updateProduct.setQuantity(80);
//        updateProduct.setPrice(BigDecimal.valueOf(32324));
//        update(updateProduct);

        Product deleteProduct = new Product();
        deleteProduct.setProductId(5018);
        delete(deleteProduct);
    }

    private static void delete(Product product) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        session.delete(product); // Mặc định xóa theo Id
        transaction.commit();
    }

    private static void update(Product product) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        session.update(product); // Mặc định cập nhập theo Id
        transaction.commit();
    }

    private static void add(Product product) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        session.save(product);
        transaction.commit();
    }

    // Lấy danh sách sản phẩm theo khoảng số lượng
    private static List<Product> getByQuantity(Integer min, Integer max) {
        Session session = HibernateUtil.getSession();
        Query<Product> query = session.createQuery(
                "SELECT p FROM Product p WHERE p.quantity BETWEEN :min AND :max", Product.class);
        query.setParameter("min", min);
        query.setParameter("max", max);
        return query.getResultList();
    }

    // Lấy danh sách sản phẩm theo tên
    private static List<Product> getByName(String name) {
        Session session = HibernateUtil.getSession();
        Query<Product> query = session.createQuery(
                "SELECT p FROM Product p WHERE p.productName LIKE :name", Product.class);
        query.setParameter("name", "%" + name + "%");
        return query.getResultList();
    }

    // Lấy tất cả dữ liệu trong bảng sản phẩm
    private static List<Product> getAll() {
        Session session = HibernateUtil.getSession();
        Query<Product> query = session.createQuery("SELECT p FROM Product p", Product.class);
        return query.getResultList();
    }


}
