package com.nt.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.BankLoanIntrestCalculator;

public class MethodReplaceTest {

	public static void main(String[] args) {
//create IOc Container
	ApplicationContext	ctx= 
		new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
BankLoanIntrestCalculator cal=ctx.getBean("loanIntrest", BankLoanIntrestCalculator.class);
System.out.println(cal.getClass().getSuperclass());
System.out.println(cal.getClass());
System.out.println(cal.calculateIntrestAmmount(1500,5,2));	
((AbstractApplicationContext) ctx).close();
}

}
