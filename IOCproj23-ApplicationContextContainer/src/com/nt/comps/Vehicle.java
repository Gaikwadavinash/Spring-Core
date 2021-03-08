//Target Class
package com.nt.comps;
public final class Vehicle {
private IEngine engg;
private String type;
public Vehicle() {
System.out.println("Vehicle::0-Param Constructor");	
}
public void setType(String type) {
	this.type = type;
	System.out.println("Vehicle::"+type);
}
public Vehicle(IEngine engg) {
System.out.println("Vehicle::1-param constructor");	
this.engg=engg;

}

public void setEngg(IEngine engg) {
	this.engg = engg;
	System.out.println("Vehicle::"+engg);
}
public void Journey(String SourcePlace,String Destination) {
	engg.start();
	System.out.println("Vehicle.Journey() Started::"+SourcePlace);
	engg.stop();
	System.out.println("Vehicle.Journey() Stopped::"+Destination);
}
}
