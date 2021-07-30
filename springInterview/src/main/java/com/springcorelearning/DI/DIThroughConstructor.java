package com.springcorelearning.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;


import com.springcorelearning.DI.service.OrderService;

public class DIThroughConstructor {
	@Bean
	public OrderService orderService() {
		return new OrderService();

	}

	@Bean
	public OrderserviceClient orderServiceClient() {
		return new OrderserviceClient(orderService());

	}
	
	public static void main(String... strings) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
        		DIThroughConstructor.class);
       OrderserviceClient bean = context.getBean(OrderserviceClient.class);
        bean.showPendingOrderDetails();
    }
	
	
	private static class OrderserviceClient {
		
		private OrderService orderService;

	
		public OrderserviceClient(OrderService orderService) {
			this.orderService=orderService;
		}

		
		public void showPendingOrderDetails(){
			System.out.println(orderService.getOrderDetails("800"));
		}
	}
}
