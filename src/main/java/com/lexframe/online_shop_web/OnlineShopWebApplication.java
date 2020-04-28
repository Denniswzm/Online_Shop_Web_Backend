package com.lexframe.online_shop_web;

import com.lexframe.online_shop_web.model.Product;
import com.lexframe.online_shop_web.model.User;
import com.lexframe.online_shop_web.repository.ProductRepository;
import com.lexframe.online_shop_web.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OnlineShopWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShopWebApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner userDemo(UserRepository userRepository, ProductRepository productRepository) {
//		return args -> {
//			userRepository.save(new User("Dennis1","bnmfghj"));
//			userRepository.save(new User("Dennis2","bnmfghj"));
//			userRepository.save(new User("Dennis3","bnmfghj"));
//			userRepository.save(new User("Dennis4","bnmfghj"));
//			userRepository.save(new User("Dennis5","bnmfghj"));
//			userRepository.save(new User("Dennis6","bnmfghj"));
//			userRepository.save(new User("Dennis7","bnmfghj"));
//			userRepository.save(new User("Dennis8","bnmfghj"));
//			productRepository.save(new Product("Hotdog",100,2.00));
//			productRepository.save(new Product("Cheese Buger",20,4.99));
//			productRepository.save(new Product("Double Cheese Buger",20,5.99));
//		};
//	}
}
