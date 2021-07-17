package com.springcorelearning.bean.spring5;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

public class Customizer {
	
	public static void prototypeScoped(BeanDefinition bd){
		bd.setScope(ConfigurableBeanFactory.SCOPE_PROTOTYPE);
		
	}
	
	public static void lazy(BeanDefinition bd){
		bd.setScope(ConfigurableBeanFactory.SCOPE_PROTOTYPE);
		
	}
	
	public static void defaultInitMethod(BeanDefinition bd){
		bd.setInitMethodName("init");
		
	}
	
	public static void defaultDestroyMethod(BeanDefinition bd){
		bd.setDestroyMethodName("destroy");
		
	}

}
