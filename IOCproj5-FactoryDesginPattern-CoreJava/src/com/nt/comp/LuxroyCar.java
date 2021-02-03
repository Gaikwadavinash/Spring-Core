package com.nt.comp;
public class LuxroyCar implements ICar{
 public LuxroyCar() {
System.out.println(this.getClass().getSuperclass());
}	
	@Override
public void drive() {
System.out.println("Driving Luxory Cars");
}
	@Override
public void addAcessories() {
	System.out.println(" Fitting  acessosries to Luxroy Car");
}
}
