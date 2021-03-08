package com.nt.test;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.controller.BankController;
import com.nt.vo.CustmerVO;
public class RealTimeDITest {

	public static void main(String[] args) {
//craete IOC container
ApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
//get Controller class obj from IOC contaienr
BankController controller=ctx.getBean("controller",BankController.class);

//read inputs from enduser
java.util.Scanner s= new java.util.Scanner(System.in);
System.out.println("Enter the Custmer Name");
String custName=s.nextLine();
System.out.println("Enter the Custmer Address");
String cadd=s.nextLine();
System.out.println("Enter the Custmer Principle Amount");
String pamt=s.nextLine();
System.out.println("Enter the Custmer Rate");
String rate=s.nextLine();
System.out.println("Enter the  Custmer time");
String time=s.nextLine();
//create CustomerVO class obj having all inputs
CustmerVO vo= new CustmerVO();
vo.setCname(custName);
vo.setCadd(cadd);
vo.setpAmt(pamt);
vo.setRate(rate);
vo.setTime(time);
//invoke Method
try {
	//use controller classs
	String result=controller.processCustmer(vo);
	System.out.println(result);
	Environment env=((ClassPathXmlApplicationContext)ctx).getEnvironment();
	System.out.println(env.getClass());
	System.out.println(env.getProperty("os.name"));
}catch (Exception e) {
	  System.out.println("Problem in Customer Registration");
	e.printStackTrace();
	
}
((AbstractApplicationContext) ctx).close();
	}

}
