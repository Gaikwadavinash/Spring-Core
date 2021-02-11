package com.nt.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryMethodBeanInstantiationTest {

	public static void main(String[] args) {

DefaultListableBeanFactory factory= new DefaultListableBeanFactory();
XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
//get Bean Instantiation
//return relevant Class Object
Calendar cal1=factory.getBean("cal",Calendar.class);
System.out.println("Calender Object:"+cal1.getClass()+" ===="+"Calender Objetc Data:"+cal1.toString());

System.out.println("===============================================");
//return own Class object
Class clazz=factory.getBean("clazz",Class.class);
System.out.println("clazz obj class::"+clazz.getClass()+ "---->clazz obj data::"+clazz.toString());

System.out.println("=============================================");
Properties props=factory.getBean("props",Properties.class);
System.out.println("props Obj Class:"+props.getClass()+" "+"===="+"Props object Data:"+props.toString());

System.out.println("==========================================");
String s1=factory.getBean("s2",String.class);
System.out.println("String Class:"+s1.getClass()+"====="+"String Class object Data:"+s1.toString());

System.out.println("==================================");
String s3=factory.getBean("s4" ,String.class);
System.out.println("String Class:"+s3.getClass()+"====="+"String Class object Data:"+s3.toString());
	
System.out.println("===============================");
Iterator it=factory.getBean("it",Iterator.class);
System.out.println("it obj class::"+it.getClass()+ "---->it obj data::"+it.toString());
	
	}

}
