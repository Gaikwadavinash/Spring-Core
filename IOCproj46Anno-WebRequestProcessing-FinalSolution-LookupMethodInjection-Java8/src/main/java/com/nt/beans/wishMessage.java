package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("wmg")
public class wishMessage {
private wishMessage() {
	System.out.println("wishMessage 0-param Constructor");
}
	public  String  showWishMsg(String user) {
		return "Good Morning::"+user;
	}

}
