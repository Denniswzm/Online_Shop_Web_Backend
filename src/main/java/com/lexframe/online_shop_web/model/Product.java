package com.lexframe.online_shop_web.model;


import com.sun.xml.bind.v2.model.core.ID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String ProductName;
    private Integer Quantity;
    private Double Price;

    public Product(){

    }

    public Product(String productName, Integer quantity, Double price){
        this.ProductName = productName;
        this.Quantity = quantity;
        this.Price = price;

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(Id, product.Id) &&
                Objects.equals(ProductName, product.ProductName) &&
                Objects.equals(Quantity, product.Quantity) &&
                Objects.equals(Price, product.Price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, ProductName, Quantity, Price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "Id=" + Id +
                ", ProductName='" + ProductName + '\'' +
                ", Quantity=" + Quantity +
                ", Price=" + Price +
                '}';
    }
}
