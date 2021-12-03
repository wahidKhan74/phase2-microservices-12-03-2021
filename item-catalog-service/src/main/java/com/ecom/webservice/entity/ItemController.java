package com.ecom.webservice.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

	@GetMapping("/items")
	public List<Items> listProducts(){
		List<Items> list = new ArrayList<Items>();
		list.add(new Items(1001, "Apple mac book", "electronic"));
		list.add(new Items(1001, "Dell  book", "electronic"));
		list.add(new Items(1001, "Hp  book", "electronic"));
		list.add(new Items(1001, "lenovo book", "electronic"));
		return list;
	}
}
