package com.nt.test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

import com.nt.config.AppConfig;
import com.nt.config.PresenatationAppConfig;
import com.nt.controller.BankController;
import com.nt.vo.CustmerVO;

public class CustmerProfileTest {

	public static void main(String[] args) throws Exception {
		//create Ioc Container
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();	
//to get Enviroment object
ConfigurableEnvironment cenv=(ConfigurableEnvironment) ctx.getEnvironment();
	//to set the profiles
cenv.setActiveProfiles("dev");//before preinstation profile will be set
//to specify configuration class
ctx.register(AppConfig.class);
//refresh class
	ctx.refresh();
	BankController controller=ctx.getBean("controller",BankController.class);
	CustmerVO vo= new CustmerVO("Mannu", "hyd", "1500", "2","5");
	String result=controller.processCustmer(vo);
	System.out.println(result);
	}

}
