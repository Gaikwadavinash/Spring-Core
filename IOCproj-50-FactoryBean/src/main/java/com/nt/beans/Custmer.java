package com.nt.beans;

public class Custmer {
private Product prod;
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
