package com.nt.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.context.support.StaticApplicationContext;
import org.springframework.stereotype.Component;
@Component("handler")
@Scope("prototype")
public class RequestHandler {
private static int count;
public RequestHandler() {
count++;
System.out.println("RequestHandler 0-param Constructor Count::"+count);
}
public void processingData(String data) {
System.out.println("RequestHandler Data::"+data);	
System.out.println("RequestHandler hashcode::"+this.hashCode());
System.out.println("RequestHandler Count::"+count);
}
}
