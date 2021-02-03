package com.nt.beans;

public class A {
private B b;
//public void setB(B b) {
//	this.b = b;
//System.out.println("A Class ::Setter Method SetB(A a) ");
//
//}

@Override
public String toString() {
	return "A [b=]";
}
public A(B b) {
System.out.println("A Class Const");
	this.b = b;
}



}


