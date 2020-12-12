package com.nt.beans;
import java.util.Date;
public class WishMessageGenrator {
	private Date date;
static {
	System.out.println("WishMessageGenrator::static block");
}
public WishMessageGenrator(Date date) {
System.out.println("WishMessageGenrato:"+date);
System.out.println("WishMessageGenrator::1-param Constructor");
this.date=date;
}
public String genrateWishMessage(String user) {
	System.out.println("WishMessageGenrator.genrateWishMessage()");
int hour=date.getHours();
if(hour<12) {
	return "Good..Morning.."+user;
}
else if(hour<15) {
	return "Good..AfterNoon.."+user;
}
else if(hour<20) {
	return "Good..Noon.."+user;
}
else {
	return "Good..Night.."+user;
}
}
}
