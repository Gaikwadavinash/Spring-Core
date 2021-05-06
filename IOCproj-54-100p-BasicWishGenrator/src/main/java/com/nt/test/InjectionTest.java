package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.WishMessageGenrator;
import com.nt.config.AppConfig;

public class InjectionTest {

	public static void main(String[] args) {

ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);		

WishMessageGenrator genrator1=ctx.getBean("wish", WishMessageGenrator.class);

System.out.println("WishMessge:"+genrator1.showMessage("raja"));
	}

}
