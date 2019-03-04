package com.john.inaction.springcloud.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("book.properties") //如果是application.properties中的配置,则不需要该注解
public class Book2 {
	
	@Value("${book.name}")
	private String name;
	
	@Value("${book.author}")
	private String author;
	
	@Value("${book.desc}")
	private String desc;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Book2 [name=" + name + ", author=" + author + ", desc=" + desc + "]";
	}
	
}
