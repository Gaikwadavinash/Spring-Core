package com.nt.beans;

public class B {
	private A a;

	public B() {
		System.out.println("0-param Constructor::A Class");
	}
	public void setA(A a) {
		this. a= a;
		System.out.println("A class::Setter Method(B b)Parameter");
		
	}
@Override
public String toString() {
	return "B [a=]";
}





}
