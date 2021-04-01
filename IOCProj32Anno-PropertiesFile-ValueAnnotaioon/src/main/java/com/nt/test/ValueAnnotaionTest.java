package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Person;
import com.nt.beans.Person1;

public class ValueAnnotaionTest {

	public static void main(String[] args) {
ApplicationContext  ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	
Person 	per=ctx.getBean("per",Person.class);
System.out.println(per);
System.out.println("===================================");
Person1 per1=ctx.getBean("per1",Person1.class);
System.out.println(per1);
((AbstractApplicationContext) ctx).close();
	}
}
