package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.ToString;
@ToString
@Component("per")

//@PropertySource(value ="com/nt/commons/myfile.properties")
//@PropertySource(value = "com/nt/commons/myfile2.properties")
public class Person {
//@Value("1001")	
@Value("${per.pid}")

	private int pid;
//@Value("raja")
@Value("${per.name}")
private String name;
@Value("${per.age}")
private float age;
}
