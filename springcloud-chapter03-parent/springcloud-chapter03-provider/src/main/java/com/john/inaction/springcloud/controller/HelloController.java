package com.john.inaction.springcloud.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@Value("${server.port}")
	private String port;
	
	@Autowired
	private DiscoveryClient client;
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String index() {
		List<ServiceInstance> instances = client.getInstances("eureka-provider");
		for(ServiceInstance instance : instances) {
			
			logger.info("/hello host: [{}], server id :[{}]", instance.getHost(), instance.getServiceId());
		}
		
		
		return "Hello World from " + port;
	}
	
	
}
