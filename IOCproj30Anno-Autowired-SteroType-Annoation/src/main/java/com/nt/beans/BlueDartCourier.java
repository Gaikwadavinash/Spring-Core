package com.nt.beans;

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
