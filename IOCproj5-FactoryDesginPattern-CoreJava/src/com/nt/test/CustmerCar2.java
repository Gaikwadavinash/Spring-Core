package com.nt.test;

import com.nt.comp.ICar;
import com.nt.factory.CarFactory;

public class CustmerCar2 {

	public static void main(String[] args) {
		
		ICar car=CarFactory.getInstanceCar("SportCar");
		System.out.println(car.getClass());
		car.drive();
		car.addAcessories();
	}

}
