package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {BusinessAppConfig.class,PresenatationAppConfig.class})
public class AppConfig {

}
