package com.nt.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.nt.beans.Printer;

public class AcessingPrivateConstructor {

	public static void main(String[] args) throws Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
try {
	//Load clas
	Class c=Class.forName("com.nt.beans.Printer");
	//get acccess to constructors
	Constructor con[]=c.getDeclaredConstructors();
	  //get access to private cosntructor 
	con[0].setAccessible(true);
	 //create object for loaded class 
Printer p1=(Printer) con[0].newInstance();
Printer p2=(Printer) con[0].newInstance();

System.out.println(p1.hashCode()+"  "+p2.hashCode());
			} catch (ClassNotFoundException e) {

	e.printStackTrace();
}
	}

}
