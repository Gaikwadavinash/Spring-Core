package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Custmer;

public class FactoryBeanTest {

	public static void main(String[] args) {
	
ApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfg/applicationContext.xml");
Custmer cust=ctx.getBean("custmer", Custmer.class);
System.out.println("====================");
cust.showProduct();
System.out.println("----------------");


	}

}
