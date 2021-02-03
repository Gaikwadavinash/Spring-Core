package com.nt.beans;

public class A {
private B b;
public A() {
	System.out.println("0-param Constructor::A Class");
}
public void setB(B b) {
	System.out.println("A class::Setter Method(B b)Parameter");
	this.b = b;
}
@Override
public String toString() {
	return "A [b=]";
}



}


