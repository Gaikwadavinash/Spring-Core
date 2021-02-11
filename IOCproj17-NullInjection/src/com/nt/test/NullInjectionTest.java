package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.PersonalInfo;

public class NullInjectionTest {

	public static void main(String[] args) {
//Create IOC container
DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
//Load xml bean Defination Reader
XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
//load Cfg File
reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
//create object of spring Bean Class
PersonalInfo ramesh= factory.getBean("rameshInfo",PersonalInfo.class);
System.out.println(ramesh);

System.out.println("=======================");
PersonalInfo ramesh2= factory.getBean("ramesh2",PersonalInfo.class);
System.out.println(ramesh2);
System.out.println("========================");
PersonalInfo ramesh3= factory.getBean("ramesh3",PersonalInfo.class);
System.out.println(ramesh3);
	}

}
