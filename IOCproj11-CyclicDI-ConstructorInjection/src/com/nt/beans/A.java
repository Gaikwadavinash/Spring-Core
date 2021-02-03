package com.nt.beans;

public class A {
private B b;

public A(B b) {
	this.b = b;
	System.out.println("1-param Constructor ::A class");
}

@Override
public String toString() {
	return "A [b=]";
}



}


