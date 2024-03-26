package com.example.session.w4;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

/**
 * @author PhongTT35
 * @description N/A
 **/
@Entity
@Table(name = "Product")
public class Product {

    @Id
    @Column(name = "ProductId")
    private Integer productId;

    @Column(name = "ProductName")
    private String productName;

    @Column(name = "Price")
    private BigDecimal price;

    @Column(name = "Quantity")
    private Integer quantity;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
