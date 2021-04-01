package com.nt.beans1;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.nt.beans.ICourier;

public class Flipkart {
	//@Autowired
	
	@Autowired(required=true)//only one dependent Spring bean Id
	//@Qualifier("dtdc")//In applicationContext 4th Approach
	//@Qualifier("cr3")
	
	//@Autowired(required=false)
	private ICourier courier;
public Flipkart() {
System.out.println("0-param onstructor::Flipkart (Target Class)");
}
/*Setter Method*/
 @Autowired
@Qualifier("dtdc")
public void setCourier(ICourier cr) {
	this.courier = cr;
	System.out.println("Flipkart::setCourier()::"+courier);
}
 /*orbitari method*/
//@Autowired
//@Qualifier("dhl")
//public void assign(ICourier cr) {
//System.out.println(" Orbitary Method ::Flipkart assign()::"+cr);
//this.courier=cr;
//}
/*Constructor*/
@Autowired
//@Qualifier("dtdc")//Not allowed in Top of the constructor
public Flipkart(@Qualifier("dtdc")ICourier courier){
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