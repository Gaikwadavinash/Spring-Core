package com.nt.beans;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
//TargetClass
@Component("cricketer")
public class Cricketer implements ApplicationContextAware
{
	@Value("${cktr.name}")
private String name;
	@Value("${cktr.jersyNo}")
private int jersyNo;
	@Value("${ckbat.beanId}")
private String beanId;
private ApplicationContext ctx;

@Override
//It is not setter method for setter Injection .It is method ApplicationContextAware(I)
public void setApplicationContext(ApplicationContext ctx) throws BeansException {

System.out.println("Cricketer.setApplicationContext()"+ctx.getClass());
this.ctx=ctx;
}
public Cricketer() {
System.out.println("CricketerBat-0-ParamConstructor");
}

public void setName(String name) {
	System.out.println("Cricketer.setName()");
	this.name = name;
}
public void setJersyNo(int jersyNo) {
	System.out.println("Cricketer.setJersyNo()");
	this.jersyNo = jersyNo;
}
public void setBeanId(String beanId) {
	System.out.println("Cricketer.setBeanId()");
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
////create IOc Container
//ApplicationContext ctx= 
//new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
System.out.println("2nd IOC Container");
CricketBat bat=ctx.getBean("bat",CricketBat.class);//dependencyLookup
//use CricketBat Object
	int score=bat.scoreRun();
	System.out.println("Cricketer runs:"+score);
}

}
