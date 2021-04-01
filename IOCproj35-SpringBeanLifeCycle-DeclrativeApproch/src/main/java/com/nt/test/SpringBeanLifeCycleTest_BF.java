package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

import com.nt.beans.VoteEligiblityChecking;

public class SpringBeanLifeCycleTest_BF {

	public static void main(String[] args) {
//create IOC Container
DefaultListableBeanFactory factory= new DefaultListableBeanFactory();
XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
//get Spring Bean Class Object
VoteEligiblityChecking vote=factory.getBean("voting",VoteEligiblityChecking.class);

//invoked the method
System.out.println(vote.checkEligiblity());

//destroy Singleton
//factory.destroySingletons();

	}

}
