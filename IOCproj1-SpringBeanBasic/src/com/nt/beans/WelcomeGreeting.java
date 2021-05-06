package com.nt.beans;

import java.util.Date;

public class WelcomeGreeting {
	private Date date;
static {
System.out.println("WelcomeGreeting.StaticBlock");
}//static Block
public WelcomeGreeting() {
	System.out.println("WelcomeGreeting:0-Param Constructor");
}//const
public String Welcome(String user) {
	//return "Welcome To String:"+user;
	
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

