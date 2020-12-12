package com.nt.factory;
import com.nt.comps.BlueDarkCourier;
import com.nt.comps.DTDCCourier;
import com.nt.comps.EkartCourier;
import com.nt.comps.Flipkart;
import com.nt.comps.ICourier;
public class CourierFactory {
public static Flipkart getFlipkart(String CourierType ) {
	ICourier courier=null;
	if(CourierType.equalsIgnoreCase("dtdc")) {
		courier= new DTDCCourier();
	}
	else if (CourierType.equalsIgnoreCase("ekart")) {
		courier=new EkartCourier();
	}
	else if (CourierType.equalsIgnoreCase("bluedart")) {
		courier=new BlueDarkCourier();
	}
	else {
		throw new IllegalArgumentException("Invalid argument");
	}
	Flipkart flipkart= new Flipkart();
	flipkart.setCourier(courier);
	return flipkart;
}
}
