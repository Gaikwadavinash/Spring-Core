package com.nt.test;
import java.util.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;
import com.nt.beans.WishMessageGenerator;
public class SetterInjection {
	public static void main(String[] args) {

FileSystemResource res= new FileSystemResource
("src/com/nt/cfgs/apllicationContext.xml");

XmlBeanFactory factory= new XmlBeanFactory(res);

WishMessageGenerator gen=
(WishMessageGenerator)factory.getBean("wmg");

System.out.println(gen.message("raja"));
		
	}

}
