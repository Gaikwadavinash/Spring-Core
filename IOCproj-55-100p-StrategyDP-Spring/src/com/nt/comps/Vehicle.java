//Target Class
package com.nt.comps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("vehicle")
public class Vehicle {
	@Autowired
	@Qualifier("diselEngg")
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
