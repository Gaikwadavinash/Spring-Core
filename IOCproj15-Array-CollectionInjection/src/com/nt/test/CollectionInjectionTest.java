package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.College;
import com.nt.beans.CourseInfo;
import com.nt.beans.FacultyInfo;
import com.nt.beans.FruitStore;
import com.nt.beans.Student;

public class CollectionInjectionTest {

	public static void main(String[] args) {
//Create IoC Conatiner
DefaultListableBeanFactory factory= new DefaultListableBeanFactory();
//Create xml Bean Defination Reader
XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
//load cfg file
reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
College clg= factory.getBean("clg",College.class);
System.out.println(clg);
System.out.println("=========================");
Student stud=factory.getBean("stud",Student.class);
System.out.println(stud);
System.out.println("=========================");
FacultyInfo fact=factory.getBean("fact", FacultyInfo.class);
System.out.println(fact);
System.out.println("=========================");
FruitStore fruitStore=factory.getBean("fruitst",FruitStore.class);
System.out.println(fruitStore);
System.out.println("=========================");
CourseInfo courseInfo=factory.getBean("courseInfo",CourseInfo.class);
System.out.println(courseInfo);
}

}
