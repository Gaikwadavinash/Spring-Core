package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration

@ComponentScan(basePackages ="com.nt.controller")
public class PresentationAppConfig {

}
