package com.john.inaction.springcloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
	
	private static final Logger logger = LoggerFactory.getLogger(ConsumerController.class);
	
	@Autowired
	private RestTemplate template;
	
	@RequestMapping(value = "/consumer", method = RequestMethod.GET)
	public String consumer() {
		logger.info("开始消费....");
		
		String url = "http://eureka-provider/hello";
		return template.getForEntity(url, String.class).getBody();
	}
	
	
}
