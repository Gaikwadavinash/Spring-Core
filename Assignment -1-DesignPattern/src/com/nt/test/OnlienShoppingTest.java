package com.nt.test;
import com.nt.comps.Flipkart;
import com.nt.comps.ICourier;
import com.nt.factory.CourierFactory;
public class OnlienShoppingTest {

	public static void main(String[] args) {
Flipkart flipkart=CourierFactory.getFlipkart("ekart");
flipkart.shopping("shoe");
flipkart.payment(1000);
	}

}
