package com.nt.factory;

import com.nt.comps.CNGEngine;
import com.nt.comps.DiselEngine;
import com.nt.comps.IEngine;
import com.nt.comps.PetrolEngine;
import com.nt.comps.Vehicle;

public class VechileFactory {
public static Vehicle getInstance(String EngineType) {
	IEngine engg=null;
if(EngineType.equalsIgnoreCase("DiselEngine"))
	engg= new DiselEngine();
else if(EngineType.equalsIgnoreCase("PetrolEngine"))
	engg=new PetrolEngine();
else if(EngineType.equalsIgnoreCase("CNGEngine"))
	engg= new CNGEngine();
else {
	throw new IllegalArgumentException("Invalid Engine Type");
}
//create object target Class
Vehicle vehicle= new Vehicle();
// to assign depenent class to target class
vehicle.setEngg(engg);
	return vehicle;
}
}
