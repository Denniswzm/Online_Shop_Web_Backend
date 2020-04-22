package com.lexframe.online_shop_web.repository;

import com.lexframe.online_shop_web.model.Product;
import com.lexframe.online_shop_web.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
