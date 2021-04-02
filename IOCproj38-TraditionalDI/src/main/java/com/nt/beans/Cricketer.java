package com.nt.beans;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//TargetClass
public class Cricketer
{
private String name;
private int jersyNo;
private String beanId;

public Cricketer() {
System.out.println("CricketerBat-0-ParamConstructor");
}
public void setName(String name) {
	this.name = name;
}
public void setJersyNo(int jersyNo) {
	this.jersyNo = jersyNo;
}
public void setBeanId(String beanId) {
	this.beanId = beanId;
}
public void fielding() {
	System.out.println("Mr."+name+"having Jesrsy No"+jersyNo+"is fielding");
}
public void bowling() {
	System.out.println("Mr."+name+"having Jesrsy No"+jersyNo+"is Bowling");
}
public void batting() {
	System.out.println("Mr."+name+"having Jesrsy No"+jersyNo+"is batting");
//Dependency lookup to get CricketBat Object only in the Batting Method
//create extra IOC Container
	ApplicationContext ctx=
new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
System.out.println("2nd IOC Container");	
	CricketBat bat=ctx.getBean("beanId",CricketBat.class);//dependencyLookup
//use CricketBat Object
	int score=bat.scoreRun();
	System.out.println("Cricketer runs:"+score);
}
}
