package com.nt.test;

import com.nt.comps.Vehicle;
import com.nt.factory.VehicleFactory;

public class StrategyDPTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//get vehicle terget class obejct 		
Vehicle vehicle=VehicleFactory.getInstance();
//invoking business Logic method
vehicle.Journey("hyd", "Mumbai");
	}

}
