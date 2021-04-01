package com.nt.beans;

import javax.inject.Named;

@Named("dhl")
public class DHLCourier implements ICourier {
public DHLCourier() {
System.out.println("0-Param Constructor::DHL Courier");
}
	@Override
	public String deliver(int id) {
		
		return "Delivering DHL product Having id::"+id;
	}

}
