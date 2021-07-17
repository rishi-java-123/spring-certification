package com.springcorelearning.bean;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class InjectingOtherBean {
	public static void main(String[] args) {
		 DefaultListableBeanFactory context =new DefaultListableBeanFactory();
		GenericBeanDefinition beanOtherdef = new GenericBeanDefinition();
		beanOtherdef.setBeanClass(MyOtherBean.class);
		context.registerBeanDefinition("other", beanOtherdef);
		
		GenericBeanDefinition beanDef = new GenericBeanDefinition();
		beanDef.setBeanClass(MyBean.class);
		MutablePropertyValues mpv = new MutablePropertyValues();
		mpv.addPropertyValue("otherBean", context.getBean("other"));
		beanDef.setPropertyValues(mpv);
		context.registerBeanDefinition("myBean", beanDef);
		
		
		MyBean bean = context.getBean(MyBean.class);
		bean.doSomething3();
	}

}
