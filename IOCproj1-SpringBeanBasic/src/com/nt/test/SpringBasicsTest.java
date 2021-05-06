package com.nt.test;
import java.time.LocalDateTime;

import java.util.*;


import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;

import com.nt.beans.WelcomeGreeting;
public class SpringBasicsTest {
	public static void main(String[] args) {
	
// To load and Hold SpringBean Configuration file
FileSystemResource res= new FileSystemResource
("src/com/nt/cfgs/applicationContext.xml");
//To Create IOC Container(xml )

XmlBeanFactory factory = new XmlBeanFactory(res);

Date d=(Date)factory.getBean("dt");
//System.out.println("Date Object Data:"+d);

WelcomeGreeting greeting=
(WelcomeGreeting)factory.getBean("wg");
System.out.println("Message :"+greeting.Welcome("raja"));
	}

}

