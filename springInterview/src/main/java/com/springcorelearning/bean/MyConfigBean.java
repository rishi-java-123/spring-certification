package com.springcorelearning.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;


/*BeanFactoryPostProcessor allows client code to customize bean definitions. The method BeanFactoryPostProcessor.postProcessBeanFactory is called by Spring startup process just after all bean definitions have been loaded,
 *  but no beans have been instantiated yet*/
public class MyConfigBean implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition gbd = new GenericBeanDefinition();
		gbd.setBeanClass(MyBean.class);
		gbd.getPropertyValues().add("str","my string property");
		 ((DefaultListableBeanFactory) beanFactory)
         .registerBeanDefinition("myBeanName", gbd);
	}

}
