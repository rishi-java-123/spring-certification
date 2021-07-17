package com.springcorelearning.bean.spring5;

import org.springframework.context.support.GenericApplicationContext;

public class RegisterBean3 {
	
	public static void main(String[] args) {
		GenericApplicationContext appContext = new GenericApplicationContext();
		appContext.registerBean("orderBean", OrderServiceImpl.class, Customizer::lazy);
		appContext.refresh();
		
		 System.out.println("context refreshed");
		 
		 OrderService bean = (OrderService) appContext.getBean("orderBean");
		 bean.placeOrder("Laptop", 2);
		 appContext.close();
	}
}
