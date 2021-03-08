package com.nt.test;
import java.util.Locale;
import java.util.ResourceBundle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringI18nApp {

	public static void main(String[] args) {
		//create Ioc Container 
		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
Locale locale= new Locale(args[0],args[1]);
String msg1=ctx.getMessage("Wishmsg",new Object[] {"buddy"," welcome"},"msg", locale);
String msg2=ctx.getMessage("Welcome.msg",new Object[] {},"msg2", locale);
String msg3=ctx.getMessage("bye.msg",new Object[] {},"msg3", locale);
System.out.println(msg1+"  "+msg2+"  "+msg3);
//System.out.println(msg1);
	}

}
