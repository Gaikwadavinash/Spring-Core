//resolving Prameter bases on Value (Normal value="");
package com.nt.beans;

public class Student {
private int	sno;
private String sname;
private String sadd;
private float avg;

 public Student(int sno,String sname,String sadd,Float avg) {
System.out.println("4-param Constructor");
this.sno=sno;
this.sname=sname;
this.sadd=sadd;
this.avg=avg;
}
 public Student(int sno, String sname, String sadd) {
System.out.println("3-param Constructor");
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
	}
 
 public Student(int sno, String sname) {
System.out.println("2-param Constructor");
		this.sno = sno;
		this.sname = sname;
	}
@Override
public String toString() {
	return "Student [sno=" + sno + ", sname=" + sname + ", sadd=" + sadd + ", avg=" + avg + "]";
}
//public String toString() {
//	return this.getClass().getName()+"@"+Integer.toHexString(hashCode());
//}
}
