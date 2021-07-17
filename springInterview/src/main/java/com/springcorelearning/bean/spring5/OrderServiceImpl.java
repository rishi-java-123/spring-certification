package com.springcorelearning.bean.spring5;

public class OrderServiceImpl implements OrderService{
	
	private LogService logService;
	
	public OrderServiceImpl() {
        System.out.printf("instance of %s created: %s%n", this.getClass().getName(),
                System.identityHashCode(this));
    }

	public OrderServiceImpl(LogService logService) {
		super();
		this.logService = logService;
	}

	 public void setLogService(LogService logService) {
         this.logService = logService;
     }



	@Override
	public void placeOrder(String item, int qty) {
		System.out.printf("placing order item: %s, qty: %s, isntance: %s%n",
                item, qty, System.identityHashCode(this));
        if (logService != null) {
            logService.log("Order placed");
        }
		
	}
	
	
	 private void init() {
         System.out.printf("%s, init method called: %s%n", this.getClass().getName(),
                 System.identityHashCode(this));
     }

     private void destroy() {
         System.out.printf("%s, destroy method called: %s%n", this.getClass().getName(),
                 System.identityHashCode(this));
     }

}
