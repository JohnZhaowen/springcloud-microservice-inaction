package com.john.inaction.springcloud.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = { "random.properties" })
@ConfigurationProperties(prefix = "random")
public class RandomValue {
	
	private String strNum;
	
	public String getStrNum() {
		return strNum;
	}

	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}

	@Override
	public String toString() {
		return "RandomValue [strNum=" + strNum +  "]";
	}


}
