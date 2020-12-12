package com.nt.beans;
import java.util.*;
public class WishMessageGenerator {
	static {
System.out.println("WishMessageGenerator:static Method");
	}
public WishMessageGenerator() {
	System.out.println("====0-param Constructor===");
}
private Date date;

public void setDate(Date date) {
	System.out.println("WishMessageGenerator.setDate():"+date);
	this.date = date;
}
public String message(String user ) {
	System.out.println("WishMessageGenerator.message()");
int hour=date.getHours();

if(hour<12) {	
	return "Good Morning..:"+user;
}
else if (hour<18) {
return "Good Evening..:"+user;	
}else if (hour<20) {
	return "Good Noon..:"+user;
}
else {
	return "Good Night..:"+user;
}
	
}
}
