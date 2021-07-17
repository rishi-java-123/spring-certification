package com.springcorelearning.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	
	@Bean
	public MyConfigBean myConfigBean() {
		return new MyConfigBean();
		
	}
	@Bean
	public MyConfigBean1 myConfigBeans() {
		return new MyConfigBean1();
		
	}

}
