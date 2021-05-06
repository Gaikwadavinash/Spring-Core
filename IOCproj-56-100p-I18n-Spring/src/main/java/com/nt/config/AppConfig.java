package com.nt.config;

import java.util.ResourceBundle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
//@ComponentScan(basePackages ="com.nt.commons" )
public class AppConfig {
@Bean("messageSource")
	public ResourceBundleMessageSource createBunddle() {
	ResourceBundleMessageSource bunddle= new ResourceBundleMessageSource();
bunddle.setBasename("com/nt/commons/app");	
return bunddle;
}
}
