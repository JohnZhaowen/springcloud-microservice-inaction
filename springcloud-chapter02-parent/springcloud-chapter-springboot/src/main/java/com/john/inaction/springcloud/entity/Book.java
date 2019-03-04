package com.john.inaction.springcloud.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
/*指定配置文件名，默认从classpath下寻找该文件，也就是等同于classpath:dataSource.properties
* 可以指定多个文件
*/
@PropertySource(value = { "book.properties" })
/*
* 指定前缀，读取的配置信息项必须包含该前缀，且除了前缀外，剩余的字段必须和实体类的属性名相同，
* 才能完成银映射
*/
@ConfigurationProperties(prefix = "book")
public class Book {
	
	private String name;
	
	private String author;
	
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
		return "Book [name=" + name + ", author=" + author + ", desc=" + desc + "]";
	}
	
}
