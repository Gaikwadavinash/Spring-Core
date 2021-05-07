package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.PersonalInfo;

public class PropertyTest {

	public static void main(String[] args) {
	
ApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfg/applicationContext.xml");		

PersonalInfo info=ctx.getBean("info",PersonalInfo.class);
System.out.println(info);
	}

}
