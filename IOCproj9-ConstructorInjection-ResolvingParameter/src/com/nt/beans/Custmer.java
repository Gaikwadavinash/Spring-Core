package com.nt.beans;

public class Custmer {
private int cno;
private String cname;
private String cadd;
private float bilAmount;
public Custmer() {
	System.out.println("0-Param Constructor");
}
public void setCno(int cno) {
	this.cno = cno;
}
public void setCname(String cname) {
	this.cname = cname;
}
public void setCadd(String cadd) {
	this.cadd = cadd;
}
public void setBilAmount(float bilAmount) {
	this.bilAmount = bilAmount;
}

public Custmer(int cno, String cname, String cadd, float bilAmount) {
System.out.println("\n 4-param Constructor");	
	this.cno = cno;
	this.cname = cname;
	this.cadd = cadd;
	this.bilAmount = bilAmount;
}
@Override
public String toString() {
	return "Custmer [cno=" + cno + ", cname=" + cname + ", cadd=" + cadd + ", bilAmount=" + bilAmount + "]";
}


}
