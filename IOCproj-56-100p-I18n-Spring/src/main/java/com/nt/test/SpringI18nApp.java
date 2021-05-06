package com.nt.test;
import java.util.Locale;
import java.util.ResourceBundle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.nt.config.AppConfig;

public class SpringI18nApp {

	public static void main(String[] args) {
		//create Ioc Container 
		ApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
Locale locale= new Locale("de","DE");
String msg1=ctx.getMessage("Wishmsg",new Object[] {"buddy","welcome"},"msg", locale);
String msg2=ctx.getMessage("Welcome.msg",new Object[] {},"msg2", locale);
String msg3=ctx.getMessage("bye.msg",new Object[] {},"msg3", locale);
System.out.println(msg1+"  "+msg2+"  "+msg3);
//System.out.println(msg1);
	}

}
