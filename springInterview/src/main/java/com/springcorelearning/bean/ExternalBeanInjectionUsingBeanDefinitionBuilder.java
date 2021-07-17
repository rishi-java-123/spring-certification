package com.springcorelearning.bean;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class ExternalBeanInjectionUsingBeanDefinitionBuilder {
	
	public static void main(String[] args) {
		DefaultListableBeanFactory context = new DefaultListableBeanFactory();
		
		BeanDefinitionBuilder addPropertyValue = BeanDefinitionBuilder.rootBeanDefinition(MyBean.class).addPropertyValue("str", "myStringValue");
		context.registerBeanDefinition("myBean", addPropertyValue.getBeanDefinition());
		
	  MyBean bean = context.getBean(MyBean.class);
	  bean.doSomething1();
	}

}
