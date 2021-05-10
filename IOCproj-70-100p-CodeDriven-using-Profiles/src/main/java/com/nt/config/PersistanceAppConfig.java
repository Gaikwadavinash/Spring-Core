package com.nt.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.zaxxer.hikari.HikariDataSource;
@Configuration
@ComponentScan("com.nt.dao")
public class PersistanceAppConfig {
//Dev env..  (Apache DBCp2)
@Bean("cpds1")
@Profile("dev")
public DataSource createDataSource()throws Exception {
//ComboPooledDataSource cpds= new ComboPooledDataSource();
BasicDataSource cpds= new BasicDataSource();
cpds.setDriverClassName("com.mysql.cj.jdbc.Driver");
cpds.setUrl("jdbc:mysql:///springntsp613");
cpds.setUsername("root");
cpds.setPassword("manager");
return cpds;
}
//uat env.. (c3P0)
@Bean("cdps2")
@Profile("uat")
public DataSource createSource()throws Exception{
	ComboPooledDataSource cpds= new ComboPooledDataSource();
	cpds.setDriverClass("oracle.jdbc.driver.OracleDriver");
	cpds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
	cpds.setUser("scott");
	cpds.setPassword("tiger");
	return cpds;
}
//apache tomcat
//test env
@Bean("dpcs3")
@Profile("test")
public DataSource cDataSource() {
	 org.apache.tomcat.jdbc.pool.	DataSource ds= new org.apache.tomcat.jdbc.pool.DataSource();
ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
ds.setUrl("jdbc:mysql:///springntsp613");
		ds.setUsername("root");
		ds.setPassword("manager");
		return ds;
}

@Bean("cpds4")
@Profile("prod")
public DataSource createSourceData()throws Exception {
	HikariDataSource hkds=new HikariDataSource();
	hkds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	hkds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
			hkds.setUsername("scott");
			hkds.setPassword("tiger");
			return hkds;
}
}
