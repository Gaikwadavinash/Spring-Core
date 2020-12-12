package com.nt.test;
import java.lang.reflect.*;
public class NewInstanceTest2 {
	public static void main(String[] args) throws Exception {
Class c= Class.forName(args[0]);		
Constructor con[]=c.getDeclaredConstructors();
Object ob1=con[1].newInstance();
System.out.println("Display the object:"+ob1);
Object ob2=con[0].newInstance(10,20);
System.out.println("Display the object:"+ob2);

	}

}
