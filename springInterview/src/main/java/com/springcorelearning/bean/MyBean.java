package com.springcorelearning.bean;

import java.util.Date;

public class MyBean {

	private Date date ;
	 private String str;
	 MyOtherBean otherBean;

     public void setStr (String str) {
         this.str = str;
     }
	
	public void doSomething() {
		System.out.println("from my bean class :"+date);
	}
	
	public void setOtherBean (MyOtherBean otherBean) {
	      this.otherBean = otherBean;
	  }

	  public void doSomething3 () {
	      otherBean.doSomething();
	  }
	
	public void doSomething1() {
		System.out.println("from my bean class :"+str);
	}
	public void setDate(Date date) {
		this.date=date;
	}
}
