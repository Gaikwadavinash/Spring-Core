package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("wish")
public class WishMessageGenrator {
	@Autowired
	private LocalDateTime date;
public WishMessageGenrator() {
	System.out.println("WishMessageGenrator::0-param Constructor");
}

public String showMessage(String user) {
	int hour=date.getHour();
	if(hour<12) {
		return "Good Morning "+user;
	}else if(hour<16) {
		return "Good AfterNoon "+user;
	}else if (hour<18) {
return "Good Evenig "+user;	
	}else {
		return "GoodNight "+user;
	}
}
}
