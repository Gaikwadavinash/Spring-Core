package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.SampleBean;

public class DefaultBeanIdTest {

public static void main(String[] args) {

//Create Ioc Conatiner
DefaultListableBeanFactory factory= new DefaultListableBeanFactory();
//Create xml Bean Defination Reader
XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
//load spring cfg file
reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
System.out.println("========================");
//create spring Benn class obejct

SampleBean sampleBean1=factory.getBean("com.nt.beans.SampleBean",SampleBean.class);
System.out.println(" Default bean Object Data::"+sampleBean1);
//com.nt.beans.SampleBean#0
SampleBean sampleBean2=factory.getBean("com.nt.beans.SampleBean#0",SampleBean.class);
System.out.println("Default bean Object Data#0::"+sampleBean2);
//com.nt.beans.SampleBean#1
SampleBean sampleBean3=factory.getBean("com.nt.beans.SampleBean#1",SampleBean.class);
System.out.println("Default bean Object Data#1::"+sampleBean3);

//com.nt.beans.SampleBean#2
SampleBean sampleBean4=factory.getBean("com.nt.beans.SampleBean#2",SampleBean.class);
System.out.println("Default bean Object Data#2::"+sampleBean4);
}
}
