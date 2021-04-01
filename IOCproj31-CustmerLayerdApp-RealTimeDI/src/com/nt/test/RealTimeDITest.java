package com.nt.test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.BankController;
import com.nt.vo.CustmerVO;
public class RealTimeDITest {

	public static void main(String[] args) {
////craete IOC container
//	DefaultListableBeanFactory factory= new DefaultListableBeanFactory();
//	XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
//reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
//
////get Controller class obj from IOC contaienr
//BankController controller=factory.getBean("controller",BankController.class);

	ApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");	
BankController Controller=(BankController) ctx.getBean("Controller",BankController.class);

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
	String result=Controller.processCustmer(vo);
	System.out.println(result);
}catch (Exception e) {
	  System.out.println("Problem in Customer Registration");
	e.printStackTrace();
}
	}

}
