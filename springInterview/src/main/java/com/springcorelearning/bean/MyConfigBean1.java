package com.springcorelearning.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class MyConfigBean1 implements BeanDefinitionRegistryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		GenericBeanDefinition gbd = new GenericBeanDefinition();
		gbd.setBeanClass(MyBean.class);
		gbd.getPropertyValues().add("str", "my string property");
		registry.registerBeanDefinition("myBeanName", gbd);
		
	}

}
