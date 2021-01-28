package com.nt.test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.nt.controller.BankController;
import com.nt.vo.ProductVo;
public class RealTimeDI_StratgyDP {
	public static void main(String[] args) {
DefaultListableBeanFactory factory= new DefaultListableBeanFactory();
XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
BankController controller= factory.getBean("controller",BankController.class);	
java.util.Scanner sc= new java.util.Scanner(System.in);
System.out.println("Enter the PNmae");
String pname=sc.nextLine();
System.out.println("Enter the ptype");
String type=sc.nextLine();
System.out.println("Enter the BasePrice");
String baseprice=sc.nextLine();
System.out.println("Enter the Status");
String status=sc.nextLine();
System.out.println("Enter the qty");
String qty= sc.nextLine();
//Reading data scanner through and push into vo class
ProductVo vo= new ProductVo();
vo.setpName(pname);
vo.setType(type);
vo.setBasePrice(baseprice);
vo.setStatus(status);
vo.setQty(qty);
try {
String result=controller.productProcess(vo)	;
System.out.println(result);
}catch (Exception e) {
	System.out.println("Problem in Product Registration");
	e.printStackTrace();
}
	}
}
