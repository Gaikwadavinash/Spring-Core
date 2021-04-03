package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class AwareInjection_DependencyLookup_Test {

	public static void main(String[] args) {
	//create IOC Container
	ApplicationContext ctx	= 
new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
Cricketer cricketer= ctx.getBean("cricketer",Cricketer.class);
System.out.println("=========================");
//invoked method
cricketer.batting();
cricketer.batting();
System.out.println("==========================");
	cricketer.bowling();
	System.out.println("========================");
	cricketer.fielding();
//close container
	((AbstractApplicationContext) ctx).close();
	}

}
