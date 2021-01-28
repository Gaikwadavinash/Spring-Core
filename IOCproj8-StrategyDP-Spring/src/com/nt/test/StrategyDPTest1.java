package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.comps.Vehicle;

public class StrategyDPTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//craete ioc container
BeanFactory factory= new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
//create target class object
Vehicle vehicle=factory.getBean("vehicle",Vehicle.class);
//invoke b.logic
vehicle.Journey("Mumbai","chennai");
	}

}
