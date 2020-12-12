package com.nt.comp;
public class Test {
	public int a,b;
static {
	System.out.println("Static Block Test Class");
}
public Test() {
	System.out.println("0-param Constructor");
}

public Test(int a,int b) {
	this.a=a;
	this.b=b;
	System.out.println("2-param Constructor");
}

public String toString() {
	return "Test[a:"+a+","+"b:"+b+"]";
}
}
