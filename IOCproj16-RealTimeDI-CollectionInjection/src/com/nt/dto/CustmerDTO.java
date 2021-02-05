package com.nt.dto;
import java.io.Serializable;
public final class CustmerDTO implements Serializable {
private String cname;
private String cadd;
 private float pamt;
 private float rate;
 private float time;
 //Getters and Setters Method
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCadd() {
	return cadd;
}
public void setCadd(String cadd) {
	this.cadd = cadd;
}
public float getPamt() {
	return pamt;
}
public void setPamt(float pamt) {
	this.pamt = pamt;
}
public float getRate() {
	return rate;
}
public void setRate(float rate) {
	this.rate = rate;
}
public float getTime() {
	return time;
}
public void setTime(float time) {
	this.time = time;
}
//toString()
@Override
public String toString() {
	return "CustmerDTO [cname=" + cname + ", cadd=" + cadd + ", pamt=" + pamt + ", rate=" + rate + ", time=" + time
			+ "]";
}
 
}
