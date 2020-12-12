package com.nt.comps;
public class Flipkart {
private ICourier courier;
public void setCourier(ICourier courier) {
	this.courier=courier;
}
public void shopping(String Item) {
	System.out.println("Filpkart.shopping done::"+Item);
}
public void payment(int amount) {
System.out.println("Filpkart.payment done::"+amount+"rs");
courier.pickupOrder();
courier.deliverdOrder();
}
}
