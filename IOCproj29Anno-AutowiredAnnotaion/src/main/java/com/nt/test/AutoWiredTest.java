package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Flipkart;
public class AutoWiredTest {

	public static void main(String[] args) {
//IOC Conatainer
	ApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
//get Target Bean
Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
String msg=fpkt.shopping(new String []{"Shirt","trouser","shoes"}, new Float[] {1000.0f,500.0f,3000.0f});
System.out.println(msg);
((AbstractApplicationContext) ctx).close();

	}

}
