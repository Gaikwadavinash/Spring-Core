package com.nt.test;

import com.nt.comp.ICar;
import com.nt.factory.CarFactory;

public class CustmerNull {

	public static void main(String[] args) {

		ICar car=CarFactory.getInstanceCar("Null");
		System.out.println(car.getClass());
		car.drive();
		car.addAcessories();
	}

}
