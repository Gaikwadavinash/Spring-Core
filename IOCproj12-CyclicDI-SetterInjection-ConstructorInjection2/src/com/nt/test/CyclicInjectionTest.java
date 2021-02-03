package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.A;
import com.nt.beans.B;

public class CyclicInjectionTest {

	public static void main(String[] args) {
//load Ioc Container
DefaultListableBeanFactory  factory= new DefaultListableBeanFactory();
//Create xml Bean Defination Reader
XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
//load spring cfg file
reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
//get Bean Object
//A a=factory.getBean("a1", A.class);
//System.out.println(a);
//Aclass return Bclass cont-A Class setter-a 
//modified aftet git 1st
B b=factory.getBean("b1", B.class);
System.out.println(b);
//AClass const-b Class setter-B return
	}
	}


