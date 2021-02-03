package com.nt.beans;

public class B {
	private A a;
	
public B(A a) {
		this.a = a;
System.out.println("B Class ::1-param Constructor(A a)");	
}

@Override
public String toString() {
	return "B [a=]";
}





}
