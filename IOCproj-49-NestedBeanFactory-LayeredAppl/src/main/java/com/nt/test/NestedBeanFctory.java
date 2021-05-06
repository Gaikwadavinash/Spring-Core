package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;

public class NestedBeanFctory {

	public static void main(String[] args) {
//parent IOC Conatiner		
ApplicationContext pctx= new ClassPathXmlApplicationContext("com/nt/cfg/business-beans.xml");
//child IOC Conatiner
ApplicationContext cctx= new ClassPathXmlApplicationContext( new String[] {"com/nt/cfg/presentation-beans.xml"},pctx);

//get Controller Class
MainController controller=cctx.getBean("controller",MainController.class);
try {
	controller.showEmpDesg("CLERK","MANAGER","SALESMAN").forEach(dto->{
		System.out.println(dto);
	});
}catch (Exception e) {
	e.printStackTrace();
}
((AbstractApplicationContext) cctx).close();
	}

}
