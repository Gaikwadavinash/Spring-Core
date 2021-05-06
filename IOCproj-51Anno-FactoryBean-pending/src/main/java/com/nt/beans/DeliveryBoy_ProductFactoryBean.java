package com.nt.beans;

import org.springframework.beans.factory.FactoryBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("Db")
public class DeliveryBoy_ProductFactoryBean implements FactoryBean<Product>{
@Value("${prod.Type}")
	private String prodType;
	
public DeliveryBoy_ProductFactoryBean(String prodType) {
System.out.println("1-param Constructor");
this.prodType=prodType;
}
@Override
	public Product getObject() throws Exception {
	System.out.println("DeliveryBoy_ProductFactoryBean.getObject()");	
	if(prodType.equalsIgnoreCase("electronic")) {
		ElectornicProduct product1= new ElectornicProduct("110", "5*");
          product1.setPId(10010);
		product1.setPName("Ac");
		return product1;
	}else if(prodType.equalsIgnoreCase("automobile")){
	AutomobileProduct product2= new AutomobileProduct("Bus","1500" );
	product2.setPId(10012);
	product2.setPName("bus");
	return product2;
	}
	else {
		return null;
	}
	}

	@Override
	public Class<Product> getObjectType() {
		System.out.println("DeliveryBoy_ProductFactoryBean.getObjectType()");
		return Product.class;
	}
public boolean isSingleton() {
		System.out.println("DeliveryBoy_ProductFactoryBean.isSingleton()");
return true;	
}

}
