package com.nt.beans;

public class WebContainer {
private RequestHandler rh;

public WebContainer(RequestHandler rh) {
System.out.println("WebContainer 1-param Constructor");
this.rh=rh;
}

public void requestHandle(String data) {
System.out.println("WebContainer Data::"+data);
System.out.println("WebContainer.hashcode::"+this.hashCode());
rh.processingData(data);
System.out.println("WebContainer Data::"+data);
}
}
