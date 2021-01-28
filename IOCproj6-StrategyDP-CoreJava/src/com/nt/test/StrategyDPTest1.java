package com.nt.test;

import com.nt.comps.IEngine;
import com.nt.comps.Vehicle;
import com.nt.factory.VechileFactory;

public class StrategyDPTest1 {

	public static void main(String[] args) {
		try {
			//vechile class object(Target Class object)
	Vehicle vehicle= VechileFactory.getInstance("diselengine");
	//invoked business logic 
	vehicle.journey("mumbai", "goa");
	
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
}
