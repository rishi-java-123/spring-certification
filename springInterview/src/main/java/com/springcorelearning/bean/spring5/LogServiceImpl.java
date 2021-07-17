package com.springcorelearning.bean.spring5;

public class LogServiceImpl implements LogService{
	
	

	@Override
	public void log(String msg) {
		System.out.println(msg);
		
	}

	public LogServiceImpl() {
		super();
		System.out.printf("instance of %s created: %s%n", this.getClass().getName(),
                System.identityHashCode(this));
	}
	
	public void init() {
        System.out.printf("%s, init method called: ", this.getClass().getName(),
                System.identityHashCode(this));
    }

}
