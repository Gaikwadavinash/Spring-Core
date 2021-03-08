package com.nt.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18nApp {

	public static void main(String[] args) {
	//Create locale Object
Locale locale=new Locale(args[0],args[1]);
//create Resourece Bundle Object
ResourceBundle bundle=ResourceBundle.getBundle("com/nt/commons/app",locale);
System.out.println(bundle.getString("Wishmsg")+"  "+bundle.getString("Welcome.msg")+"  "+bundle.getString("bye.msg"));

	}

}
