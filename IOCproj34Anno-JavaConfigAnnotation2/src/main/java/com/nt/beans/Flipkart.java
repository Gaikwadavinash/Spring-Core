package com.nt.beans;

import java.util.Arrays;

import java.util.Random;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
@Named("fpkt")//to config java class as a spring bean

public class Flipkart {
//@Resource(name ="dhl")
//@Resource(name ="activeCourier")
	private ICourier courier;
public Flipkart() {
System.out.println("0-param onstructor::Flipkart (Target Class)");
}
@Resource( name = "activeCourier")
public void assign(ICourier cr) {
	System.out.println(" Orbitary Method ::Flipkart assign()::"+cr);
	this.courier=cr;
	}


//@Resource(name="activeCourier")
public void setCourier(ICourier cr) {
	this.courier = cr;
	System.out.println("Flipkart::setCourier()::"+courier);
}

@Autowired
////("activeCourier")
public Flipkart(@Qualifier("activeCourier") ICourier courier){
this.courier=courier;
	System.out.println("1::Param Constructor::"+courier);	
}



public String shopping(String Items[],Float prices[]) {
float billAmt=0.0f;
for(float p:prices) 
	billAmt=billAmt+p;
//genrate id Order
int id= new Random().nextInt(20000);
//used courier
String msg=courier.deliver(id);
String finalMsg=Arrays.toString(Items)+"are shopped having prices"+Arrays.toString(prices)+"with BillAmt::"+billAmt+"--->"+msg;
return finalMsg;
	
}
}