package com.springcorelearning.bean.spring5;

import org.springframework.context.support.GenericApplicationContext;

public class RegisterBean2 {
	
	public static void main(String[] args) {
		GenericApplicationContext applicationContext = new GenericApplicationContext();
		applicationContext.registerBean(OrderServiceImpl.class, Customizer::prototypeScoped);
		applicationContext.refresh();
		System.out.println("context refreshed");
		OrderService os = applicationContext.getBean(OrderService.class);
		os.placeOrder("laptop", 2);
		System.out.println("---------------------");
		
		os = applicationContext.getBean(OrderService.class);
		os.placeOrder("Desktop", 2);
		applicationContext.close();
	}

}
