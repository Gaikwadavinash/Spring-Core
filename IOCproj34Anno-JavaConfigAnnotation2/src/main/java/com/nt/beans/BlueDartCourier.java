package com.nt.beans;

import javax.inject.Named;

//<bean id="dtdc" class="com.nt.beans.DTDCCourier"
 //<bean id="dhl" class="com.nt.beans.DHLCourier" 
 //<bean id="bluedart" class="com.nt.beans.BlueDartCourier" 
@Named("bluedart")
public class BlueDartCourier implements ICourier {

	public BlueDartCourier() {
	System.out.println("0-Param Constructor::BlueDart Courier");
	}
	@Override
	public String deliver(int id) {
		// TODO Auto-generated method stub
		return "Delivering BlueDart Courier product Having id::"+id;
	}

}
