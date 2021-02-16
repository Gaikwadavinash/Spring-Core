package com.nt.comps;

public class Vehicle {
 private IEngine engg;//composition /has-a-relation
 public void setEngg(IEngine engg) {
	 this.engg=engg;
 }
 public void journey(String pickupPlace,String DroppingPlace) {
	 engg.start();
	 System.out.println("Vehicle.journey  Started::"+pickupPlace);
	 engg.stop();
	 System.out.println("Vehicle.journey Stopped::"+DroppingPlace);
 }
}
