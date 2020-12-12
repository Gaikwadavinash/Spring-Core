package com.nt.comps;
public final class DotNetCourse implements ICourse {

	@Override
	public void startCourse() {
		System.out.println("Dot Net Course start...");

	}

	@Override
	public void endCourse() {
		System.out.println("Duration::aproximately 3 month takes time");
		System.out.println("Dot Net Course end...");
			
	}

}
