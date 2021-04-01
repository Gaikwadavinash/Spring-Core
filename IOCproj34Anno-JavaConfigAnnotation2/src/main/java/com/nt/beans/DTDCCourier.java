package com.nt.beans;

import javax.inject.Named;

@Named("dtdc")
public class DTDCCourier implements ICourier{
public DTDCCourier() {
	System.out.println("0-Param Constructor::DTDC Courier");
}
	@Override
	public String deliver(int id) {
		// TODO Auto-generated method stub
		return "Delivering DTDCCourier product Having id::"+id ;
	}

}
