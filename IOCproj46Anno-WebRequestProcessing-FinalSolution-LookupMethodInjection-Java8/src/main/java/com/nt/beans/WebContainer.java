package com.nt.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("container")
@Scope("singleton")
public interface WebContainer  {
@Lookup
public  RequestHandler getHandler();
default void requestHandle(String data) {
System.out.println("WebContainer Data::"+data);
System.out.println("WebContainer.hashcode::"+this.hashCode());
//traditional lookup dependency
RequestHandler rh=getHandler();
rh.processingData(data);
System.out.println("WebContainer Data::"+data);
}


}
