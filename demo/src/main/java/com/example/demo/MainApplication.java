package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = {"com.example.demo"})
@EnableAspectJAutoProxy
public class MainApplication extends  SpringBootServletInitializer{
	
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
	@Override
	protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
		System.out.println("Inside MainApplication.configure()");
		return application.sources(MainApplication.class);
	}

}
