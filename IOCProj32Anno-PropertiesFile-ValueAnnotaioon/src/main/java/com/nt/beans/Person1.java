package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component("per1")
//@PropertySource(value = "com/nt/commons/myfile2.properties")
//@PropertySource(value ="com/nt/commons/myfile.properties")
//@PropertySource(value ={"com/nt/commons/myfile.properties","com/nt/commons/myfile2.properties"})

@PropertySources({@PropertySource("com/nt/commons/myfile.properties"),@PropertySource("com/nt/commons/myfile2.properties")})
public class Person1 {
@Value("${per.pid}")	
private int pid;
@Value("${per.name}")
private String name;
@Value("${per.age}")
private float age;
@Value("${os.name}")
private String os;
@Value("${path}")
private String path;

}
