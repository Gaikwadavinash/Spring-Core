package com.nt.test;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;
import com.nt.beans.WishMessageGenrator;
public class ConstructorInjection {
	public static void main(String[] args) {
FileSystemResource res= new FileSystemResource
("src/com/nt/cfgs/application.xml");
XmlBeanFactory  factory= new XmlBeanFactory(res);
WishMessageGenrator genrator=(WishMessageGenrator)factory.getBean("wmg");
System.out.println(genrator.genrateWishMessage("raja"));	
}

}
