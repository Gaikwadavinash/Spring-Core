//Dependent Class
package com.nt.comps;

import org.springframework.stereotype.Component;

@Component("diselEngg")
public class DiselEngine implements IEngine {

	public void start() {
System.out.println("DiselEngine.start()::->Disel Engine Started");				
	}
	public void stop() {
	System.out.println("DiselEngine.stop()::->Petrol Engine Stopped");	
		
	}

}
