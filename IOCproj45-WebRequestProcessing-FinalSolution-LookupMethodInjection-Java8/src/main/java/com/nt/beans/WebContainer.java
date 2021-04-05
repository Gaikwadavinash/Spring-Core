package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class WebContainer  {

private ApplicationContext ctx;

public WebContainer() {
	System.out.println("WebContainer 0-param Constructor::"+this.getClass());
	
}

public abstract RequestHandler getHandler();
public void requestHandle(String data) {
System.out.println("WebContainer Data::"+data);
System.out.println("WebContainer.hashcode::"+this.hashCode());
//traditional lookup dependency
RequestHandler rh=getHandler();
rh.processingData(data);
System.out.println("WebContainer Data::"+data);
}


}
