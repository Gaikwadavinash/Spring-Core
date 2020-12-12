package com.nt.test;
import com.nt.comp.*;

import java.util.*;
public class NewInstanceTest1 {
	public static void main(String[] args) throws Exception {
Class c=Class.forName(args[0]);
Object object=c.newInstance();
System.out.println("Display object of :"+object);
	}
}
