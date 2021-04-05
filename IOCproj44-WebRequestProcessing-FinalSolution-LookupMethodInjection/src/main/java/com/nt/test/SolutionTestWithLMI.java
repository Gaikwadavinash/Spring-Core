package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WebContainer;

public class SolutionTestWithLMI {

	public static void main(String[] args) {
	//create Ioc Container
ApplicationContext ctx= 
new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");		
WebContainer container=ctx.getBean("container",WebContainer.class);
container.requestHandle("hi");
System.out.println("===========================");
container.requestHandle("hello");
System.out.println("=============================");
container.requestHandle("thank you");
	}

}
