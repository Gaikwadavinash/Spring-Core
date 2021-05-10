package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
@Configuration
@Import(value= {PersistanceAppConfig.class,ServiceAppConfig.class})
public class BusinessAppConfig {

}
