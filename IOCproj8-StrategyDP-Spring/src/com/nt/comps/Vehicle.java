//Target Class
package com.nt.comps;
public final class Vehicle {
private IEngine engg;

public void setEngg(IEngine engg) {
	this.engg = engg;
}
public void Journey(String SourcePlace,String Destination) {
	engg.start();
	System.out.println("Vehicle.Journey() Started::"+SourcePlace);
	engg.stop();
	System.out.println("Vehicle.Journey() Stopped::"+Destination);
}
}
