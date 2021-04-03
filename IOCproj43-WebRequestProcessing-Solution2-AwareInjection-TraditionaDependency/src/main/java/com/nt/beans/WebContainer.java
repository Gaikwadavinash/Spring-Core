package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer implements ApplicationContextAware {
private String beanId;
private ApplicationContext ctx;

public WebContainer(String beanId) {
	System.out.println("WebContainer 1-param Constructor");
	this.beanId=beanId;
}

public void requestHandle(String data) {
System.out.println("WebContainer Data::"+data);
System.out.println("WebContainer.hashcode::"+this.hashCode());
////create ioc Container
//ApplicationContext ctx= 
//new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
System.out.println("2nd IOC Conatiner");
RequestHandler rh= ctx.getBean("handler",RequestHandler.class);
rh.processingData(data);
System.out.println("WebContainer Data::"+data);
}

@Override
public void setApplicationContext(ApplicationContext ctx) throws BeansException {
	System.out.println("WebContainer.setApplicationContext()");
	this.ctx=ctx;
	
}
}
