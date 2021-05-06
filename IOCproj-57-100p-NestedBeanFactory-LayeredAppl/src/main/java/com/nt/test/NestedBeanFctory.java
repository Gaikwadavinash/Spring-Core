package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.config.BusinessAppConfig;
import com.nt.config.PresentationAppConfig;
import com.nt.controller.MainController;

public class NestedBeanFctory {

	public static void main(String[] args) {
//parent IOC Conatiner		
AnnotationConfigApplicationContext pctx= new AnnotationConfigApplicationContext(BusinessAppConfig.class);

AnnotationConfigApplicationContext cctx= new AnnotationConfigApplicationContext(PresentationAppConfig.class);
cctx.setParent(pctx);
//AnnotationConfigApplicationContext cctx= new AnnotationConfigApplicationContext();
//cctx.setParent(pctx);
//cctx.register(PresentationAppConfig.class);
//cctx.refresh();
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
