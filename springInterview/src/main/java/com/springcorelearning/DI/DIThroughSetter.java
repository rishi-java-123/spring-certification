package com.springcorelearning.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.springcorelearning.DI.service.OrderService;

public class DIThroughSetter {

	@Bean
	public OrderService orderService() {
		return new OrderService();

	}

	@Bean
	public OrderserviceClient orderServiceClient() {
		return new OrderserviceClient();

	}

	public static void main(String... strings) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIThroughSetter.class);
		OrderserviceClient bean = context.getBean(OrderserviceClient.class);
		bean.showPendingOrderDetails();
	}

	private static class OrderserviceClient {

		private OrderService orderService;

		@Autowired
		public void setOrderService(OrderService orderService) {

			this.orderService = orderService;
		}
		
		public void showPendingOrderDetails(){
			System.out.println(orderService.getOrderDetails("200"));
		}
	}

}
