package com.nt.test;
import java.io.Reader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import com.nt.beans.Custmer;
import com.nt.beans.Marks;
import com.nt.beans.Person;
import com.nt.beans.Student;
public class ConstructorInjectionTest1 {
	public static void main(String[] args) {
//Create IOC container
DefaultListableBeanFactory factory= new DefaultListableBeanFactory();
//create Reader having factory
XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
//Load and parse spring bean cfg file
reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
//get Spring bena class obj
Student student1=factory.getBean("st1",Student.class);
System.out.println("Student1 Object Data::"+student1);
System.out.println("----------------------------------");
Student student2 =factory.getBean("st2", Student.class);
System.out.println("Student2 Object Data::"+student2);
System.out.println("-----------------------------------");
Student student3=factory.getBean("st3",Student.class);
System.out.println("Student3 Object Data::"+student3);
System.out.println("====================================");
Marks marks1=factory.getBean("mk", Marks.class);
System.out.println("Maarks Object Data::"+marks1);
System.out.println("-------------------------------");
Person person1=factory.getBean("ps",Person.class);
System.out.println("Person1 Object Data::"+person1);
System.out.println("================================");
Custmer custmer1= factory.getBean("cust", Custmer.class);
System.out.println("Custmer1 Object Data::"+custmer1);
	}

}
