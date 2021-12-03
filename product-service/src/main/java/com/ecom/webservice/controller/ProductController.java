package com.ecom.webservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.webservice.entity.Product;

@RestController
public class ProductController {

	@GetMapping("/products")
	public List<Product> listProducts(){
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1001, "Apple mac book", 343333.45d));
		list.add(new Product(1001, "Dell  book", 123333.45d));
		list.add(new Product(1001, "Hp  book", 873333.45d));
		list.add(new Product(1001, "lenovo book", 5333.45d));
		return list;
	}
}
