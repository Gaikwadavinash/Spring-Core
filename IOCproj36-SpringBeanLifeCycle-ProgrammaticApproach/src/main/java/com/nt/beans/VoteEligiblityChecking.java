package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
public class VoteEligiblityChecking implements InitializingBean,DisposableBean {
private String name;
private int age;
private Date verificationDate ;
public VoteEligiblityChecking() {
System.out.println("VoteEligiblityChecking.VoteEligiblityChecking()");
	
}
public void setName(String name) {
	this.name = name;
}
public void setAge(int age) {
	this.age = age;
}
public void setVerificationDate(Date verificationDate) {
	this.verificationDate = verificationDate;
}
//init life cycle method(custom init Method)
public void afterPropertiesSet() throws Exception {
System.out.println("VoteEligiblityChecking.afterPropertiesSet()");
	//To intalize those properties which are not participate  in the Injection
	verificationDate= new Date();
	//to check whether imp properties are injected with Correct value or Not
	if(name==null||name.equals(" ")||age<=0||age>=125)//validation Logic 
	{
		throw new IllegalArgumentException("Invalid Input");
	}
	}

//business Method Logic
public String checkEligiblity() {
	
	System.out.println("VoteEligiblityChecking.checkEligiblity()");
	if(age<18) 
		 return "Mr./Miss./Mrs."+name +"("+age+") u r not elgible for Voting  . Verified on "+verificationDate;
			else
		return "Mr./Miss./Mrs."+name +"("+age+") u r  elgible  for voting  . Verified on "+verificationDate;			
}
//destroy Method

public void destroy() throws Exception {
	System.out.println("VoteEligiblityChecking.destroy()");
	name=null;
	age=0;
	verificationDate=null;	
}



}

