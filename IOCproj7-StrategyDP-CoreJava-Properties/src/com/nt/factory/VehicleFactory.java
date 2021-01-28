package com.nt.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.nt.comps.IEngine;
import com.nt.comps.Vehicle;
public class VehicleFactory {
private static Properties props;
static {
	try {
		//load  Properties file by using InputStream
	InputStream is=new FileInputStream("src/com/nt/commns/Strategy.Properties");	
	//Load properties  info  to java.util.Properties Class object
	props= new 	Properties();
	props.load(is);
	}catch (Exception e) {
		e.printStackTrace();
	}
}
public static Vehicle getInstance() {
	Vehicle vehicle=null;
	try {
	//load and create object of depenedent class by collecting
	//class name and properties file
	String dependentClassName=props.getProperty("dependent.ClassName");
Class dependentclazz=Class.forName(dependentClassName);		
//lEngine engg=(IEngine)dependentclazz.newInstance();
//newInstance method is java.lang.Class is deprecated
Constructor cons[]=dependentclazz.getDeclaredConstructors();
IEngine engg=(IEngine)cons[0].newInstance();
//Create object for taraget Class (fixed object);
vehicle= new Vehicle();
vehicle.setEngg(engg);
	}catch (ClassNotFoundException cnfe) {
		
		cnfe.printStackTrace();
	}catch (Exception e) {
	e.printStackTrace();
	}
	return vehicle;
}

}//end of static block

