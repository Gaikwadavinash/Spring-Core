package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("custmer")
public class Custmer {
@Autowired
private Product prod;
public Custmer() {
	System.out.println("0-param constructor");
}
public Custmer(Product prod) {
	System.out.println("1-Param Constructor");
	this.prod=prod;
}
public void showProduct() {
	if(prod!=null) {
		System.out.println(prod);
	}else {
	System.out.println("Product Not Recived");
	}
}
}
