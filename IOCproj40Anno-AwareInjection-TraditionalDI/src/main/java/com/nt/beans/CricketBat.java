package com.nt.beans;

import java.util.Random;

import org.springframework.stereotype.Component;
//DependentClass
@Component("bat")
public class CricketBat{
public CricketBat() {
System.out.println("CricketBat.CricketBat()");
}
public int scoreRun() {
	System.out.println("Cricketer.scoreRun()");
	return new Random().nextInt(100);
}
}