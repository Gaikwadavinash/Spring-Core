package com.nt.factory;
import com.nt.comp.BudgetCar;

import com.nt.comp.ICar;
import com.nt.comp.LuxroyCar;
import com.nt.comp.SportCar;


public class CarFactory {	
	public  CarFactory() {
		System.out.println(this.getClass().getSuperclass());
	}
public static ICar getInstanceCar(String Type) {
	
ICar car=null;
if(Type.equalsIgnoreCase("BudgetCar")) {
car=new BudgetCar();
}else if (Type.equalsIgnoreCase("LuxroyCar")){
	car= new LuxroyCar();
}
else if (Type.equalsIgnoreCase("SportCar")) {
	car= new SportCar();
}	
else {
throw  new IllegalArgumentException("Invalid Argument");
}
return car;	
}

}
