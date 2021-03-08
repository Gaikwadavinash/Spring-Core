package com.nt.beans;

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
