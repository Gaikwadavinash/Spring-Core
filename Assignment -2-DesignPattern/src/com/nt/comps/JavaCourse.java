package com.nt.comps;
public  final class JavaCourse implements ICourse {

	@Override
	public void startCourse() {
System.out.println("Java Course started ...");
	}

	@Override
	public void endCourse() {
		System.out.println("Duration::aproximately 3 month takes time");	
		System.out.println("Java Course end..");
		
	}

}
