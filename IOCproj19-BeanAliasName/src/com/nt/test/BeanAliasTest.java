package com.nt.test;
import java.util.*;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;
import com.nt.beans.WishMessageGenerator;
public class BeanAliasTest {
	public static void main(String[] args) {

//FileSystemResource res= new FileSystemResource
//("src/com/nt/cfgs/apllicationContext.xml");
//
//XmlBeanFactory factory= new XmlBeanFactory(res);
DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
//WishMessageGenerator gen=(WishMessageGenerator)factory.getBean("WishMessageGenerator");
//WishMessageGenerator gen1=(WishMessageGenerator)factory.getBean("wmg1");
//WishMessageGenerator gen2=(WishMessageGenerator)factory.getBean("wmg2");


System.out.println("******************************************");
WishMessageGenerator gen3=(WishMessageGenerator)factory.getBean("wmg1");
//WishMessageGenerator gen4=(WishMessageGenerator)factory.getBean("wmg4");
//WishMessageGenerator gen5=(WishMessageGenerator)factory.getBean("wmg3");
	
System.out.println(gen3.message("raja"));
System.out.println("========================");
//System.out.println(gen4.message("rani"));
System.out.println("========================");
//System.out.println(gen5.message("Police"));
//System.out.println("HashCode:"+gen.hashCode()+"   "+gen1.hashCode()+" "+gen2.hashCode());

	
//System.out.println("HashCode:"+gen3.hashCode()+"   "+gen4.hashCode()+" "+gen5.hashCode());
	}

}
