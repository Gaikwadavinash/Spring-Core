package com.nt.beans;

public class WelcomeGreeting {
static {
System.out.println("WelcomeGreeting.StaticBlock");
}//static Block
public WelcomeGreeting() {
	System.out.println("WelcomeGreeting:0-Param Constructor");
}//const
public String Welcome(String user) {
	return "Welcome To String:"+user;
}
}
