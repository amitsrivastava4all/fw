package com.brainmentors.apps.dao;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
@ComponentScan(basePackages="com.brainmentors")
@EnableWebMvc
public class DAOConfig extends WebMvcConfigurerAdapter {
	@Bean(name="datasource")
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/amit");
        dataSource.setUsername("root");
        dataSource.setPassword("");
         
        return dataSource;
    }
     
    @Bean(name="userDAO")
    public UserDAO getUserDAO() {
        return new UserDAO(getDataSource());
    }
}
