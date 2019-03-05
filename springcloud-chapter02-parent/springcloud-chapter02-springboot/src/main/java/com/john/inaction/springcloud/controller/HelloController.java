package com.john.inaction.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.john.inaction.springcloud.entity.Book;
import com.john.inaction.springcloud.entity.Book2;
import com.john.inaction.springcloud.entity.RandomValue;

@RestController
public class HelloController {
	
	@Autowired
	private Book book;
	
	@Autowired
	private Book2 book2;
	
	@Autowired
	private RandomValue random;
	
	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}
	
	@RequestMapping("/book")
	public String book() {
		return book.toString();
	}
	
	@RequestMapping("/book2")
	public String book2() {
		return book2.toString();
	}
	
	@RequestMapping("/num")
	public String num() {
		return random.toString();
	}
	
}
