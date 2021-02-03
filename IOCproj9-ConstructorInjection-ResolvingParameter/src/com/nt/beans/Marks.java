//resolving Prameter bases on index value
package com.nt.beans;

public class Marks {
	public Marks(int m1, int m2, int m3) {
	System.out.println("3-param Constructor");
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	private int m1,m2,m3;

	
	@Override
	public String toString() {
		return "Marks [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}
	
}
