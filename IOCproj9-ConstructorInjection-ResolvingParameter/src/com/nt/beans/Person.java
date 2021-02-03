//resolving Prameter bases on Type
package com.nt.beans;

public class Person {
private int id;
private String name;
private long phone;

public Person(int id, String name, long phone) {
	System.out.println("3-param constructor");
	this.id = id;
	this.name = name;
	this.phone = phone;
}

@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", phone=" + phone + "]";
}

}
