package com.springcorelearning.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;


import com.springcorelearning.DI.service.OrderService;

public class DIThroughField {
	@Bean
	public OrderService orderService() {
		return new OrderService();

	}

	@Bean
	public OrderserviceClient orderServiceClient() {
		return new OrderserviceClient();

	}
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(DIThroughField.class);
		OrderserviceClient bean = configApplicationContext.getBean(OrderserviceClient.class);
		bean.showPendingOrderDetails();
	}
	
	
	
	private static class OrderserviceClient {

		@Autowired
		private OrderService orderService;

		
		public void showPendingOrderDetails(){
			System.out.println(orderService.getOrderDetails("400"));
		}
	}

}
