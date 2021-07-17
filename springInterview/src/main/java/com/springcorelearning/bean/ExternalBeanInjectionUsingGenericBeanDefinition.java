package com.springcorelearning.bean;

import java.util.Date;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;


/*For an alternative implementation of the org.springframework.beans.factory.ListableBeanFactory interface,have 
 * a look at StaticListableBeanFactory,
which manages existing bean instances rather than creating new ones based on bean definitions.*/
public class ExternalBeanInjectionUsingGenericBeanDefinition {
	
	public static void main(String[] args) {
		
		DefaultListableBeanFactory context = new DefaultListableBeanFactory();
		
		/*use this GenericBeanDefinition class for the purpose of registering user-visible bean definitions (which a post-processor might operate on,potentially even reconfiguring the parent name). 
* Use RootBeanDefinition / ChildBeanDefinition where parent/child relationships happen to be pre-determined.*/
		 
		GenericBeanDefinition gbd = new GenericBeanDefinition();
		gbd.setBeanClass(MyBean.class);
		
		/*Allows simple manipulation of properties, and provides constructors to support deep copy and construction from a Map.*/
		MutablePropertyValues mpv = new MutablePropertyValues();
		mpv.add("date", new Date());
		gbd.setPropertyValues(mpv);
		
		context.registerBeanDefinition("myBeanName", gbd);
		
		MyBean bean = context.getBean(MyBean.class);
		bean.doSomething();
	}

}
