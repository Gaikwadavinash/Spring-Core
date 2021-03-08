package com.nt.listener;

import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class IOCContainerMonitoringListener implements ApplicationListener {
private long start,end;
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
	if(event.toString().contains("RefreshedEvent")) {
System.out.println("Application Context Ioc container Started as:"+new Date());
	start=System.currentTimeMillis();
	System.out.println(start);
	}else if(event.toString().contains("ClosedEvent")){
	System.out.println("Application Context Ioc container Stopped as:"+new Date());
end=System.currentTimeMillis();
System.out.println(end);
	System.out.println("IOCContainerMonitoringListener is Curennt Mode::"+(end-start)+ "ms");
		
	}
		
	}

}
