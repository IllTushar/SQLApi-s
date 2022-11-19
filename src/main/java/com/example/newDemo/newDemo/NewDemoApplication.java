package com.example.newDemo.newDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration(
		exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class NewDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewDemoApplication.class, args);
	}

}
