package com.springcorelearning.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanFactoryPostProcessorExample {
	
	private static AnnotationConfigApplicationContext annotationConfigApplicationContext;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		MyBean bean = annotationConfigApplicationContext.getBean(MyBean.class);
		bean.doSomething1();
		
	}

}
