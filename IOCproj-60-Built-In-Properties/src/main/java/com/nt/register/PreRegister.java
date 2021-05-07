package com.nt.register;

import java.text.SimpleDateFormat;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;



public class PreRegister implements PropertyEditorRegistrar{

	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		System.out.println("PreRegister.registerCustomEditors()");
	SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
	registry.registerCustomEditor(java.util.Date.class,new CustomDateEditor(sdf, true));
	}

}
