package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Printer;
import com.nt.beans.WishMessageGenerator;

public class SpringBeanScopeTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
WishMessageGenerator generator1=factory.getBean("wmg", WishMessageGenerator.class);
System.out.println(generator1.sayHello("raja"));
WishMessageGenerator generator2=factory.getBean("wmg", WishMessageGenerator.class);
WishMessageGenerator generator3=factory.getBean("wmg", WishMessageGenerator.class);
System.out.println(generator1.hashCode()+"  "+generator2.hashCode()+" "+generator3.hashCode());
	
	Printer printer1=factory.getBean("p1", Printer.class);
	Printer printer2=factory.getBean("p1", Printer.class);
	System.out.println(printer1.hashCode()+"  "+printer2.hashCode());
	}

}
