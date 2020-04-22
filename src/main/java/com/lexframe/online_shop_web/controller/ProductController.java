package com.lexframe.online_shop_web.controller;

import com.lexframe.online_shop_web.model.Product;
import com.lexframe.online_shop_web.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public class ProductController {
    private final ProductRepository ProductRepository;

    public ProductController(ProductRepository productRepository) {
        this.ProductRepository = productRepository;
    }

    @GetMapping
    public List<Product> getAllProduct() {
        return ProductRepository.findAll();
    }

    public ResponseEntity<Product> getProduct(@PathVariable Long id) {
        Optional<Product> product = ProductRepository.findById(id);
        return product.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
