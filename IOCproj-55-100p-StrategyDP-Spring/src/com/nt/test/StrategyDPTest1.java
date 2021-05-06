package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.comps.Vehicle;
import com.nt.config.AppConfig;

public class StrategyDPTest1 {

	public static void main(String[] args) {
ApplicationContext ctx= new AnnotationConfigApplicationContext( AppConfig.class);
Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
System.out.println("===================");
vehicle.Journey("Mumbai","Hyd");


	}

}
