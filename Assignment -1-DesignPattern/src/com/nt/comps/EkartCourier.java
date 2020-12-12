package com.nt.comps;

public final class EkartCourier implements ICourier {
	@Override
	public void pickupOrder() {
	System.out.println("EkartCourier::pickupOrder");
	}
	@Override
	public void deliverdOrder(){
System.out.println("EkartCourier::deliverdOrder");
	}

}
