package com.nt.test;

import org.springframework.context.ApplicationContext;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;


import com.nt.controller.BankController;
import com.nt.vo.CustmerVO;

public class CustmerProfileTest {

	public static void main(String[] args) throws Exception {
		//create Ioc Container
	ClassPathXmlApplicationContext cpxctx= new ClassPathXmlApplicationContext();
//to get Enviroment object
ConfigurableEnvironment cenv=(ConfigurableEnvironment) cpxctx.getEnvironment();
	//to set the profiles
cenv.setActiveProfiles("prod");//before preinstation profile will be set
//to specify configuration class
cpxctx.setConfigLocations("com/nt/cfgs/applicationContext.xml");
//refresh class
	cpxctx.refresh();
	BankController controller=cpxctx.getBean("controller",BankController.class);
	CustmerVO vo= new CustmerVO("Manisha", "hyd", "1500", "2","5");
	String result=controller.processCustmer(vo);
	System.out.println(result);
	}

}
