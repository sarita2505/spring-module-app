package com.spring;

import com.spring.cart.ICartService;
import com.spring.controller.CartController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring.xml")
public class SpringModuleAppApplication implements CommandLineRunner {

	@Autowired
	private ICartService cartService;

	@Autowired
	private CartController cartController;
	public static void main(String[] args) {
		SpringApplication.run(SpringModuleAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hashcode: "+cartService);
		System.out.println("hashcode: "+cartController);
	}
}
