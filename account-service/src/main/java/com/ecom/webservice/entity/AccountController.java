package com.ecom.webservice.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@GetMapping("/accounts")
	public List<Account> listAccount() {
		List<Account> list = new ArrayList<Account>();
		list.add(new Account(100, "Mike Smith"));
		list.add(new Account(101, "Will Smith"));
		list.add(new Account(102, "David Smith"));
		list.add(new Account(103, "Marry Smith"));
		list.add(new Account(104, "Ava Smith"));
		return list;
	}
}
