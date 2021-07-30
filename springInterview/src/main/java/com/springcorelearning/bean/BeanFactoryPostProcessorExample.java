package com.springcorelearning.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*BeanFactoryPostProcessor allows client code to customize bean definitions. 
 * The method BeanFactoryPostProcessor.postProcessBeanFactory is called by Spring startup process 
 * just after all bean definitions have been loaded, but no beans have been instantiated yet.*/
 

public class BeanFactoryPostProcessorExample {
	
	private static AnnotationConfigApplicationContext annotationConfigApplicationContext;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		MyBean bean = annotationConfigApplicationContext.getBean(MyBean.class);
		bean.doSomething1();
		
	}

}
